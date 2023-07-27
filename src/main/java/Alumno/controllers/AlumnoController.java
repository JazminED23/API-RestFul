package Alumno.controllers;

import Alumno.Repository.AlumnoRepository;
import Alumno.models.Alumno;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

@Path("/alumnos")
@Produces("application/json")
@Consumes("application/json")
@Transactional
public class AlumnoController{

AlumnoRepository alumnoRepository;
@Inject
public AlumnoController(AlumnoRepository alumnoRepository){
    this.alumnoRepository=alumnoRepository;
}
@GET
    public List<Alumno> listAll(){

    return alumnoRepository.listAll();
}
    @GET
    @Path("/{Num_control}")
    public Alumno getById(@PathParam("Num_control")int Num_control){
    return alumnoRepository.findById(Num_control);
    }
    @POST
    public Response create(Alumno alumno){
    alumnoRepository.save(alumno);
    return Response.created(
            URI.create("/alumnos"+alumno.getNum_control())
    ).build();
    }
    @PUT
    @Path("/{Num_control}")
    public Response update(@PathParam("Num_control") int Num_control,Alumno alumno){
    alumnoRepository.update(alumno);
    return Response.ok().build();
    }
    @DELETE
    @Path("{Num_control}")
    public Response delete(@PathParam("Num_control") int Num_control) {
        Alumno alumno = alumnoRepository.findById(Num_control);
        if (alumno == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        } else {
            alumnoRepository.delete(alumno);
            return Response.ok().build();
        }
    }
}

