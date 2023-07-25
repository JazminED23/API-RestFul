package Alumno.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALUMNOS")
public class Alumno {
    private Integer num_control;
    private String nombre;
    private String apellido;
    private String correo;
    private String carrera;
    private String direccion;
    @Id
    public Integer getNum_control(){
        return num_control;
    }
    public void setNum_control(Integer num_control){
        this.num_control=num_control;
    }


}
