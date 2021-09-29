
public class Revista implements Produto, Promocional{
	private String nome;
	private double valor;
	private String descricao;	
	private Editora editora;
 
	public Revista(String nome, double valor, String descricao, Editora editora) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.editora = editora;
		this.valor = this.valor+getTaxaImpressao();
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


	public Editora getEditora() {
		return editora;
	}


	//Como essa função é um "get" e pública, Não entendi direito se ela deveria ter a responsabilidade de agregar o valor ao valor inicial
	//ou apenas mostra-lo, por isso optei de fazer a segunda opção e apenas chama-la no constructor para agregar ao valor..
	//como o diagrama dizia que deveria ter essa função e o texto não dizia a taxa, mantive a mesma do livro físico.. 
	public double getTaxaImpressao() {
		return getValor()*0.05;
	}

	@Override
	public boolean aplicaDesconto(double porcentagem) {
		double descontoMaximo = 10;
		if(porcentagem<=descontoMaximo){
			double desconto = this.getValor()*(porcentagem/100);
			System.out.println(descontoMaximo);
			this.setValor(this.getValor()-desconto);
			return true;
		} else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "Revista [nome=" + nome + ", valor=" + valor + ", descricao=" + descricao + ", editora=" + editora + "]";
	}
	
	
}

//Revistas pode ser aplicado um desconto de no máximo 10%
//Uma revista deve obrigatoriamente ter uma editora para ser criada.
