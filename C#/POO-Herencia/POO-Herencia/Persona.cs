using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_Herencia
{
	internal class Persona
	{
		public string nombre;
		protected int edad;
		private string cedula;
		const int salario = 60;
		public Persona(string nombre, int edad, string cedula)
		{
			this.nombre = nombre;
			this.edad = edad;
			this.cedula = cedula;
		}
		
		public string Nombre{ 
			get { return nombre; } 
			set { nombre = value; }
		}
		public int Edad
		{
			get { return edad; }
			set { edad = value; }
		}
		public string Cedula
		{
			get { return cedula; }
			set { cedula = value; }
		}
		public virtual string Hablar()
		{
			return "Persona: Hola mi nombre es: " + this.nombre;
		}
		public virtual string Calificar()
		{
			return "Persona: Persona calificada";
		}

		public override string ToString()
		{
			return "Nombre: " + this.nombre + " Edad: " + this.edad + " Cedula: " + this.cedula;
		
		}
	}
}
