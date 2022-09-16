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

namespace MatrizVisual
{
	public partial class Formulario : Form
	{
		Thread th;
		VentanaSuma vs;
		VentanaMultiplicacion vm;
		public Formulario()
		{
			InitializeComponent();
		}
		public void AbrirSuma()
		{
			Application.Run(new VentanaSuma());
		}
		public void AbrirMult()
		{
			Application.Run(new VentanaMultiplicacion());
		}
		private void btnSuma_Click(object sender, EventArgs e)
		{
			if(th == null) th = new Thread(AbrirSuma);
			th.SetApartmentState(ApartmentState.STA);
			th.Start();
			this.Close();
			
		}
		private void btnMultiplicacion(object sender, EventArgs e)
		{
			if (th == null) th = new Thread(AbrirMult);
			th.SetApartmentState(ApartmentState.STA);
			th.Start();
			this.Close();
		}
	}
}
