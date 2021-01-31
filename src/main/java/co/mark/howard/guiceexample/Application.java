package co.mark.howard.guiceexample;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.enterprise.inject.spi.CDI;

import com.google.inject.Guice;
import com.google.inject.Injector;

import co.mark.howard.guiceexample.api.CustomerService;

@Singleton
public class Application {
	private final CustomerService customerService;
	
	@Inject
	public Application (final CustomerService customerService) {
		this.customerService = customerService;
	}

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ApplicationModule());
		Application application = injector.getInstance(Application.class);
		application.start();
	}
	
	public void start () {
		customerService.helloWorld();
		
		CustomerService hogeCustomerService = (CustomerService) CDI.current().select(CustomerService.class);
	}

}
