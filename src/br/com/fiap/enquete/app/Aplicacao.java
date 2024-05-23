package br.com.fiap.enquete.app;

import br.com.fiap.enquete.model.Pergunta;
import br.com.fiap.enquete.model.Questionario;

public class Aplicacao {

	public static void main(String[] args) {
		
		Questionario q = new Questionario();
		q.setDescricao("Questionário da saúde");
		
		Pergunta p = new Pergunta();
		p.setOrdem(1);
		p.setQuestao("Em uma escala de 1 a 10, quão saudável você se considera?");
		p.setTipo("aberta");
		
		q.addPergunta(p);
		
		p = new Pergunta();
		p.setOrdem(2);
		p.setQuestao("Você sofre atualmente de uma doença crônica?");
		p.setTipo("unica");
		p.addOpcao("Sim");
		p.addOpcao("Não");
		
		q.addPergunta(p);
		
		
	}

}
