package com.cesars.api.services.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cesars.api.services.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/")
public class ConsultaController {
    @Autowired
    ConsultaService consultaService;

    @GetMapping("api/{id}")
    public Object getCharacter(@PathVariable int id){
        return consultaService.getDataById(id);
    }
    
    @GetMapping()
    public Object getAll(){
        return consultaService.getData();
    }
}
