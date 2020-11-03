using System;
class Rectangle {
	public static void Main() {
        Console.WriteLine("Enter length and width of a rectangle");
		int a = Int32.Parse(Console.ReadLine()), b = Int32.Parse(Console.ReadLine());
		
		Console.WriteLine("Area of rectangle is {0}:\t", a*b);
		Console.WriteLine("Perimeter of rectangle is {0}:\t", 2*(a+b));
    }

}