package aula7;

public class Principal {
	public static void main(String[] args) {
		Robo robo1 = new Robo();
		Robo robo2 = new Robo();
		
		robo1.ligar();
		robo1.andar();
		robo1.parar();
		robo1.desligar();
		
		robo2.ligar();
		robo2.andar();
		robo2.parar();
		robo2.desligar();
	}

}
