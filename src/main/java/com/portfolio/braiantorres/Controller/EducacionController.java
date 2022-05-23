package com.portfolio.braiantorres.Controller;

import com.portfolio.braiantorres.Entity.Educacion;
import com.portfolio.braiantorres.Interface.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping({"/educacion"})
public class EducacionController {
    
    @Autowired
    EducacionService service;
    
    @GetMapping
    public List<Educacion>listar(){
    return service.listar();
    }
    
}
