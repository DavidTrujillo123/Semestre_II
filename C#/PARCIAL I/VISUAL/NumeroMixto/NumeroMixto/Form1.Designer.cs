namespace NumeroMixto
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
			this.label1 = new System.Windows.Forms.Label();
			this.label2 = new System.Windows.Forms.Label();
			this.txtEntero1 = new System.Windows.Forms.TextBox();
			this.txtNum1 = new System.Windows.Forms.TextBox();
			this.txtDen1 = new System.Windows.Forms.TextBox();
			this.label3 = new System.Windows.Forms.Label();
			this.label4 = new System.Windows.Forms.Label();
			this.txtDen2 = new System.Windows.Forms.TextBox();
			this.txtNum2 = new System.Windows.Forms.TextBox();
			this.txtEntero2 = new System.Windows.Forms.TextBox();
			this.btnSumar = new System.Windows.Forms.Button();
			this.Imprimir = new System.Windows.Forms.TextBox();
			this.btnMult = new System.Windows.Forms.Button();
			this.btnRestar = new System.Windows.Forms.Button();
			this.btnDividir = new System.Windows.Forms.Button();
			this.SuspendLayout();
			// 
			// label1
			// 
			this.label1.AutoSize = true;
			this.label1.Location = new System.Drawing.Point(128, 57);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(58, 16);
			this.label1.TabIndex = 0;
			this.label1.Text = "MIXTO 1";
			// 
			// label2
			// 
			this.label2.AutoSize = true;
			this.label2.Location = new System.Drawing.Point(468, 57);
			this.label2.Name = "label2";
			this.label2.Size = new System.Drawing.Size(58, 16);
			this.label2.TabIndex = 1;
			this.label2.Text = "MIXTO 2";
			// 
			// txtEntero1
			// 
			this.txtEntero1.Location = new System.Drawing.Point(110, 128);
			this.txtEntero1.Name = "txtEntero1";
			this.txtEntero1.Size = new System.Drawing.Size(39, 22);
			this.txtEntero1.TabIndex = 2;
			// 
			// txtNum1
			// 
			this.txtNum1.Location = new System.Drawing.Point(154, 103);
			this.txtNum1.Name = "txtNum1";
			this.txtNum1.Size = new System.Drawing.Size(31, 22);
			this.txtNum1.TabIndex = 3;
			// 
			// txtDen1
			// 
			this.txtDen1.Location = new System.Drawing.Point(154, 147);
			this.txtDen1.Name = "txtDen1";
			this.txtDen1.Size = new System.Drawing.Size(30, 22);
			this.txtDen1.TabIndex = 4;
			// 
			// label3
			// 
			this.label3.AutoSize = true;
			this.label3.Location = new System.Drawing.Point(155, 128);
			this.label3.Name = "label3";
			this.label3.Size = new System.Drawing.Size(35, 16);
			this.label3.TabIndex = 5;
			this.label3.Text = "-------";
			// 
			// label4
			// 
			this.label4.AutoSize = true;
			this.label4.Location = new System.Drawing.Point(483, 113);
			this.label4.Name = "label4";
			this.label4.Size = new System.Drawing.Size(35, 16);
			this.label4.TabIndex = 9;
			this.label4.Text = "-------";
			// 
			// txtDen2
			// 
			this.txtDen2.Location = new System.Drawing.Point(482, 132);
			this.txtDen2.Name = "txtDen2";
			this.txtDen2.Size = new System.Drawing.Size(30, 22);
			this.txtDen2.TabIndex = 8;
			// 
			// txtNum2
			// 
			this.txtNum2.Location = new System.Drawing.Point(482, 88);
			this.txtNum2.Name = "txtNum2";
			this.txtNum2.Size = new System.Drawing.Size(31, 22);
			this.txtNum2.TabIndex = 7;
			// 
			// txtEntero2
			// 
			this.txtEntero2.Location = new System.Drawing.Point(438, 113);
			this.txtEntero2.Name = "txtEntero2";
			this.txtEntero2.Size = new System.Drawing.Size(39, 22);
			this.txtEntero2.TabIndex = 6;
			// 
			// btnSumar
			// 
			this.btnSumar.Location = new System.Drawing.Point(110, 252);
			this.btnSumar.Name = "btnSumar";
			this.btnSumar.Size = new System.Drawing.Size(124, 23);
			this.btnSumar.TabIndex = 10;
			this.btnSumar.Text = "SUMAR";
			this.btnSumar.UseVisualStyleBackColor = true;
			this.btnSumar.Click += new System.EventHandler(this.btnSumar_Click);
			// 
			// Imprimir
			// 
			this.Imprimir.Location = new System.Drawing.Point(412, 179);
			this.Imprimir.Multiline = true;
			this.Imprimir.Name = "Imprimir";
			this.Imprimir.Size = new System.Drawing.Size(244, 96);
			this.Imprimir.TabIndex = 11;
			// 
			// btnMult
			// 
			this.btnMult.Location = new System.Drawing.Point(110, 291);
			this.btnMult.Name = "btnMult";
			this.btnMult.Size = new System.Drawing.Size(124, 23);
			this.btnMult.TabIndex = 12;
			this.btnMult.Text = "MULTIPLICAR";
			this.btnMult.UseVisualStyleBackColor = true;
			this.btnMult.Click += new System.EventHandler(this.btnMult_Click);
			// 
			// btnRestar
			// 
			this.btnRestar.Location = new System.Drawing.Point(110, 332);
			this.btnRestar.Name = "btnRestar";
			this.btnRestar.Size = new System.Drawing.Size(124, 23);
			this.btnRestar.TabIndex = 13;
			this.btnRestar.Text = "RESTAR";
			this.btnRestar.UseVisualStyleBackColor = true;
			this.btnRestar.Click += new System.EventHandler(this.btnRestar_Click);
			// 
			// btnDividir
			// 
			this.btnDividir.Location = new System.Drawing.Point(110, 376);
			this.btnDividir.Name = "btnDividir";
			this.btnDividir.Size = new System.Drawing.Size(124, 23);
			this.btnDividir.TabIndex = 14;
			this.btnDividir.Text = "DIVIDIR";
			this.btnDividir.UseVisualStyleBackColor = true;
			this.btnDividir.Click += new System.EventHandler(this.btnDividir_Click);
			// 
			// Form1
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(800, 475);
			this.Controls.Add(this.btnDividir);
			this.Controls.Add(this.btnRestar);
			this.Controls.Add(this.btnMult);
			this.Controls.Add(this.Imprimir);
			this.Controls.Add(this.btnSumar);
			this.Controls.Add(this.label4);
			this.Controls.Add(this.txtDen2);
			this.Controls.Add(this.txtNum2);
			this.Controls.Add(this.txtEntero2);
			this.Controls.Add(this.label3);
			this.Controls.Add(this.txtDen1);
			this.Controls.Add(this.txtNum1);
			this.Controls.Add(this.txtEntero1);
			this.Controls.Add(this.label2);
			this.Controls.Add(this.label1);
			this.Name = "Form1";
			this.Text = "Form1";
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Label label1;
		private System.Windows.Forms.Label label2;
		private System.Windows.Forms.TextBox txtEntero1;
		private System.Windows.Forms.TextBox txtNum1;
		private System.Windows.Forms.TextBox txtDen1;
		private System.Windows.Forms.Label label3;
		private System.Windows.Forms.Label label4;
		private System.Windows.Forms.TextBox txtDen2;
		private System.Windows.Forms.TextBox txtNum2;
		private System.Windows.Forms.TextBox txtEntero2;
		private System.Windows.Forms.Button btnSumar;
		private System.Windows.Forms.TextBox Imprimir;
		private System.Windows.Forms.Button btnMult;
		private System.Windows.Forms.Button btnRestar;
		private System.Windows.Forms.Button btnDividir;
	}
}

