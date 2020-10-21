/*
a = [1, 6, 9, 18, 27, 36, 51, 68, 82, 101] массиви берилген. Бул массивдин так элементтерин 
башка массивке алып, жыйынтыгын чыгаргыла.
*/
using  System;

public class HW {
    public static void Main() {
        int[] arr = {1, 6, 9, 18, 27, 36, 51, 68, 82, 101};
        int count = arr.Length, k = 0;
        int[] odd = new int[count];

        Console.Write("Array with all elements\n\t");
        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 == 1) {
                odd[k++] = arr[i];
            }
            Console.Write(" {0}", arr[i]);
        }

        Console.Write("\nArray with odd elements\n\t");
        for (int i = 0; i < k; i++) {
            Console.Write(" {0}", odd[i]);
        }
        Console.WriteLine();
    }
}