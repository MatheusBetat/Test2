import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Gym.entity.Aluno;
import Gym.entity.Instrutor;

public class Console2 {

	private static List<Aluno> list = new ArrayList<>();
	
	private static List<Instrutor> listInstrutor = new ArrayList<>();
	
	public static void main(String[] args) {
		String opcao;
		do {
			menu();
			opcao = digita(" Digite uma opção: ");
			switch (opcao) {
			case "1":
				cadastraAluno(list);
				break;
			case "2":
				listaAluno();
				break;
			case "3":
				cadastraInstrutor();
				break;
			case "4":
				listaInstrutor();
				break;
			case "0":
				System.out.println("\n Final do Programa.");
				break;	
			default:
				System.out.println("\n Opção inválida.");
			}

		} while (!opcao.equals("0"));
	}

	private static void menu() {
		System.out.println("\nMENU" + "\n-------------------------------------\n" + "1- Cadastra Aluno\n"
				+ "2- Listar Alunos\n" + "3- Cadastrar Instrutor\n" + "4- Listar Instrutores\n"+"-------------------------------------\n");
	}

	private static void listaAluno() {
		if (list.size() == 0) {
			System.out.println("\n Nenhum aluno cadastrado\n");
		} else {
			System.out.println("\n Lista de alunos: \n");
			for (int i = 0; i < list.size(); i++) {
				System.out.println("Código: " + list.get(i).getCodigo());
				System.out.println("Nome: " + list.get(i).getNome());
				System.out.println("Idade: " + list.get(i).getIdade());
				System.out.println("----------------------------------\n");
			}
		}
	}
	private static void listaInstrutor() {
		if (listInstrutor.size() == 0) {
			System.out.println("\n Nenhum instrutor cadastrado\n");
		} else {
			System.out.println("\n Lista de instrutores: \n");
			for (int i = 0; i < listInstrutor.size(); i++) {
				System.out.println("Nome: " + listInstrutor.get(i).getNome());
				System.out.println("Formaçao: " + listInstrutor.get(i).getFormaçao());
				System.out.println("----------------------------------\n");
			}
		}
	}
	
	private static void cadastraAluno(List<Aluno> list) {
		Aluno aluno = new Aluno();
		aluno.setCodigo(String.valueOf(list.size() + 1));
		aluno.setNome(digita("Nome do aluno: "));
		aluno.setIdade(digita("Idade do aluno: "));
		list.add(aluno);
	}
	private static void cadastraInstrutor() {
		Instrutor instrutor = new Instrutor();
        instrutor.setNome(digita("Digite o nome do instrutor: "));
        instrutor.setFormaçao(digita("Digite a formaçao: "));
        listInstrutor.add(instrutor);
		
	}


	public static String digita(String men) {
		System.out.print(men);
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

}
