using System;
using System.Collections.Generic;
using System.Text;

namespace NumeroFraccionario
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
		private Mixto PonerDatos(Fraccionario f1, int result) 
		{
			if (mix == null)
			{
				mix = new Mixto(result, f1);
			}
			else
			{
				mix.F = f1;
				mix.Ent = result;
			}
			return mix;
		}

		//SUMA
		public Mixto Suma(int n)
		{
			int result;
			result = this.Ent + n;

			PonerDatos(this.f1, result);
			return mix;
		}
		public Mixto Suma()
		{
			return Suma(1);
		}
		public Mixto Suma(Mixto m1)
		{
			int ent = m1.Ent;
			int result;
			Fraccionario f = m1.F;


			result = this.ent + ent;
			fr = this.F.Suma(f);

			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Suma(int num, int den)
		{
			fr = this.F.Suma(num, den);

			PonerDatos(fr, this.Ent);
			return mix;
		}
		public Mixto Suma(int ent, int num, int den)
		{
			int result = this.Ent + ent;
			fr = this.F.Suma(num, den);
			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Suma(int ent, Fraccionario f)
		{
			int result = this.Ent + ent;
			fr = this.F.Suma(f);
			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Suma(Fraccionario f)
		{
			fr = this.F.Suma(f);
			PonerDatos(fr, this.Ent);
			return mix;
		}
		public static Mixto operator +(Mixto m1, Mixto m2) 
		{
			return m1.Suma(m2);
		}
		public static Mixto operator + (Mixto m1, int num) 
		{
			return m1.Suma(num);
		}
		public static Mixto operator +(int num, Mixto m1)
		{
			return m1.Suma(num);
		}
		public static Mixto operator ++(Mixto m) 
		{
			return m.Suma();
		}
		//Resta
		public Mixto Resta(int n)
		{
			return Suma(n*(-1));
		}
		public Mixto Resta(Mixto m1)
		{
			int ent = m1.Ent;
			int result;
			Fraccionario f = m1.F;


			result = this.ent - ent;
			fr = this.F.Resta(f);

			PonerDatos(fr, result);
			return mix;
		}
		public Mixto Resta(int num, int den)
		{
			fr = this.F.Resta(num, den);

			PonerDatos(fr, this.Ent);
			return mix;
		}
		public Mixto TransformarAMixto(Fraccionario f)
		{
			int num, den, entr, numr, denr;

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
					return this.Ent + this.F.Imprimir();
				}
			}
		}
	}
}
