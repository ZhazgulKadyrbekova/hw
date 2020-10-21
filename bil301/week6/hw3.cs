/*
NxM массивин кокус сандар менен толтургула, элементтер кайталанышы мүмүкүн. 
Бул массивте K элементинин акыркы кирүү индекстерин аныктагыла.
*/

using System;

public class HW {
    public static void Main() {
        Console.WriteLine("Enter values for n, m: ");
        int n = Int32.Parse(Console.ReadLine()), m = Int32.Parse(Console.ReadLine());
        Random random = new Random();

        int[,] arr = new int[n, m];
        Console.WriteLine("Array we got:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i, j] = random.Next(0, 100);
                Console.Write("\t{0}", arr[i, j]);
            }
            Console.WriteLine();
        }
        Console.WriteLine("Enter value for k:");
        int k = Int32.Parse(Console.ReadLine());

        bool flag = false;
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if (k == arr[i, j]) {
                    Console.WriteLine("Last \"{0}\" is placed in ({1},{2})", k, i+1, j+1);
                    flag = true;
                    break;
                }
            }
            
        }
        if (!flag) {
            Console.WriteLine("{0} does not exist in array", k);
        }
        
    }
}