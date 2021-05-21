package br.com.caelum.livraria.service;

import javax.ejb.ApplicationException;

//configuração para configurar uma application exception em rollback = true
//uma exception checked sempre é uma applicationException
//sem essa anotação, não faz o rollback
@ApplicationException(rollback = true)
public class LivrariaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7062517738171329266L; //runTimeException é unchecked!

	
}
