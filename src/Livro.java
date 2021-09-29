
public abstract class Livro implements Produto{
	private String nome;
	private String descricao;
	private double valor;
	private Autor autor;
	
	public Livro(String nome, String descricao, double valor, Autor autor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.autor = autor;
	}

	
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public Autor getAutor() {
		return autor;
	}


	public void mostrarDetalhes(){
		System.out.println( "Livro [nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", autor=" + autor + "]");
	}
	
}

//Um livro deve obrigatoriamente ter um autor para que seja criado
//Um livro deve ter nome, descrição, valor e autor.
