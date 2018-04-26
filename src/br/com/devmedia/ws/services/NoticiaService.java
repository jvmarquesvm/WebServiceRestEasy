package br.com.devmedia.ws.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.devmedia.ws.Noticia;

@Path("noticias")
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
