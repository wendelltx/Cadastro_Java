
public class Pessoa {
	String nome;	
	int idade;
	String cpf;
	
	public Pessoa(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	void exibir(){
		System.out.println("\n |Nome: "+ nome + "\n |Idade: " + idade + "\n |CPF: " +  cpf);
	}
}
