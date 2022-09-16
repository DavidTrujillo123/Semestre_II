using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_Herencia
{
	internal sealed class DocenteOcacional : Docentes //sealed sella una clase 
	{
		private int horas;
		public DocenteOcacional(string nombre, int edad, string cedula, string asignatura, int horas) : base(nombre, edad, cedula, asignatura)
		{
			this.horas = horas;
		}
		public string PagaHoras()
		{
			return "PAGO: " + 12;
		}
		public override string ToString()
		{
			return base.ToString() +" Horas: "+horas;
		}

	}
}
