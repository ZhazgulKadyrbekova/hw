using System;

class ParseExample {
    public static void Main() {

        Console.WriteLine("Write numbers each at new line to sum up:");
        String str = "aaa";
        int[] nmb = new int[100];
        int i = 0, sum = 0;

        while (str.Length != 0) {
            str = Console.ReadLine();
            nmb[i] = Int32.Parse(str);
            sum += nmb[i];
            Console.WriteLine(nmb[i++] + " " + sum);
        }

        Console.WriteLine("Sum of all numbers is {0}", sum);

    }
}
