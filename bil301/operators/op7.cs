// true жана false операторлорду кайрадан жүктөө.
using System;
class Logik {
    int x, y; 
    public Logik() { 
        x = y  = 0; 
    }
    public Logik(int i, int j ) { 
        x = i; y = j;  
    }
    public static bool operator true(Logik op) {
        if((op.x != 0) || (op.y != 0))  return true;  
        else return false; 
    }
    public static bool operator false(Logik op) { 
        if((op.x == 0) && (op.y == 0)) return true;  
        else return false; 
    }
    public void Show()  {
        Console.WriteLine(x + ", " + y); 
    }  
}

class Program { 
    static void Main() {
        Logik a = new Logik(5, 6);
        Logik b = new Logik(-7,  -8);
        Logik c = new Logik (0, 0);
        
        Console.Write("a: "); a.Show();
        Console.Write("b: "); b.Show();
        Console.Write("с: "); c.Show();
        
        if(a) Console.WriteLine("Чын."); 
        else Console.WriteLine("Жалган.");
        
        if(b) Console.WriteLine("Чын."); 
        else Console.WriteLine("Жалган.");
        
        if(c) Console.WriteLine("Чын."); 
        else Console.WriteLine("Жалган."); 
    } 
}