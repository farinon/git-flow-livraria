
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("### Criando Autores e Editoras");
        Autor autor1 = new Autor("Fulano de Tal", "fulano@gmail.com", "321.321.321-53");
        System.out.println(autor1);
        
        Autor autor2 = new Autor("Beltrano de Tal", "beltrano@gmail.com", "322.322.322-54");
        System.out.println(autor2);
        
        Editora editora1 = new Editora("Editora Tal", "322.322.0001.322-54");
        System.out.println(editora1);
        
        Editora editora2 = new Editora("Editora Tal Tal Tal", "321.321.0001.322-53");
        System.out.println(editora1);
        
        System.out.println("");
        
        System.out.println("### Criando um Livro Físico");
        LivroFisico livro1 = new LivroFisico("As tranças de um careca", "Melhor livro do mundo segundo a crítica", 15, autor1);
        System.out.println(livro1);        
        System.out.println("");
        
        System.out.println("### Criando um E-Book");
        Ebook livro2 = new Ebook("As novissimas tranças de um careca", "Bem pior que o original, segundo a critica", 9, autor2);
        System.out.println("Ebook - "+livro2);
        System.out.println("");
        
        System.out.println("### Criando uma Revista");
        Revista revista1 = new Revista("Boca de Bueiro", 10, "Revista de fofocas pesadas", editora1);
        System.out.println("Revista - "+revista1);
        System.out.println("");
        
        System.out.println("### Aplicando 30% de desconto a cada produto cadastrado ou dando erro se o o produto não permitir tanto desconto");
        if(livro1.aplicaDesconto(30)==true) {
        	System.out.println("Desconto Aplicado.");
        	System.out.println(livro1);        
            System.out.println("");
        } else {
        	System.out.println("Desconto Excede o Máximo Parametrizado.");
        	System.out.println(livro1);
            System.out.println("");
        }

        if(livro2.aplicaDesconto(30)==true) { // é um e-book, deve ser o único funcionar com 30%...
        	System.out.println("Desconto Aplicado.");
        	System.out.println("Ebook - "+livro2);        
            System.out.println("");
        } else {
        	System.out.println("Desconto Excede o Máximo Parametrizado.");
        	System.out.println("Ebook - "+livro2); 
            System.out.println("");
        }

        if(revista1.aplicaDesconto(30)==true) {
        	System.out.println("Desconto Aplicado.");
        	System.out.println(revista1);        
            System.out.println("");
        } else {
        	System.out.println("Desconto Excede o Máximo Parametrizado.");
        	System.out.println(revista1);
            System.out.println("");
        }
		
	}

}
