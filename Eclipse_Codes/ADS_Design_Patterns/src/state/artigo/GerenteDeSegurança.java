package state.artigo;

public class GerenteDeSegurança {
	
	private static GerenteDeSegurança instance;
	private String usuarioCorrente;
	
	private GerenteDeSegurança() {
		
	}
		
	public String getUsuarioCorrente() {
		return usuarioCorrente;
	}

	public void setUsuarioCorrente(String usuarioCorrente) {
		this.usuarioCorrente = usuarioCorrente;
	}

	public static GerenteDeSegurança getInstance() {
		if (instance == null) {
			instance = new GerenteDeSegurança();
		}
		return instance;
	}
	
	public boolean UsuarioModerador() {
		return "MODERADOR".equals(usuarioCorrente); //Dessa forma não é lançado a exception NullPointException
	}
	
	public boolean UsuarioAutor() {
		return "AUTOR".equals(usuarioCorrente);
	}
}
