using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.VisualBasic;

namespace MatrizVisual
{
	public partial class VentanaMultiplicacion : Form
	{
		private Formulario f1 = new Formulario();
		private Matriz m1, m2, mres;
		private Thread th;
		public VentanaMultiplicacion()
		{
			InitializeComponent();
			m1 = new Matriz();
			m2 = new Matriz();
			mres = new Matriz();

			txtImprimir1.TextAlign = HorizontalAlignment.Center;
			txtImprimir2.TextAlign = HorizontalAlignment.Center;

			txtImprimir1.Text = m1.Imprimir();
			txtImprimir2.Text = m2.Imprimir();

		}
		public void AbrirForms()
		{
			Application.Run(new Formulario());
		}
		private void btnRegresar_Click(object sender, EventArgs e)
		{
			if (th == null) th = new Thread(AbrirForms);
			th.SetApartmentState(ApartmentState.STA);
			th.Start();
			this.Close();

		}
		private void PonerDatos()
		{
			txtFila2.Text = txtColumna1.Text;

			int fil1, col1, fil2, col2;
			fil1 = int.Parse(txtFila1.Text);
			col1 = int.Parse(txtColumna1.Text);
			
			fil2 = col1;
			col2 = int.Parse(txtColumna2.Text);

			m1.Filas = fil1;
			m1.Columnas = col1;
			m2.Filas = fil2;
			m2.Columnas = col2;

		}

		private void btnLlenarManual(object sender, EventArgs e)
		{
			PonerDatos();

			int num;

			for (int i = 0; i < m1.Filas; i++)
			{
				for (int j = 0; j < m1.Columnas; j++)
				{
					num = int.Parse(Interaction.InputBox("Matriz 1\r" + " Posicion: (" + i + "," + j + ")"));
					m1.SetDatos(i, j, num);
				}
			}

			for (int i = 0; i < m2.Filas; i++)
			{
				for (int j = 0; j < m2.Columnas; j++)
				{
					num = int.Parse(Interaction.InputBox("Matriz 2\r" + " Posicion: (" + i + "," + j + ")"));
					m2.SetDatos(i, j, num);
				}
			}

			txtImprimir1.TextAlign = HorizontalAlignment.Center;
			txtImprimir2.TextAlign = HorizontalAlignment.Center;

			txtImprimir1.Text = m1.Imprimir();
			txtImprimir2.Text = m2.Imprimir();
		}

		private void btnMultiplicar_Click(object sender, EventArgs e)
		{
			if (m1 == null || m2 == null) PonerDatos();
			ImprimirResultado.TextAlign = HorizontalAlignment.Center;

			mres = m1.Multiplicar(m2);


			txtFila3.Text = mres.Filas + "";
			txtColumna3.Text = mres.Columnas + "";

			ImprimirResultado.Text = mres.Imprimir();
		}

		private void btnTranspuesta_Click(object sender, EventArgs e)
		{
			if (comBox1.SelectedIndex == 0)
			{
				ImprimirTrans.Text = this.m1.Transpuesta(m1).Imprimir();
			}
			else if (comBox1.SelectedIndex == 1)
			{
				ImprimirTrans.Text = this.m2.Transpuesta(m2).Imprimir();
			}
			else
			{
				ImprimirTrans.Text = this.mres.Transpuesta(mres).Imprimir();
			}
		}

		private void btnLlenarAleatorio_Click(object sender, EventArgs e)
		{
			PonerDatos();
			int inicio = int.Parse(Interaction.InputBox("Ingrese un numero inicio"));
			int fin = int.Parse(Interaction.InputBox("Ingrese un numero fin"));

			this.m1 = m1.LlenarDatos(m1, inicio, fin);
			m2.LlenarDatos(m2, inicio, fin);
			this.m2 = m2.LlenarDatos(m2, inicio, fin);//aleatorio

			txtImprimir1.TextAlign = HorizontalAlignment.Center;
			txtImprimir2.TextAlign = HorizontalAlignment.Center;

			txtImprimir1.Text = m1.Imprimir();
			txtImprimir2.Text = m2.Imprimir();
		}
	}
}
