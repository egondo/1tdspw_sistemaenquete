package br.com.fiap.enquete.model;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {

	private String questao;
	
	private int ordem;
	
	private String tipo;
	
	private List<String> opcoes;

	public void addOpcao(String op) {
		if (opcoes == null) 
			opcoes = new ArrayList<>();
		
		opcoes.add(op);
	}
	
	public String getQuestao() {
		return questao;
	}

	public void setQuestao(String questao) {
		this.questao = questao;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<String> getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(List<String> opcoes) {
		this.opcoes = opcoes;
	}
}
