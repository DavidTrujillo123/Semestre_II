using System;
using System.Collections.Generic;
using System.Text;

namespace POO_E01_TrujilloDavid
{
	internal class SenCos
	{
		private double angulo;

		public SenCos(double angulo)
		{
			this.angulo = angulo;
		}

		public SenCos()
		{
			this.angulo=0;

		}

		public double Potencia(double bas, int exponente)
		{
			double result = 1;
			for (int i = 0; i < exponente; i++)
			{
				result *= bas;
			}

			return result;
		}
		public double Factorial(int num)
		{
			double result = 1;
			for (int i = 1; i <= num; i++)
			{
				result *= i;
			}
			return result;
		}
		public double Sen()
		{
			double result = 0;
			double x = this.Transformar();
			for (int i = 0; i < 10; i++)
			{
				result = (Potencia(-1,i)) * (Potencia(x, (2*i)+1)) / (Factorial((2*i)+1)) + result;
				
			}
			return result;
		}
		public double Cos()
		{
			double result = 0;
			double x = this.Transformar();
			for (int i = 0; i < 10; i++)
			{
				result = (Potencia(-1, i)) * (Potencia(x, 2 * i)) / (Factorial(2 * i)) + result;
			}
			return result;
		}
		public double Transformar()
		{
			double a = this.angulo;
			double rad = a * Math.PI / 180;
			return rad;
		}
		public double Radianes
		{
			get { return this.angulo*Math.PI / 180; }
		}

	}
}
