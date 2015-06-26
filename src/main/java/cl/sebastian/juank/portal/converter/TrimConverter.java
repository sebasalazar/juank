package cl.sebastian.juank.portal.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Sebastián Salazar Molina <sebasalazar@gmail.com>
 */
@FacesConverter("TrimConverter")
public class TrimConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return StringUtils.trimToEmpty(string);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {

        if (o != null) {
            return StringUtils.trimToEmpty(o.toString());
        } else {
            return StringUtils.EMPTY;
        }
    }
}
