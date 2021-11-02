package ui;

import java.util.Scanner;
import model.Ideas;

public class Main {
	
//	private Hanoi hanoi;
	private Scanner sc;
	
	private static int poles[]; 
	
	public Main() {
		
//		hanoi = new Hanoi();
		poles = new int [3];
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.inputData();
	}
	
	public void createPoles(int n) {
		
		poles[0] = n;
		poles[1] = 0;
		poles[2] = 0;
	}
	
	public void inputData() {
		
		System.out.print("Number of disks: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		createPoles(n);
		
		System.out.println("\nORIGINAL: " + printPoles() + "\n");
		solve(n, poles[0], poles[1], poles[2]);
//		HanoiCopy(n, 1, 2, 3);
//		System.out.println("\nFINAL: " + hanoi.printPoles());
	}
	
	public void solve(int n, int origin, int aux, int destiny) {
		
//		System.out.println("Origin: " + origin);
//		System.out.println("Aux: " + aux);
//		System.out.println("Destiny: " + destiny);

		if(n == 1) {
			
			poles = move(origin, destiny, aux);
			System.out.println("--" + printPoles());
			 
		} else {
			
			solve(n - 1, origin, destiny, aux);
			poles = move(origin, destiny, aux);
			System.out.println(printPoles());
			solve(n - 1, aux, origin, destiny);
		}
	}
	
	public int [] move(int origin, int destiny, int aux) {
		
		origin--;
		destiny++;
		
		int[] arr = {origin, aux, destiny};
		
		return arr;
	}
	
	public void HanoiCopy(int n, int origin, int aux, int destiny) {

		if(n == 1) {

			System.out.println("Move disc " + n + " from " + origin + " to " + destiny);

		} else {

			HanoiCopy(n - 1, origin, destiny, aux);
			System.out.println("Move disc " + n + " from " + origin + " to " + destiny);
			HanoiCopy(n - 1, aux, origin, destiny);
		}
	}
	
	public String printPoles() {
		
		return "A:[" + poles[0] + "] " + "B:[" + poles[1] + "] " + "C:[" + poles[2] + "]";
	}
}