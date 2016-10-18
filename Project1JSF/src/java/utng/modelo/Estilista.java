package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estilista")
public class Estilista implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estilista")
    private Long idEstilista;
    @Column(length = 30)
    private String nombre;
    @Column(length = 50)
    private String ciudad;
    @Column(length = 30)
    private String Colonia;

    public Estilista() {
        this.idEstilista = 0L;
    }

    public Long getIdEstilista() {
        return idEstilista;
    }

    public void setIdEstilista(Long idEstilista) {
        this.idEstilista = idEstilista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

}
