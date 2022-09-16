using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PilasYcolas
{
	internal class Pilas
	{
        private Object[] obj;
        private static int cont;

        public Pilas(int tamanio)
        {
            obj = new Object[tamanio];
            cont = tamanio;
        }
        public Pilas()
        {
            obj = new Object[10];
            cont = obj.Length;
        }

        public Object[] getObj()
        {
            return obj;
        }
        public void Apilar(Object obj)
        {
            this.obj[cont - 1] = obj;
            cont--;
        }
        public void Desapilar(int num)
        {
            num = this.obj.Length - num;
            int aux = 0;
            for (int i = 0; i < num; i++)
            {
                if (this.obj[i] != null)
                {
                    aux++;
                    this.obj[i] = null;
                }
            }
            cont += aux;
        }
        public void Desapilar()
        {
            int aux = 0;
			for (int i = 0; i < this.obj.Length; i++)
			{
                if (obj[i] != null)
                {
                    aux = i;
                    break;
                }
			}
            obj[aux] = null;
            if (cont < obj.Length) cont++;
        }
        public Boolean Comprobar()
        {
            if (cont <= 0)
            {
                return false;
            }
            else return true;
        }
        public String ImprimirObjeto()
        {
            String c = "";
            int aux = this.obj.Length - 1;
            for (int i = 0; i < this.obj.Length; i++)
            {
                if (this.obj[i] != null)
                {
                    if (typeof(Circunferencia).IsInstanceOfType(obj[i]))
                        c += aux + ".-" + ((Circunferencia)this.obj[i]).Imprimir();
                    else if (typeof(Fecha).IsInstanceOfType(obj[i]))
                        c += aux + ".-" + ((Fecha)this.obj[i]).Imprimir();
                    else if (typeof(Triangulo).IsInstanceOfType(obj[i]))
                        c += aux + ".-" + ((Triangulo)this.obj[i]).Imprimir() + "\r\n";
                    else if (typeof(Cuadrado).IsInstanceOfType(obj[i]))
                        c += aux + ".-" + ((Cuadrado)this.obj[i]).Imprimir();
                    else if (typeof(Punto).IsInstanceOfType(obj[i]))
                        c += aux + ".-" + ((Punto)this.obj[i]).Imprimir() + "\r\n";
                    else if (typeof(SegmentoRecta).IsInstanceOfType(obj[i]))
                        c += aux + ".-" + ((SegmentoRecta)this.obj[i]).Imprimir() + "\r\n";
                    else if (typeof(Elipse).IsInstanceOfType(obj[i]))
                        c += aux + ".-" + ((Elipse)this.obj[i]).Imprimir();
                    else if (typeof(Rectangulo).IsInstanceOfType(obj[i]))
                        c += aux + ".-" + ((Rectangulo)this.obj[i]).Imprimir();
                    c += "\r\n";
                }
                aux--;
            }
            return c;
        }
    }
}
