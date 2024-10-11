import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int 가로 = sc.nextInt(); 
		int 세로 = sc.nextInt();
		
		for (int i = 0; 세로 > i; i++) {
			for (int j = 0; 가로 > j; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
				
	}
}
