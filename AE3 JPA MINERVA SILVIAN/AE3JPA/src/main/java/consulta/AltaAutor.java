package consulta;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelo.entidad.Autor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AltaAutor {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pruebajpa_libreria");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

       
        Autor autor1 = new Autor();
        autor1.setNombre("Ken");
        autor1.setApellidos("Follet");
        autor1.setFechaNacimiento(parseDate("1949-06-05")); 
        em.persist(autor1);

       
        Autor autor2 = new Autor();
        autor2.setNombre("Cristian");
        autor2.setApellidos("Jacq");
        autor2.setFechaNacimiento(parseDate("1947-04-28"));

        em.persist(autor2);

      
        Autor autor3 = new Autor();
        autor3.setNombre("John");
        autor3.setApellidos("Katzenbach");
        autor3.setFechaNacimiento(parseDate("1950-06-23"));

        em.persist(autor3);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }

    
    private static Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}