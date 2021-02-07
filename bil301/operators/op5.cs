//Унардык операторду кайрадан жүктөө.
using System;
class Unar
{   int a;
    int b;
    public Unar()
        {   a = b = 0;     }
    public Unar(int arg0, int arg1)
        {   a = arg0;     b = arg1;     }
    public static Unar operator - (Unar obj)
        {   Unar Result = new Unar();
            Result.a = -obj.a;
            Result.b = -obj.b;
            return Result;     }
    public int GetValueA()     {        return a;    }
    public int GetValueB()    {        return b;    }
}
class Program
{   public static int Main()
    {   Unar O = new Unar(5, -3);
        Console.WriteLine(-O.GetValueA());
        Console.WriteLine(-O.GetValueB());
        return 0;   
     }	//O=ob1-ob2;
}