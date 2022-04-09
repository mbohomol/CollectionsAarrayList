package br.com.generation.arraylist;

//importar a biblioteca ArrayList:
import java.util.ArrayList;

public class CollectionsArrayList {
	
	public static void main(String[] args) {
	
	// criar um obj ArrayList:
	ArrayList<String> estoque = new ArrayList<>();
	
	estoque.add("Loja");
	estoque.add("Produtos");
	estoque.add("Roupas");
	estoque.add("Há 40 calças jeans no estoque");
	estoque.add("Vestidos nos tamanhos do PP ao GG");
	
	System.out.println(estoque); //imprime oque esta na tela
	
	estoque.remove(3);
	System.out.println(estoque); //este imprime ref ao remove
	
	System.out.println("Tamanho do ArrayList: " + estoque.size() ); 
}
}