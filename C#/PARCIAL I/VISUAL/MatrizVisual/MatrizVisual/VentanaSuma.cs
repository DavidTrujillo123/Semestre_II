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
	public partial class VentanaSuma : Form
	{
		Formulario f1 = new Formulario();
		private Matriz m1,m2,mres;
		Thread th;

		public void AbrirForms()
		{
			Application.Run(new Formulario());
		}

		public VentanaSuma()
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

		private void PonerDatos()
		{
			int fil, col;
			fil = int.Parse(txtFila1.Text);
			col = int.Parse(txtColumna1.Text);

			
			m1.Filas = fil;
			m1.Columnas = col;
			m2.Filas = fil;
			m2.Columnas = col;
			
		}
		private void btnRegresar_Click(object sender, EventArgs e)
		{
			if (th == null) th = new Thread(AbrirForms);
			th.SetApartmentState(ApartmentState.STA);
			th.Start();
			this.Close();
		}

		private void VentanaSuma_Load(object sender, EventArgs e)
		{

		}

		private void btnManual_Click(object sender, EventArgs e)
		{
			PonerDatos();

			int num; 
			
			for (int i = 0; i < m1.Filas; i++)
			{
				for (int j = 0; j < m1.Columnas; j++)
				{
					num = int.Parse(Interaction.InputBox("Matriz 1\r"+" Posicion: ("+i+","+j+")"));
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

		private void btnRestar_Click(object sender, EventArgs e)
		{
			if (m1 == null || m2 == null) PonerDatos();
			ImprimirResultado.TextAlign = HorizontalAlignment.Center;

			mres = m1.Restar(m2);
			ImprimirResultado.Text = mres.Imprimir();

		}
		private void btnSumar_Click(object sender, EventArgs e)
		{
			if (m1 == null || m2 == null) PonerDatos();
			ImprimirResultado.TextAlign = HorizontalAlignment.Center;

			mres = m1.Sumar(m2);
			ImprimirResultado.Text = m1.Sumar(m2).Imprimir();

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

		private void bntAleatorio_Click(object sender, EventArgs e)
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
