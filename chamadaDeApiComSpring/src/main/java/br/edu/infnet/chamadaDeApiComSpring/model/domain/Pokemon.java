package br.edu.infnet.chamadaDeApiComSpring.model.domain;

public class Pokemon {

	private String name;
	private int id;

	
	@Override
	public String toString() {
		return "Nome: " + name + " id: " + id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
