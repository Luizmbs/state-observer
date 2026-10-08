package stateobserver;

public class LivroEstadoExcluido extends LivroEstado{

    private LivroEstadoExcluido() {};
    private static LivroEstadoExcluido instance = new LivroEstadoExcluido();
    public static LivroEstadoExcluido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Excluído";
    }
}
