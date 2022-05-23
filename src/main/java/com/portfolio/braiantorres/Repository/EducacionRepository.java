package com.portfolio.braiantorres.Repository;

import com.portfolio.braiantorres.Entity.Educacion;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface EducacionRepository extends Repository<Educacion, Integer> {
    List<Educacion>findAll();
    Educacion findOne(int id);
    Educacion save(Educacion e);
    void delete(Educacion e);
    
    
}
