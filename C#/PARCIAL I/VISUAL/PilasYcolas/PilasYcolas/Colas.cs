using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PilasYcolas
{
	internal class Colas
	{
        private Object[] obj;
        private static int cont = 0;

        public Colas()
        {
            obj = new Object[10];
        }
        public Colas(int tamanio)
        {
            obj = new Object[tamanio];
        }
        public void Colar(Object obj)
        {
            this.obj[cont] = obj;
            Colas.cont++;
        }
        public void Descolar(int num)
        {
            int aux = 0;
            for (int i = 0; i <= num; i++)
            {
                if (this.obj[i] != null)
                {
                    obj[i] = null;
                    aux++;
                }
            }

            //Para mover la pos
            for (int j = 0; j < obj.Length; j++)
            {
                if (obj[j] != null)
                {
                    obj[j - aux] = obj[j];
                    obj[j] = null;
                }
            }
            cont -= aux;
        }
        public void Descolar()
        {
            obj[0] = null;
            for (int j = 0; j < obj.Length; j++)
            {
                if (obj[j] != null)
                {
                    obj[j - 1] = obj[j];
                    obj[j] = null;
                }
            }
            cont--;
        }
        public Boolean Comprobar()
        {
            if (cont == obj.Length) {
                return false;
            }
            else return true;
        }
        public String ImprimirObjeto()
        {
            String c = "";
        
            for (int i = 0; i < this.obj.Length; i++)
            {
                if (this.obj[i] != null)
                {
                    if (typeof(Circunferencia).IsInstanceOfType(obj[i]))
                        c += i + ".-" + ((Circunferencia)this.obj[i]).Imprimir();
                    else if (typeof(Fecha).IsInstanceOfType(obj[i]))
                        c += i + ".-" + ((Fecha)this.obj[i]).Imprimir();
                    else if (typeof(Triangulo).IsInstanceOfType(obj[i]))
                        c += i + ".-" + ((Triangulo)this.obj[i]).Imprimir() + "\r\n";
                    else if (typeof(Cuadrado).IsInstanceOfType(obj[i]))
                        c += i + ".-" + ((Cuadrado)this.obj[i]).Imprimir();
                    else if (typeof(Punto).IsInstanceOfType(obj[i]))
                        c += i + ".-" + ((Punto)this.obj[i]).Imprimir() + "\r\n";
                    else if (typeof(SegmentoRecta).IsInstanceOfType(obj[i]))
                        c += i + ".-" + ((SegmentoRecta)this.obj[i]).Imprimir() + "\r\n";
                    else if (typeof(Rectangulo).IsInstanceOfType(obj[i]))
                        c += i + ". - " + ((Rectangulo)this.obj[i]).Imprimir();
                    else if (typeof(Elipse).IsInstanceOfType(obj[i]))
                        c += i + ". - " + ((Elipse)this.obj[i]).Imprimir();
                    c += "\r\n";
                }
            }
            return c;
        }
    }
}
