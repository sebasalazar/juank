package cl.sebastian.juank.modelo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author Sebastián Salazar Molina <sebasalazar@gmail.com>
 */
@XmlRootElement
public class BaseBean implements Serializable {

    private static final long serialVersionUID = -572159829033690039L;

    /**
     * Muestra un objeto en un formato más legible
     *
     * @return Un string con la descripción del objeto
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(
                this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
