//Importamos las librerias necesarias para trabajar con jpa y la base de datos.
import javax.persistence.*;

// Esta clase se encarga de insertar los proveedores en la base de datos.

public class InsertarProveedores {
    public static void main(String[] args) {
        // Creamos el EntityManagerFactory para la base de datos a partir de la unidad definida en el archivo persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBD");

        // EntityManager es el objeto que nos permite interactuar con la base de datos.
        EntityManager em = emf.createEntityManager();

        // Iniciamos una transacción para insertar los datos.
        em.getTransaction().begin();

        //Creamos varios proveedores.
        Proveedor proveedor1 = new Proveedor("Juan", "Pérez", "Calle Falsa 123", "123456789", "A12345678", "España");
        Proveedor proveedor2 = new Proveedor("María", "Gómez", "Avenida Siempre Viva 456", "987654321", "B87654321", "México");
        Proveedor proveedor3 = new Proveedor("Carlos", "López", "Calle Real 789", "456789123", "C23456789", "Argentina");
        Proveedor proveedor4 = new Proveedor("Ana", "Martínez", "Calle Luna 101", "321654987", "D34567890", "Colombia");
        Proveedor proveedor5 = new Proveedor("Luis", "Fernández", "Calle Sol 202", "654321789", "E45678901", "Francia");
        Proveedor proveedor6 = new Proveedor("Laura", "Sánchez", "Calle Mar 303", "789123456", "F56789012", "Perú");
        Proveedor proveedor7 = new Proveedor("Pedro", "Ramírez", "Calle Tierra 404", "159753486", "G67890123", "Estados Unidos");
        Proveedor proveedor8 = new Proveedor("Sofía", "Torres", "Calle Aire 505", "753159486", "H78901234", "Ecuador");
        Proveedor proveedor9 = new Proveedor("Diego", "Hernández", "Calle Agua 606", "951753486", "I89012345", "Paraguay");
        Proveedor proveedor10 = new Proveedor("Isabel", "Jiménez", "Calle Fuego 707", "357159486", "J90123456", "Uruguay");
        Proveedor proveedor11 = new Proveedor("Andrés", "García", "Calle Tierra 808", "159753486", "K01234567", "Bolivia");
        Proveedor proveedor12 = new Proveedor("Patricia", "Cruz", "Calle Nieve 909", "753159486", "L12345678", "Cuba");
        Proveedor proveedor13 = new Proveedor("Fernando", "Morales", "Calle Viento 1010", "951753486", "M23456789", "España");
        Proveedor proveedor14 = new Proveedor("Gabriela", "Salazar", "Calle Luz 1111", "357159486", "N34567890", "España");
        Proveedor proveedor15 = new Proveedor("Javier", "Mendoza", "Calle Sombra 1212", "159753486", "O45678901", "Honduras");
        Proveedor proveedor16 = new Proveedor("Claudia", "Paredes", "Calle Estrella 1313", "753159486", "P56789012", "Estados Unidos");
        Proveedor proveedor17 = new Proveedor("Ricardo", "Ríos", "Calle Océano 1414", "951753486", "Q67890123", "El Salvador");
        Proveedor proveedor18 = new Proveedor("Verónica", "Cordero", "Calle Mariposa 1515", "357159486", "R78901234", "China");
        Proveedor proveedor19 = new Proveedor("Eduardo", "Vega", "Calle Jaguar 1616", "159753486", "S89012345", "China");
        Proveedor proveedor20 = new Proveedor("Natalia", "Cabrera", "Calle Serpiente 1717", "753159486", "T90123456", "Panamá");
        Proveedor proveedor21 = new Proveedor("Alberto", "Salinas", "Calle León 1818", "951753486", "U01234567", "Paraguay");
        Proveedor proveedor22 = new Proveedor("Mónica", "Pérez", "Calle Tigre 1919", "357159486", "V12345678", "Chile");
        Proveedor proveedor23 = new Proveedor("Hugo", "González", "Calle Águila 2020", "159753486", "W23456789", "España");
        Proveedor proveedor24 = new Proveedor("Silvia", "Mora", "Calle Búho 2121", "753159486", "X34567890", "Venezuela");
        Proveedor proveedor25 = new Proveedor("Raúl", "Cano", "Calle Republica 2", "951753486", "X65678541", "Ecuador");
        Proveedor proveedor26 = new Proveedor("MArio", "Cano", "Calle Halcón 2222", "951753486", "Y45678901", "Alemania");
        Proveedor proveedor27 = new Proveedor("Patricia", "Cano", "Calle Sol y luna 5622", "951753486", "Y45673651", "Alemania");

        // Insertamos los proveedores en la base de datos.
        em.persist(proveedor1);
        em.persist(proveedor2);
        em.persist(proveedor3);
        em.persist(proveedor4);
        em.persist(proveedor5);
        em.persist(proveedor6);
        em.persist(proveedor7);
        em.persist(proveedor8);
        em.persist(proveedor9);
        em.persist(proveedor10);
        em.persist(proveedor11);
        em.persist(proveedor12);
        em.persist(proveedor13);
        em.persist(proveedor14);
        em.persist(proveedor15);
        em.persist(proveedor16);
        em.persist(proveedor17);
        em.persist(proveedor18);
        em.persist(proveedor19);
        em.persist(proveedor20);
        em.persist(proveedor21);
        em.persist(proveedor22);
        em.persist(proveedor23);
        em.persist(proveedor24);
        em.persist(proveedor25);
        em.persist(proveedor26);
        em.persist(proveedor27);
        // Confirmamos la transacción.
        em.getTransaction().commit();
        // Cerramos el EntityManager y el EntityManagerFactory.
        em.close();
        emf.close();
        // Imprimimos un mensaje de éxito.
        System.out.println("Proveedores insertados correctamente.");

    }
}