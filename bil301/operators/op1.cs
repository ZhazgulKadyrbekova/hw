// object + object

using System;
class Binar {
    int a;
    int b;
    public Binar() { 
        a = b = 0;
    } 
    
    public Binar(int arg0, int arg1) {
        a = arg0;
        b = arg1; 
    }
    
    //Бинардык + операторун кайрадан жүктөө
    public static Binar operator +(Binar obj0, Binar obj1) {
        Binar Result = new Binar();
        Result.a = obj0.a + obj0.b;
        Result.b = obj1.a + obj1.b;
        return Result;
    }
    public int GetValueA()    { return a;   }
    public int GetValueB()    {   return b;   }
}

class Program {
    public static int Main() {
        Binar OSum = new Binar();
        Binar O1 = new Binar(5, 10);
        Binar O2 = new Binar(10, 20);
        OSum = O1 + O2;
        Console.WriteLine(OSum.GetValueA());
        Console.WriteLine(OSum.GetValueB());
        return 0;
    }
}