package edu.udistrital.aspirante.AspiranteGomezCasas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.udistrital.aspirante.AspiranteGomezCasas.model.ProgramaAcad;
import edu.udistrital.aspirante.AspiranteGomezCasas.service.ProgramaAcadService;

@RestController
@RequestMapping("/api/programas")
public class ProgramaAcadController {



	@Autowired
	private ProgramaAcadService ps;

	public ProgramaAcadController() {

	}
	
	@GetMapping
	public ResponseEntity<List<ProgramaAcad>> getProgramas(){
			return ResponseEntity.ok( ps.obtenerTodas());
	}
	
	@GetMapping("/autores")
	public ResponseEntity<String> getAutores(){
			return ResponseEntity.ok( "Mary Leany Vaquiro Cardozo y Dylier Steven Moya Tinoco, 20241578069- 20232578001 , Programacion por Componenetes grupo 302");
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProgramaAcad> getProgramasId(@PathVariable int id){
			return ps.buscarId(id)
					.map(ResponseEntity::ok)
					.orElseGet(()->ResponseEntity.notFound().build());
	}
	
	
	@PostMapping
	public String postPrograma(@RequestBody ProgramaAcad p) {
		ps.guardar(p);
		return "Creado";
	}
	
	@PutMapping
	public String putPrograma(@RequestBody ProgramaAcad p) {
		ps.actualizar(p);
		return "Actualizado";
	}
	
	@DeleteMapping("/{id}")
	public String deletePrograma(@PathVariable int id) {
		ps.eliminar(id);
		return "Eliminado";
	}
	
	
	
}
