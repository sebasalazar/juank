package cl.sebastian.juank.servicio.impl;

import cl.sebastian.juank.modelo.Comuna;
import cl.sebastian.juank.modelo.Provincia;
import cl.sebastian.juank.modelo.Region;
import cl.sebastian.juank.repository.ComunaRepository;
import cl.sebastian.juank.repository.ProvinciaRepository;
import cl.sebastian.juank.repository.RegionRepository;
import cl.sebastian.juank.servicio.ServicioGeografico;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sebastián Salazar Molina <ssalazar@experti.cl>
 */
@Service("servicioGeografico")
public class ServicioGeograficoImpl implements ServicioGeografico, Serializable {

    @Resource(name = "regionRepository")
    private RegionRepository regionRepository;
    @Resource(name = "provinciaRepository")
    private ProvinciaRepository provinciaRepository;
    @Resource(name = "comunaRepository")
    private ComunaRepository comunaRepository;
    private final static Logger logger = LoggerFactory.getLogger(ServicioGeograficoImpl.class);

    public List<Region> consultarRegiones() {
        List<Region> regiones = new ArrayList<Region>();
        try {
            regiones = regionRepository.findAll();
        } catch (Exception e) {
            regiones = new ArrayList<Region>();
            logger.error("Error al consultar Regiones: {}", e.toString());
            logger.debug("Error al consultar Regiones: {}", e.toString(), e);
        }
        return regiones;
    }

    public List<Provincia> consultarProvincias(Region region) {
        List<Provincia> provincias = new ArrayList<Provincia>();
        try {
            if (region != null) {
                provincias = provinciaRepository.findByRegion(region);
            }
        } catch (Exception e) {
            provincias = new ArrayList<Provincia>();
            logger.error("Error al consultar provincia: {}", e.toString());
            logger.debug("Error al consultar provincia: {}", e.toString(), e);
        }
        return provincias;
    }

    public List<Comuna> consultarComunas(Provincia provincia) {
        List<Comuna> comunas = new ArrayList<Comuna>();
        try {
            if (provincia != null) {
                comunas = comunaRepository.findByProvincia(provincia);
            }
        } catch (Exception e) {
            comunas = new ArrayList<Comuna>();
            logger.error("Error al consultar comunas: {}", e.toString());
            logger.debug("Error al consultar comunas: {}", e.toString(), e);
        }
        return comunas;
    }
}
