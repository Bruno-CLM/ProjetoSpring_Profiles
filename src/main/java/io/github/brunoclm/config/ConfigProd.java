package io.github.brunoclm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ConfigProd implements Config {

	@Bean
	public void indicaVersaoDev() {
		System.out.println("***Configuração de Produção***");
	}

	
	
}
