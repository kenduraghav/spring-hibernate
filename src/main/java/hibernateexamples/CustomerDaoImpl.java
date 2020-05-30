package hibernateexamples;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	public List<Customer> getAllCustomers(){
		Session  session = getCurrentSession();
		List<Customer> customerList = session.createQuery("from Customer").list();
		return customerList;
	}


	@Override
	public void insertCustomer(Customer customer) {
		Session  session = getCurrentSession();
		session.persist(customer);
	}

}
