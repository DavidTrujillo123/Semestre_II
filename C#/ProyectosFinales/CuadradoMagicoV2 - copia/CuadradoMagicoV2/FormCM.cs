using System;
using System.Drawing;
using System.Threading;
using System.Windows.Forms;

namespace CuadradoMagicoV2
{
	public partial class FormCM : Form
	{
		public TextBox[,] bnts;
		TextBox aux;
		Point punto;
		Font fuente;
		Size tm;
		int cont;
		int a;
		int b;
		int longitud;
		int medio;
		public FormCM()
		{
			InitializeComponent();
			punto = new Point();
			fuente = new Font("Times New Roman", 20, FontStyle.Bold);
			tm = new Size(50, 50);
			bnts = new TextBox[0,0];


		}
		private void Creartxt(TextBox[,] bnts)
		{
			aux = new TextBox();
			int x, y;
			x = 0;
			y = 0;
			for (int i = 0; i < bnts.GetLength(0); i++)
			{
				for (int j = 0; j < bnts.GetLength(0); j++)
				{
					if (bnts[i, j] == null)
					{
						bnts[i, j] = new TextBox();
						punto.X = x;
						punto.Y = y;
						bnts[i, j].Location = punto;
						bnts[i, j].Multiline = true;
						bnts[i, j].TextAlign = HorizontalAlignment.Center;
						bnts[i, j].Font = fuente;  //fuente
						bnts[i, j].Size = new Size(50, 50);
					}
					if (i == 0 || j == bnts.GetLength(0) - 1)
					{
						bnts[i, j].Enabled = false;
					}
					x += 50;
					panelContentedor.Controls.Add(bnts[i, j]);
				}
				x = 0;
				y += 50;
			}

			x = bnts[bnts.GetLength(0)-1, bnts.GetLength(0)-1].Location.X;
			punto.X = x;
			punto.Y = y;
			aux.Location = punto;
			aux.Multiline = true;
			aux.TextAlign = HorizontalAlignment.Center;
			aux.Font = fuente;
			aux.Size = tm;
			aux.Enabled = false;
			panelContentedor.Controls.Add(aux);
		}
		private void btnCrear_Click(object sender, EventArgs e)
		{
			try
			{
				int tamanio;

				tamanio = Convert.ToInt32(comboBoxNum.Text);
				bnts = new TextBox[tamanio + 1, tamanio + 1];

				Creartxt(bnts);

				btnCrear.Enabled = false;
			}
			catch (Exception ex)
			{
				MessageBox.Show("Ingrese un valor correcto");
			}
		}

		private void btnRestablecer_Click(object sender, EventArgs e)
		{
			try
			{
				btnCrear.Enabled = true;
				for (int i = 0; i < bnts.GetLength(0); i++)
				{
					for (int j = 0; j < bnts.GetLength(0); j++)
					{
						bnts[i, j].Text = "";
						panelContentedor.Controls.Remove(bnts[i, j]);
						bnts[i, j] = null;
					}
				}
				panelContentedor.Controls.Remove(aux);
				aux = null;
				btnResolver.Enabled = true;
				btnComprobar.Enabled = true;
				GC.Collect();
			}
			catch (Exception ex)
			{
				MessageBox.Show("Ingrese un valor correcto");
			}
		}
		private bool Ganar()
		{
			int fila, col, med, cont;
			fila = 0;
			col = 0; med = 0;cont = 0;
			int[] Afila, Acol;
			Afila = new int[bnts.GetLength(0)-1];
			Acol = new int[bnts.GetLength(0)-1];

			//suma de fila y columna
			for (int i = 1; i < bnts.GetLength(0); i++)
			{
				for (int j = 0; j < bnts.GetLength(0)-1; j++)
				{
					fila += int.Parse(bnts[i, j].Text);
					col += int.Parse(bnts[j+1, i-1].Text);
				}
				Afila[cont] = fila;
				Acol[cont] = col;
				bnts[0, cont].Text = col + "";
				bnts[cont+1, bnts.GetLength(0) - 1].Text = fila + "";
				cont++;
				//bnts[0, i-1].Text = Afila[i-1]+""; 
				fila = 0; col = 0;
			}
			
			//Diagonal principal
			for (int i = 1; i < bnts.GetLength(0); i++)
			{
				med += int.Parse(bnts[i, i-1].Text);
			}
			aux.Text = med+"";


			//Diagonal secundaria
			int med1 = 0;
			int auxX, auxY;
			auxX = bnts.GetLength(0)-1;
			auxY = 0;
			while (auxY<bnts.GetLength(0)-1) {
				med1+=int.Parse(bnts[auxX, auxY].Text);
				auxX--;
				auxY++;
			}
			bnts[0, bnts.GetLength(0) - 1].Text = med1 + "";


			for (int i = 0; i < bnts.GetLength(0)-1; i++)
			{
				if (Acol[i] != Afila[i] || med != Acol[i] || med != Afila[i] || med1 != Acol[i] || med1 != Afila[i])
				{
					return false;
				}
			}
			return true;
		}
		private void btnComprobar_Click(object sender, EventArgs e)
		{
			try
			{
				if (Ganar())
				{
					MessageBox.Show("HAS GANADO...");
				}
				else
				{
					MessageBox.Show("SIGUE INTENTANDOLO...");
				}
			}
			catch (Exception ex)
			{
				MessageBox.Show("Ingrese un valor correcto..");
			}
		}
		public void CuadradoMagico()//tamanio
		{
			
				bool comprobar = true;
				for (int i = 0; i < bnts.GetLength(0); i++)
				{
					for (int j = 0; j < bnts.GetLength(0); j++)
					{
						if (bnts[i, j] != null)
						{
							if (!bnts[i, j].Text.Equals(""))
								comprobar = false;
						}
						else comprobar = false;
					}
				}

				if (comprobar)
				{
					longitud = bnts.GetLength(0) - 1;
					medio = longitud / 2;

					bnts[0, longitud].Text = -1 + "";//fila 0 columna final
					b = medio;
					a = 1;

					cont = 1;

					timer1.Start();
				}
				else
				{
					MessageBox.Show("REINICIE PARA RESOLVER..");
					btnResolver.Enabled = true;
					btnRestablecer.Enabled = true;
					btnComprobar.Enabled = true;
				}
			
			
		}

		private void btnResolver_Click(object sender, EventArgs e)
		{
			
			btnResolver.Enabled = false;
			btnRestablecer.Enabled = false;
			btnComprobar.Enabled = false;
			CuadradoMagico();
		}

		private void timer1_Tick_1(object sender, EventArgs e)
		{
			if (a == 0)
			{
				a = longitud;
			}

			//ultima columna pasa al inicio
			if (b == longitud)
			{
				b = 0;
			}

			bnts[a, b].Text = cont + "";

			a--;
			b++;

			//Compruba si esta lleno en esa posicion
			if (!bnts[a, b].Text.Equals(""))
			{
				a += 2;
				b--;

			}
			Console.WriteLine(a + " " + b);
			cont++;

			if (cont-1 >= longitud*longitud)
			{
				timer1.Enabled=false;
				btnRestablecer.Enabled = true;
				Ganar();

			}
		}

		private void FormCM_FormClosing(object sender, FormClosingEventArgs e)
		{
			timer1.Enabled = false;
		}

		private void trackBar1_Scroll(object sender, EventArgs e)
		{
			timer1.Interval = trackBar1.Value;
		}
	}
}
