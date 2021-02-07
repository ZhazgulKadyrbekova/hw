using System;
class Triangle1 {
	public static void Main() {
        Console.WriteLine("Enter sides of an equalateral triangle");
		int a = Int32.Parse(Console.ReadLine());
		
		Console.WriteLine("Area of triangle is {0}:\t", a*a/2*Math.Sqrt(3));
		Console.WriteLine("Perimeter of triangle is {0}:\t", 3*a);
    }

}