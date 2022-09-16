using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_Excepciones
{
	internal class Carro
	{
		string nombre;
		bool gas;

		public Carro(string nombre, bool gas)
		{
			this.nombre = nombre;
			this.gas = gas;
		}
		public bool Gas
		{
			get { return gas; }
			set { gas = value; }
		}
		public void Moverse()
		{
			//if (gas == true)
			//	Console.WriteLine("El carro se esta moviendo");
			//else
			//	throw new Exception("El carro no tiene gas");
			try
			{
				Console.WriteLine("El carro se mueve");
			}
			catch(CarroExcepciones e)
			{
				Console.WriteLine(e.Message);
			}
		}

		public void EncerderLuces()
		{
			Console.WriteLine("Se encienden luces");
		}
	}
}
