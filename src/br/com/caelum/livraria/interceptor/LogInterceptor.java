package br.com.caelum.livraria.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptor {

	@AroundInvoke
	public Object intercepta(InvocationContext context) throws Exception {

		long milisec = System.currentTimeMillis();

		//essa linha � a chamada dos metodos que ser�o interceptados
		Object proceed = context.proceed();
		
		String name = context.getMethod().getName();
		String simpleName = context.getTarget().getClass().getSimpleName();

		System.out.println(name + ", " + simpleName);
		System.out.println("Tempo gasto: " + milisec);

		return proceed;
	}
}
