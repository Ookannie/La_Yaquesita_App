package objetoNegocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Brenda Bojorquez 
 */
public class Orden {
    int id;
    List <Platillo> platillos;
    List <Platillo> extras;
    Usuario empleado;
    Date fecha;
    double total;
    
    public Orden(){
        platillos = new ArrayList<>();
        extras = new ArrayList<>();
    }

    public Orden(List<Platillo> platillos, List<Platillo> extras, Usuario empleado, Date fecha, double total) {
        this.platillos = platillos;
        this.extras = extras;
        this.empleado = empleado;
        this.fecha = fecha;
        this.total = total;
    }

    public Orden(int id, List<Platillo> platillos, List<Platillo> extras, Usuario empleado, Date fecha, double total) {
        this.id = id;
        this.platillos = platillos;
        this.extras = extras;
        this.empleado = empleado;
        this.fecha = fecha;
        this.total = total;
    }

    
    public List<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(List<Platillo> platillos) {
        this.platillos = platillos;
    }

    public List<Platillo> getExtras() {
        return extras;
    }

    public void setExtras(List<Platillo> extras) {
        this.extras = extras;
    }

    public Usuario getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Usuario empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", platillos=" + platillos + ", extras=" + extras + ", empleado=" + empleado + ", fecha=" + fecha + ", total=" + total + '}';
    }
    
}
