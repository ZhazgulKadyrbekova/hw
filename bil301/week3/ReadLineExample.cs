using System;

class ReadLineExample {
    public static void Main() {
        Console.WriteLine("Enter year to learn whether it leap:");
        int year = Convert.ToInt32(Console.ReadLine());
        if (year%4 == 0 ) {
            Console.WriteLine(year + " is leap year");
        } else {
            Console.WriteLine(year + " is not leap year");
        }
    }
}
