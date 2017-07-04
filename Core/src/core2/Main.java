package core2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int width;
		int height;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width = ");
		width = sc.nextInt();
		System.out.print("Enter height= ");
		height = sc.nextInt();
		
		Rectangle rc = new Rectangle(width, height);
		rc.area();
		rc.perimetr();
		
	}
	
}
