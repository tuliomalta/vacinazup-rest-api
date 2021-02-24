package vacinazup.vacinazup.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vacinazup.vacinazup.rest.api.model.Vacina;
import vacinazup.vacinazup.rest.api.repository.VacinaRepository;

import java.util.List;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

    @Autowired
    private VacinaRepository vacinaRepository;

    @GetMapping
    public List<Vacina> listar() {
        return vacinaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vacina adicionar(@RequestBody Vacina vacina) {
        return vacinaRepository.save(vacina);
    }
}
