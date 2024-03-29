package modelo.entidad.nuevo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import antlr.collections.List;

@Entity
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private String modelo;

    @ManyToMany
    private List empleados;

	public Coche() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", empleados=" + empleados + "]";
	}



  
}