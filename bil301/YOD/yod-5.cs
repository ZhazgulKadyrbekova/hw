using System;

class YOD5 {
    public static void Main() {
        double x = 0, y = 0;
        int k = -1;
        Console.WriteLine("    |-1 0 1");
        for (x = 0; x <= 10; x+=0.5) {
            if (x % 4 == 0) k++;
            if (x == 1.5 + 4*k || x == 2.5 + 4*k) {
                y = 0;
                Console.Write(x.ToString().PadLeft(4));
                Console.WriteLine("|   *  ");
            } else if (x == 4*k + 2) {
                y = -1;
                Console.Write(x.ToString().PadLeft(4));
                Console.WriteLine("| * |  ");
            } else {
                y = 1;
                Console.Write(x.ToString().PadLeft(4));
                Console.WriteLine("|   | *");
            }
            
        }
    }
}
