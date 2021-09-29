
public class Editora {

	private String nomeFantasia;
	private String cnpj;
	
	public Editora(String nomeFantasia, String cnpj) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Editora [nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + "]";
	}
	
	
	
	
}

//Uma editora deve ter um nome fantasia e um cnpj.