package edu.udistrital.aspirante.AspiranteGomezCasas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.udistrital.aspirante.AspiranteGomezCasas.model.Aspirante;
import edu.udistrital.aspirante.AspiranteGomezCasas.repository.AspiranteRepository;

@Service
public class AspiranteService {

    @Autowired 
    AspiranteRepository repo;

    public AspiranteService() {
    }
    
    public List<Aspirante> obtenerTodos(){
        return repo.findAll();
    }
    
    public void guardar(Aspirante aspirante) {
        repo.save(aspirante);
    }
    
    public void actualizar(Aspirante aspirante) {
        repo.update(aspirante);
    }
    
    public void eliminar(String identificacion) {
        repo.delete(identificacion);
    }
    
    public Optional<Aspirante> buscarId(String identificacion) {
        return repo.findById(identificacion);
    }
}