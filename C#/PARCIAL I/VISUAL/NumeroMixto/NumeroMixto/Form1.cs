using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace NumeroMixto
{
	public partial class Form1 : Form
	{
		Mixto m1, m2, maux;
		Fraccionario f;
		public Form1()
		{
			InitializeComponent();
			f = new Fraccionario();
		}

		private void PonerDatos()
		{
			int ent1 = int.Parse(txtEntero1.Text);
			int num1 = int.Parse(txtNum1.Text);
			int den1 = int.Parse(txtDen1.Text);

			int ent2 = int.Parse(txtEntero2.Text);
			int num2 = int.Parse(txtNum2.Text);
			int den2 = int.Parse(txtDen2.Text);

			if (m1 == null || m2 == null)
			{
				m1 = new Mixto(ent1, num1, den1);
				m2 = new Mixto(ent2, num2, den2);
			}
			else
			{
				m1.Ent = ent1;
				m1.Den = den1;
				m1.Num= num1;

				m2.Ent = ent2;
				m2.Den = den2;
				m2.Num = num2;
			}
		}

		private void btnMult_Click(object sender, EventArgs e)
		{
			Mixto result;
			PonerDatos();
			result = m1.Multiplicar(m2);
			Imprimir.Text = m1.Imprimir + " * " + m2.Imprimir + " = " + result.Imprimir;
		}

		private void btnRestar_Click(object sender, EventArgs e)
		{
			Mixto result;
			PonerDatos();
			result = m1.Restar(m2);
			Imprimir.Text = m1.Imprimir + " - " + m2.Imprimir + " = " + result.Imprimir;
		}

		private void btnDividir_Click(object sender, EventArgs e)
		{
			
			Fraccionario result;
			PonerDatos();
			result = m1.Dividir(m2);

			if (result.Num < result.Den)
			{
				Imprimir.Text = m1.Imprimir + " / " + m2.Imprimir + " = " + result.Imprimir;
			}
			else
			{
				if (maux == null) maux = new Mixto(1, 1, 1);
				maux = maux.TransformarAMixto(result);
				Imprimir.Text = m1.Imprimir + " / " + m2.Imprimir + " = " + maux.Imprimir;
			}
		}

		private void btnSumar_Click(object sender, EventArgs e)
		{
			Mixto result;
			PonerDatos();
			result = m1.Sumar(m2);
			Imprimir.Text = m1.Imprimir+" + "+m2.Imprimir+" = "+result.Imprimir; 
		}
	}
}
