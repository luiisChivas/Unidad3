package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "actriz")
public class Actriz implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actriz")
    private Long idActriz;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String apellidoPaterno;
    @Column(length = 30)
    private String apelllidoMaterno;

    @ManyToOne
    @JoinColumn(name = "id_estilista")
    private Estilista estilista;

    public Actriz(Long idActriz, String nombre, String apellidoPaterno, String apelllidoMaterno, Estilista estilista) {
        this.idActriz = idActriz;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apelllidoMaterno = apelllidoMaterno;
        this.estilista = estilista;
    }

    public Actriz() {
        this.idActriz = 0L;
    }

    public Long getIdActriz() {
        return idActriz;
    }

    public void setIdActriz(Long idActriz) {
        this.idActriz = idActriz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApelllidoMaterno() {
        return apelllidoMaterno;
    }

    public void setApelllidoMaterno(String apelllidoMaterno) {
        this.apelllidoMaterno = apelllidoMaterno;
    }

    public Estilista getEstilista() {
        return estilista;
    }

    public void setEstilista(Estilista estilista) {
        this.estilista = estilista;
    }

}
