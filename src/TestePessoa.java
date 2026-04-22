import java.util.Scanner;

public class TestePessoa {

	private static Object clear;

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Henrique", 20, "111.222.333-44");
		Pessoa p2 = new Pessoa(null, 0, null);
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println(" Seja bem-vindo(a)");
		System.out.println(" Para realizarmos seu cadastro por favor insira seus dados");
		
		System.out.print("\n Digite seu nome: ");
		String nomeDigitado = ler.nextLine();
		p2.nome = nomeDigitado;
		
		System.out.print("\n Digite sua idade: ");
		int idadeDigitada = ler.nextInt();
		p2.idade = idadeDigitada;
		
		System.out.print("\n Digite seu CPF: ");
		String cpfDigitado = ler.next();
		p2.cpf = cpfDigitado;
		
		p1.exibir();
		p2.exibir();

	}

}
