package hibernateexamples;

import java.util.List;

public interface CustomerDao {
	
	public List<Customer> getAllCustomers();
	
	public void insertCustomer(Customer customer);

}
