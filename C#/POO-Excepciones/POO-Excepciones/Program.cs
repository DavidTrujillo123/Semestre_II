using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_Excepciones
{
	internal class Program
	{
		static void Main(string[] args)
		{
			string num="asasa";
			int a = 3;
			//try
			//{
			//	a = a / 0;
			//	int num2 = int.Parse(num);

			//}
			//catch (Exception e) when (e.GetType() != typeof(FormatException))
			//{

			//}
			//catch (FormatException e)
			//{
			//	Console.WriteLine(e.Message);
			//}
			//catch (Exception e)
			//{
			//	Console.WriteLine(e.Message);
			//}
			//finally
			//{
			//	Console.WriteLine("EJECUTA SI O SI");
			//}

			//int numx = int.MaxValue;
			//unchecked
			//{
			//	numx = numx + 20;
			//	Console.WriteLine(numx);
			//}


			Carro c1 = new Carro("susuki",true);

			c1.Moverse();
			
			
				
			
				c1.EncerderLuces();
		
		}
	}
}
