package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta.Conta;

public class AlteraSaldoConta {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta contaLuan = em.find(Conta.class, 1L);
		
		//System.out.println("Conta do Luan->" +  contaLuan.getTitular());
		
		em.getTransaction().begin();
		
		contaLuan.setSaldo(100.0);
		
		em.getTransaction().commit();
	}
}
