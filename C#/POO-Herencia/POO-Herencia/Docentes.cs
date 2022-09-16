using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_Herencia
{
	internal class Docentes : Persona
	{
		private string asignatura;

		public Docentes(string nombre, int edad, string cedula, string asignatura) : base(nombre, edad, cedula)
		{
			this.asignatura = asignatura;
		}

		public override string Hablar()
		{
			return "Docente: Hola soy docente y mi nombre es: "+nombre;
		}
		public new string Calificar()
		{
			return "Docente: Docente calificando";
		}
		public override string ToString()
		{
			return base.ToString()+" Asignatura: "+asignatura;
		}
	}
}
