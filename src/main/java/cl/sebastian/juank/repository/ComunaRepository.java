package cl.sebastian.juank.repository;

import cl.sebastian.juank.modelo.Comuna;
import cl.sebastian.juank.modelo.Provincia;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sebastián Salazar Molina <ssalazar@experti.cl>
 */
@Resource(name = "comunaRepository")
public interface ComunaRepository extends JpaRepository<Comuna, Integer> {

    public List<Comuna> findByProvincia(Provincia provincia);
}
