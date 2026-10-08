package stateobserver;

public abstract class LivroEstado {

    public abstract String getEstado();

    public boolean emprestar(Livro livro){ return false;}

    public boolean devolver(Livro livro){ return false;}

    public boolean cadastrar(Livro livro){return false;}

    public boolean excluir(Livro livro){return false;};

    public boolean agendar(Livro livro){return false;}

    public boolean restaurar(Livro livro){return false;}

    public boolean liberar(Livro livro){return false;}

    public boolean bloquear(Livro livro){return false;}

}
