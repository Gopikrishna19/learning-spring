import com.gopikrishna19.learningSpring.repositories.CustomerRepository;
import com.gopikrishna19.learningSpring.repositories.HibernateCustomerRepositoryImpl;
import com.gopikrishna19.learningSpring.service.CustomerService;
import com.gopikrishna19.learningSpring.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());

        return customerService;
    }
}
