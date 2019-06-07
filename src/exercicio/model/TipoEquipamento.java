package exercicio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TipoEquipamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	private String nomeTipoEquipamento;
	
	@ManyToOne
	@JoinColumn(name="TipoEquipamento_Equipamento")
	
	private Equipamento Equipamento;
	
	public TipoEquipamento() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeTipoEquipamento() {
		return nomeTipoEquipamento;
	}
	public void setNomeTipoEquipamento(String nomeTipoEquipamento) {
		this.nomeTipoEquipamento = nomeTipoEquipamento;
	}
	@Override
	public String toString() {
		return "TipoEquipamento [id=" + id + ", nomeTipoEquipamento=" + nomeTipoEquipamento + "]";
	}
	
	
	
	
	
	
}
