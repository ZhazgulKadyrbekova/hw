//Үч анык a,b,c сандары берилген. Жактары ушул сандар болгон үч бурчтук жашайбы?

using System;
class YOD {
    public static void Main() {
        Console.WriteLine("Enter sides of triangle");
        int a = Int32.Parse(Console.ReadLine());
        int b = Int32.Parse(Console.ReadLine());
        int c = Int32.Parse(Console.ReadLine());

        if ((a+b > c && c > Math.Abs(a-b)) || (b+c > a && a > Math.Abs(b-c)) || (a+c > b && b > Math.Abs(a-c))) {
            Console.WriteLine("There exists triangle with sides {0}, {1} and {2}", a, b, c);
        } else {
            Console.WriteLine("There is no triangle with sides {0}, {1} and {2}", a, b, c);
        }
    }
}