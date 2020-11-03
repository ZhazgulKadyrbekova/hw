using System;
class Circle {
	public static void Main() {
        Console.WriteLine("Enter length of a circle");
		int r = Int32.Parse(Console.ReadLine());
		
		Console.WriteLine("Area of circle is {0}:\t", r*r*Math.PI);
		Console.WriteLine("Circumference of circle is {0}:\t", 2*Math.PI*r);
    }

}