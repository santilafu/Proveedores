//Importamos las librerias necesarias para Serializar con Java y ObjectDB.
import javax.persistence.*;
import java.io.Serializable;

//Creamos Entidad Proveedor que implementa Serializable.
@Entity
public class Proveedor implements Serializable {
    //Creamos los atributos de la clase Proveedor.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String cif;
    private String pais;

    //Creamos contructor que obliga ObjectDB.
    public Proveedor() {
    }

    //Creamos el constructor de la clase Proveedor.
    public Proveedor(String nombre, String apellido, String direccion, String telefono, String cif, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cif = cif;
        this.pais = pais;
    }
    //Creamos los getters y setters de la clase Proveedor.
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    //Creamos el metodo toString de la clase Proveedor.
    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cif='" + cif + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
