package persistenciaBD;

import java.util.List;


/**
 *
 * @author Brenda Bojorquez
 * @param <T>
 */
public interface BaseDAO<T> {
    
    public boolean agregar(T entidad);
    
    public boolean actualizar(T entidad);
    
    public boolean eliminar(T entidad);
    
    public T consultarPorID(int id);
    
    public List<T> consultarElementos();
    
}
