
public class Ebook extends Livro implements Promocional{

	public Ebook(String nome, String descricao, double valor, Autor autor) {
		super(nome, descricao, valor, autor);
	}
	
	@Override
	public boolean aplicaDesconto(double porcentagem) {
		double descontoMaximo = 30;
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
		return "Livro[nome="+ getNome() + ", descricao=" + getDescricao() + ", " + getAutor() +"valor=" + getValor()+"]";
	}
	
}

//ebooks pode ser aplicado um desconto de no máximo 30%.