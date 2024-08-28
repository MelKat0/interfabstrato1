package aula5interface;

public class PrincipalComputador {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		Home home = new Home();
		
		System.out.println("----COMPUTADOR_GAMER-----");
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
		
		System.out.println("-----COMPUTADOR_HOME-----");
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregandoSistema();
		System.out.println("-------------------------");
	}
}
