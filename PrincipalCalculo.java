package aula5interface;

public class PrincipalCalculo {

	public static void main(String[] args) {

		Calculando continha = new Calculando();
	
		System.out.println("----CALCULOS----");
		System.out.println("Soma: " + continha.soma());
		System.out.println("Subtração: " + continha.sub());
		System.out.println("Multiplicação: " + continha.mult());
		System.out.println("Divisão: " + continha.div());
		System.out.println("Exponente: " + continha.exp());
		System.out.println("----------------");
	}

}
