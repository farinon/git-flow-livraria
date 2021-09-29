
public class Autor {
	private String nome;
	private String email;
	private String cpf;
	
	public Autor(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	public void mostrarDetalhes() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", email=" + email + ", cpf=" + cpf + "]";
	}

	
}
//Um autor deve ter nome, email e cpf.
