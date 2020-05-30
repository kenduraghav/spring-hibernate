package hibernateexamples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;

	
	@Override
	public List<Customer> getAllCustomer() {
		return customerDao.getAllCustomers();
	}
	
	@Override
	public void insertCustomer(Customer customer) {
		customerDao.insertCustomer(customer);
	}

}
