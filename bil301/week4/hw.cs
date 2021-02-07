using System;

class HW {
    public static void Main() {
        enterdata:
        Console.WriteLine("Enter a number to find month:");
        int n = Int32.Parse(Console.ReadLine());

        if (n < 1 || n > 12) {
            Console.WriteLine("Number must be between 1 and 12");
            goto enterdata;
        }
        
        switch (n) {
            case 1: Console.WriteLine("First month is January"); break;
            case 2: Console.WriteLine("Second month is February"); break;
            case 3: Console.WriteLine("Third month is March"); break;
            case 4: Console.WriteLine("Fourth month is April"); break;
            case 5: Console.WriteLine("Fifth month is May"); break;
            case 6: Console.WriteLine("Sixth month is June"); break;
            case 7: Console.WriteLine("Seventh month is July"); break;
            case 8: Console.WriteLine("Eighth month is August"); break;
            case 9: Console.WriteLine("Ninth month is September"); break;
            case 10: Console.WriteLine("Tenth month is October"); break;
            case 11: Console.WriteLine("Eleventh month is November"); break;
            case 12: Console.WriteLine("Twelvth month is December"); break;
        }
    }
}