package br.com.fiap.enquete.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Questionario {
	
	private String descricao;
	private LocalDate data;
	private List<Pergunta> perguntas;
	
	public Questionario() {
		data = LocalDate.now();
	}
	
	public void addPergunta(Pergunta p) {
		if (perguntas == null)
			perguntas = new ArrayList<>();
		perguntas.add(p);
	}
	
	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}
