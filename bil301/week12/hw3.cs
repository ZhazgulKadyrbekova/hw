/*
Студент жөнүндө малыматты иштетүүнү камтыган int жана string тибиндеги эки параметрлүү индексаторду түзгүлө. Биринчи параметр аркылуу студенттер жөнүндө (3 студент) маалыматты массивке сактагыла, экинчи параметр аркылуу студент жөнүңдө маалыматты студенттин аты боюнча издөөнү уюштургула.
*/

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
    public Student this[int index, string val] {
        get {
            for (int i = 0; i < 3; i++) {
                if (data[i].name == val) {
                    return data[i];
                }
            }
            return new Student("not found");
        }
        set {
            data[index] = value;
        }
    }
}

class HW {
    public static void Main(string[] args) {
        Univer univer = new Univer();
        univer[0, "smth"] = new Student("Aidai");
        univer[1, "smth"] = new Student("Zhazgul");
        univer[2, "smth"] = new Student("Aidana");

        Console.WriteLine(univer[-1, "Aidana"].name);        
    }
}