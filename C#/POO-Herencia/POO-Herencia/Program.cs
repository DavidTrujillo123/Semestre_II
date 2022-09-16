using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_Herencia
{
	internal class Program
	{
		static void Main(string[] args)
		{
			//Estudiantes p = new Estudiantes("Juan", 11, "123","FICA",1);
			//Docentes d = new Docentes("Ana", 3, "1111", "SO");
			//Persona p1 = new Persona("ana", 4, "as");


			//Console.WriteLine(d.Hablar());
			//Console.WriteLine(d.Calificar());
			//Console.WriteLine(d.ToString());
			//Console.WriteLine("--------------------");
			//Console.WriteLine(((Persona)d).Hablar());
			//Console.WriteLine(((Persona)d).Calificar());
			//Console.WriteLine(d.ToString());

			//Console.WriteLine();
			//Console.WriteLine(p.Hablar());
			//Console.WriteLine(p.Calificar());
			//Console.WriteLine(p.ToString());
			//Console.WriteLine("--------------------");
			//Console.WriteLine(((Persona)p).Hablar());
			//Console.WriteLine(((Persona)p).Calificar());
			//Console.WriteLine(p.ToString());

			//Console.WriteLine();

			//DocenteOcacional dc = new DocenteOcacional("ARMANDO CASAS", 68, "10038291","ALGEBRA",20);
			//Console.WriteLine(dc.ToString());

			Persona p1 = new DocenteOcacional("ARMANDO CASAS", 68, "10038291", "ALGEBRA", 20);
			Console.WriteLine(p1.ToString());
			Console.WriteLine(p1.Hablar());
			p1 = (Docentes)p1;
			Console.WriteLine(p1.ToString());
			Console.WriteLine(p1.Hablar());
		}
	}
}
