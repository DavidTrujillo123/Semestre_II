using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EVA_POO_TrujilloDavid
{
	internal class Futbolista : Persona, IFutbolista
	{
		private double peso;
		private string puesto;

		public Futbolista(int id, string nombre, int edad, double peso, string puesto) : base(id,nombre, edad)
		{
			this.peso = peso;
			this.puesto = puesto;
		}

		public string Puesto
		{
			get { return puesto; }
			set { puesto = value; }
		}
		public double Peso
		{
			get { return peso; }
			set { peso = value; }
		}

		public override string Concentrarse()
		{
			return "El futbolista "+base.Nombre+" se esta consentrando...";
		}

		public string Entrenar()
		{
			return "El futbolista " + base.Nombre + " esta entreanando...";
		}

		public string JugarPartido()
		{
			return "El futbolista " + base.Nombre + " esta jugando...";
		}

		public override string Viajar()
		{
			return "El futbolista " + base.Nombre + " esta viajan";
		}

		public override string ToString()
		{
			return base.ToString() + " Peso: " + peso + " Puesto: " + puesto;
		}
	}
}
