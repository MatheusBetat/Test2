package Gym;

import Gym.entity.Aluno;

// cadastro dos alunos
public class AlunoController {
	public static void main(String[] args) {
		// List<Aluno> alunos = new Arraylist
		Aluno aluno = new Aluno();

		aluno.setNome("Matheus");
		aluno.setCodigo("123");
		aluno.setIdade("23");
		System.out.println("Aluno : " + aluno.getNome());
		System.out.println("Codigo : " + aluno.getCodigo());
		System.out.println("Idade : " + aluno.getIdade());

		Aluno aluno2 = new Aluno();

		aluno2.setNome("Karol");
		aluno2.setCodigo("321");
		aluno2.setIdade("23");
		System.out.println("Aluno :" + aluno2.getNome());
		System.out.println("Codigo :" + aluno2.getCodigo());
		System.out.println("Idade :" + aluno2.getIdade());

		Aluno aluno3 = new Aluno();

		aluno3.setNome("Matheus Sutoff");
		aluno3.setCodigo("333");
		aluno3.setIdade("23");
		System.out.println("Aluno :" + aluno3.getNome());
		System.out.println("Codigo :" + aluno3.getCodigo());
		System.out.println("Idade :" + aluno3.getIdade());
	}
} 
