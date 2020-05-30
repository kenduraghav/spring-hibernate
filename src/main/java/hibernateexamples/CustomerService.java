package hibernateexamples;

import java.util.List;

public interface CustomerService {

	List<Customer> getAllCustomer();
	
	void insertCustomer(Customer customer);
}
