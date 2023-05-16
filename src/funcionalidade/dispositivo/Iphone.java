package funcionalidade.dispositivo;

import funcionalidade.aparelhoTelefonico.AparelhoTelefonico;
import funcionalidade.navegadorNaInternet.NavegadorNaInternet;
import funcionalidade.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico,NavegadorNaInternet, ReprodutorMusical{

	public void tocar(String musica) {
		System.out.println("TOCANDO "+ musica);
	}

	public void pausar() {
		System.out.println("PAUSANDO MUSICA");

	}

	public void selecionarMusica(String musica) {
		if(musica != null) {			
			System.out.println("SELECIONANDO MUSICA"+ musica);
			tocar(musica);
		}else {
			System.out.println("ERRO AO SELECIONAR A MUSICA");
		}
	}

	
	public void exibirPagina(String url) {
		if(url != null) {			
			System.out.println("EXIBINDO "+url+" NO NAVEGADOR");
		}else {
			System.out.println("PAGINA NÃO ENCONTRADA!");
		}
	}

	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA AO NAVEGADOR");
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PAGINA DO NAVEGADOR");
	}

	public void ligar(String numero) {
		System.out.println("CHAMANDO "+numero);
	}

	public void atender() {
		System.out.println("ATENDENDO CHAMADA");
	}

	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");

	}
	
}
