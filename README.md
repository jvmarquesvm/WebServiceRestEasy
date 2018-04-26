# WebServiceRestEasy
Projeto Exemplo de Webservice com o framework RestEasy
WebService REST
 - Utilizando a biblioteca RestEasy
 - Mantindo pela Jboss - segue a especificação JAX-RS ( JAVA API PARA Restfull WebService sobre o protocolo HTTP.
 - Servidor de Aplicação será o WildFly 12
	- Já vem com o RESTEasy por padrão

Criar um Dynamic Web Project
	- WebServiceRestEasy
	- WildFly12
  - nome da URL: WebServiceRestEasy
  - Gerar web.xml

- Criar uma classe de configuração
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

- Configurar o Web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
	id="WebApp_ID" version="3.1">
	<display-name>WebServiceRestEasy</display-name>
	<welcome-file-list>
		<welcome-file>index.jsp</welcome-file>
	</welcome-file-list>
	<context-param>
		<param-name>javax.ws.rs.Application</param-name>
		<param-value>br.com.devmedia.ws.config.ApplicationConfig</param-value>
	</context-param>
	<servlet>
		<servlet-name>RestEasy</servlet-name>
		<servlet-class>org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>RestEasy</servlet-name>
		<url-pattern>/*</url-pattern>
	</servlet-mapping>
</web-app>

- Configurar a Classe que será exposta
NoticiaService.java
package br.com.devmedia.ws.services;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import br.com.devmedia.ws.Noticia;

@Path("/noticias")
public class NoticiaService {
	@GET
	//@Produces(value= MediaType.APPLICATION_JSON)
	@Produces(value= MediaType.APPLICATION_XML)
	@Path("/todas")
	public List<Noticia> buscarTodas(){
		List<Noticia> noticias = new ArrayList<Noticia>();
		
		Noticia n1 = new Noticia("Noticia1","noticia 1");
		Noticia n2 = new Noticia("Noticia2","noticia 2");
		Noticia n3 = new Noticia("Noticia3","noticia 3");
		Noticia n4 = new Noticia("Noticia4","noticia 4");
		Noticia n5 = new Noticia("Noticia5","noticia 5");
		Noticia n6 = new Noticia("Noticia6","noticia 6");
		
		noticias.add(n1);
		noticias.add(n2);
		noticias.add(n3);
		noticias.add(n4);
		noticias.add(n5);
		noticias.add(n6);
		
		return noticias;
	}
}
