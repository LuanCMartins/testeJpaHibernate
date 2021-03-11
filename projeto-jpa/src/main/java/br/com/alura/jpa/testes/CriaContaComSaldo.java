package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta.Conta;

public class CriaContaComSaldo {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();

		Conta conta = new Conta();
		conta.setTitular("Giovanna");
		conta.setNumero(55976);
		conta.setAgencia(3482);
		conta.setSaldo(1000.0);

		em.getTransaction().begin();

		em.persist(conta);

		em.getTransaction().commit();
	}
}
