import java.io.*;
//To find area of triangle
class TriangleArea {
	public static void main(String args[]) {
		if((args.length != 0) && (args.length == 2)) {
			System.out.print(args[0] + " " + args[1]);
			double base = Double.parseDouble(args[0]);
			double height = Double.parseDouble(args[1]);
			double area = (base * height) / 2;	
					System.out.print("\n" + area);
		}		
	}
}