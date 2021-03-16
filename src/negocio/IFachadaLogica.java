package negocio;

import java.util.List;
import objetoNegocio.Platillo;

/**
 *
 * @author Brenda Bojorquez
 */
public interface IFachadaLogica {
    
    public void desplegarProductos();
    
    public void calcularOrden(List<Platillo> listaPlatillo);
    
    public void personalizarPlatillo(Platillo platillo);
}
