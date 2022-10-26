package io.github.brunoclm.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.brunoclm.config.Config;

@Component
public class TesteProfile {

	@Autowired
	public void indicarConfiguracao(Config config) {
		System.out.println("Configuração atual é:" + config.getClass().getSimpleName().substring(0, config.getClass().getSimpleName().indexOf("$")));
	}
	
}
