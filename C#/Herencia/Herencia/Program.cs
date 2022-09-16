using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Herencia
{
	internal class Program
	{
		static void Main(string[] args)
		{
			Secretaria sc = new Secretaria("MARIA PEREZ","123",21,333.33);
			Console.WriteLine(sc.Imprimir());
		}
	}
}
