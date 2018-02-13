package co.mark.howard.guiceexample.customer;

import co.mark.howard.guiceexample.api.CustomerService;

public class DefaultCustomerService implements CustomerService {

	@Override
	public void helloWorld() {
		System.out.println("Hello World");
	}

}
