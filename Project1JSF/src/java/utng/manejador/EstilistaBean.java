package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.EstilistaDAO;
import utng.modelo.Estilista;

@ManagedBean
@SessionScoped
public class EstilistaBean implements Serializable {

    private List<Estilista> estilistas;
    private Estilista estilista;

    public EstilistaBean() {
    }

    public List<Estilista> getEstilistas() {
        return estilistas;
    }

    public void setEstilistas(List<Estilista> estilistas) {
        this.estilistas = estilistas;
    }

    public Estilista getEstilista() {
        return estilista;
    }

    public void setEstilista(Estilista estilista) {
        this.estilista = estilista;
    }

    public String listar() {
        EstilistaDAO dao = new EstilistaDAO();
        try {
            estilistas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Estilistas";
    }

    public String eliminar() {
        EstilistaDAO dao = new EstilistaDAO();
        try {
            dao.delete(estilista);
            estilistas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar() {
        estilista = new Estilista();
        return "Iniciar";
    }

    public String guardar() {
        EstilistaDAO dao = new EstilistaDAO();
        try {
            if (estilista.getIdEstilista() != 0) {
                dao.update(estilista);
            } else {
                dao.insert(estilista);
            }
            estilistas = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Estilista estilista) {
        this.estilista = estilista;
        return "Editar";
    }

}
