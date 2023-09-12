package packages;

import java.util.Scanner;

public class CLA {
		public static void main(String[] args) {
			String a;
			int b;
			float c;

			Scanner inn = new Scanner(System.in);

			System.out.println("Enter String Value");
			a= inn.nextLine();
			System.out.println("Entered Line  =" + a);

			System.out.println("Enter integer Value");
			b=inn.nextInt();
			System.out.println("Entered integer   ="+b);

			System.out.println("Enter the float value");
			c=inn.nextFloat();
			System.out.println("You have entered float value   = "+c);

		}
}

