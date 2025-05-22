// Importamos Clases necsarias para gestionar consultas con JPA.
import java.util.List;
import javax.persistence.*;

// Esta clase se encarga de mostrar los proveedores en la base de datos.
public class MostrarProveedores {
    public static void main(String[] args) {
        // Creamos el EntityManagerFactory para la base de datos a partir de la unidad definida en el archivo persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");

        // EntityManager es el objeto que nos permite interactuar con la base de datos.
        EntityManager em = emf.createEntityManager();

        // JPQL: selecciona los proveedores cuyo país sea España y ordena por nombre ascendente
        String jpql = "SELECT p FROM Proveedor p WHERE p.pais = 'España' ORDER BY p.nombre ASC";

        // Ejecutamos la consulta y obtenemos la lista de resultados
        List<Proveedor> lista = em.createQuery(jpql, Proveedor.class).getResultList();

        // Mostramos los proveedores de España en consola
        System.out.println("=== PROVEEDORES DE ESPAÑA ===");
        for (Proveedor p : lista) {
            System.out.println(p);
        }

        // Cerramos las conexiones
        em.close();
        emf.close();
    }
}