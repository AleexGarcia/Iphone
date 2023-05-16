package sistemaOperacional;

import funcionalidade.dispositivo.Iphone;

public class SistemaIphone {
	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
		System.out.println("Aparelho telefonico");
		meuIphone.ligar("6498199999");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		System.out.println("Reprodutor musical");
		meuIphone.tocar("#65486");
		meuIphone.pausar();
		meuIphone.selecionarMusica("#15624");
		System.out.println("Navegador");
		meuIphone.adicionarNovaAba();
		meuIphone.exibirPagina("www.google.com");
		meuIphone.atualizarPagina();

	}
}
