package br.com.elo7.exploringMars;

import br.com.elo7.exploringMars.dto.CartesianPlan;
import br.com.elo7.exploringMars.dto.Instruction;
import br.com.elo7.exploringMars.probe.Probe;

public class App 
{
    public static void main( String[] args )
    {
		
		CartesianPlan cp = new CartesianPlan(5, 5);

		Probe p1 = new Probe(1, 2, "N");

		Probe p2 = new Probe(3, 3, "E");
		
		String[] instructions1 = {"L", "M", "L", "M", "L", "M", "L", "M", "M"};
		Instruction i1 = new Instruction(instructions1);
		String[] instructions2 = {"M", "M", "R", "M", "M", "R", "M", "R", "R", "M"};
		Instruction i2 = new Instruction(instructions2);

		
		for (String inst : i1.getInstruction()) {			
			p1.move(cp.getAxisX(), cp.getAxisY(), inst);
		}
		
		for (String inst : i2.getInstruction()) {			
			p2.move(cp.getAxisX(), cp.getAxisY(), inst);
		}
		
		System.out.println("=====");
		
		System.out.println(p1.getInitX() + " " + p1.getInitY() + " " + p1.getDirection());
		System.out.println(p2.getInitX() + " " + p2.getInitY() + " " + p2.getDirection());
		


		
    }
}
