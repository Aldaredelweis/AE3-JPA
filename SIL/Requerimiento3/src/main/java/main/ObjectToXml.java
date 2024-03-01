package main;
import javax.xml.bind.*;

import entidad.Articulos;

import java.util.*;

public class ObjectToXml {
    public static void main(String[] args) {
        try {
           
            JAXBContext context = JAXBContext.newInstance(Articulos.class);

           
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

           
            List<Articulos> articulos = new ArrayList<Articulos>();
            Articulos articulo1 = new Articulos();
            articulo1.setNombre("Articulo 1");
            articulo1.setPrecio(100.0);
            articulos.add(articulo1);

            Articulos articulo2 = new Articulos();
            articulo2.setNombre("Articulo 2");
            articulo2.setPrecio(200.0);
            articulos.add(articulo2);

            Articulos articulo3 = new Articulos();
            articulo3.setNombre("Articulo 3");
            articulo3.setPrecio(300.0);
            articulos.add(articulo3);

            for (Articulos articulo : articulos) {
                marshaller.marshal(articulo, System.out);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
