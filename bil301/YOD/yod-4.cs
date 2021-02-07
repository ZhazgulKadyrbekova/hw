/*
Берилген катардын биринчи 10 мүчөсүнүн суммасын 0.000001 тактыкта эсептегиле.
*/

using System;

class YOD4 {
    public static void Main() {
        double a = 0, sum = 0;
        for (int i = 0; i < 10; i++) {
            a = Math.Pow(-1, i) * (i+1) / (Math.Pow(i, 3) + 2);
            //Console.WriteLine("{0}\t{1}", i, a);
            sum += a;
        }
        Console.WriteLine("Sum of first 10 variables is {0:G5}", sum);
        
    }
}