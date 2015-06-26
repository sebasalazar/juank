package cl.sebastian.juank.repository;

import cl.sebastian.juank.modelo.Region;
import javax.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sebastián Salazar Molina <ssalazar@experti.cl>
 */
@Resource(name = "regionRepository")
public interface RegionRepository extends JpaRepository<Region, Integer> {

}
