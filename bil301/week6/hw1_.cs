/*
for, while, do-while циклдарды колдонуу менен бир ѳлчѳмдүү массивди кокус сандар менен толтуруп, Массивдин эң чоң элементинин индексин аныктагыла.
*/
using System;

public class HW {
    public static void Main() {
        Console.Write("Enter size of array ");
        int size = Int32.Parse(Console.ReadLine());
        Random random = new Random();
        
        ////////////////////    FOR LOOP    ///////////////
        int[] arr1 = new int[size];
        int max = -1000, imax = 0, i = 0;
        Console.Write("First array we got: ");
        for (i = 0; i < size; i++) {
            arr1[i] = random.Next(-1000, 1000);
            Console.Write("{0} ", arr1[i]);
            if (arr1[i] > max) {
                max = arr1[i];
                imax = i;
            }
        }
        Console.WriteLine();
        Console.WriteLine("Max element in array is {0}, indexed in {1}", max, imax);
        Console.WriteLine();
        
        ////////////////////    WHILE LOOP    //////////////
        int[] arr2 = new int[size];
        int temp = size; max = -1000; imax = 0; i = 0;
        Console.Write("Second array we got: ");
        while (size > 0)
        {
            arr2[i] = random.Next(-1000, 1000);
            Console.Write("{0} ", arr2[i]);
            if (arr2[i] > max)
            {
                max = arr2[i];
                imax = i;
            }

            i++;
            size--;
        }
        Console.WriteLine();
        Console.WriteLine("Max element in array is {0}, indexed in {1}", max, imax);
        Console.WriteLine();
        
        /////////////////////    DO...WHILE LOOP    /////////////////
        max = -1000; imax = 0; i = 0; size = temp;
        int[] arr3 = new int[size];
        Console.Write("Third array we got: ");
        do {
            arr3[i] = random.Next(-1000, 1000);
            Console.Write("{0} ", arr3[i]);
            if (arr3[i] > max)
            {
                max = arr3[i];
                imax = i;
            }

            i++;
            size--;
        } while (size > 0);
        Console.WriteLine();
        Console.WriteLine("Max element in array is {0}, indexed in {1}", max, imax);
        Console.WriteLine();
    }
}