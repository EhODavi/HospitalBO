package br.com.casaDoCodigo.livroOO.persistencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.casaDoCodigo.livroOO.entidades.Procedimento;

public class ProcedimentoBancoDeDados {

	private List<Procedimento> procedimentos;
	
	public ProcedimentoBancoDeDados() {
		this.procedimentos = new ArrayList<>();
	}
	
	public void adicionar(Procedimento procedimento) {
		
		if (!procedimentos.contains(procedimento)) {
			procedimentos.add(procedimento);
			procedimento.setCodigo(procedimentos.size());
		} 
	}
	
	public void excluir(Procedimento procedimento) {
		procedimentos.remove(procedimento);
	}
	
	public List<Procedimento> listarTodos() {
		return Collections.unmodifiableList(procedimentos);
	}
}