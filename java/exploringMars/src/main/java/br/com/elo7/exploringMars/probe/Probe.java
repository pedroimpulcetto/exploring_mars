/** Classe para objeto do tipo Probe(sonda) onde serão contidos valores e métodos para o mesmo.
 * Para instanciar esse objeto do tipo Probe é necessário informar os seguintes atributos:
 * @param initX - ponto de partida da sonda no eixo X
 * @param initY - ponto de partida da sonda no eixo Y
 * @param direction - direção inicial da sonda no plano cartesiano
 */


package br.com.elo7.exploringMars.probe;


import java.util.ArrayList;

public class Probe {
	public int initX;
	public int initY;
	public String direction;
	private ArrayList<String> windRose;
	
	
	public Probe(int initX, int initY, String direction) {
		this.setInitX(initX);
		this.setInitY(initY);
		this.setDirection(direction);
		
		this.windRose = new ArrayList<String>();
		windRose.add("N");
		windRose.add("E");
		windRose.add("S");
		windRose.add("W");
		
	}
	
	/** Método para mover a sonda
	 * Esse método verificará quais as posições initX e initY que a sonda se encontra e a direção e 
	 * a partir da instrução recebida como parâmetro o método irá mover a sonda
	 * Ele também verificará a partir dos parâmetros axisX e axisY se o movimento da sonda está dentro do plano cartesiano,
	 * não ultrapassando os eixos X e Y
	 * @param axisX - valor final/tamanho do eixo X do plano cartesiano
	 * @param axisY - valor final/tamanho do eixo Y do plano cartesiano
	 * @param instruction - instrução que a sonda deve seguir
	 * 
	 */

	public void move(int axisX, int axisY, String instruction) {
		
		if ("R".equals(instruction)) {
			int indexDirection = this.windRose.indexOf(direction) + 1;
			if (indexDirection == 4) {
				indexDirection = 0;
			}
			this.setDirection((String) this.windRose.get(indexDirection));
		} else if ("L".equals(instruction)) {
			int indexDirection = this.windRose.indexOf(direction) - 1;
			if (indexDirection == -1) {
				indexDirection = 3;
			}
			this.setDirection((String) this.windRose.get(indexDirection));
		} else if ("M".equals(instruction)) {
			if (this.getInitY() <= axisY) {
	            if ("N".equals(this.getDirection())) {
	                this.setInitY(this.getInitY()+1);
	            }
			}
			
			if (this.getInitX() <= axisX) {
	            if ("E".equals(this.getDirection())) {
	                this.setInitX(this.getInitX()+1);
	            }
			}
			
			if (this.getInitY() > 0) {
	            if ("S".equals(this.getDirection())) {
	                this.setInitY(this.getInitY()-1);
	            }
			}
			
			if (this.getInitX() > 0) {
	            if ("W".equals(this.getDirection())) {
	                this.setInitX(this.getInitX()-1);
	            }
			}
		}
	}

	public int getInitX() {
		return initX;
	}




	public void setInitX(int initX) {
		this.initX = initX;
	}




	public int getInitY() {
		return initY;
	}




	public void setInitY(int initY) {
		this.initY = initY;
	}




	public String getDirection() {
		return direction;
	}




	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	
	
	public ArrayList<String> getWindRose() {
		return windRose;
	}
	
	
	

	public void setWindRose(ArrayList<String> windRose) {
		this.windRose = windRose;
	}

}
