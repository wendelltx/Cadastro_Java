import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Henrique", 20, "111.222.333-44");
		Pessoa p2 = new Pessoa(null, 0, null);
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nomeDigitado = ler.nextLine();
		p2.nome = nomeDigitado;
		
		System.out.println("Digite sua idade: ");
		int idadeDigitada = ler.nextInt();
		p2.idade = idadeDigitada;
		
		System.out.println("Digite seu CPF: ");
		String cpfDigitado = ler.nextLine();
		p2.nome = cpfDigitado;

	}

}
