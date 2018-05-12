package com.mattesca.alfred.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.mattesca.alfred.enums.Tipologia;
@Entity
@Table(name="categoria")

public class Categoria {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private Long idCategoria;
	@Column(name = "tipologia")
	@Enumerated(EnumType.STRING)
	private Tipologia tipologia;

	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "prodotto")
	private List<Prodotto> prodotti = new ArrayList<>();
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="negozio")
	private Negozio negozio;
	
	
	public Categoria(Tipologia tipologia) {
		super();
		this.tipologia = tipologia;
	}

	public Categoria(Tipologia tipologia, List<Prodotto> prodotti) {
		super();
		this.tipologia = tipologia;
		this.prodotti = prodotti;
	}
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public Tipologia getTipologia() {
		return tipologia;
	}
	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}
	public List<Prodotto> getProdotti() {
		return prodotti;
	}
	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	public Negozio getNegozio() {
		return negozio;
	}
	public void setNegozio(Negozio negozio) {
		this.negozio = negozio;
	}
	
	
}
