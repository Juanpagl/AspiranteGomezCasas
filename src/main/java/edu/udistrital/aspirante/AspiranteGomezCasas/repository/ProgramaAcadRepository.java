package edu.udistrital.aspirante.AspiranteGomezCasas.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import edu.udistrital.aspirante.AspiranteGomezCasas.model.ProgramaAcad;

@Repository
public class ProgramaAcadRepository {



	private List<ProgramaAcad> listaP = new ArrayList<ProgramaAcad>();

	public ProgramaAcadRepository() {
		if (listaP.isEmpty()) {
			ProgramaAcad obj = new ProgramaAcad(100, "Ingenieria de Sistemas", 99);
			ProgramaAcad obj2 = new ProgramaAcad(200, "Ingenieria de Industrial", 100);
			ProgramaAcad obj3 = new ProgramaAcad(300, "Ingenieria de Mecanica", 102);
			ProgramaAcad obj4 = new ProgramaAcad(400, "Ingenieria de Software", 106);
			listaP.add(obj);
			listaP.add(obj2);
			listaP.add(obj3);
			listaP.add(obj4);
			
			System.out.println("crea obj");
		}
	}

	public List<ProgramaAcad> findAll() {

		return listaP;
	}

	public void save(ProgramaAcad dto) {
		listaP.add(dto);
	}

	public void delete(int id) {

		listaP.removeIf(p -> p.getId_pro() == id);
	}

	public Optional<ProgramaAcad> findId(int id) {
				 
		return listaP.stream().filter(p -> p.getId_pro() == id).findFirst();
	}

	public void update(ProgramaAcad dto) {

		for (int i = 0; i < listaP.size(); i++) {
			if (listaP.get(i).getId_pro() == dto.getId_pro()) {
				listaP.set(i, dto);
			}

		}

	}

}
