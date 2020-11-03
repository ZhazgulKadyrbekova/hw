
using System;
class Example {
    public int gcd(int a, int b) {
        
    }
}
class HW {
    public static void Main() {
        Example ob = new Example();
        int m = 9;
        Console.WriteLine(ob.fact(m));
    }
}

/*
hw1.cs(20,12): error CS1502: The best overloaded method match for `Example.Square(int)' has some invalid arguments
hw1.cs(10,17): (Location of the symbol related to previous error)
hw1.cs(20,23): error CS1615: Argument `#1' does not require `ref' modifier. Consider removing `ref' modifier
Compilation failed: 2 error(s), 0 warnings

функция параметр кабыл алган жерде ref кызматчы созу жок болгон учурда, 
функцияны чакырып жатканда ref созун колдонууга болбойт
*/