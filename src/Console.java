import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("bom");
		System.out.print(" dia!\n");
		
		System.out.println("bom");
		System.out.println("dia!");
		
	    System.out.printf("Megasena: %d %d %d %d %d %d\n", 
	    		1, 2, 3, 4, 5, 6);
	    System.out.printf("salario: %.1f", 1235.64575);
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    entrada.nextLine();
	    
		System.out.print("digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("\n\nNome =" + nome + "" + sobrenome);
		
		

	}

}
