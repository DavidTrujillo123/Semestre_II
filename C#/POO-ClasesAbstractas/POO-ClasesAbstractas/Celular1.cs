using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_ClasesAbstractas
{
	internal class Celular1 : IOneDrive, ICorreo
	{
		public string DescargarArchivo()
		{
			return "Descargando Archivo"; 
		}

		public string EnviarCorreo()
		{
			return "Enviando Archivo";
		}

		public string MoverArchivo(string archivo)
		{
			return "Moviendo Archivo " + archivo;
		}

		public string SubirArchivo(string archivo)
		{
			return "Subiendo archivo "+archivo;
		}
		

	}
}
