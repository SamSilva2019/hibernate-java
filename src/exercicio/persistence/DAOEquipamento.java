package exercicio.persistence;

import exercicio.model.Equipamento;

public class DAOEquipamento extends DAO {
	
	public DAOEquipamento() {
		super();
	}
	
	public void cadastrar (Equipamento e) {
		
		entityManager.getTransaction().begin();//Inicia uma transação
		entityManager.persist(e);//objeto a ser cadastrado
		entityManager.getTransaction().commit(); //executa o cadastro
		entityManager.close(); //fecha a conexação
	}
}
