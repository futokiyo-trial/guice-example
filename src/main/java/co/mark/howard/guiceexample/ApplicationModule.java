package co.mark.howard.guiceexample;

import com.google.inject.AbstractModule;

import co.mark.howard.guiceexample.api.CustomerService;
import co.mark.howard.guiceexample.customer.DefaultCustomerService;

public class ApplicationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(CustomerService.class).to(DefaultCustomerService.class).asEagerSingleton();
	}

}
