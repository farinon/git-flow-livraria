
public class LivroFisico extends Livro implements Promocional{
	public LivroFisico(String nome, String descricao, double valor, Autor autor) {
		super(nome, descricao, valor, autor);
		super.setValor(super.getValor()+getTaxaImpressao());
	}

	
	//Como essa fun��o � um "get" e p�blica, N�o entendi direito se ela deveria ter a responsabilidade de agregar o valor ao valor inicial
	//ou apenas mostra-lo, por isso optei de fazer a segunda op��o e apenas chama-la no constructor para agregar ao valor..
	public double getTaxaImpressao() {
		return super.getValor()*0.05;
	}
	
	public void pimponeta(){
		System.out.println("Pimponeta Peta Peta Perruge, faz pim pom!");
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

//Livro f�sico desconto m�ximo de 5%
//O livro f�sico possui uma taxa de impress�o agregada ao seu valor, de 5% do valor inicial do livro
