using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumeroMixto
{
	internal class Mixto
	{
		private Fraccionario f1, fr;
		private int ent;
		private Mixto mix;

		public Mixto(int ent, Fraccionario f1)
		{
			this.ent = ent;
			this.f1 = f1;
		}
		public Mixto(int ent, int num, int den)
		{
			this.ent = ent;
			f1 = new Fraccionario(num, den);
		}
		public int Ent
		{
			get { return ent; }
			set { ent = value; }
		}
		public Fraccionario F
		{
			get { return f1; }
			set { f1 = value; }
		}
		public int Num
		{
			get {return f1.Num;}
			set {f1.Num = value;}
		}
		public int Den
		{
			get {return f1.Den;}
			set { f1.Den = value; }
		}
		private Mixto PonerDatos(Fraccionario f1, int ent)
		{
			if (mix == null)
			{
				mix = new Mixto(ent, f1);
			}
			else
			{
				mix.F = f1;
				mix.Ent = ent;
			}
			return mix;
		}

//SUMA
		public Mixto Sumar(int n)
		{
			int result;
			result = this.Ent + n;

			PonerDatos(this.f1, result);
			return mix;
		}
		public Mixto Sumar()
		{
			return Sumar(1);
		}
		public Mixto Sumar(Mixto m1)
		{
			int ent = m1.Ent;
			int result;
			Fraccionario f = m1.F;


			result = this.ent + ent;
			fr = this.F.Sumar(f);

			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Sumar(int num, int den)
		{
			fr = this.F.Sumar(num, den);

			PonerDatos(fr, this.Ent);
			return mix;
		}
		public Mixto Sumar(int ent, int num, int den)
		{
			int result = this.Ent + ent;
			fr = this.F.Sumar(num, den);
			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Sumar(int ent, Fraccionario f)
		{
			int result = this.Ent + ent;
			fr = this.F.Sumar(f);
			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Sumar(Fraccionario f)
		{
			fr = this.F.Sumar(f);
			PonerDatos(fr, this.Ent);
			return mix;
		}
		public static Mixto operator +(Mixto m1, Mixto m2)
		{
			return m1.Sumar(m2);
		}
		public static Mixto operator +(Mixto m1, int num)
		{
			return m1.Sumar(num);
		}
		public static Mixto operator +(int num, Mixto m1)
		{
			return m1.Sumar(num);
		}
		public static Mixto operator ++(Mixto m)
		{
			return m.Sumar();
		}

//Restar
		public Mixto Restar(int n)
		{
			return Sumar(n * (-1));
		}
		public Mixto Restar()
		{
			return Restar(1);
		}
		public Mixto Restar(Mixto m1)
		{
			int ent = m1.Ent;
			int result;
			Fraccionario f = m1.F;


			result = this.ent - ent;
			fr = this.F.Restar(f);

			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Restar(int num, int den)
		{
			fr = this.F.Restar(num, den);

			PonerDatos(fr, this.Ent);
			return mix;
		}
		public Mixto Restar(int ent, int num, int den)
		{
			int result = this.Ent + ent;
			fr = this.F.Restar(num, den);
			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Restar(int ent, Fraccionario f)
		{
			int result = this.Ent + ent;
			fr = this.F.Restar(f);
			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Restar(Fraccionario f)
		{
			fr = this.F.Restar(f);
			PonerDatos(fr, this.Ent);
			return mix;
		}
		public static Mixto operator -(Mixto m1, Mixto m2)
		{
			return m1.Restar(m2);
		}
		public static Mixto operator -(Mixto m1, int num)
		{
			return m1.Restar(num);
		}
		public static Mixto operator -(int num, Mixto m1)
		{
			return m1.Restar(num);
		}
		public static Mixto operator --(Mixto m)
		{
			return m-1;
		}
//Multiplicar
		public Fraccionario TransformarAFraccion(Mixto m)
		{
			int ent = m.Ent;
			int num = m.Num;
			int den = m.Den;

			int rnum;

			rnum = (den * ent) + num;
			
			return new Fraccionario(rnum,den);
		}
		public Mixto TransformarAMixto(Fraccionario f)
		{
			int num, den , entr, numr, denr;

			num = f.Num;
			den = f.Den;

			if (num >= den)
			{
				entr = num / den;
				numr = num % den;
				denr = den;

				f.Num = numr;
				f.Den = denr;
			}
			else
			{
				entr = 0;
			}
			return PonerDatos(f, entr);
		}
		public Mixto Multiplicar(int n)
		{
			int ent = this.Ent;
			Fraccionario f = this.F;

			ent *= n;
			f.Multiplicar(n);

			return PonerDatos(f, ent);
		}
		public Mixto Multiplicar(Mixto m1)
		{
			Fraccionario f1, f2;

			if (mix == null) mix = new Mixto(this.Ent, this.Num, this.Den);
			else
			{
				mix.Num = this.Num;
				mix.Den = this.Den;
				mix.Ent = this.Ent;
			}
			f1 = TransformarAFraccion(m1);
			f2 = TransformarAFraccion(mix);

			mix =TransformarAMixto(f1.Multiplicar(f2));
			return mix;
		}
		public Mixto Multiplicar(int ent, int num, int den)
		{
			if (fr == null) fr = new Fraccionario(num, den);
			else
			{
				fr.Num = num;
				fr.Den = den;
			}

			return Multiplicar(PonerDatos(fr, ent));
		}
		public Mixto Multiplicar(int num, int den)
		{
			int rnum, rden;

			if (fr == null) fr = new Fraccionario(this.Num, this.Den);
			else
			{
				fr.Num = this.Num;
				fr.Den = this.Den;
			}
			rnum = fr.Num * num;
			rden = fr.Den * den;
			
			fr.Num = rnum;
			fr.Den = rden;

			return TransformarAMixto(fr);
		}
//Dividir
		public Mixto Dividir(int n)
		{
			return Multiplicar(1,n);
		}
		public Fraccionario Dividir(Mixto m)
		{
			Fraccionario f = TransformarAFraccion(m);
			Mixto mix1 = new Mixto(this.ent, this.F.Num, this.F.Den);

			return TransformarAFraccion(mix1).Dividir(f);
		}
		public String Imprimir
		{
			get
			{
				if (f1.Num == 0)
				{
					return this.Ent + "";
				}
				else
				{
					return this.Ent + this.F.Imprimir;
				}
			}
		}

	}
}
