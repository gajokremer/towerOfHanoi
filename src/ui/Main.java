package ui;

import java.util.Scanner;
import model.Hanoi;

public class Main {
	
	private Hanoi hanoi;
	private Scanner sc;
//	private static int poles[]; 
	
	public Main() {
		
		hanoi = new Hanoi();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.inputData();
	}
	
	public void inputData() {
		
		System.out.print("Number of disks: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		hanoi.createPoles(n);
//		hanoi.HanoiCopy(n, 0, 0, 0);
		System.out.println("\nORIGINAL: " + hanoi.printPoles() + "\n");
		hanoi.solve(n, 0, 0, 0);
		System.out.println("\nFINAL: " + hanoi.printPoles());
	}
}