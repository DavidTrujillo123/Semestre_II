using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace practica_evaVectores
{
	public partial class Form1 : Form
	{
		Vector3D v1, v2, res;

		private void btnComparar_Click(object sender, EventArgs e)
		{
			LlenarDatos();
			if (v1.Comparar(v2))
			{
				MessageBox.Show("SON IGUALES");
			}
			else MessageBox.Show("NO SON IGUALES");
		}

		public Form1()
		{
			InitializeComponent();
			v1 = new Vector3D(0, 0, 0);
			v2 = new Vector3D(0, 0, 0);
		}

		private void btnNorma_Click(object sender, EventArgs e)
		{
			LlenarDatos();
			Imprimir.Text = "VECTOR 1: "+v1.CalcularNorma() + "  VEC2: "+v2.CalcularNorma();
		}

		private void LlenarDatos()
		{
			v1.X1 = int.Parse(txtX1.Text);
			v1.Y1 = int.Parse(txtY1.Text);
			v1.Z1 = int.Parse(txtZ1.Text);
			v1.X2 = int.Parse(txtX2.Text);
			v1.Y2 = int.Parse(txtY2.Text);
			v1.Z2 = int.Parse(txtZ2.Text);

			v2.X1 = int.Parse(txtX3.Text);
			v2.Y1 = int.Parse(txtY3.Text);
			v2.Z1 = int.Parse(txtZ3.Text);
			v2.X2 = int.Parse(txtX4.Text);
			v2.Y2 = int.Parse(txtY4.Text);
			v2.Z2 = int.Parse(txtZ4.Text);
		}

		private void button1_Click(object sender, EventArgs e)
		{
			LlenarDatos();

			Vector3D res;
			res = v1.Sumar(v2);
			Imprimir.Text = res.Imprimir();
		}
	}
}
