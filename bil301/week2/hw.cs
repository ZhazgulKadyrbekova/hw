//example for bitwise XOR

using System;
class HW {
	static void Main() {
		bool x = true, y = false, z = true;

		Console.WriteLine(x ^ y); // true,
		Console.WriteLine(x ^ z); // false,
		Console.WriteLine(z ^ y); // true,

	}
}