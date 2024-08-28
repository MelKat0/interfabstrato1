package aula5interface;

public class Calculando implements Calculos{

	@Override
	public double soma() {
		return 4+2;
	}
	@Override
	public double sub() {
		return 4-2;
	}
	@Override
	public double mult() {
		return 4*2;
	}
	@Override
	public int div() {
		return 4/2;
	}
	@Override
	public int exp() {
		return 4*4;
	}
	
	
}