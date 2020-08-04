package br.com.elo7.exploringMars;

public class Instruction {
	public String[] instruction;
	
	
	
	public Instruction(String[] instruction) {
		super();
		this.setInstruction(instruction);
		
	}
	
	

	public String[] getInstruction() {
		return instruction;
	}



	public void setInstruction(String[] instruction) {
		this.instruction = instruction;
	}
}
