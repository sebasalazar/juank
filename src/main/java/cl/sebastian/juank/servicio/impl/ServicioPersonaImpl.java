package cl.sebastian.juank.servicio.impl;

import cl.sebastian.juank.modelo.Persona;
import cl.sebastian.juank.repository.PersonaRepository;
import cl.sebastian.juank.servicio.ServicioPersona;
import java.io.Serializable;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sebastián Salazar Molina <ssalazar@experti.cl>
 */
@Service("servicioPersona")
public class ServicioPersonaImpl implements ServicioPersona, Serializable {

    @Resource(name = "personaRepository")
    private PersonaRepository personaRepository;
    private final static Logger logger = LoggerFactory.getLogger(ServicioPersonaImpl.class);

    @Override
    @Transactional
    public Persona guardar(Persona persona) {
        Persona resultado = null;
        try {
            if (persona != null) {
                resultado = personaRepository.save(persona);
            }
        } catch (Exception e) {
            resultado = null;
            logger.error("Error al guardar Persona: {}", e.toString());
            logger.debug("Error al guardar Persona: {}", e.toString(), e);
        }
        return resultado;
    }
}
