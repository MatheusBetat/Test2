package testes;

public class testes {
	public static void main(String[] args) {
		System.out.println("ola pessoal".charAt(2));

		String s = "boa tarde";
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tardee"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "matheus";
		var sobrenome = "betat";
		var idade = 23;
		var salario = 140.000;

		System.out.println("nome:" + nome + "\nsobrenome:" + sobrenome + "\nidade:" + idade + "\nsalario:" + salario);
		System.out.printf("o senhor %s %s tem %d anos e ganha R$%f.", nome, sobrenome, idade, salario);

	}
}