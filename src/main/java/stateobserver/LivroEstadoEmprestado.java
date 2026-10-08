package stateobserver;

public class LivroEstadoEmprestado extends LivroEstado {

    private LivroEstadoEmprestado() {};
    private static LivroEstadoEmprestado instance = new LivroEstadoEmprestado();
    public static LivroEstadoEmprestado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Emprestado";
    }

    public boolean devolver(Livro livro) {
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        return true;
    }


    public boolean agendar(Livro livro) {
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        return true;
    }
}
