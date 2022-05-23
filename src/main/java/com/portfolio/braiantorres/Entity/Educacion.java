
package com.portfolio.braiantorres.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 @Table(name="Educacion")
public class Educacion {
     
     @Id
     @Column
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     @Column
     private String nombre;
     @Column
     private String anio_inicio;
     @Column
     private String anio_fin;
     @Column
     private String detalle;
     @Column
     private String img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio_inicio() {
        return anio_inicio;
    }

    public void setAnio_inicio(String anio_inicio) {
        this.anio_inicio = anio_inicio;
    }

    public String getAnio_fin() {
        return anio_fin;
    }

    public void setAnio_fin(String anio_fin) {
        this.anio_fin = anio_fin;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
   
}
