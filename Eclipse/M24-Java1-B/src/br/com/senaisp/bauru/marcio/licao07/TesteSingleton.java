package br.com.senaisp.bauru.marcio.licao07;

public class TesteSingleton {

	public static void main(String[] args) {

		ClasseSingleton obj01 = ClasseSingleton.getInstancia();
		ClasseSingleton obj02 = ClasseSingleton.getInstancia();
		
		//alterando os dados
		System.out.println(obj01);
		System.out.println(obj02);
		
		obj01.setNome("Pacoquinha");
		System.out.println(obj02.getNome());
	}

}
