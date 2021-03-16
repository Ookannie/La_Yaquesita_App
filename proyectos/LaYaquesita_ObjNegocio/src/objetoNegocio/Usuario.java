package objetoNegocio;

import enumeradores.TipoUsuario;

/**
 *
 * @author Brenda Bojorquez
 */
public class Usuario {
    int id;
    String nombre;
    String contra;
    TipoUsuario puesto;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String contra, TipoUsuario puesto) {
        this.id=id;
        this.nombre = nombre;
        this.contra = contra;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public TipoUsuario getPuesto() {
        return puesto;
    }

    public void setPuesto(TipoUsuario puesto) {
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", contra=" + contra + ", puesto=" + puesto + '}';
    }
    
    
    
}
