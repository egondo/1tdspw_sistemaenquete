package br.com.fiap.enquete.model;

import java.util.ArrayList;
import java.util.List;

public class Resposta {

	private String valor;
	private List<String> opcoes = new ArrayList<>();
	private Pergunta pergunta;
	private Pessoa entrevistado;
	
	public void addOpcao(String op) {
		opcoes.add(op);
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public List<String> getOpcoes() {
		return opcoes;
	}
	
	public void setOpcoes(List<String> opcoes) {
		this.opcoes = opcoes;
	}
	
	public Pergunta getPergunta() {
		return pergunta;
	}
	
	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}
	
	public Pessoa getEntrevistado() {
		return entrevistado;
	}
	
	public void setEntrevistado(Pessoa entrevistado) {
		this.entrevistado = entrevistado;
	}
}
