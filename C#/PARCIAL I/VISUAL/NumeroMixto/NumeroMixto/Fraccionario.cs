using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumeroMixto
{
	internal class Fraccionario
	{
        private int num;
        private int den;
        public static int cont = 0;
        public Fraccionario(int num, int den)
        {
            this.num = num;
            this.den = den;
            if (num == 0 || den == 0)
            {
                this.num = 0;
                this.den = 1;
            }
            Fraccionario.cont++;
            Console.WriteLine("Obj Fraccionario: " + cont);

        }
        public Fraccionario(int num)
        {
            this.num = num;
            this.den = 1;
            Fraccionario.cont++;
            Console.WriteLine("Obj Fraccionario: " + cont);
        }
        public Fraccionario()
        {
            this.num = 0;
            this.den = 1;
            Fraccionario.cont++;
            Console.WriteLine("Obj Fraccionario: " + cont);
        }
        public int Num
        {
            get
            {
                Simplificar();
                return this.num;
            }
            set
            {
                Simplificar();
                if (value == 0)
                {
                    this.num = 0;
                    this.den = 1;
                }
                else
                {
                    this.num = value;
                }
            }
        }
        public int Den
        {
            get
            {
                Simplificar();
                return this.den;
            }
            set
            {
                if (value == 0 || this.num == 0)
                {
                    this.num = 0;
                    this.den = 1;
                }
                else this.den = value;
            }
        }

        public void Simplificar(int num, int den)
        {
            int aux = 2;
            int div = 0;
            int numr, denr;

            while (true)
            {
                if (num % aux == 0 && den % aux == 0)
                {
                    div = aux;
                    break;
                }
                aux++;
                if (aux == 9) break;

            }

            if (div != 0)
            {
                while (true)
                {
                    numr = num / div;
                    denr = den / div;
                    if (numr % div != 0 || denr % div != 0)
                    {
                        break;
                    }
                    num = numr;
                    den = denr;
                }
            }
            else
            {
                numr = num;
                denr = den;
            }

            if (num != den)
            {
                this.num = numr;
                this.den = denr;
            }
            else
            {
                this.num = 1;
                this.den = 1;
            }
        }
        public void Simplificar()
        {
            Simplificar(this.num, this.den);
        }

        /**
         * Sumar dos fraccionarios 
         * @param num
         * @param den
         * @return Direccion de memoria de un objeto
         */
        public Fraccionario Sumar(int num, int den)
        {
            int rnum, rden;

            if (num == 0) return new Fraccionario(this.num, this.den);
            else if (this.num == 0) return new Fraccionario(num, den);

            rden = this.Den * den;
            rnum = this.Num * den + this.Den * num;



            return new Fraccionario(rnum, rden);

        }
        public Fraccionario Sumar()
        {
            return Sumar(1, 1);
        }
        public Fraccionario Sumar(int num)
        {
            return Sumar(num, 1);
        }
        public Fraccionario Sumar(Fraccionario f1)
        {
            return Sumar(f1.Num, f1.Den);
        }
        public Fraccionario Sumar(int num, int den, Fraccionario fr)
        {
            int rnum, rden;

            rden = this.Den * den;
            rnum = this.Num * den + this.Den * num;

            if (fr == null)
            {
                fr = new Fraccionario(rnum, rden);
            }
            else
            {
                fr.Num = rnum;
                fr.Den = rden;
            }

            return fr;
        }
        public Fraccionario Sumar(Fraccionario f1, Fraccionario fr)
        {
            return Sumar(f1.Num, f1.Den, fr);
        }
        public static Fraccionario operator +(Fraccionario f1, Fraccionario f2)
        {
            return f1.Sumar(f2);
        }
        public static Fraccionario operator +(Fraccionario f1, int num)
        {
            return f1.Sumar(num);
        }
        public static Fraccionario operator ++(Fraccionario f1)
        {
            f1.Num = f1.Num + f1.Den;
            return f1;
        }
//Restar
        public Fraccionario Restar(int num, int den)
        {
            int rnum, rden;

            if (num == 0) return new Fraccionario(this.num, this.den);
            else if (this.num == 0) return new Fraccionario((-1) * num, den);

            rden = this.Den * den;
            rnum = this.Num * den - this.Den * num;



            return new Fraccionario(rnum, rden);
        }
        public Fraccionario Restar()
        {
            return Restar(1, 1);
        }
        public Fraccionario Restar(int num)
        {
            return Restar(num, 1);
        }
        public Fraccionario Restar(Fraccionario f)
        {
            return Restar(f.Num, f.Den);
        }
        public Fraccionario Restar(int num, int den, Fraccionario fr)
        {
            int rnum, rden;

            rden = this.Den * den;
            rnum = this.Num * den - this.Den * num;

            if (fr == null)
            {
                fr = new Fraccionario(rnum, rden);
            }
            else
            {
                fr.Num = rnum;
                fr.Den = rden;
            }

            return fr;
        }
        public Fraccionario Restar(Fraccionario f, Fraccionario fr)
        {

            return Restar(f.Num, f.Den, fr);
        }
        public static Fraccionario operator -(Fraccionario f1, Fraccionario f2)
        {
            return f1.Restar(f2);
        }
        public static Fraccionario operator --(Fraccionario f1)
        {
            f1.Num = f1.Num - f1.Den;
            return f1;
        }

//Multiplicar
        public Fraccionario Multiplicar(int num, int den)
        {
            int rnum, rden;
            rnum = this.Num * num;
            rden = this.Den * den;


            Fraccionario f = new Fraccionario(rnum, rden);
            return f;
        }
        public Fraccionario Multiplicar(int num, int den, Fraccionario fr)
        {
            int rnum, rden;
            rnum = this.Num * num;
            rden = this.Den * den;



            if (fr == null)
            {
                fr = new Fraccionario(rnum, rden);
            }
            else
            {
                fr.Den = rden;
                fr.Num = rnum;
            }

            return fr;
        }
        public Fraccionario Multiplicar()
        {
            return Multiplicar(1, 1);
        }
        public Fraccionario Multiplicar(int num)
        {
            return Multiplicar(num, 1);
        }
        public Fraccionario Multiplicar(Fraccionario f)
        {
            return Multiplicar(f.Num, f.Den);
        }
//Dividir
        public Fraccionario Dividir(int num, int den)
        {
            if (den == 0) return new Fraccionario(0, 1);
            int rnum, rden, aux;

            aux = num;
            num = den;
            den = aux;

            rnum = this.Num * num;
            rden = this.Den * den;



            return new Fraccionario(rnum, rden);
        }
        public Fraccionario Dividir(int num, int den, Fraccionario fr)
        {
            int rnum, rden, aux;

            aux = num;
            num = den;
            den = aux;

            rnum = this.Num * num;
            rden = this.Den * den;

            if (fr == null)
            {
                fr.Den = rden;
                fr.Num = rnum;
            }
            return fr;
        }
        public Fraccionario Dividir(int num)
        {
            return Dividir(num, 1);
        }
        public Fraccionario Dividir(Fraccionario f)
        {
            return Dividir(f.Num, f.Den);
        }
        public String Imprimir
        {
            get
            {
                if (this.Den > 0 && this.Den != 1) return "(" + this.Num + "/" + this.Den + ")";
                else if (this.Den == 1) return "(" + this.Num + ")";
                else return "(" + this.Num * (-1) + "/" + this.Den * (-1) + ")";
            }
        }
    }
}
