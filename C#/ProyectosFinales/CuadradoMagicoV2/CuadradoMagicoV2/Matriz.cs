using System;
using System.Drawing;
using System.Windows.Forms;

namespace CuadradoMagicoV2
{
	public class Matriz : TextBox
	{
		protected TextBox[,] valores;
		protected TextBox aux;
		protected Point punto;
		protected Font fuente;
		protected Size tm;

		public Matriz(int tamanio)
		{
			valores = new TextBox[tamanio+1,tamanio+1];
			punto = new Point();
			fuente = new Font("Times New Roman", 20, FontStyle.Bold);
			tm = new Size(50, 50);
		}
		public TextBox[,] Get()
		{
			return valores;
		}
		public void CaracteristicasTextBox(TextBox B)
		{
			B.Location = punto;//punto modificado
			B.Multiline = true;
			B.TextAlign = HorizontalAlignment.Center;
			B.Font = fuente;  //fuente
			B.Size = tm;
		}
		public void CrearTextBox(Panel panelContenedor)
		{
			aux = new TextBox();
			int x, y;
			x = 0;
			y = 0;
			for (int i = 0; i < valores.GetLength(0); i++)
			{
				for (int j = 0; j < valores.GetLength(1); j++)
				{
					if (valores[i, j] == null)
					{
						valores[i, j] = new TextBox();
						
						punto.X = x;//modifica punto
						punto.Y = y;
						CaracteristicasTextBox(valores[i, j]);

					}
					if (i == 0 || j == valores.GetLength(0) - 1)
					{
						valores[i, j].Enabled = false;//BLOQUE EL RESULTADO DE LA SUMA DE FILAS Y COL VACIO
					}
					x += 50;
					panelContenedor.Controls.Add(valores[i, j]);
				}
				x = 0;
				y += 50;
				
			}
			
			//ultimo cuadrado
			x = valores[valores.GetLength(0) - 1, valores.GetLength(0) - 1].Location.X;
			punto.X = x;
			punto.Y = y;
			CaracteristicasTextBox(aux);
			aux.Enabled = false;
			panelContenedor.Controls.Add(aux);
			panelContenedor.Refresh();
			panelContenedor.Update();
		}
		public void Reestablecer(Panel panelContenedor)
		{
			//for (int i = 0; i < valores.GetLength(0); i++)
			//{
			//	for (int j = 0; j < valores.GetLength(1); j++)
			//	{
			//		if (valores[i, j] != null)
			//		{
			//			valores[i, j].Text = "";
			//			panelContenedor.Controls.Remove(valores[i, j]);
			//			valores[i, j] = null;
			//		}
			//		else
			//		{
			//			MessageBox.Show("Ingrese un valor correcto");
			//			i = valores.GetLength(0);
			//			j = valores.GetLength(1);
			//		}
			//	}
			//}
			panelContenedor.Controls.Clear();
			//panelContenedor.Controls.Remove(aux);
			aux = null;
			valores = null;
			GC.Collect();
			panelContenedor.Refresh();
			panelContenedor.Update();
		}
		public bool PonerSumaYganar(int suma)
		{
			suma = ((suma * suma) * ((suma * suma) + 1)) / (2 * suma);

			int fila, col, med, cont;
			fila = 0;
			col = 0; med = 0; cont = 0;
			int[] Afila, Acol;
			Afila = new int[valores.GetLength(0) - 1];
			Acol = new int[valores.GetLength(1) - 1];

			//suma de fila y columna
			for (int i = 1; i < valores.GetLength(0); i++)
			{
				for (int j = 0; j < valores.GetLength(1) - 1; j++)
				{
					fila += int.Parse(valores[i, j].Text);
					col += int.Parse(valores[j + 1, i - 1].Text);
				}
				Afila[cont] = fila;
				Acol[cont] = col;
				valores[0, cont].Text = col + "";
				valores[cont + 1, valores.GetLength(0) - 1].Text = fila + "";
				cont++;
				fila = 0; col = 0;
			}

			//Diagonal principal
			for (int i = 1; i <valores.GetLength(0); i++)
			{
				med += int.Parse(valores[i, i - 1].Text);
			}
			aux.Text = med + "";


			//Diagonal secundaria
			int med1 = 0;
			int auxX, auxY;
			auxX = valores.GetLength(0) - 1;
			auxY = 0;
			while (auxY < valores.GetLength(0) - 1)
			{
				med1 += int.Parse(valores[auxX, auxY].Text);
				auxX--;
				auxY++;
			}
			valores[0, valores.GetLength(0) - 1].Text = med1 + "";

			//Comprobar ganador
			for (int i = 0; i < valores.GetLength(0) - 1; i++)
			{
				if (Acol[i] != Afila[i] || med != Acol[i] || med != Afila[i] || med1 != Acol[i] 
					|| med1 != Afila[i])
				{
					return false;
				}
				if (Acol[i] != suma)
				{
					return false ;
				}
			}
			return true;
		}
		public void Limpiar()
		{
			for (int i = 0; i < valores.GetLength(0); i++)
			{
				for (int j = 0; j < valores.GetLength(1); j++)
				{
					valores[i, j].Text = "";
				}
			}
			aux.Text = "";
		}
	}
}
