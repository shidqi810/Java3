import java.util.*;

public class trisula {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int a = n/3; //nilai a untuk
				int b = n-1;
				int c = n/2;
				int d = (n/2) + 1;
				if (i <= c) {
					if (i == 1) {
						if ( (j == a) || (j ==b) ) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else if (i == a) {
						if ( (j == (a-1)) || (j == a) ) {
							System.out.print("*");
						}
						else if ( (j == (c+1)) ) {
							System.out.print("* ");
						}
						else if ( (j == (b-1)) || (j ==b) ) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else if (i == c) {
						if ( (j > 1 ) && (j < n) ) {
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