package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.ActrizDAO;
import utng.datos.EstilistaDAO;
import utng.modelo.Actriz;
import utng.modelo.Estilista;

@ManagedBean 
@SessionScoped
public class ActrizBean implements Serializable{
    private List<Actriz> actrices;
    private Actriz actriz;
    private List<Estilista> estilistas;
    
    public ActrizBean(){
        actriz = new Actriz();
        actriz.setEstilista(new Estilista());
    }

    public List<Actriz> getActrices() {
        return actrices;
    }

    public void setActrices(List<Actriz> actrices) {
        this.actrices = actrices;
    }

    public Actriz getActriz() {
        return actriz;
    }

    public void setActriz(Actriz actriz) {
        this.actriz = actriz;
    }

    public List<Estilista> getEstilistas() {
        return estilistas;
    }

    public void setEstilistas(List<Estilista> estilistas) {
        this.estilistas = estilistas;
    }
    
       public String listar(){
        ActrizDAO dao = new ActrizDAO();
        try {
            actrices=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Actrices";
    }
       
       public String eliminar(){
      ActrizDAO dao = new ActrizDAO();
        try {
            dao.delete(actriz);
            actrices=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        actriz= new Actriz();
        actriz.setEstilista(new Estilista());
        try {
            estilistas= new EstilistaDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }
    
    public String guardar(){
         ActrizDAO dao = new ActrizDAO();
        try {
            if(actriz.getIdActriz()!= 0){
                dao.update(actriz);
            }else {
                dao.insert(actriz);
            }
            actrices=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Actriz actriz){
        this.actriz=actriz;
        try {
            estilistas = new EstilistaDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }    
}
