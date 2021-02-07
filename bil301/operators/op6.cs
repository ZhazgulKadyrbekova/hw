//Унардык операторду кайрадан жүктөө.
using System;
class Unar
{  int x;
    public Unar() { x = 0; }
    public Unar(int i) { x = i; }
    public static Unar operator ++(Unar op)
    {   Unar result = new Unar();
        result.x = op.x + 1;
        return result;     }
    public void Show()     { Console.WriteLine(x ); } 
}

class Program
{   static void Main()
    {   Unar a = new Unar(1);
        Unar с = new Unar();
        Console.Write("a: "); a.Show();
        с = a++;
        Console.WriteLine("с = а++");         
        Console.Write("с: "); с.Show();         
        Console.Write("а: "); a.Show();
        
        a = new Unar(1);
        Console.Write("а: "); a.Show();
        
        с = ++a; 
        Console.WriteLine("с = ++а");         
        Console.Write("а: "); a.Show();         
        Console.Write("c: ");        
        с.Show();     
    }
}