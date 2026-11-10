package edu.udistrital.aspirante.AspiranteGomezCasas.controller;

import edu.udistrital.aspirante.AspiranteGomezCasas.model.Aspirante;
import edu.udistrital.aspirante.AspiranteGomezCasas.service.AspiranteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aspirantes")
public class AspiranteController {

    private final AspiranteService aspiranteService;

    public AspiranteController(AspiranteService aspiranteService) {
        this.aspiranteService = aspiranteService;
    }

    @GetMapping
    public List<Aspirante> listar() {
        return aspiranteService.obtenerTodos();
    }

    @PostMapping
    public Aspirante guardar(@RequestBody Aspirante aspirante) {
        return aspiranteService.guardar(aspirante);
    }
}
