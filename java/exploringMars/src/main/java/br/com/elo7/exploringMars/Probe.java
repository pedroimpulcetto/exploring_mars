package br.com.elo7.exploringMars;

import java.util.List;

public class Probe {
	public int initX;
	public int initY;
	public String direction;
	
	
	public Probe(int initX, int initY, String direction) {
		super();
		this.setInitX(initX);
		this.setInitY(initY);
		this.setDirection(direction);
		
		System.out.println(this.getInitX() + " " + this.getInitY() + " " + this.getDirection());
	}
	
	public void move(int axisX, int axisY, String instruction, List<String> windRose) {
		
		if (instruction == "R") {
			int indexDirection = windRose.indexOf(direction) + 1;
			if (indexDirection == 4) {
				indexDirection = 0;
			}
			this.setDirection((String) windRose.get(indexDirection));
		} else if (instruction == "L") {
			int indexDirection = windRose.indexOf(direction) - 1;
			if (indexDirection == -1) {
				indexDirection = 3;
			}
			this.setDirection((String) windRose.get(indexDirection));
		}
		
		
		if (this.getInitY() <= axisY) {
            if (instruction == "M" && this.getDirection() == "N") {
                this.setInitY(this.getInitY()+1);
            }
		}
		
		if (this.getInitX() <= axisX) {
            if (instruction == "M" && this.getDirection() == "E") {
                this.setInitX(this.getInitX()+1);
            }
		}
		
		if (this.getInitY() > 0) {
            if (instruction == "M" && this.getDirection() == "S") {
                this.setInitY(this.getInitY()-1);
            }
		}
		
		if (this.getInitX() > 0) {
            if (instruction == "M" && this.getDirection() == "W") {
                this.setInitX(this.getInitX()-1);
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

}
