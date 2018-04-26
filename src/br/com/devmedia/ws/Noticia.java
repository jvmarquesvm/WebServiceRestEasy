package br.com.devmedia.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="noticia")
public class Noticia {
	
	private String titulo;
	
	private String descricao;
		
	public Noticia() {
		super();
	}
	public Noticia(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	@XmlElement(name="titulo")
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@XmlElement(name="descricao")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
