package edu.udistrital.aspirante.AspiranteGomezCasas.service;

import edu.udistrital.aspirante.AspiranteGomezCasas.model.Aspirante;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AspiranteService {

    private static final String FILE_PATH = "aspirantes.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Aspirante> obtenerTodos() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try {
            return objectMapper.readValue(file, new TypeReference<List<Aspirante>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Aspirante guardar(Aspirante aspirante) {
        List<Aspirante> aspirantes = obtenerTodos();
        
        if (aspirante.getId() == null) {
            aspirante.setId((long) (aspirantes.size() + 1));
        }

        aspirantes.add(aspirante);

        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_PATH), aspirantes);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al escribir en el archivo JSON", e);
        }

        return aspirante;
    }
}
