package com.portfolio.braiantorres.Service;

import com.portfolio.braiantorres.Entity.Educacion;
import com.portfolio.braiantorres.Interface.EducacionService;
import com.portfolio.braiantorres.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceImp implements EducacionService{
    @Autowired
    private EducacionRepository repository;
    @Override
    public List<Educacion> listar() {
        return repository.findAll();
    }

    @Override
    public Educacion listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Educacion add(Educacion e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Educacion edit(Educacion e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Educacion delete(Educacion e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
