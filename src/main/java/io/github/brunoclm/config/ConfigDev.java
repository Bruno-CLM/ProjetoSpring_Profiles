package io.github.brunoclm.config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.github.brunoclm.app.HashMD5;

@Configuration
@Profile("dev")
public class ConfigDev implements Config {
	
	@Bean
	public void indicaVersaoDev() throws NoSuchAlgorithmException {
		System.out.println("***Configuração de Desenvolvedor***");
		new HashMD5("Davi");
	}

	
}
