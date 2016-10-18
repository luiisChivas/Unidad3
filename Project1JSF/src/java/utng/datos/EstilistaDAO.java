package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Estilista;

public class EstilistaDAO extends DAO<Estilista>{

    public EstilistaDAO() {
        super(new Estilista());
    }

    public Estilista getOneById(Estilista estilista) throws HibernateException {
        return super.getOneById(estilista.getIdEstilista()); 
    }
    
    
    
    
}
