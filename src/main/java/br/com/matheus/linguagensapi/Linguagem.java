package br.com.matheus.linguagensapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {
	
	@Id
	private String id;
	//Atributos
	private String title;
	private String image;
	private int ranking;
	
	//Um construtor serve para instanciar objetos da classe onde foi definido
	public Linguagem(String title, String image, int ranking) {
		this.title = title;
		this.image = image;
		this.ranking = ranking;
	}
	
	//método getter retorna seu valor
	public String getTitle() {
		return title;
	}
	public String getImage() {
		return image;
	}
	public int getRanking() {
		return ranking;
	}
	public String getId() {
		return id;
	}
	
}
