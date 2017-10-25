import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcode.service.CustomerService;
import com.tcode.service.CustomerServiceIml;

public class Application {

	public static void main(String[] args) {
		
		//CustomerService service = new CustomerServiceIml();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstname());
		
	}

}
