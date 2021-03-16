package controles;

import java.util.List;
import objetoNegocio.Orden;

/**
 *
 * @author Brenda Bojorquez
 */
public class ControlOrden implements ControlFactory<Orden>{

   @Override
    public boolean agregar(Orden entidad) {
        return false;
    }

    @Override
    public boolean actualizar(Orden entidad) {
        return false;
    }

    @Override
    public boolean eliminar(Orden entidad) {
        return false;
    }

    @Override
    public Orden consultarPorID(int id) {
        return null;
    }

    @Override
    public List<Orden> consultarElementos() {
        return null;
    }
    
}
