
public class LivroFisico extends Livro implements Promocional{
	public LivroFisico(String nome, String descricao, double valor, Autor autor) {
		super(nome, descricao, valor, autor);
		super.setValor(super.getValor()+getTaxaImpressao());
	}

	
	//Como essa função é um "get" e pública, Não entendi direito se ela deveria ter a responsabilidade de agregar o valor ao valor inicial
	//ou apenas mostra-lo, por isso optei de fazer a segunda opção e apenas chama-la no constructor para agregar ao valor..
	public double getTaxaImpressao() {
		return super.getValor()*0.05;
	}
	
	@Override
	public boolean aplicaDesconto(double porcentagem) {
		double descontoMaximo = 5;
		if(porcentagem<=descontoMaximo){
			double desconto = super.getValor()*porcentagem/100;
			super.setValor(super.getValor()-desconto);
			return true;
		} else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "LivroFisico [nome="+ getNome() + ", descricao=" + getDescricao() + ", valor)=" + getValor()+ ", " + getAutor() +"]";
	}
	
	
	
	
}

//Livro físico desconto máximo de 5%
//O livro físico possui uma taxa de impressão agregada ao seu valor, de 5% do valor inicial do livro
