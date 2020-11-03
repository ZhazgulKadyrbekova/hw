using System;
class Square {
	public static void Main() {
        Console.WriteLine("Enter length of a square");
		int a = Int32.Parse(Console.ReadLine());
		
		Console.WriteLine("Area of square is {0}:\t", a*a);
		Console.WriteLine("Perimeter of square is {0}:\t", 4*a);
    }

}