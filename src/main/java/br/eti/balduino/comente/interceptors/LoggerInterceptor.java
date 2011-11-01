package br.eti.balduino.comente.interceptors;

import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.caelum.vraptor.resource.ResourceMethod;

@Intercepts
@SessionScoped
public class LoggerInterceptor implements Interceptor {

	private final HttpServletRequest request;

	public LoggerInterceptor(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void intercept(InterceptorStack stack, ResourceMethod method,
			Object resourceInstance) throws InterceptionException {
		System.out.println("Calling      " + request.getRequestURI());
		System.out.println("  Parameters " + request.getQueryString());
		stack.next(method, resourceInstance);
	}

	@Override
	public boolean accepts(ResourceMethod method) {
		return true;
	}

}
