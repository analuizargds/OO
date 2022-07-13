package aula7;

public class Robo {
	String modelo;
	String cor;
	int ano;
	String nSerie;
	boolean ligado;
	float direcao;
	float velocidade;
	/*
	 *	Escrever um construtor no qual o robo já e
	 *     criado no estado ligado, velocidade igual a
	 *     dois, e direcao igual a zero.
	 */
	public Robo () {
		this.ligado = true;
		this.direcao = 0;
		this.velocidade = 2;
	}
	
	public void ligar() {
		ligado = true;
		velocidade = 0;
	}
	
	public void desligar() {
		ligado = false;
		velocidade = 0;
	}
	
	public void andar() {
		velocidade = 2;
	}
	 /*
	 * (3) Escrever um segundo metodo andar cujo incremento da
	 *     velocidade e fornecida como argumento
	 */
	public void andar2(float incremento) {
		this.velocidade += incremento;
	}
	
	public void parar() {
		velocidade = 0;
	}
	
	public void virar() {
		direcao = direcao + 1;
		if(direcao == 360)
			direcao = 0;
	}
	 /*
	 * (4) Escrever um segundo metodo virar cuja incremento da
	 *     direcao e fornecida como argumento
	 */
	public void virar2(float incr_direcao) {
		direcao += incr_direcao;
		if (direcao == 360) {
			direcao = 0;
		}
	}
	
	public String toString() {
		andar2();
		virar2();
		return modelo + "/n" +
				cor + "/n" +
				ano + "/n" +
				nSerie + "/n"+
				ligado;
	}
}
