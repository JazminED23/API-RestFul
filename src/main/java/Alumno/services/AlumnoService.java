package Alumno.services;

import Alumno.models.Alumno;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.List;
@Stateless
public class AlumnoService {
    @PersistenceContext
    private EntityManager em;
    public List<Alumno> getAll(){
        TypedQuery<Alumno> query= em.createQuery("select a from Alumno a", Alumno.class);
        return query.getResultList();
    }
}
