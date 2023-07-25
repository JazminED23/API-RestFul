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

@Path("/alumnos")
public class AlumnoController {
    @Inject
    private AlumnoService alumnoService;
    @Path("/all")
    @GET
    @Produces("application/json")
    public JsonArray getAll(){
        JsonArrayBuilder builder = Json.createArrayBuilder();
        for (Alumno alumno: alumnoService.getAll()){
            builder.add(Json.createObjectBuilder().add("num_control",alumno.getNum_control()));
        }
        return builder.build();
    }
}

