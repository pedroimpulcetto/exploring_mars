package ExploringMars;

import java.util.ArrayList;

public class ExploringMars {
	public static void main(String[] args) {
		
		ArrayList<String> windRose = new ArrayList();
		windRose.add("N");
		windRose.add("E");
		windRose.add("S");
		windRose.add("W");
		
		CartesianPlan cp = new CartesianPlan(5, 5);
		
		System.out.println(cp.getAxisX() + " " + cp.getAxisY());
		
		Probe p1 = new Probe(cp.getAxisX(), cp.getAxisY(), 1, 2, "N");
		Probe p2 = new Probe(cp.getAxisX(), cp.getAxisY(), 3, 3, "E");
		
		String[] instructions1 = {"L", "M", "L", "M", "L", "M", "L", "M", "M"};
		Instruction i1 = new Instruction(instructions1);
		String[] instructions2 = {"M", "M", "R", "M", "M", "R", "M", "R", "R", "M"};
		Instruction i2 = new Instruction(instructions2);

		
		for (String inst : i1.getInstruction()) {			
			p1.move(inst, windRose);
		}
		
		for (String inst : i2.getInstruction()) {			
			p2.move(inst, windRose);
		}
		
		System.out.println("=====");
		
		System.out.println(p1.getInitX() + " " + p1.getInitY() + " " + p1.getDirection());
		System.out.println(p2.getInitX() + " " + p2.getInitY() + " " + p2.getDirection());
	}
}
