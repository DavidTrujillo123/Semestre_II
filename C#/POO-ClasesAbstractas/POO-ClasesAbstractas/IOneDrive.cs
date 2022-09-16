using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_ClasesAbstractas
{
	internal interface IOneDrive
	{
		String SubirArchivo(string archivo);
		string DescargarArchivo();
		string MoverArchivo(string archivo);
		
	}
}
