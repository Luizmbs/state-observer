package stateobserver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void naoDeveEmprestarLivroNovo() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoNovo.getInstance());
        assertFalse(livro.emprestar());
    }

    @Test
    public void naoDeveDevolverLivroNovo() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoNovo.getInstance());
        assertFalse(livro.devolver());
    }

    @Test
    public void deveCadastrarLivroNovo() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoNovo.getInstance());
        assertTrue(livro.cadastrar());
    }

    @Test
    public void naoDeveExcluirLivroNovo() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoNovo.getInstance());
        assertFalse(livro.excluir());
    }

    @Test
    public void naoDeveAgendarLivroNovo() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoNovo.getInstance());
        assertFalse(livro.agendar());
    }

    @Test
    public void naoDeveRestaurarLivroNovo() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoNovo.getInstance());
        assertFalse(livro.restaurar());
    }

    @Test
    public void naoDeveLiberarLivroNovo() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoNovo.getInstance());
        assertFalse(livro.liberar());
    }

    @Test
    public void naoDeveBloquearLivroNovo() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoNovo.getInstance());
        assertFalse(livro.bloquear());
    }

    @Test
    public void deveEmprestarLivroCadastrado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        assertTrue(livro.emprestar());
    }

    @Test
    public void naoDeveDevolverLivroCadastrado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        assertFalse(livro.devolver());
    }

    @Test
    public void naoDeveCadastrarLivroCadastrado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        assertFalse(livro.cadastrar());
    }

    @Test
    public void deveExcluirLivroCadastrado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        assertTrue(livro.excluir());
    }

    @Test
    public void naoDeveAgendarLivroCadastrado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        assertFalse(livro.agendar());
    }

    @Test
    public void naoDeveRestaurarLivroCadastrado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        assertFalse(livro.restaurar());
    }

    @Test
    public void naoDeveLiberarLivroCadastrado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        assertFalse(livro.liberar());
    }

    @Test
    public void deveBloquearLivroCadastrado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        assertTrue(livro.bloquear());
    }

    @Test
    public void naoDeveEmprestarLivroEmprestado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.emprestar());
    }

    @Test
    public void deveDevolverLivroEmprestado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertTrue(livro.devolver());
    }

    @Test
    public void naoDeveCadastrarLivroEmprestado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.cadastrar());
    }

    @Test
    public void naoDeveExcluirLivroEmprestado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.excluir());
    }

    @Test
    public void deveAgendarLivroEmprestado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertTrue(livro.agendar());
    }

    @Test
    public void naoDeveRestaurarLivroEmprestado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.restaurar());
    }

    @Test
    public void naoDeveLiberarLivroEmprestado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.liberar());
    }

    @Test
    public void naoDeveBloquearLivroEmprestado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        assertFalse(livro.bloquear());
    }

    @Test
    public void naoDeveEmprestarLivroBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        assertFalse(livro.emprestar());
    }

    @Test
    public void deveDevolverLivroBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        assertTrue(livro.devolver());
    }

    @Test
    public void naoDeveCadastrarLivroBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        assertFalse(livro.cadastrar());
    }

    @Test
    public void deveExcluirLivroBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        assertTrue(livro.excluir());
    }

    @Test
    public void naoDeveAgendarLivroBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        assertFalse(livro.agendar());
    }

    @Test
    public void deveRestaurarLivroBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        assertTrue(livro.restaurar());
    }

    @Test
    public void deveLiberarLivroBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        assertTrue(livro.liberar());
    }

    @Test
    public void naoDeveBloquearLivroBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        assertFalse(livro.bloquear());
    }

    @Test
    public void naoDeveEmprestarLivroExcluido() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoExcluido.getInstance());
        assertFalse(livro.emprestar());
    }

    @Test
    public void naoDeveDevolverLivroExcluido() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoExcluido.getInstance());
        assertFalse(livro.devolver());
    }

    @Test
    public void naoDeveCadastrarLivroExcluido() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoExcluido.getInstance());
        assertFalse(livro.cadastrar());
    }

    @Test
    public void naoDeveExcluirLivroExcluido() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoExcluido.getInstance());
        assertFalse(livro.excluir());
    }

    @Test
    public void naoDeveAgendarLivroExcluido() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoExcluido.getInstance());
        assertFalse(livro.agendar());
    }

    @Test
    public void naoDeveRestaurarLivroExcluido() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoExcluido.getInstance());
        assertFalse(livro.restaurar());
    }

    @Test
    public void naoDeveLiberarLivroExcluido() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoExcluido.getInstance());
        assertFalse(livro.liberar());
    }

    @Test
    public void naoDeveBloquearLivroExcluido() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoExcluido.getInstance());
        assertFalse(livro.bloquear());
    }

}
