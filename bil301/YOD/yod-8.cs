using System;

class YOD3 {
    static int size;
    static  int[,] arr;

    public static void Main() {
        
        Console.WriteLine("Enter size of square array");
        size = Int32.Parse(Console.ReadLine());

        arr = new int[size,size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i, j] = rand.Next(-99, 99);
            }
        }

        Console.WriteLine("Array without changes");
        printArray();
        func();
        Console.WriteLine("Array after changes");
        printArray();
        

    }

    public static void printArray() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Console.Write("{0}\t", arr[i,j]);
            }
            Console.WriteLine();
        }
        Console.WriteLine();
    }
    
    public static void func() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i, j] = arr[j, i];
            }
        }
    }
}