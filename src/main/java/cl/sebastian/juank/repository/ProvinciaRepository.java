package cl.sebastian.juank.repository;

import cl.sebastian.juank.modelo.Provincia;
import cl.sebastian.juank.modelo.Region;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sebastián Salazar Molina <ssalazar@experti.cl>
 */
@Resource(name = "provinciaRepository")
public interface ProvinciaRepository extends JpaRepository<Provincia, Integer> {

    public List<Provincia> findByRegion(Region region);
}
