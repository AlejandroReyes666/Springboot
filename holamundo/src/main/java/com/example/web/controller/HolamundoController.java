
package com.example.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolamundoController {
    @GetMapping("/hola")
    public String saludar(){

        return"Hola Nunca pares de aprender";
    }
}
