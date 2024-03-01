package consulta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.entidad.Libreria;

public class AltaLibreria {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pruebajpa_libreria");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Libreria libre1 = new Libreria();
        libre1.setNombre("Finestres");
        libre1.setNombreDueno("Jeremias");
        libre1.setDireccion("Calle Diputacion 249 Barcelona");
        
        em.persist(libre1);
        
        Libreria libre2 = new Libreria();
        libre2.setNombre("Altair");
        libre2.setNombreDueno("David");
        libre2.setDireccion("Calle del Pardo 320 Madrid");
        
        em.persist(libre2);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

