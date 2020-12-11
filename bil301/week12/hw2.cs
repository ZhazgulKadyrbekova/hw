// Массивдин чегарасын текшерген индексаторду түзгүлө.

using System;

class Student {
    public string name;
    public Student(string n) {
        name = n;
    }
}
class Univer {
    Student[] data;
    public Univer() {
        data = new Student[3];
    }
    public Student this[int index] {
        get {
            if (index > 2) {
                return data[2];
            } else if (index < 0) {
                return data[0];
            } else {
                return data[index];
            }
        }
        set {
            if (index > 2) {
                data[2] = value;
            } else if (index < 0) {
                data[0] = value;
            } else {
                data[index] = value;
            }
        }
    }
}

class HW {
    public static void Main(String[] args) {

        Univer manas = new Univer();
        manas[0] = new Student("Zhazgul");
        manas[1] = new Student("Atyrgul");
        manas[2] = new Student("AAAAAa");
        manas[3] = new Student("BBBBBB");

        Student stud = manas[0];
        
        Console.WriteLine(stud.name);

        Console.WriteLine(manas[0].name);
        Console.WriteLine(manas[1].name);
        Console.WriteLine(manas[2].name);
        Console.WriteLine(manas[3].name);
    }
}