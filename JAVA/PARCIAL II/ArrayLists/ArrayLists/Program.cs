using System;
using System.Collections;

namespace ArrayLists
{
	internal class Program
	{
		static void Main(string[] args)
		{
			ArrayList a = new ArrayList();

			a.Add(2);
			a.Add(9);
			a.Add(4);
			a.Add(2);
			a.Add(7);
			a.Add(1);
			a.Add(5);

			Console.WriteLine(a.Count);
			Console.WriteLine(a.Capacity);

			Console.WriteLine(a.Contains(2));
		}
	}
}
