using System;
class Binar {
    int x, y, z;
    public Binar() { x = 0; y = 0; z = 0; }
    public Binar(int i, int j, int k) { x = i; y = j; z = k; }
    public static Binar operator +(Binar op1, Binar op2)
    {
        Binar result = new Binar(); 
        result.x = op1.x + op2.x; 
        result.y = op1.y + op2.y; 
        result.z = op1.z + op2.z; 
        return result; 
    }

    public static Binar operator -(Binar op1, Binar op2)
    {
        Binar result = new Binar(); 
        result.x = op1.x - op2.x; 
        result.y = op1.y - op2.y; 
        result.z = op1.z - op2.z; 
        return result; 
    }

    public void Show() {Console.WriteLine(x + ", " + y + ", " + z); }    
}

class BinarDemo { 
    static void Main() {
        Binar a = new Binar(1, 2, 3); a.Show();
        Binar b = new Binar(10, 10, 10); b.Show();
        Binar c;
        c = a + b;  Console.Write("а + b: "); c.Show();
        c = a + b + c;  Console.Write("а + b + с: "); c.Show();
        c = c - a;  Console.Write("с - а: "); c.Show();
        c = c - b; Console.Write("с - b: "); c.Show();
    } 
}