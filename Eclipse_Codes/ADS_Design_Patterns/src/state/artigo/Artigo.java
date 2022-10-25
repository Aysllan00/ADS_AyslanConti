package state.artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class Artigo {

	//private String estado;
	private Estado estado;
	
	private List<String> logHistorico = new ArrayList<>();
		
	public Artigo() {
		this.estado = new EstadoRascunho(this);//Estado inicial
	}
	
	public void publicar() {
		estado.publicar();
	}
	
	public void reprovar() {
		estado.reprovar();
	}
	
	protected void transitarEstado(Estado estado) {
		this.estado = estado;
	}

	public Estado getEstado() {
		return estado;
	}

	public List<String> getLogHistorico() {
		return logHistorico;
	}
	
	
	/*
	public Artigo() {
		this.estado = "RASCUNHO";//Estado inicial
	}

	public String getEstado() {
		return estado;
	}

	public List<String> getLogHistorico() {
		return logHistorico;
	}
	
	public void publicar() {
		GerenteDeSegurança gerenteSegurança = GerenteDeSegurança.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			if(gerenteSegurança.UsuarioAutor()) {
				this.estado = "REVISANDO";
				this.logHistorico.add("Transitando para REVISANDO em " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para publicar!");
			}
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(gerenteSegurança.UsuarioModerador()) {
				this.estado = "APROVADO";
				this.logHistorico.add("Transitando para APROVADO em " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para publicar!");
			}
		}
		
		if("APROVADO".equals(estado)) {
			return;
		}
	}
	
	public void reprovar() {
		GerenteDeSegurança gerenteSegurança = GerenteDeSegurança.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			return;
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(gerenteSegurança.UsuarioModerador()) {
				this.estado = "RASCUNHO";
				this.logHistorico.add("Transitando para APROVADO em " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para publicar!");
			}
		}
		
		if("APROVADO".equals(estado)) {
			return;
		}
	}
	*/
}
