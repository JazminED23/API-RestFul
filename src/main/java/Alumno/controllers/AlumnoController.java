package Alumno.controllers;

import Alumno.models.Alumno;
import Alumno.services.AlumnoService;
import jakarta.inject.Inject;
import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonArrayBuilder;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import javax.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.ws.rs.core.MediaType;

@Path("/alumnos")
public class AlumnoController{
    @Inject
    private AlumnoService alumnoService;
    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonArray getAll(){
        JsonArrayBuilder arrayBuilder  = Json.createArrayBuilder();
        for (Alumno alumno : alumnoService.getAll()) {
            JsonObjectBuilder objectBuilder = Json.createObjectBuilder()
                    .add("num_control", alumno.getNum_control())
                    .add("nombre", alumno.getNombre())
                    .add("apellido", alumno.getApellido())
                    .add("correo", alumno.getCorreo())
                    .add("carrera", alumno.getCarrera())
                    .add("direccion", alumno.getDireccion());
            arrayBuilder.add(objectBuilder);
        }
        return arrayBuilder.build();
    }

}

