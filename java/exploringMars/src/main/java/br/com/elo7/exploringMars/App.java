package br.com.elo7.exploringMars;

import java.util.Scanner;

import br.com.elo7.exploringMars.dto.CartesianPlan;
import br.com.elo7.exploringMars.dto.Instruction;
import br.com.elo7.exploringMars.probe.Probe;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int axisX = scan.nextInt();
    	int axisY = scan.nextInt();
		
		CartesianPlan cp = new CartesianPlan(axisX, axisY);

		int initX01 = scan.nextInt();
    	int initY01 = scan.nextInt();
    	String direction01 = scan.next();
    	Probe p1 = new Probe(initX01, initY01, direction01);

    	int initX02 = scan.nextInt();
    	int initY02 = scan.nextInt();
    	String direction02 = scan.next();
		Probe p2 = new Probe(initX02, initY02, direction02);
		
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
