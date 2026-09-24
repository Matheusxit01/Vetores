package livraria;

public class LivroDeLivraria extends Livro {
    private double preco;
    private int estoque;
    
    public LivroDeLivraria(String titulo, String autor, String editora,
    		                int numPaginas, int ano, double preco, int estoque) {
    	super(titulo, autor, editora, numPaginas, ano);
    	this.preco = preco;
    	this.estoque = estoque;
    	
    }
    
    @Override
    public void exibirDados() {
    	super.exibirDados();
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Estoque: " + estoque + " unidade(s)");
    }
}
