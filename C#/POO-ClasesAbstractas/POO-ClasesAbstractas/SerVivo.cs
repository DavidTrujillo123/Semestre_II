using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POO_ClasesAbstractas
{
	internal abstract class SerVivo
	{
        private String nombre;
        private int edad;

        public SerVivo(String nombre, int edad)
        {
            this.edad = edad;
            this.nombre = nombre;
        }

        public int getEdad()
        {
            return edad;
        }

        public void setEdad(int edad)
        {
            this.edad = edad;
        }

        public String getNombre()
        {
            return nombre;
        }

        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }
        
        public override String ToString()
        {
            return "Nombre: " + nombre + " Edad:" + edad;
        }


        protected abstract String Alimentarse();
    }
}
