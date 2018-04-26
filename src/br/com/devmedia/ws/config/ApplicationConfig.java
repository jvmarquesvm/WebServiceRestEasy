package br.com.devmedia.ws.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

//Mapeia para aplicacão os recursos
public class ApplicationConfig extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> recursos = new HashSet<>();
		recursos.add(br.com.devmedia.ws.services.NoticiaService.class);
		return recursos;
	}
	
}
