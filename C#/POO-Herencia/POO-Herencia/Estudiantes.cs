using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_Herencia
{
	internal class Estudiantes : Persona
	{
		private string facultad;
		private int nivel;

		public Estudiantes(string nombre, int edad, string cedula, string facultad, int nivel) : base(nombre, edad,cedula)
		{
			this.facultad = facultad;
			this.nivel = nivel;
			
		}
		public new string Hablar()
		{
			return base.Hablar()+nombre + "Soy estudiante del la facultad: "+this.facultad;
			//return "Estudiante: Hola soy estudiante y me llamo"+nombre;
		}
		public new string Calificar()
		{
			return "Estuadiante: Estudiante calificando";
		}
		public override string ToString()
		{
			return base.ToString() + " Facultad: " + facultad+" Nivel: "+this.nivel;
		}

	}
}
