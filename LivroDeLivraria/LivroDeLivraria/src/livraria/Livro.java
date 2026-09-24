package livraria;

public class Livro {
public static void main(String[] args) {
		protected String titulo;
		protected String autor;
		protected String editora;
		protected int numPaginas;
		protected int ano;
		
        public Livro(String titulo, String autor, String editora, int numPaginas, int ano) {
        	
           this.titulo	= titulo;
           this.autor = autor;
           this.editora = editora;
           this.numPaginas = numPaginas;
           this.ano = ano;
        
        }
        
        public void exibirDados() {
        	System.out.println("Título: " + titulo);
        	System.out.println("Autor: " + autor);
        	System.out.println("Editora: " + editora);
        	System.out.println("Paginas: " + numPaginas);
        	System.out.println("Ano: " + ano);
	
    }

  }
