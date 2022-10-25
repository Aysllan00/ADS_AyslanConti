package state.artigo;

import java.time.LocalDate;

public class EstadoRascunho implements Estado {

	private Artigo artigo;
	
	public EstadoRascunho(Artigo artigo) {
		this.artigo = artigo;
	}
	
	@Override
	public void publicar() {
		GerenteDeSegurança gerenteSegurança = GerenteDeSegurança.getInstance();

		if(gerenteSegurança.UsuarioAutor()) {
			this.artigo.transitarEstado(new EstadoRevisando(artigo));
			this.artigo.getLogHistorico().add("Transitando para REVISANDO em " + LocalDate.now());
			return;
		} else {
			throw new RuntimeException("Usuario não tem permissão para publicar!");
		}
		
	}

	@Override
	public void reprovar() {
		// TODO Auto-generated method stub
		
	}

}
