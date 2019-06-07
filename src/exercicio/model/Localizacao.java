package exercicio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Localizacao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	private Integer numeroSala;
	private String descricao;
	
	
	
	public Localizacao() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(Integer numeroSala) {
		this.numeroSala = numeroSala;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Localizacao [id=" + id + ", numeroSala=" + numeroSala + ", descricao=" + descricao + "]";
	}
	
	
}
