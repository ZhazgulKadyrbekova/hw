/*
18. Фибоначчи катарынын n-санынын маанисин эсептеген рекурсивдүү методду жазыңыз. Фибоначчи катарлары 1, 1, 2, 3, 5, 8, 13 ... натуралдык сандар тизмеги.
*/

using System;
class Example {
    public int fib(int a, int b, int i, int n) {
        if (i == n) return b;
        else return fib(b, a+b, i+1, n);
    }
}
class HW {
    public static void Main() {
        Example ob = new Example();
        Console.WriteLine("Enter index to learn its value (starting from 1):");
        int n = Int32.Parse(Console.ReadLine());
        int a = 1, b = 1;
        if (n == 1) Console.WriteLine("1");
        else Console.WriteLine(ob.fib(a,b,2,n));
    }
}
