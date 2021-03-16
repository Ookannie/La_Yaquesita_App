package persistenciaBD;

import java.util.List;
import objetoNegocio.Orden;

/**
 *
 * @author Brenda Bojorquez
 */
public class OrdenDAO implements BaseDAO<Orden>{

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
