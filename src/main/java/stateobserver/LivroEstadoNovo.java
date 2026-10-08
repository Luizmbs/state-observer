package stateobserver;

public class LivroEstadoNovo extends LivroEstado{

    private LivroEstadoNovo() {};
    private static LivroEstadoNovo instance = new LivroEstadoNovo();
    public static LivroEstadoNovo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Novo";
    }

    @Override
    public boolean cadastrar(Livro livro) {
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        return true;
    }
}
