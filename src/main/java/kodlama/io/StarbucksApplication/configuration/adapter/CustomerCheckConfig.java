package kodlama.io.StarbucksApplication.configuration.adapter;

import kodlama.io.StarbucksApplication.Adapters.MernisServiceAdapter;
import kodlama.io.StarbucksApplication.business.abstracts.CustomerCheckService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerCheckConfig {
    @Bean
    public CustomerCheckService getCustomerCheckService(){
        return new MernisServiceAdapter();
    }
}
