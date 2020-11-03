/* Үч анык a,b,c сандары берилген. Жактары ушул сандар болгон үч бурчтук жашайбы? */

using System;

class HW {
    public static void Main() {
        Console.WriteLine("Enter three sides of a triangle:");
        Double a = Double.Parse(Console.ReadLine()), b = Double.Parse(Console.ReadLine()), c = Double.Parse(Console.ReadLine());
        
        if ((a + b > c && c > Math.Abs(a-b)) || (b + c > a && a > Math.Abs(b-c)) || (a + c > b && b > Math.Abs(a-c))) {
            Console.WriteLine("Triangle with sides a={0}, b={1}, c={2} EXISTS.", a,b,c);
        } else {
            Console.WriteLine("Triangle with sides a={0}, b={1}, c={2} DOESN'T EXIST.", a,b,c);
        }
    }
}