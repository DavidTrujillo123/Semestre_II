using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EVA_POO_TrujilloDavid
{
	internal class Entrenador:Persona , IEntrenador
	{
		private string federacion;

		public Entrenador(int id, string nombre, int edad, string federacion): base(id, nombre, edad)
		{
			this.federacion = federacion;
		}
		public string Federacion
		{
			get { return federacion; }
			set { federacion = value; }
		}
		//private string Inicio()
		//{
		//	return "El entrenador " + base.Nombre;
		//}
		public override string Concentrarse()
		{
			return "El entrenador " + base.Nombre + " se esta concentrando...";
		}

		public override string Viajar()
		{
			return "El entrenador " + base.Nombre + " esta viajando";
		}

		public string DirigirPartido()
		{
			return "El entrenador "+base.Nombre+" esta dirigiendo el partido";
		}

		public string DirigirEntrenamiento()
		{
			return "El entrenador " + base.Nombre + " esta dirigiendo el entrenamiento";  
		}

		public override string ToString()
		{
			return base.ToString() + " Fedaracion: " + federacion;
		}
	}
}
