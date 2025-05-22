# 🧾 Actividad de Evaluación – Unidad 8: Proveedores con ObjectDB

Este proyecto forma parte de la actividad de evaluación de la Unidad 8 del módulo de Programación de 1º DAM.  
En esta práctica he trabajado con una base de datos orientada a objetos (ObjectDB) desde Java, para insertar y consultar información sobre proveedores.

---

## 🎯 Objetivo de la actividad

- Crear una base de datos llamada `Empresa.odb`
- Insertar al menos 10 proveedores con los siguientes datos:
    - `id` (autogenerado)
    - `nombre`
    - `CIF`
    - `país`
- Mostrar **solo los proveedores de España**, ordenados **alfabéticamente por nombre**

---

## 🛠️ Tecnologías utilizadas

- Lenguaje: Java 24
- Entorno: IntelliJ IDEA
- Base de datos: ObjectDB
- Librerías: JPA (`javax.persistence`)

---

## 📁 Estructura del proyecto
ProveedoresObjectDB/
├── src/
│ ├── Proveedor.java
│ ├── InsertarProveedores.java
│ ├── MostrarProveedores.java
│ └── META-INF/
│ └── persistence.xml
├── db/
│ └── Empresa.odb
└── objectdb.jar

---

## 👨‍💻 Clase: `Proveedor.java`

Contiene la entidad que se almacena en la base de datos. He utilizado las anotaciones de JPA para definir los atributos:

```java
@Entity
public class Proveedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String cif;
    private String pais;

    public Proveedor() {}
    public Proveedor(String nombre, String cif, String pais) {
        this.nombre = nombre;
        this.cif = cif;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Proveedor{id=" + id + ", nombre='" + nombre + "', CIF='" + cif + "', país='" + pais + "'}";
    }
}
```
## 👨‍💻 Clase: `InsertarProveedores.java`
Esta clase se encarga de insertar los proveedores en la base de datos. He utilizado un `EntityManager` para gestionar la conexión y las transacciones. He creado un método `insertarProveedores` que recibe una lista de proveedores y los inserta en la base de datos.

## 👨‍💻 Clase: `MostrarProveedores.java`
Esta clase se encarga de mostrar los proveedores de España. He utilizado una consulta JPQL para filtrar y ordenar los resultados. He creado un método `mostrarProveedores` que recibe el `EntityManager` y muestra los proveedores en la consola.

```java

        // JPQL: selecciona los proveedores cuyo país sea España y ordena por nombre ascendente
        String jpql = "SELECT p FROM Proveedor p WHERE p.pais = 'España' ORDER BY p.nombre ASC";

        // Ejecutamos la consulta y obtenemos la lista de resultados
        List<Proveedor> lista = em.createQuery(jpql, Proveedor.class).getResultList();

        // Mostramos los proveedores de España en consola
        System.out.println("=== PROVEEDORES DE ESPAÑA ===");
        for (Proveedor p : lista) {
            System.out.println(p);
        }
```
## Al finalizar la ejecución de la clase `MostrarProveedores`, se mostrará en consola una lista de proveedores de España ordenados alfabéticamente por nombre.
```java
Proveedor{id=13, nombre='Fernando', apellido='Morales', direccion='Calle Viento 1010', telefono='951753486', cif='M23456789', pais='España'}
Proveedor{id=14, nombre='Gabriela', apellido='Salazar', direccion='Calle Luz 1111', telefono='357159486', cif='N34567890', pais='España'}
Proveedor{id=23, nombre='Hugo', apellido='González', direccion='Calle Águila 2020', telefono='159753486', cif='W23456789', pais='España'}
Proveedor{id=1, nombre='Juan', apellido='Pérez', direccion='Calle Falsa 123', telefono='123456789', cif='A12345678', pais='España'}
```
## 📁 Archivo: `persistence.xml`
Este archivo contiene la configuración de la unidad de persistencia. He definido el nombre de la base de datos y el proveedor de JPA (ObjectDB). Aquí está el contenido del archivo:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
             version="2.0">
    <persistence-unit name="miBD">
        <provider>com.objectdb.jpa.Provider</provider>
        <class>Proveedor</class>
        <properties>
            <property name="javax.persistence.jdbc.url" value="db/proveedores.odb"/>
        </properties>
    </persistence-unit>
</persistence>
```
## 📁 Archivo: `objectdb.jar`
Este archivo es la librería de ObjectDB que se utiliza para gestionar la base de datos. Debe estar en el classpath del proyecto para que funcione correctamente. Puedes descargarlo desde la [página oficial de ObjectDB](https://www.objectdb.com/download).

## 🧑🏻‍🎓 AUTOR
Santiago Lafuente Hernández
Estudiante de 1º DAM
Actividad de Evaluación – Unidad 8 Modulo de Programación


