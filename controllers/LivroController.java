package controllers;
import models.Livro;
import java.util.ArrayList;

public class LivroController {

    private static ArrayList <Livro> livros = new ArrayList<Livro>();

    public void cadastrar(Livro livro) {
        livros.add(livro);
    }

    public ArrayList<Livro> listar(){
        return livros;
    }

    public Livro buscarPorLivro(String titulo) {
        for(Livro livroLista: livros) {
            if(livroLista.getTitulo().equals(titulo)) {
                return livroLista;
            }
        }
        return null;
    }
    
}
