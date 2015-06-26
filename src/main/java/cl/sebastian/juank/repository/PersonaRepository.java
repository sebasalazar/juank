package cl.sebastian.juank.repository;

import cl.sebastian.juank.modelo.Persona;
import javax.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sebastián Salazar Molina <ssalazar@experti.cl>
 */
@Resource(name = "personaRepository")
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
