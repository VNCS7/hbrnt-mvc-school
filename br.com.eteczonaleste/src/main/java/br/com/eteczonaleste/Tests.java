package br.com.eteczonaleste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Professor;

public class Tests {
	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		Curso c = new Curso();
		Disciplina d = new Disciplina();
		Professor p = new Professor();
		
		a.setNome("Vinícius Alves");
		a.setRg("37.600.640/7");
		a.setCpf("473.140.228/01");
		a.setCep("08474120");
		a.setEndereco("R. Milagre dos Peixes");
		a.setBairro("Castro Alves");
		a.setIdCurso(1);
		
		c.setNome("Técnico em Informática");
		c.setCargaHoraria(1500);
		
		d.setNomeDisciplina("Programação de Computadores II");
		d.setCargaHoraria(10);
		
		p.setNome("Jeferson");
		p.setRg("00.000.000/0");
		p.setCpf("000.000.000/01");
		p.setCep("00000000");
		p.setEndereco("AV. Águia de Haia");
		p.setBairro("Cid. AE Carvalho");
		
	
		
		//DEFINIÇÃO DOS VALORES
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
		
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(a);
		em.persist(c);
		em.persist(d);
		em.persist(p);
		em.getTransaction().commit();

		em.close();
		emf.close();
		
	}

}
