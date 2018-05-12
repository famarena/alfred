package com.mattesca.alfred.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="negozio")

public class Negozio {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_negozio")
	private Long idNegozio;
	@Column(name = "nome")
	private String nome;

	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "categoria")
	private List<Categoria> categorieDisponibili = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "prodotto")
	private List<Prodotto> prodottiDisponibili = new ArrayList<>();
	
	
	
	public Negozio( String nome, List<Categoria> categorieDisponibili) {
		this.nome = nome;
		this.categorieDisponibili = categorieDisponibili;
	}
	
	
	public Long getIdNegozio() {
		return idNegozio;
	}
	public void setIdNegozio(Long idNegozio) {
		this.idNegozio = idNegozio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Categoria> getCategorieDisponibili() {
		return categorieDisponibili;
	}
	public void setCategorieDisponibili(List<Categoria> categorieDisponibili) {
		this.categorieDisponibili = categorieDisponibili;
	}
	public List<Prodotto> getProdottiDisponibili() {
		return prodottiDisponibili;
	}
	public void setProdottiDisponibili(List<Prodotto> prodottiDisponibili) {
		this.prodottiDisponibili = prodottiDisponibili;
	}


}
