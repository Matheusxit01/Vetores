package livraria;

public class Main {
    public static void main(String[] args) {
    	LivroDeLivraria livro1 = new LivroDeLivraria(
    			"Dom Casmurro", "Machado de Assis", "Editora Garnier",
    			256, 1899, 39.90, 12);
    	LivroDeLivraria livro2 = new LivroDeLivraria( "Grande Sertão: Veredas", "João Guimarães Rosa", "Nova Fronteira",
                624, 1956, 74.50, 5);
    	
    	livro1.exibirDados();
    	System.out.println("--------------------------");
    	livro2.exibirDados();
    	
    }
}
