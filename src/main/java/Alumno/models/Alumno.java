package Alumno.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALUMNOS")
public class Alumno {
    private int num_control;
    private String nombre;
    private String apellido;
    private String correo;
    private String carrera;
    private String direccion;

    public Alumno(int num_control, String nombre, String apellido, String correo, String carrera, String direccion) {
        this.num_control = num_control;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.carrera = carrera;
        this.direccion = direccion;
    }



    @Id
    public int getNum_control(){
        return num_control;
    }
    public void setNum_control(int num_control){
        this.num_control=num_control;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

}
