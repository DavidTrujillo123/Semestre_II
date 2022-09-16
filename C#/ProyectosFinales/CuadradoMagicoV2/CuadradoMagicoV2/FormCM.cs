using System;
using System.Collections;
using System.Windows.Forms;

namespace CuadradoMagicoV2
{
	public partial class FormCM : Form
	{
		private int numero;
		private object ob;

		private Matriz valores;
		private int cont;
		private int a;
		private int b;
		private int longitud;
		private int medio;
		
		public FormCM()
		{
			InitializeComponent();

			valores = new Matriz(3);
			valores.CrearTextBox(this.panelContenedor);
			PonerEvento();
		}
		//
		//EVENTO QUE DETECTA SI HA INGRESADO UN NUMERO REPETIDO
		//
		
		private bool ComprobarNumRep(int num, object ob)
		{
			
			//Comprueba si se repiten
			int aux;
			int cont = 0;
			for (int i = 1; i < valores.Get().GetLength(0); i++)
			{
				for (int j = 0; j < valores.Get().GetLength(1) - 1; j++)
				{
					if (valores.Get()[i, j].Text != "")
					{
						aux = int.Parse(valores.Get()[i, j].Text);
						if (num == aux)
						{
							cont++;
														}
						if (cont > 1)// Asegura que el numero se repita 2 y retorna true
						{
							((TextBox)ob).Text = "";
							return true;
						}
					}
					
				}
			}
			
			return false;
		}
		
		private bool ComprobarNumMaximo(int num)
		{
			//Comprueba si el numero es mayor al maximo permitido
			int n = int.Parse(comboBoxNum.Text);
			n *= n;//tamanio matriz
			return num > n;
			
		}
		
		private void ComprobarValorRepetido_Click(object sender, EventArgs e)
		{
			if (ComprobarNumRep(numero, ob))
			{
				MessageBox.Show("NÚMERO REPETIDO");
			}	
		}
		
		private void ComprobarNumMax_TextChanged(object sender, EventArgs e)
		{
			string txtnum = ((TextBox)sender).Text;
			
			if (txtnum != "" && txtnum != " ")
			{
				try
				{
					int num = int.Parse(txtnum);
					this.numero = num;
					ob = sender;

					if (ComprobarNumMaximo(num))
					{
						MessageBox.Show("NÚMERO FUERA DE RANGO");
						((TextBox)sender).Text = "";
					}
				}
				catch (FormatException ex)
				{
					MessageBox.Show("DIGITE UN NÚMERO");
					((TextBox)sender).Text = "";
					Console.WriteLine(ex.Message);
				}
			}
			
		}

		public void PonerEvento()
		{
			for (int i = 1; i < valores.Get().GetLength(0); i++)//No toma la primera fila
			{
				for (int j = 0; j < valores.Get().GetLength(1)-1; j++)//No toma la ultima columna
				{
					valores.Get()[i, j].TextChanged += new EventHandler(ComprobarNumMax_TextChanged);
					valores.Get()[i, j].Click += new EventHandler(ComprobarValorRepetido_Click);
				}
			}
		}
		//
		//Crear
		//
		private void comboBoxNum_SelectedIndexChanged(object sender, EventArgs e)
		{
			Reestablecer();
			Crear();
		}
		private void Crear()
		{
			
				int tamanio;

				tamanio = int.Parse(comboBoxNum.Text);

				valores = new Matriz(tamanio);
				valores.CrearTextBox(panelContenedor);
				PonerEvento();
			
		}
		
		//
		//Reestablecer
		//
		private void Reestablecer()
		{
			if (valores != null)
			{
				valores.Reestablecer(this.panelContenedor);
				valores = null;
				btnResolver.Enabled = true;
				btnComprobar.Enabled = true;
				GC.Collect();//elimina todos los objetos sobrantes
			}
			
		}
		//
		//COMPROBADOR SI GANA O NO
		//
		private void btnComprobar_Click(object sender, EventArgs e)
		{
			try
			{
				if (ComprobarNumRep(numero, ob))
				{
					MessageBox.Show("Numero repetido");
				}
				else {
					if (valores.PonerSumaYganar(int.Parse(this.comboBoxNum.Text)))
					{
						MessageBox.Show("HAS GANADO...");
					}
					else
					{
						MessageBox.Show("SIGUE INTENTANDOLO...");
					}
				}
			}
			catch (Exception ex)
			{
				MessageBox.Show("Ingrese un valor correcto..");
				Console.WriteLine(ex);
			}
		}
		public void CuadradoMagico()
		{
			
			btnLimpiar.PerformClick();
			
			//ASIGNA VALORES INICIALES
			longitud = valores.Get().GetLength(0) - 1;
			medio = longitud / 2;

			valores.Get()[0, longitud].Text = " ";//fila 0 columna final
			b = medio;
			a = 1;

			cont = 1;

			timer1.Start();
			
		}
		//
		//Resuelve
		//
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

			valores.Get()[a, b].Text = cont + "";

			a--;
			b++;

			//Compruba si esta lleno en esa posicion
			if (!valores.Get()[a, b].Text.Equals(""))
			{
				a += 2;
				b--;
			}

			cont++;

			//COMPUEBA SI YA TERMINO DE LLENAR LOS VALORES
			if (cont - 1 >= longitud * longitud)
			{
				timer1.Enabled = false;
				comboBoxNum.Enabled = true;
				btnLimpiar.Enabled = true;
				btnComprobar.Enabled = true;
				valores.PonerSumaYganar(int.Parse(this.comboBoxNum.Text));//ASIGNA LOS NUMEROS DE LA SUMA DE FILAS,COL,ETC
			}
		}
		private void btnResolver_Click(object sender, EventArgs e)
		{
			
			if ( valores != null)
			{
				Console.WriteLine(valores);
				btnLimpiar.PerformClick();
				btnResolver.Enabled = false;
				btnComprobar.Enabled = false;
				btnLimpiar.Enabled = false;
				comboBoxNum.Enabled = false;
				CuadradoMagico();
			}
			else
			{
				MessageBox.Show("Seleccione un tamaño para poder resolver");
			}
		}
		//
		//ASEGURA QUE EL TIMER SE DETENGA
		//
		private void FormCM_FormClosing(object sender, FormClosingEventArgs e)//PRECAUSION TIMER
		{
			timer1.Enabled = false;
		}
		//
		//BARRA DE VELOCIDAD
		//
		private void trackBar1_Scroll(object sender, EventArgs e)//PARA AUMENTAR O DISMINUIR LA VELOCIDAD
		{
			try
			{
				timer1.Interval = trackBar1.Value;
			}
			catch (Exception ex)
			{
				Console.WriteLine(ex.Message);
			}
		}
		//
		//INFORMACION
		//
		private void btnInfo_Click(object sender, EventArgs e)
		{
			int a = int.Parse(this.comboBoxNum.Text);
			int b = ((a * a) * ((a * a) + 1)) / (2 * a);//FORMULA PARA SABER LA SUMA DE LAS FILAS, COLUMNAS, ETC

			MessageBox.Show("- Utilice números consecutivos desde 1 hasta el tamaño de la matriz en su caso: "+
				"1 hasta "+a*a+"\n\n- La suma de todas las filas, columnas, diagonal principal y secundaria debe ser: "+b
				, "Ayuda", MessageBoxButtons.OK, MessageBoxIcon.Information);
		}
		//
		//Boton limpiar
		//
		private void btnLimpiar_Click(object sender, EventArgs e)
		{
			btnResolver.Enabled = true;
			valores.Limpiar();

		}

		
	}
}
