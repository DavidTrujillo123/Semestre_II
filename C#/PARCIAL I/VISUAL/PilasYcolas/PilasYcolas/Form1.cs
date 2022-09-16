using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PilasYcolas
{
	public partial class Form1 : Form
	{
		private Pilas p1;
		private Colas c1;

		private static int cont = 0;
		public Form1()
		{
			InitializeComponent();
			p1 = new Pilas();
			c1 = new Colas();

		}
		private void btnApilar_Click(object sender, EventArgs e)
		{
			if (p1.Comprobar())
			{
				if (this.comboBox.SelectedIndex == 0)
				{
					p1.Apilar(new Circunferencia(cont++));
				}
				else if (this.comboBox.SelectedIndex == 1) p1.Apilar(new Cuadrado(cont++));
				else if (this.comboBox.SelectedIndex == 2) p1.Apilar(new Elipse(5, 2));
				else if (this.comboBox.SelectedIndex == 3) p1.Apilar(new Punto());
				else if (this.comboBox.SelectedIndex == 4) p1.Apilar(new Triangulo(1, 1, 2, 2));
				else if (this.comboBox.SelectedIndex == 5) p1.Apilar(new Rectangulo());
				else if (this.comboBox.SelectedIndex == 6) p1.Apilar(new SegmentoRecta());
				else if (this.comboBox.SelectedIndex == 7) p1.Apilar(new Fecha());
			}
			else
			{
				MessageBox.Show("Pila llena");
				
			}
			ImprimirPila.Text = p1.ImprimirObjeto();
		}

		private void btnDesapilar_Click(object sender, EventArgs e)
		{
			p1.Desapilar();
			ImprimirPila.Text = p1.ImprimirObjeto();
		}

		private void btnColar_Click(object sender, EventArgs e)
		{
			if (c1.Comprobar())
			{
				if (this.comboBox.SelectedIndex == 0)
				{
					c1.Colar(new Circunferencia(cont++));
				}
				else if (this.comboBox.SelectedIndex == 1) c1.Colar(new Cuadrado(cont++));
				else if (this.comboBox.SelectedIndex == 2) c1.Colar(new Elipse());
				else if (this.comboBox.SelectedIndex == 3) c1.Colar(new Punto());
				else if (this.comboBox.SelectedIndex == 4) c1.Colar(new Triangulo(1, 1, 2, 2));
				else if (this.comboBox.SelectedIndex == 5) c1.Colar(new Rectangulo());
				else if (this.comboBox.SelectedIndex == 6) c1.Colar(new SegmentoRecta());
				else if (this.comboBox.SelectedIndex == 7) c1.Colar(new Fecha());
			}
			else
			{
				MessageBox.Show("Cola llena");
			}
			ImprimirCola.Text = (c1.ImprimirObjeto());
		}

		private void btnDescolar_Click(object sender, EventArgs e)
		{
			c1.Descolar();
			ImprimirCola.Text = (c1.ImprimirObjeto());
		}
	}
}
