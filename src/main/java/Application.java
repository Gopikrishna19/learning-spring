import com.gopikrishna19.learningSpring.model.Customer;
import com.gopikrishna19.learningSpring.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);

        Customer customer = customerService.findAll().get(0);

        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
    }
}
