package com.mattesca.alfred.entities;

import java.time.LocalDate;

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
import javax.persistence.Table;

import com.mattesca.alfred.enums.StatoProdotto;

@Entity
@Table(name="prodotto")

public class Prodotto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_prodotto")
	private Long idProdotto;
	@Column(name = "nome_prodotto")
	private String nomeProdotto;
	@Column(name = "stato_prodotto")
	@Enumerated(EnumType.STRING)
	private StatoProdotto statoProdotto;
	@Column(name = "quantita")
	private int quantita;
	@Column(name = "scadenza_da_apertura")
	private LocalDate scadenzaDaApertura;
	@Column(name = "scadenza_confezione")
	private LocalDate scadenzaConfezione;
	@Column(name = "data_apertura")
	private LocalDate dataApertura;

	@Column(name = "prezzo")
	private Long prezzo;
	
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="negozio")
	private Negozio negozio;
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="categoria")
	private Categoria categoria;
	
	
	public Prodotto(String nomeProdotto, StatoProdotto statoProdotto, int quantita, LocalDate scadenzaConfezione) {
		super();
		this.nomeProdotto = nomeProdotto;
		this.statoProdotto = statoProdotto;
		this.quantita = quantita;
		this.scadenzaConfezione = scadenzaConfezione;
	}
	
	public Long getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(Long idProdotto) {
		this.idProdotto = idProdotto;
	}
	public String getNomeProdotto() {
		return nomeProdotto;
	}
	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}
	public StatoProdotto getStatoProdotto() {
		return statoProdotto;
	}
	public void setStatoProdotto(StatoProdotto statoProdotto) {
		this.statoProdotto = statoProdotto;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public LocalDate getScadenzaDaApertura() {
		return scadenzaDaApertura;
	}
	public void setScadenzaDaApertura(LocalDate scadenzaDaApertura) {
		this.scadenzaDaApertura = scadenzaDaApertura;
	}
	public LocalDate getScadenzaConfezione() {
		return scadenzaConfezione;
	}
	public void setScadenzaConfezione(LocalDate scadenzaConfezione) {
		this.scadenzaConfezione = scadenzaConfezione;
	}
	public LocalDate getDataApertura() {
		return dataApertura;
	}
	public void setDataApertura(LocalDate dataApertura) {
		this.dataApertura = dataApertura;
	}
	public Long getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Long prezzo) {
		this.prezzo = prezzo;
	}
	public Negozio getNegozio() {
		return negozio;
	}
	public void setNegozio(Negozio negozio) {
		this.negozio = negozio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
	
	
	
	
	

}
