using System;

class ConvertExample {
    public static void Main() {

        byte[] B = {3, 7, 12, 255};

        Console.WriteLine("Array is: {0}",
                        BitConverter.ToString(B));

        String str = Convert.ToBase64String(B); 

		Console.WriteLine("Base 64 string is :{0}", str); 
    }
}