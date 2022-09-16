using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_Excepciones
{
	internal class CarroExcepciones : Exception
	{
		public CarroExcepciones(string message): base(message) 
		{ 

		}

		public void exception(Carro c1)
		{
			if(c1.Gas == false)
				throw new CarroExcepciones("No tines gas");
		}
	}
}
