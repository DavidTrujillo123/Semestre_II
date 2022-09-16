using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using NumeroFraccionario;

namespace Primera_APP
{
	public partial class Form1 : Form
	{
		public Form1()
		{
			InitializeComponent();
		}

        private Fraccionario f1,f2, result;
        
		private void btnSumar_Click(object sender, EventArgs e)
		{
            result = f1.Suma(f2,result);
            String c;
            c = f1.Imprimir() + " + " + f2.Imprimir() + " = " + result.Imprimir();
            txtImprimir.Text = c;
        }
		private void btnRestar_Click(object sender, EventArgs e)
		{
            result = f1.Resta(f2, result);
            String c;
            c = f1.Imprimir() + " - " + f2.Imprimir() + " = " + result.Imprimir();
            txtImprimir.Text=c;
        }

		private void btnMult_Click(object sender, EventArgs e)
		{
            result = f1.Multiplicacion(f2);
            String c = f1.Imprimir() + " * " + f2.Imprimir() + " = " + result.Imprimir();
            txtImprimir.Text = c;
        }

		private void bntDiv_Click(object sender, EventArgs e)
		{
            result = f1.Division(f2);
            String c = f1.Imprimir() + " / " + f2.Imprimir() + " = " + result.Imprimir();
            txtImprimir.Text =c;
        }

	

		private void btnCrear_Click(object sender, EventArgs e)
		{
            int num1, den1, num2, den2;

            num1 = int.Parse(txtNum.Text);
            den1 = int.Parse(txtDen.Text);
            num2 = int.Parse(txtNum2.Text);
            den2 = int.Parse(txtDen2.Text);

            if ((f1 != null) && (f2 != null))
            {
                f1.Num = num1;
                f1.Den = den1;
                f2.Num = num2;
                f2.Den = den2;
            }
            else
            {
                f1 = new Fraccionario(num1, den1);
                f2 = new Fraccionario(num2, den2);
            }

            String c = "Fr 1: " + f1.Imprimir() + "     Fr 2: " + f2.Imprimir();
            txtImprimir.Text = c;
        }

		private void Form1_Load(object sender, EventArgs e)
		{

		}
	}
}
