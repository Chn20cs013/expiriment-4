import java.util.*;

class Perimeter

{

	public static void main(String[] args)	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length and breadth of Rectangle : ");

		int l = sc.nextInt();

		int b = sc.nextInt();

		System.out.print("Enter the radius of circle : ");

		int r = sc.nextInt();

		Perimeter ab = new Perimeter(r);

		Perimeter ac = new Perimeter(l,b);

	}

	Perimeter(int r)

	{

		System.out.println("Perimeter of the circle = "+ (float)(2*3.14*r));

	}

	Perimeter(int l, int b)

	{

		System.out.println("Perimeter of the Rectangle = "+ (2*(l+b)));

	}

	

	

	

}
