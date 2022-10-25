package state.artigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArtigoTest {

	//F6 anda no execução do teste(debug)
	
	@Test
	void RascunhoAprovado() {
		GerenteDeSegurança gerenSegurança = GerenteDeSegurança.getInstance();
		
		Artigo artigo = new Artigo();
		
		//1. Rascunho > Revisando
		gerenSegurança.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		//2. Revisando > Aprovado
		gerenSegurança.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		assertTrue(artigo.getEstado() instanceof EstadoAprovado);
		
		artigo.getLogHistorico().forEach(System.out::println);
	}
	
	@Test
	void RascunnhoRevisandoRascunho() {
		GerenteDeSegurança gerenSegurança = GerenteDeSegurança.getInstance();
		
		Artigo artigo = new Artigo();
		
		//1. Rascunho > Revisando
		gerenSegurança.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		//2. Revisando > Rascunho
		gerenSegurança.setUsuarioCorrente("MODERADOR");
		artigo.reprovar();
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
		artigo.getLogHistorico().forEach(System.out::println);
	}

	/*
	@Test
	void RascunnhoAprovado() {
		GerenteDeSegurança gerenSegurança = GerenteDeSegurança.getInstance();
		
		Artigo artigo = new Artigo();
		
		//1. Rascunho > Revisando
		gerenSegurança.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		assertEquals("REVISANDO", artigo.getEstado());
		
		//2.Revisando > Aprovado
		gerenSegurança.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		assertEquals("APROVADO", artigo.getEstado());
		
		//Imprime Historico
		artigo.getLogHistorico().forEach(System.out::println);
		
	}
	*/
}
