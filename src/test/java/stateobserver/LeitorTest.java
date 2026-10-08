package stateobserver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeitorTest {

    @Test
    void deveNotificarLeitorQuandoLivroForCadastrado() {
        Livro livro = new Livro();
        livro.setNome("Livro A");
        Leitor leitor = new Leitor("Leitor 1");
        leitor.aguardar(livro);
        livro.cadastrar();
        assertEquals("Leitor 1, livro disponível: Livro{nome='Livro A', estado='Cadastrado'}", leitor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarLeitorQuandoLivroForDevolvidoDeEmprestado() {
        Livro livro = new Livro();
        livro.setNome("Livro A");
        livro.setEstado(LivroEstadoEmprestado.getInstance());
        Leitor leitor = new Leitor("Leitor 1");
        leitor.aguardar(livro);
        livro.devolver();
        assertEquals("Leitor 1, livro disponível: Livro{nome='Livro A', estado='Cadastrado'}", leitor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarLeitorQuandoLivroForLiberado() {
        Livro livro = new Livro();
        livro.setNome("Livro A");
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        Leitor leitor = new Leitor("Leitor 1");
        leitor.aguardar(livro);
        livro.liberar();
        assertEquals("Leitor 1, livro disponível: Livro{nome='Livro A', estado='Cadastrado'}", leitor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarLeitorQuandoLivroForRestaurado() {
        Livro livro = new Livro();
        livro.setNome("Livro A");
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        Leitor leitor = new Leitor("Leitor 1");
        leitor.aguardar(livro);
        livro.restaurar();
        assertEquals("Leitor 1, livro disponível: Livro{nome='Livro A', estado='Cadastrado'}", leitor.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarLeitorQuandoLivroForEmprestado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        Leitor leitor = new Leitor("Leitor 1");
        leitor.aguardar(livro);
        livro.emprestar();
        assertEquals(null, leitor.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarLeitorQuandoLivroForBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        Leitor leitor = new Leitor("Leitor 1");
        leitor.aguardar(livro);
        livro.bloquear();
        assertEquals(null, leitor.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarLeitorQuandoLivroForExcluido() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoCadastrado.getInstance());
        Leitor leitor = new Leitor("Leitor 1");
        leitor.aguardar(livro);
        livro.excluir();
        assertEquals(null, leitor.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarLeitorQuandoLivroForDevolvidoDeBloqueado() {
        Livro livro = new Livro();
        livro.setEstado(LivroEstadoBloqueado.getInstance());
        Leitor leitor = new Leitor("Leitor 1");
        leitor.aguardar(livro);
        livro.devolver();
        assertEquals(null, leitor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarMultiplosLeitoresQuandoLivroForCadastrado() {
        Livro livro = new Livro();
        livro.setNome("Livro A");
        Leitor leitor1 = new Leitor("Leitor 1");
        Leitor leitor2 = new Leitor("Leitor 2");
        leitor1.aguardar(livro);
        leitor2.aguardar(livro);
        livro.cadastrar();
        assertEquals("Leitor 1, livro disponível: Livro{nome='Livro A', estado='Cadastrado'}", leitor1.getUltimaNotificacao());
        assertEquals("Leitor 2, livro disponível: Livro{nome='Livro A', estado='Cadastrado'}", leitor2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarLeitorDeOutroLivro() {
        Livro livroA = new Livro();
        Livro livroB = new Livro();
        Leitor leitor1 = new Leitor("Leitor 1");
        Leitor leitor2 = new Leitor("Leitor 2");
        leitor1.aguardar(livroA);
        leitor2.aguardar(livroB);
        livroA.cadastrar();
        assertEquals(null, leitor2.getUltimaNotificacao());
    }
}
