package br.com.caelum.livraria.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.interceptor.LogInterceptor;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER) //opcional, já que é implicito
//@Interceptors({LogInterceptor.class})//anotação para utilizar o interceptor nessa classe
public class AutorDao {

	//anotação de injeção de dependencia do JPA
	@PersistenceContext
	private EntityManager em;

	//metodo callback - é disparado apos a criacao do sessionBean stateless
	@PostConstruct
	void aposCriacao() {
		System.out.println("AutorDao foi criado");
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void salva(Autor autor) {
		
		System.out.println("salvando autor " + autor.getNome());
		em.persist(autor);
	}
	
	public List<Autor> todosAutores() {
		return em.createQuery("select a from Autor a", Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = this.em.find(Autor.class, autorId);
		return autor;
	}
	
}
