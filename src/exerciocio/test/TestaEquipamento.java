package exerciocio.test;

import exercicio.model.Equipamento;
import exercicio.persistence.DAOEquipamento;

public class TestaEquipamento{

	public static void main(String args[]) {
		
		Equipamento equipamento = new Equipamento();
		equipamento.setModelo("FIAT");
		
		try {
		DAOEquipamento dao = new DAOEquipamento();
		dao.cadastrar(equipamento);
		System.out.println("Cadastrado com Sucesso");
		
		}catch(Exception e) {
			System.out.println("Erro");
			e.printStackTrace();
		}
		
	}
}
