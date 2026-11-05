package edu.udistrital.aspirante.AspiranteGomezCasas.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import edu.udistrital.aspirante.AspiranteGomezCasas.model.Aspirante;
import edu.udistrital.aspirante.AspiranteGomezCasas.model.ProgramaAcad;

@Repository
public class AspiranteRepository {

    private List<Aspirante> listaAspirantes = new ArrayList<>();

    public AspiranteRepository() {
        if (listaAspirantes.isEmpty()) {
            
            ProgramaAcad progPrueba = new ProgramaAcad(100, "Ingenieria de Sistemas", 99); 
            Aspirante a1 = new Aspirante("123456789", "Juan", "Perez", "juan@correo.com", "3001234567", progPrueba, new Date());
            listaAspirantes.add(a1);
        }
    }

    public List<Aspirante> findAll() {
        return listaAspirantes;
    }

    public void save(Aspirante aspirante) {
        listaAspirantes.add(aspirante);
    }

    public void delete(String identificacion) {
        listaAspirantes.removeIf(a -> a.getIdentificacion().equals(identificacion));
    }

    public Optional<Aspirante> findById(String identificacion) {
        return listaAspirantes.stream().filter(a -> a.getIdentificacion().equals(identificacion)).findFirst();
    }

    public void update(Aspirante aspirante) {
        for (int i = 0; i < listaAspirantes.size(); i++) {
            if (listaAspirantes.get(i).getIdentificacion().equals(aspirante.getIdentificacion())) {
                listaAspirantes.set(i, aspirante);
                break;
            }
        }
    }
}