namespace PilasYcolas
{
	partial class Form1
	{
		/// <summary>
		/// Variable del diseñador necesaria.
		/// </summary>
		private System.ComponentModel.IContainer components = null;

		/// <summary>
		/// Limpiar los recursos que se estén usando.
		/// </summary>
		/// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
		protected override void Dispose(bool disposing)
		{
			if (disposing && (components != null))
			{
				components.Dispose();
			}
			base.Dispose(disposing);
		}

		#region Código generado por el Diseñador de Windows Forms

		/// <summary>
		/// Método necesario para admitir el Diseñador. No se puede modificar
		/// el contenido de este método con el editor de código.
		/// </summary>
		private void InitializeComponent()
		{
			this.btnColar = new System.Windows.Forms.Button();
			this.comboBox = new System.Windows.Forms.ComboBox();
			this.ImprimirPila = new System.Windows.Forms.TextBox();
			this.ImprimirCola = new System.Windows.Forms.TextBox();
			this.btnDesapilar = new System.Windows.Forms.Button();
			this.btnDescolar = new System.Windows.Forms.Button();
			this.btnApilar = new System.Windows.Forms.Button();
			this.lblTitulo = new System.Windows.Forms.Label();
			this.SuspendLayout();
			// 
			// btnColar
			// 
			this.btnColar.Location = new System.Drawing.Point(540, 506);
			this.btnColar.Name = "btnColar";
			this.btnColar.Size = new System.Drawing.Size(75, 23);
			this.btnColar.TabIndex = 1;
			this.btnColar.Text = "COLAR";
			this.btnColar.UseVisualStyleBackColor = true;
			this.btnColar.Click += new System.EventHandler(this.btnColar_Click);
			// 
			// comboBox
			// 
			this.comboBox.FormattingEnabled = true;
			this.comboBox.Items.AddRange(new object[] {
            "Circunferencia",
            "Cuadrado",
            "Elipse",
            "Punto",
            "Triangulo",
            "Rectangulo",
            "Segmento de Recta",
            "Fecha"});
			this.comboBox.Location = new System.Drawing.Point(397, 66);
			this.comboBox.Name = "comboBox";
			this.comboBox.Size = new System.Drawing.Size(121, 24);
			this.comboBox.TabIndex = 2;
			this.comboBox.Text = "Circunferencia";
			// 
			// ImprimirPila
			// 
			this.ImprimirPila.Location = new System.Drawing.Point(40, 111);
			this.ImprimirPila.Multiline = true;
			this.ImprimirPila.Name = "ImprimirPila";
			this.ImprimirPila.ReadOnly = true;
			this.ImprimirPila.Size = new System.Drawing.Size(403, 388);
			this.ImprimirPila.TabIndex = 3;
			// 
			// ImprimirCola
			// 
			this.ImprimirCola.Location = new System.Drawing.Point(473, 111);
			this.ImprimirCola.Multiline = true;
			this.ImprimirCola.Name = "ImprimirCola";
			this.ImprimirCola.ReadOnly = true;
			this.ImprimirCola.Size = new System.Drawing.Size(380, 388);
			this.ImprimirCola.TabIndex = 4;
			// 
			// btnDesapilar
			// 
			this.btnDesapilar.Location = new System.Drawing.Point(219, 506);
			this.btnDesapilar.Name = "btnDesapilar";
			this.btnDesapilar.Size = new System.Drawing.Size(110, 23);
			this.btnDesapilar.TabIndex = 5;
			this.btnDesapilar.Text = "DESAPILAR";
			this.btnDesapilar.UseVisualStyleBackColor = true;
			this.btnDesapilar.Click += new System.EventHandler(this.btnDesapilar_Click);
			// 
			// btnDescolar
			// 
			this.btnDescolar.Location = new System.Drawing.Point(652, 506);
			this.btnDescolar.Name = "btnDescolar";
			this.btnDescolar.Size = new System.Drawing.Size(114, 23);
			this.btnDescolar.TabIndex = 6;
			this.btnDescolar.Text = "DESCOLAR";
			this.btnDescolar.UseVisualStyleBackColor = true;
			this.btnDescolar.Click += new System.EventHandler(this.btnDescolar_Click);
			// 
			// btnApilar
			// 
			this.btnApilar.Location = new System.Drawing.Point(87, 505);
			this.btnApilar.Name = "btnApilar";
			this.btnApilar.Size = new System.Drawing.Size(75, 23);
			this.btnApilar.TabIndex = 7;
			this.btnApilar.Text = "APILAR";
			this.btnApilar.UseVisualStyleBackColor = true;
			this.btnApilar.Click += new System.EventHandler(this.btnApilar_Click);
			// 
			// lblTitulo
			// 
			this.lblTitulo.AutoSize = true;
			this.lblTitulo.Location = new System.Drawing.Point(412, 13);
			this.lblTitulo.Name = "lblTitulo";
			this.lblTitulo.Size = new System.Drawing.Size(103, 16);
			this.lblTitulo.TabIndex = 8;
			this.lblTitulo.Text = "PILAS Y COLAS";
			// 
			// Form1
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(890, 578);
			this.Controls.Add(this.lblTitulo);
			this.Controls.Add(this.btnApilar);
			this.Controls.Add(this.btnDescolar);
			this.Controls.Add(this.btnDesapilar);
			this.Controls.Add(this.ImprimirCola);
			this.Controls.Add(this.ImprimirPila);
			this.Controls.Add(this.comboBox);
			this.Controls.Add(this.btnColar);
			this.Name = "Form1";
			this.Text = "Form1";
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion
		private System.Windows.Forms.Button btnColar;
		private System.Windows.Forms.ComboBox comboBox;
		private System.Windows.Forms.TextBox ImprimirPila;
		private System.Windows.Forms.TextBox ImprimirCola;
		private System.Windows.Forms.Button btnDesapilar;
		private System.Windows.Forms.Button btnDescolar;
		private System.Windows.Forms.Button btnApilar;
		private System.Windows.Forms.Label lblTitulo;
	}
}

