package dev.nardos.springmvc101.services;

import dev.nardos.springmvc101.domain.Course;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Service
@Profile("jpa")
public class CourseServiceJpaImpl implements CourseService {

    private EntityManagerFactory emf;

    @PersistenceUnit
    private void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Course> getAllCourses() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Course", Course.class).getResultList();
    }

    @Override
    public Course getCourseById(String id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Course.class, id);
    }

    @Override
    public Course saveCourse(Course course) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Course crs = em.merge(course);
        em.getTransaction().commit();
        return crs;
    }

    @Override
    public void deleteCourse(String id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Course.class, id));
        em.getTransaction().commit();
    }
}
