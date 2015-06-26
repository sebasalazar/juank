package cl.sebastian.juank.servicio;

import cl.sebastian.juank.modelo.Comuna;
import cl.sebastian.juank.modelo.Provincia;
import cl.sebastian.juank.modelo.Region;
import java.util.List;

/**
 *
 * @author Sebastián Salazar Molina <ssalazar@experti.cl>
 */
public interface ServicioGeografico {

    public List<Region> consultarRegiones();

    public List<Provincia> consultarProvincias(Region region);

    public List<Comuna> consultarComunas(Provincia provincia);
}
