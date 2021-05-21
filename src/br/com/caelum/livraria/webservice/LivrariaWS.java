package br.com.caelum.livraria.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import br.com.caelum.livraria.modelo.Livro;

@WebService
@Stateless
public class LivrariaWS {

	public List<Livro> getLivrosPorNome(String nome) {
		
		System.out.println("Procurando o livro " + nome);
		
		return null;
	}
}
