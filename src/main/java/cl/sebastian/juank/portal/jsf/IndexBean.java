package cl.sebastian.juank.portal.jsf;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Sebastián Salazar Molina <sebasalazar@gmail.com>
 */
@Component
@Scope("view")
@Qualifier("indexBean")
public class IndexBean implements Serializable {

    

}
