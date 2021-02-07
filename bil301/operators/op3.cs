// variable + object 

using System;
class Binar
{   int a;
    int b;
    public Binar()  {  a = b = 0; }
    public Binar(int arg0, int arg1)
    {  a = arg0;      b = arg1;    }
    public static Binar operator +(int arg, Binar obj)
    {  Binar Result = new Binar();
    Result.a = obj.a + arg;    Result.b = obj.b + arg;
        return Result;     }
    public int GetValueA()    { return a;  }
    public int GetValueB()    { return b;  }
}

class Program
{    public static int Main()
    {   Binar OSum = new Binar();
        Binar O = new Binar(10, 20);
        int x = 5;
        OSum = x+O ;
        Console.WriteLine(OSum.GetValueA());       Console.WriteLine(OSum.GetValueB());
        return 0;    
    } }