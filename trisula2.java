import java.util.*;

public class trisula2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int tengah = (2*n)-1;

		for (int i = 1; i <= tengah; i++) {
			for (int j = 1; j <= tengah; j++) {
				int a = tengah/3; //nilai a untuk
				int b = n-1;
				int bb = n+1;
				int c = n-2;
				int cc = n+2;
				int d = (tengah/2) + 1;
				if (i < n) {
					if (i == 1) {
						if ( (j == c) || (j == cc) ) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else if (i == a) {
						if ( (j == b) || (j == bb) ) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
					else if (i == b) {
						if ( (j > 1 ) && (j <= (tengah-1)) ) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
				}
				else {
					if (j == d) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}
}