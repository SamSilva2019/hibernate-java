package exercicio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Chamado implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idchamado;
	private Date datachamado;
	private String observacao;
	private Boolean aberto;
	
	@OneToMany(mappedBy="chamado")
	private List<Equipamento> Equipamento = new ArrayList<>();
	private Equipamento equipamento;
	
	
	public Chamado() {
		
	}

	public Integer getIdchamado() {
		return idchamado;
	}

	public void setIdchamado(Integer idchamado) {
		this.idchamado = idchamado;
	}

	public Date getDatachamado() {
		return datachamado;
	}

	public void setDatachamado(Date datachamado) {
		this.datachamado = datachamado;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getAberto() {
		return aberto;
	}

	public void setAberto(Boolean aberto) {
		this.aberto = aberto;
	}

	@Override
	public String toString() {
		return "Chamado [idchamado=" + idchamado + ", datachamado=" + datachamado + ", observacao=" + observacao
				+ ", aberto=" + aberto + "]";
	}
	
}
