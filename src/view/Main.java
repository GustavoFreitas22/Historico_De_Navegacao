package view;

import java.util.Scanner;

import controller.ControllerHistorico;
import model.Pilha;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Pilha historico = new Pilha();
		Scanner read = new Scanner(System.in);
		ControllerHistorico controller = new ControllerHistorico();
		
		int opc;
		do {
			System.out.println("Digite a opcao desejada: \n1- Inserir novos endere�os\n2- Remover Ultimo endere�o\n3-Visualizar ultimo endere�o\n4-sair");
			opc = read.nextInt();
			switch(opc) {
					case 1:
						historico.push(controller.adicionar());
						break;
					case 2: 
						historico = controller.remover(historico);
						break;
					case 3:
						controller.visualizar(historico);
						break;
					case 4:
						System.out.println("Valeu meu bom!");
						break;
					default:
						System.out.println("Op��o invalida meu rei!\nTenta Denovo ai!");
			}
		}while(opc != 4);

	}

}
