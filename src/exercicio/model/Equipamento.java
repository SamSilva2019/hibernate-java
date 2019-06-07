package exercicio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Equipamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idEquipamento;
	private String modelo;
	private String marca;
	
	@ManyToOne
	@JoinColumn(name="chamado_equipamento")
	
	private Chamado chamado;
	
	@OneToMany(mappedBy="Equipamento")
	private List<TipoEquipamento> TipEquipamento = new ArrayList<>();
	
	@OneToMany(mappedBy="Localizacao")
	private List<Localizacao> localizacao = new ArrayList<Localizacao>
		
		
	public Equipamento() {
		
	}

	public Integer getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Integer idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Equipamento [idEquipamento=" + idEquipamento + ", modelo=" + modelo + ", marca=" + marca + "]";
	}
	
	
}
