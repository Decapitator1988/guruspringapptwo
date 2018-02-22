package com.decapitator.guruspringapptwo.config;

import com.decapitator.guruspringapptwo.services.GreetingRepository;
import com.decapitator.guruspringapptwo.services.GreetingService;
import com.decapitator.guruspringapptwo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetongService("en");
    }
    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetongService("es");
    }
    @Bean
    @Primary
    @Profile("ge")
    GreetingService primaryGermanGreetingServiceFactory(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetongService("ge");
    }
}
