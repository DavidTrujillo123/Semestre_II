using System;

using System.Drawing;

using System.Windows.Forms;

namespace CuadradoMagico
{
	public partial class Form1 : Form
	{
		public Button[,] bnts;
		private int cont = 1;

		//Para resolver
		private int k = 0;
		private int aux = 1;
		private int[][] sol;
		public Form1()
		{
			InitializeComponent();
		}
		 
		private void btnCrear_Click(object sender, EventArgs e)
		{

			int x, y, tamanio;
			x = 0;
			y = 0;

			tamanio = Convert.ToInt32(comboBoxNum.Text);

			if (bnts == null)
			{
				bnts = new Button[tamanio, tamanio];
				Console.WriteLine("1");
			}
			else
			{
				if (bnts.GetLength(0) < tamanio)//copiar objetos creados antes
				{
					object copia = (bnts).Clone();
					bnts = new Button[tamanio, tamanio];

					for (int i = 0; i < ((Button[,])copia).GetLength(0); i++)
					{
						for (int j = 0; j < ((Button[,])copia).GetLength(0); j++)
						{
							bnts[i, j] = ((Button[,])copia)[i, j];
						}
					}
					Console.WriteLine("2");
				}
				else
				{
					panelContentedor.Controls.Clear();
					bnts = new Button[tamanio, tamanio];
					Console.WriteLine("3");
				}

			}

			for (int i = 0; i < bnts.GetLength(0); i++)
			{
				for (int j = 0; j < bnts.GetLength(0); j++)
				{
					if (bnts[i, j] == null)
					{
						bnts[i, j] = new Button();
						bnts[i, j].Location = new Point(x, y);
						bnts[i, j].Size = new Size(50, 50);
						bnts[i, j].Click += new EventHandler(Pulsar_Click);
					}
					
					x += 50;
					panelContentedor.Controls.Add(bnts[i, j]);
				}
				x = 0;
				y += 50;
				
			}

			btnCrear.Enabled = false;
		}
		private void Pulsar_Click(object sender, EventArgs e)
		{
			if (((Button)sender).Text.Equals((cont-1) + ""))
			{
				((Button)sender).Text = "";
				cont--;
			}
			else if(((Button)sender).Text.Equals(""))
			{
				((Button)sender).Text = cont + "";
				cont++;
			}

			if (cont == bnts.Length + 1)
			{
				if (Ganar())
				{
					MessageBox.Show("HAS GANADOO..");
					//this.btnRestablecer.PerformClick();
				}
				else
				{
					MessageBox.Show("SIGUE INTENTANDOLO...");
				}
			}
		}
		private bool Ganar()
		{
			int fila, col, med;
			fila = 0;
			col = 0; med = 0;
			int[] Afila, Acol;
			Afila = new int[bnts.GetLength(0)];
			Acol = new int[bnts.GetLength(0)];

			for (int i = 0; i < bnts.GetLength(0); i++)
			{
				for (int j = 0; j < bnts.GetLength(0); j++)
				{
					if (bnts[i, j] != null)
					{
						fila += int.Parse(bnts[i, j].Text);
						col += int.Parse(bnts[j, i].Text);
					}
				}
				Afila[i] = fila;
				Acol[i] = col;
				fila = 0; col = 0;
			}


			for (int i = 0; i < bnts.GetLength(1); i++)
			{
				if (bnts[i, i] != null)
				{
					med += int.Parse(bnts[i, i].Text);
				}
			}

			for (int i = 0; i < bnts.GetLength(0); i++) {
				if (Acol[i] != Afila[i] || med != Acol[i] || med != Afila[i])
				{
					return false;
				}
			}
			return true;
		}
		

		private void btnRestablecer_Click(object sender, EventArgs e)
		{
			btnCrear.Enabled = true;
			for (int i = 0; i < bnts.GetLength(0); i++)
			{
				for (int j = 0; j < bnts.GetLength(0); j++)
				{
					bnts[i, j].Text = "";
					panelContentedor.Controls.Remove(bnts[i,j]);
					bnts[i, j] = null;
				}

			}

			k = 0;
			aux = 1;
			cont = 1;
			sol = null;
			GC.Collect();
		}

		public int[][] CuadradoMagico(int n)//tamanio
		{
			int a;
			int b;
			int tamanio;
			int longitud;
			int medio;
			int[][] matriz;

			tamanio = n + 1;

			matriz = new int[tamanio][];

			for (int i = 0; i < matriz.Length; i++)
			{
				matriz[i] = new int[tamanio];
			}

			longitud = matriz.Length - 1;
			medio = longitud / 2;

			matriz[0][longitud] = -1;//fila 0 columna final
			b = medio;
			a = 1;

			int cont;
			cont = 1;
			while (cont <= longitud * longitud)
			{
				//la primera fila pasa al ultimo
				if (a == 0)
				{
					a = longitud;
				}
				//ultima columna pasa al inicio
				if (b == longitud)
				{
					b = 0;
				}

				matriz[a][b] = cont;

				a--;
				b++;

				//Compruba si esta lleno en esa posicion
				if (matriz[a][b] != 0)
				{
					a += 2;
					b--;
				}

				cont++;
			}

			return matriz;
		}

		
		private void timer1_Tick(object sender, EventArgs e)
		{
			int tam = int.Parse(this.comboBoxNum.Text);
			
			if (k < sol.Length)
			{
				int i = 0;
				for (; i < sol.Length-1; i++)
				{
					if (cont == sol[k][i])
					{
						bnts[(k - 1), i].PerformClick();
						aux++;
					}
				}

				if (aux != tam*tam && k == sol.Length - 1)
				{
					k = 0;
				}
				else if (aux > tam*tam)
				{
					
					k = sol.Length;
				}
				k++;
			}
			else
			{
				k--;
				timer1.Enabled = false;
				Console.WriteLine("f");
			}
			
		}

		private void Form1_FormClosing(object sender, FormClosingEventArgs e)
		{
			timer1.Enabled = false;
		}

		private void btnResolver_Click(object sender, EventArgs e)
		{
			if (bnts != null)
			{
				btnRestablecer.PerformClick();
				btnCrear.PerformClick();
				sol = CuadradoMagico(int.Parse(this.comboBoxNum.Text));
				timer1.Start();
			}
			else
			{
				MessageBox.Show("CREE UN CUADRADO MAGICO PRIMERO");
			}
			
		}

		private void trackBar1_Scroll(object sender, EventArgs e)
		{
			timer1.Interval = trackBar1.Value;
		}
	}
}
