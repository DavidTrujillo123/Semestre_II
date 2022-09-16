using System;
using System.Collections.Generic;
using System.Text;

namespace PracticaEvaMatrizSuma
{
	internal class Vector
	{
		private int[] vec;

		public Vector(int longitud)
		{
			vec = new int[longitud];
		}
		public int[] Vec
		{ 
			get { return vec; } 
			set { vec = value; }
		}
		
		public void Imprimir()
		{
			for (int i = 0; i < vec.Length; i++)
			{
				Console.Write("{0,5:0}",vec[i]);
			}
		}
	}
}
