package teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setIdPessoa(1);
		pessoa.setNome("Vinícius");
		
		
		SessionFactory factor = new Configuration().configure().buildSessionFactory();
		Session session = factor.openSession();
		session.beginTransaction();
		
		session.save(pessoa);
		session.getTransaction().commit();
		session.close();
		
	}

}
