package br.com.caelum.livraria.service;

import javax.ejb.ApplicationException;

//configura��o para configurar uma application exception em rollback = true
//uma exception checked sempre � uma applicationException
//sem essa anota��o, n�o faz o rollback
@ApplicationException(rollback = true)
public class LivrariaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7062517738171329266L; //runTimeException � unchecked!

	
}
