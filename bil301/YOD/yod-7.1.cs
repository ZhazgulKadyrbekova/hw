/*
Маанилери терс болгон элементтердин бардыгын 0го
барабар болбогон оң сандардын эң кичине элементи менен
алмаштыгыла.
*/

using System;

public class YOD {
    public static void Main() {
        int count = 50, min = 100;
        int[] arr = new int[count];

        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arr[i] = random.Next(-100, 100);
            if (arr[i] < min && arr[i] > 0) {
                min = arr[i];
            }
            Console.Write("\t{0}", arr[i]);
            if (i%10 == 9) {
                Console.WriteLine();
            }
        }
        Console.WriteLine();

        for (int i = 0; i < count; i++) {
            if (arr[i] < 0) {
                arr[i] = min;
            }
            Console.Write("\t{0}", arr[i]);
            if (i%10 == 9) {
                Console.WriteLine();
            }
        }

    }
}