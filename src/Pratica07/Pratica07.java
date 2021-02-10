package Pratica07;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratica07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		boolean fim = false;
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		int opcao = 1;
		int ra;
		String nome;
		double nota;
		
		
		while (!fim) {
			System.out.println("Por gentileza, escolha uma opção:\t"+
						"1. Adicionar um aluno\t"+"2. Exibir a lista\t"+
						"3. Limpar a lista\t"+ "4. Fim\t");
		
			opcao = leitor.nextInt();
			switch (opcao) {
				case 1 : 
					System.out.println("Por gentileza, digite o ra do aluno: ");
					ra = leitor.nextInt();
					System.out.println("Por gentileza, digite o nome do aluno: ");
					nome = leitor.next();
					System.out.println("Por gentileza, digite a nota do aluno: ");
					nota = leitor.nextDouble();
					
					Aluno aluno = new Aluno(ra, nome, nota);
					lista.add(aluno);
				break;
				
				case 2:
					if(lista.size() == 0) {
						System.out.println("Lista está vazia!!");
					}
					else {
						System.out.println("\nLista de alunos:");
						for (Aluno a : lista) {
							System.out.println(a);
						}
					}
				break;
				
				case 3:
					lista.clear();
				break;
				
				case 4:
					fim = true;
				break;
				
				default:
					System.out.println("Opção inválida'!");
			}
		}
	}

}
