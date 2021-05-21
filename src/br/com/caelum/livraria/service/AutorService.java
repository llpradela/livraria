package br.com.caelum.livraria.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {

	@Inject
	private AutorDao dao;
	
	//required
	public void adiciona(Autor autor) {
		//regra de negocio aqui!!!!
		dao.salva(autor);
	}

	public List<Autor> todosAutores() {
		//regra de negocio aqui!!!!
		return dao.todosAutores();
	}
}
