package model;

public class Ideas {

	private int poles[]; 
	private int count = 0;

	public int[] getPoles() {
		return poles;
	}

	public void setPoles(int[] poles) {
		this.poles = poles;
	}

	public Ideas() {

		poles = new int[3];
	}
	
	public void createPoles(int n) {

		poles[0] = n;
		poles[1] = 0;
		poles[2] = 0;
	}
	
	

	public void HanoiCopy(int n, int origin, int aux, int destiny) {

		if(n == 1) {

			System.out.println("--Move disc " + n + " from " + origin + " to " + destiny);

		} else {

			HanoiCopy(n - 1, origin, destiny, aux);
			System.out.println("Move disc " + n + " from " + origin + " to " + destiny);
			HanoiCopy(n - 1, aux, origin, destiny);
		}
	}



	public void solve(int n, int origin, int aux, int destiny) {

		count++;
		System.out.println("Count: " + count);
		
		if(n == 1) {

			if(count % 2 != 0) {
				
				if(poles[0] <= 0) {
					
					poles[1]--;
					poles[2]++;
					System.out.println("--" + printPoles());
					
				} else {
					
					poles[0]--;
					poles[2]++;
					System.out.println("---" + printPoles());
				}
				
//				poles[0]--;
//				poles[2]++;
//				System.out.println("--" + printPoles());
				
			} else { //origin, destiny, aux
				
				if(poles[0] <= 0) {
					
					poles[1]--;
					poles[2]++;
					System.out.println("----" + printPoles());
					
				} else {
					
					poles[0]--;
					poles[1]++;
					System.out.println("-----" + printPoles());
				}
			}

		} else {

			solve(n - 1, origin, destiny, aux);
			
			if(count % 2 != 0) {
				
				if(poles[0] <= 0) {
					
					poles[0]--;
					poles[1]++;
					System.out.println("==" + printPoles());
					
				} else {
					
					poles[0]--;
					poles[1]++;
					System.out.println("===" + printPoles());
				}

			} else {

				poles[0]--;
				poles[2]++;
				System.out.println("====" + printPoles());
			}
			
//			poles[0]--;
//			poles[2]++;
//			System.out.println(printPoles());
			solve(n - 1, aux, origin, destiny);
		}
	}

	public void move(int origin, int destiny) {
		
		
	}

	public String printPoles() {

		return "A:[" + poles[0] + "] " + "B:[" + poles[1] + "] " + "C:[" + poles[2] + "]";
	}
}
