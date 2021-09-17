package controller;

import java.util.Scanner;

import model.Pilha;


public class ControllerHistorico {

	public ControllerHistorico() {
		super();
	}
	
	public Pilha remover(Pilha pilha) throws Exception {
		
		if(pilha.isEmpty()) {
			System.err.println("Pilha vazia meu rei, vai dar n�o");
		}else {
			System.out.println("Vamos apagar o endere�o: "+pilha.top());
			pilha.pop();
		}
		return pilha;
	}
	
	public String adicionar()  throws Exception{
		Scanner read = new Scanner(System.in);
		String endereco = "";
		
		System.out.println("Digite o endere�o a ser salvo");
		endereco = read.next();
		if(endereco.contains("http://www.")) {
			System.out.println("O endere�o foi adicionado com sucesso!");
			return endereco;
		}else {
			System.err.println("Endere�o inv�lido!");
			return "";
		}
		
	}
	
	public void visualizar(Pilha pilha) throws Exception {
		if(pilha.isEmpty()) {
			System.err.println("Pilha vazia meu rei, vai dar n�o");
		}else {
			System.out.println("O ultimo endere�o foi: "+pilha.top());
		}
	}
	
}
