using System;

public class YOD {
    public static void Main() {
        Random random = new Random();

        int[,] arr = new int[9, 9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i, j] = random.Next(0, 99);
                Console.Write("\t{0}", arr[i, j]);
            }
            Console.WriteLine();
        }
        Console.WriteLine();
        
        int k = 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                arr[i, j] = arr[j, i];
            }
            if (k < 9) {
                k++;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Console.Write("\t{0}", arr[i, j]);
            }
            Console.WriteLine();
        }





    }
}
