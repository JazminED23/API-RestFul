package Alumno.Repository;

import Alumno.models.Alumno;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@RequestScoped
@Transactional(Transactional.TxType.REQUIRED)
public class AlumnoRepository {
    @Inject
    EntityManager em;
    public <Int> Alumno findById(int Num_control){
        return em.find(Alumno.class, Num_control);
    }
    public List<Alumno> listAll(){
        return em.createQuery("select a from Alumno a",Alumno.class).getResultList();
    }

    public Alumno save(Alumno alumno){
        em.persist(alumno);
        return alumno;
    }
    public Alumno update(Alumno alumno){
        return em.merge(alumno);
    }
    public void delete(Alumno alumno){
        em.remove(alumno);
    }
}
