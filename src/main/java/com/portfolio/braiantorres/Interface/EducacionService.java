
package com.portfolio.braiantorres.Interface;

import com.portfolio.braiantorres.Entity.Educacion;
import java.util.List;


public interface EducacionService {
    List<Educacion>listar();
    Educacion listarId(int id);
    Educacion add(Educacion e);
    Educacion edit(Educacion e);
    Educacion delete(Educacion e);
    
}
