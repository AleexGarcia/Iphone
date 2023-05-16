package funcionalidade.reprodutormusical;

public interface ReprodutorMusical {
	public abstract void tocar(String musica);
	public abstract void pausar();
	public abstract void selecionarMusica(String musica);
}
