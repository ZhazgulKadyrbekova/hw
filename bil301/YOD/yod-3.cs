using System;

class YOD3 {
    public static void Main() {
        Console.WriteLine("Enter values for X and Y:");
        double x = Double.Parse(Console.ReadLine()), y = Double.Parse(Console.ReadLine());
        if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
            Console.WriteLine("Point ({0}, {1}) is outside of a given figure", x, y);
        } else if ((x == 0 && y <= 1 && y >= -1) || (x >= -1 && x <= 1 && y == 0)) {
            Console.WriteLine("Point ({0}, {1}) is on line of a given figure", x, y);
        } else {
            if (x*x + y*y < 1) {
                Console.WriteLine("Point ({0}, {1}) is inside of a given figure", x, y);
            } else if (Math.Abs(1 - (x*x + y*y)) < 0.000001) {
                Console.WriteLine("Point ({0}, {1}) is on line of a given figure", x, y);
            } else {
                Console.WriteLine("Point ({0}, {1}) is outside of a given figure", x, y);
            }
        }

        
    }
}