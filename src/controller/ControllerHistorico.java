package controller;

import java.util.Scanner;

import model.Pilha;


public class ControllerHistorico {

	public ControllerHistorico() {
		super();
	}
	
	public Pilha remover(Pilha pilha) throws Exception {
		
		if(pilha.isEmpty()) {
			System.err.println("Pilha vazia meu rei, vai dar não");
		}else {
			System.out.println("Vamos apagar o endereço: "+pilha.top());
			pilha.pop();
		}
		return pilha;
	}
	
	public String adicionar()  throws Exception{
		Scanner read = new Scanner(System.in);
		String endereco = "";
		
		System.out.println("Digite o endereço a ser salvo");
		endereco = read.next();
		if(endereco.contains("http://www.")) {
			System.out.println("O endereço foi adicionado com sucesso!");
			return endereco;
		}else {
			System.err.println("Endereço inválido!");
			return "";
		}
		
	}
	
	public void visualizar(Pilha pilha) throws Exception {
		if(pilha.isEmpty()) {
			System.err.println("Pilha vazia meu rei, vai dar não");
		}else {
			System.out.println("O ultimo endereço foi: "+pilha.top());
		}
	}
	
}
