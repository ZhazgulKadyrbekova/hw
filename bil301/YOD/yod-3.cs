/*
tan(x) = 0
    x = 0, 180, 360,...
tan(x) = undef
    x = 90, 270, 450...

*/

using System;

class YOD3 {
    public static void Main() {
        double t1, t2, a = 30, x = 1, b = 1;
        
        for (;;) {
            Console.WriteLine("Enter value of a (except zero):");
            a = Int32.Parse(Console.ReadLine());
            if (a != 0) break;
        }

        Console.WriteLine("Enter value of b:");
        b = Int32.Parse(Console.ReadLine());
        
        for (;;) {
            Console.WriteLine("Enter value of x (except zero, a*x != 90*k):");
            x = Int32.Parse(Console.ReadLine());
            if (x > 0 && (a*x % 90) != 0) break;
        }


        double rad = ConvertDegreesToRadians(a*x);
        double rad2 = ConvertDegreesToRadians(a*x/2);

        t1 = 2/(35*a*a) * (5*Math.Pow(x, 2.5) - 7*b*Math.Pow(x, 3.5));
        t2 = Math.Sin(rad)/(2*Math.Pow(Math.Cos(rad),2)) + Math.Log(Math.Tan(rad2))/2;

        Console.WriteLine("\nFor values a = {0}, b = {1}, x = {2}\nwe get result\nt1 = {3}\nt2 = {4}", a, b, x, t1, t2);
    }

    public static double ConvertDegreesToRadians (double degrees)
    {
      double radians = (Math.PI / 180) * degrees;
      return (radians);
    } 
}