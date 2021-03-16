
package objetoNegocio;

/**
 *
 * @author Diana Jiménez
 */
public class Ingrediente {
    int id;
    String nombre;
    boolean incluido;

    public Ingrediente() {
    }

    public Ingrediente(int id, String nombre, boolean incluido) {
        this.id = id;
        this.nombre = nombre;
        this.incluido = incluido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isIncluido() {
        return incluido;
    }

    public void setIncluido(boolean incluido) {
        this.incluido = incluido;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "id=" + id + ", nombre=" + nombre + ", incluido=" + incluido + '}';
    }
    
}
