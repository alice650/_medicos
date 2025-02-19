package com.medicos.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/olamundo") // Informa qual será o endpoint que vai chamar a classe OlaMundo.
@RestController // Informa ao spring boot que a classe OlaMundo é uma classe do tipo controladora.
public class OlaMundo {
    
    @GetMapping // informa que o método será invocado quando um get acontecer.
    public String olamundo(){
        return "Olá mundo";
    }
}

// localhost:8080 -> URL inicial.
// localhost:8080/medicos.
// localhost:8080/pacientes/consultas.
// localhost:8080/olamundo.
