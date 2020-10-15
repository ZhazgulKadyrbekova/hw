// N натурал саны берилсе, анын санариптер санын тапкыла.

using System;
class YOD{
    public static void Main() {
        Console.WriteLine("Enter a natural number");
        int n = Int32.Parse(Console.ReadLine()), m = n, res = 0;
        while (n > 0) {
            n /= 10;
            res++;
        }
        Console.WriteLine("There are {0} digits in {1}", res, m);
    }
}