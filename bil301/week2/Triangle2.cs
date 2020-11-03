using System;
class Triangle2 {
	public static void Main() {
        Console.WriteLine("Enter two sides and hypothenus of an right-angled triangle");
		int a = Int32.Parse(Console.ReadLine()), b = Int32.Parse(Console.ReadLine()), c = Int32.Parse(Console.ReadLine());
		
		Console.WriteLine("Area of triangle is {0}:\t", a*b/2);
		Console.WriteLine("Perimeter of triangle is {0}:\t", a+b+c);
    }

}