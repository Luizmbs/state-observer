package stateobserver;

public class LivroEstadoBloqueado extends LivroEstado{

    private LivroEstadoBloqueado() {};
    private static LivroEstadoBloqueado instance = new LivroEstadoBloqueado();
    public static LivroEstadoBloqueado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Bloqueado";
    }


    public boolean liberar(Livro livro) {
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        return true;
    }

    public boolean excluir(Livro livro) {
        livro.setEstado(LivroEstadoExcluido.getInstance());
        return true;
    }

    public boolean restaurar(Livro livro) {
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        return true;
    }

    public boolean devolver(Livro livro) {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        return true;
    }
}
