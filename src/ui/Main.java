package ui;

import java.util.Scanner;
import model.Ideas;

public class Main {
	
//	private Hanoi hanoi;
	private static Scanner sc;
	private int moves = 0;
	
	private static int poles[]; 
	
	public int[] getPoles() {
		return poles;
	}

	public void setPoles(int[] poles) {
		Main.poles = poles;
	}

	public Main() {
		
//		hanoi = new Hanoi();
		poles = new int [3];
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		System.out.print("Operation quantity: ");
		int x = sc.nextInt();
		System.out.println();
		
		int[] operations = new int[x];
		
		for(int i = 0; i < operations.length; i++) {
			
			operations[i] = main.input();
		}
		
		for(int i = 0; i < operations.length; i++) {
			
			main.initialize(operations[i]);
		}
	}
	
	public void createPoles(int n) {
		
		poles[0] = n;
		poles[1] = 0;
		poles[2] = 0;
	}
	
	public int input() {
		
		System.out.print("Number of disks: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		return n;
	}
	
	public void initialize(int n) {
		
		moves = 0;
		
		System.out.println("\n--Operation for " + n + " disks");
		
		createPoles(n);
		
		System.out.println("\nORIGINAL: " + printPoles());
		solve(n, poles[0], poles[1], poles[2], 0, 1, 2);
		System.out.println("FINAL: " + printPoles() + "\n");
		
		System.out.println("TOTAL MOVES: " + moves);
		System.out.println("2^" + n + " - 1  = " + (Math.pow(2, n) - 1));
		
//		System.out.println("END");
	}
	
	public void solve(int n, int origin, int aux, int destiny, int tower1, int tower2, int tower3) {
		
		if(n == 1) {
			
			poles[tower1]--;
			poles[tower3]++;
			moves++;
			System.out.println(printPoles());
			
		} else {

			solve(n - 1, origin, destiny, aux, tower1, tower3, tower2);
			poles[tower1]--;
			poles[tower3]++;
			moves++;
			System.out.println(printPoles());
			solve(n - 1, aux, origin, destiny, tower2, tower1, tower3);
		}
	}
	
	public int raiseToPower(int power) {
		
		int num = 0;
		
		num = (int) Math.pow(2, power) - 1;
		
		return num;
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
		
		return "[" + poles[0] + "] " + "[" + poles[1] + "] " + "[" + poles[2] + "]";
//		return "A:[" + poles[0] + "] " + "B:[" + poles[1] + "] " + "C:[" + poles[2] + "]";
//		return poles[0] + " " + poles[1] + " " + poles[2];
	}
}