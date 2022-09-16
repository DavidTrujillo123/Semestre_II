using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EVA_POO_TrujilloDavid
{
	internal abstract class Persona
	{
		private int id;
		private string nombre;
		private int edad;

		public Persona( int id, string nombre, int edad)
		{
			this.id = id;
			this.nombre = nombre;
			this.edad = edad;
		}

		public int Id
		{
			get { return id; }
			set { id = value; }
		}
		public string Nombre
		{
			get { return nombre; }
			set { nombre = value; }
		}
		public int Edad
		{
			get { return edad; }
			set { edad = value; }
		}
		public abstract string Concentrarse();
		public abstract string Viajar();

		public override string ToString()
		{
			return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad;
		}
	}
}
