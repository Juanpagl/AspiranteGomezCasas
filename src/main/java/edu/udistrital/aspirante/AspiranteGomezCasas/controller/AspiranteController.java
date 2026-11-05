package edu.udistrital.aspirante.AspiranteGomezCasas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.udistrital.aspirante.AspiranteGomezCasas.model.Aspirante;
import edu.udistrital.aspirante.AspiranteGomezCasas.service.AspiranteService;

@RestController
@RequestMapping("/api/aspirantes")
public class AspiranteController {

    @Autowired
    private AspiranteService as;

    public AspiranteController() {
    }
    
    @GetMapping
    public ResponseEntity<List<Aspirante>> getAspirantes(){
            return ResponseEntity.ok(as.obtenerTodos());
    }
    
    @GetMapping("/{identificacion}")
    public ResponseEntity<Aspirante> getAspiranteId(@PathVariable String identificacion){
            return as.buscarId(identificacion)
                    .map(ResponseEntity::ok)
                    .orElseGet(()->ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public String postAspirante(@RequestBody Aspirante a) {
        as.guardar(a);
        return "Aspirante Creado";
    }
    
    @PutMapping
    public String putAspirante(@RequestBody Aspirante a) {
        as.actualizar(a);
        return "Aspirante Actualizado";
    }
    
    @DeleteMapping("/{identificacion}")
    public String deleteAspirante(@PathVariable String identificacion) {
        as.eliminar(identificacion);
        return "Aspirante Eliminado";
    }
}