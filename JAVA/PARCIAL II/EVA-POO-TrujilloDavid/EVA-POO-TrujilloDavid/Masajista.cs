using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EVA_POO_TrujilloDavid
{
	internal class Masajista : Persona, IMasajista
	{
		private string titulo;
		private int aniosExperiencia;
		public Masajista(int id, string nombre, int edad, string titulo, int anioExperiencia) : base(id, nombre, edad)
		{
			this.titulo = titulo;
			this.aniosExperiencia = anioExperiencia;
		}

		public string Titulo
		{
			get { return titulo; }
			set { titulo = value; }
		}
		public int AniosExperiencia
		{
			get { return aniosExperiencia; }
			set { aniosExperiencia = value; }
		}
		public override string Concentrarse()
		{
			return "El masajista " + base.Nombre + " esta concentrandose";
		}

		public string DarMasaje()
		{
			return "El masajista " + base.Nombre + " esta dando un masaje";
		}

		public override string Viajar()
		{
			return "El masajista " + base.Nombre + " esta viajando";
		}

		public override string ToString()
		{
			return base.ToString() + " Titulo: "+titulo + " Años Experiencia: "+aniosExperiencia;
		}
	}
}
