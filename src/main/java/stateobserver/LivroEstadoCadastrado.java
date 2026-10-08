package stateobserver;

public class LivroEstadoCadastrado extends LivroEstado{


    private LivroEstadoCadastrado() {};
    private static LivroEstadoCadastrado instance = new LivroEstadoCadastrado();
    public static LivroEstadoCadastrado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cadastrado";
    }

    public boolean emprestar(Livro livro) {
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        return true;
    }

    public boolean excluir(Livro livro) {
        livro.setEstado(LivroEstadoExcluido.getInstance());
        return true;
    }

    public boolean bloquear(Livro livro){
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        return true;
    }

}
