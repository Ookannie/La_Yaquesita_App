package objetoNegocio;

import enumeradores.TipoProducto;

/**
 *
 * @author Brenda Bojorquez
 */
public class Platillo {
    int id;
    TipoProducto producto;
    String nombre;
    String descripcion;
    float costo;

    public Platillo() {
    }

    public Platillo(int id, TipoProducto producto, String nombre, String descripcion, float costo) {
        this.id = id;
        this.producto = producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Platillo(int id, TipoProducto producto, String nombre, float costo) {
        this.id = id;
        this.producto = producto;
        this.nombre = nombre;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public TipoProducto getProducto() {
        return producto;
    }

    public void setProducto(TipoProducto producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Platillo{" + "id=" + id + ", producto=" + producto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", costo=" + costo + '}';
    }
    
    
    
}
