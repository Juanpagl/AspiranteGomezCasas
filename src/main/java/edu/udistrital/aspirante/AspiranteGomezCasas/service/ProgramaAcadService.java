package edu.udistrital.aspirante.AspiranteGomezCasas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.udistrital.aspirante.AspiranteGomezCasas.model.ProgramaAcad;
import edu.udistrital.aspirante.AspiranteGomezCasas.repository.ProgramaAcadRepository;


@Service
public class ProgramaAcadService {


	@Autowired 
	ProgramaAcadRepository repo;

	public ProgramaAcadService() {
	
	}
	
	public List<ProgramaAcad> obtenerTodas(){
		return repo.findAll();
	}
	
	public void guardar(ProgramaAcad dto) {
		repo.save(dto);
	}
	
	public void actualizar(ProgramaAcad dto) {
		repo.update(dto);
	}
	
	public void eliminar(int id) {
		repo.delete(id);
	}
	
	public Optional<ProgramaAcad> buscarId (int id) {
		return repo.findId(id);
	}
	
}



