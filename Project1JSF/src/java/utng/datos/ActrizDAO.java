package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Actriz;

/**
 *
 * @author juan-
 */
public class ActrizDAO  extends DAO<Actriz>{

    public ActrizDAO() {
        super(new Actriz());
    }    
     public Actriz getOneById(Actriz actriz) throws HibernateException {
        return super.getOneById(actriz.getIdActriz()); 
    }
    
}
