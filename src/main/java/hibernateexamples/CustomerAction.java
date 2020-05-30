package hibernateexamples;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfiguration.class)) {

			CustomerService userService = context.getBean(CustomerService.class);

			System.out.println("Listing All Users >>>>>>>>");

			List<Customer> users = userService.getAllCustomer();

			users.forEach(user -> System.out.println(user));
		}
	}
}
