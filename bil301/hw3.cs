using System;
class HW {
	static void Main() {
		int a = 4, b = 6, c = 8, r = 5;
		
		Console.WriteLine(areaRectangle(a, b));
		Console.WriteLine(perimeterRectangle(a, b));

		Console.WriteLine(areaSquare(a));
		Console.WriteLine(perimeterSquare(a));

		Console.WriteLine(areaCircle(r));
		Console.WriteLine(circumferenceCircle(r));

		Console.WriteLine(areaTriangle1(a));
		Console.WriteLine(perimeterTriangle1(a));

		Console.WriteLine(areaTriangle2(a, b, c));
		Console.WriteLine(perimeterTriangle2(a, b, c));
	

	
	}
		static public int areaRectangle(int a, int b) {
			return a*b;
		}
		static public int perimeterRectangle(int a, int b) {
			return 2*(a+b);
		}

		static public int areaSquare(int a) {
			return a*a;
		}
		static public int perimeterSquare(int a) {
			return 4*a;
		}

		static public double areaCircle(int r) {
			return r*r*Math.PI;
		}
		static public double circumferenceCircle(int r) {
			return 2*Math.PI*r;
		}

		//equal-sized 
		static public double areaTriangle1(int a) {
			return a*a/2*Math.Sqrt(3);
		}
		static public int perimeterTriangle1(int a) {
			return 3*a;
		}

		//right-angled 
		static public int areaTriangle2(int a, int b, int c) {	//c -> hypothenus
			return a*b/2;
		}
		static public int perimeterTriangle2(int a, int b, int c) {
			return a+b+c;
		}
}