namespace MatrizVisual
{
	partial class VentanaSuma
	{
		/// <summary>
		/// Required designer variable.
		/// </summary>
		private System.ComponentModel.IContainer components = null;

		/// <summary>
		/// Clean up any resources being used.
		/// </summary>
		/// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
		protected override void Dispose(bool disposing)
		{
			if (disposing && (components != null))
			{
				components.Dispose();
			}
			base.Dispose(disposing);
		}

		#region Windows Form Designer generated code

		/// <summary>
		/// Required method for Designer support - do not modify
		/// the contents of this method with the code editor.
		/// </summary>
		private void InitializeComponent()
		{
			this.btnRegresar = new System.Windows.Forms.Button();
			this.label1 = new System.Windows.Forms.Label();
			this.btnSumar = new System.Windows.Forms.Button();
			this.txtImprimir1 = new System.Windows.Forms.TextBox();
			this.txtImprimir2 = new System.Windows.Forms.TextBox();
			this.bntAleatorio = new System.Windows.Forms.Button();
			this.label2 = new System.Windows.Forms.Label();
			this.label3 = new System.Windows.Forms.Label();
			this.txtFila1 = new System.Windows.Forms.TextBox();
			this.txtColumna1 = new System.Windows.Forms.TextBox();
			this.btnManual = new System.Windows.Forms.Button();
			this.ImprimirResultado = new System.Windows.Forms.TextBox();
			this.btnRestar = new System.Windows.Forms.Button();
			this.label4 = new System.Windows.Forms.Label();
			this.label5 = new System.Windows.Forms.Label();
			this.label6 = new System.Windows.Forms.Label();
			this.btnTranspuesta = new System.Windows.Forms.Button();
			this.comBox1 = new System.Windows.Forms.ComboBox();
			this.ImprimirTrans = new System.Windows.Forms.TextBox();
			this.label7 = new System.Windows.Forms.Label();
			this.SuspendLayout();
			// 
			// btnRegresar
			// 
			this.btnRegresar.Location = new System.Drawing.Point(48, 398);
			this.btnRegresar.Name = "btnRegresar";
			this.btnRegresar.Size = new System.Drawing.Size(107, 23);
			this.btnRegresar.TabIndex = 0;
			this.btnRegresar.Text = "REGRESAR";
			this.btnRegresar.UseVisualStyleBackColor = true;
			this.btnRegresar.Click += new System.EventHandler(this.btnRegresar_Click);
			// 
			// label1
			// 
			this.label1.AutoSize = true;
			this.label1.Location = new System.Drawing.Point(443, 31);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(202, 16);
			this.label1.TabIndex = 1;
			this.label1.Text = "SUMA O RESTA DE MATRICES";
			// 
			// btnSumar
			// 
			this.btnSumar.Location = new System.Drawing.Point(455, 312);
			this.btnSumar.Name = "btnSumar";
			this.btnSumar.Size = new System.Drawing.Size(128, 67);
			this.btnSumar.TabIndex = 2;
			this.btnSumar.Text = "SUMAR";
			this.btnSumar.UseVisualStyleBackColor = true;
			this.btnSumar.Click += new System.EventHandler(this.btnSumar_Click);
			// 
			// txtImprimir1
			// 
			this.txtImprimir1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.txtImprimir1.Location = new System.Drawing.Point(48, 124);
			this.txtImprimir1.Multiline = true;
			this.txtImprimir1.Name = "txtImprimir1";
			this.txtImprimir1.ReadOnly = true;
			this.txtImprimir1.Size = new System.Drawing.Size(227, 118);
			this.txtImprimir1.TabIndex = 3;
			// 
			// txtImprimir2
			// 
			this.txtImprimir2.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.txtImprimir2.Location = new System.Drawing.Point(315, 122);
			this.txtImprimir2.Multiline = true;
			this.txtImprimir2.Name = "txtImprimir2";
			this.txtImprimir2.ReadOnly = true;
			this.txtImprimir2.Size = new System.Drawing.Size(209, 119);
			this.txtImprimir2.TabIndex = 4;
			// 
			// bntAleatorio
			// 
			this.bntAleatorio.Location = new System.Drawing.Point(48, 312);
			this.bntAleatorio.Name = "bntAleatorio";
			this.bntAleatorio.Size = new System.Drawing.Size(141, 67);
			this.bntAleatorio.TabIndex = 7;
			this.bntAleatorio.Text = "LLENAR ALEATORIAO";
			this.bntAleatorio.UseVisualStyleBackColor = true;
			this.bntAleatorio.Click += new System.EventHandler(this.bntAleatorio_Click);
			// 
			// label2
			// 
			this.label2.AutoSize = true;
			this.label2.Location = new System.Drawing.Point(332, 250);
			this.label2.Name = "label2";
			this.label2.Size = new System.Drawing.Size(46, 16);
			this.label2.TabIndex = 8;
			this.label2.Text = "FILAS:";
			// 
			// label3
			// 
			this.label3.AutoSize = true;
			this.label3.Location = new System.Drawing.Point(332, 275);
			this.label3.Name = "label3";
			this.label3.Size = new System.Drawing.Size(85, 16);
			this.label3.TabIndex = 9;
			this.label3.Text = "COLUMNAS:";
			// 
			// txtFila1
			// 
			this.txtFila1.Location = new System.Drawing.Point(419, 247);
			this.txtFila1.Name = "txtFila1";
			this.txtFila1.Size = new System.Drawing.Size(51, 22);
			this.txtFila1.TabIndex = 10;
			this.txtFila1.Text = "3";
			// 
			// txtColumna1
			// 
			this.txtColumna1.Location = new System.Drawing.Point(419, 275);
			this.txtColumna1.Name = "txtColumna1";
			this.txtColumna1.Size = new System.Drawing.Size(51, 22);
			this.txtColumna1.TabIndex = 11;
			this.txtColumna1.Text = "3";
			// 
			// btnManual
			// 
			this.btnManual.Location = new System.Drawing.Point(242, 312);
			this.btnManual.Name = "btnManual";
			this.btnManual.Size = new System.Drawing.Size(155, 67);
			this.btnManual.TabIndex = 12;
			this.btnManual.Text = "LLENAR MANUALMENTE";
			this.btnManual.UseVisualStyleBackColor = true;
			this.btnManual.Click += new System.EventHandler(this.btnManual_Click);
			// 
			// ImprimirResultado
			// 
			this.ImprimirResultado.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.ImprimirResultado.Location = new System.Drawing.Point(555, 123);
			this.ImprimirResultado.Multiline = true;
			this.ImprimirResultado.Name = "ImprimirResultado";
			this.ImprimirResultado.ReadOnly = true;
			this.ImprimirResultado.Size = new System.Drawing.Size(209, 119);
			this.ImprimirResultado.TabIndex = 13;
			// 
			// btnRestar
			// 
			this.btnRestar.Location = new System.Drawing.Point(613, 312);
			this.btnRestar.Name = "btnRestar";
			this.btnRestar.Size = new System.Drawing.Size(124, 67);
			this.btnRestar.TabIndex = 14;
			this.btnRestar.Text = "RESTAR";
			this.btnRestar.UseVisualStyleBackColor = true;
			this.btnRestar.Click += new System.EventHandler(this.btnRestar_Click);
			// 
			// label4
			// 
			this.label4.AutoSize = true;
			this.label4.Location = new System.Drawing.Point(45, 91);
			this.label4.Name = "label4";
			this.label4.Size = new System.Drawing.Size(67, 16);
			this.label4.TabIndex = 15;
			this.label4.Text = "MATRIZ 1";
			// 
			// label5
			// 
			this.label5.AutoSize = true;
			this.label5.Location = new System.Drawing.Point(315, 90);
			this.label5.Name = "label5";
			this.label5.Size = new System.Drawing.Size(67, 16);
			this.label5.TabIndex = 16;
			this.label5.Text = "MATRIZ 2";
			// 
			// label6
			// 
			this.label6.AutoSize = true;
			this.label6.Location = new System.Drawing.Point(555, 89);
			this.label6.Name = "label6";
			this.label6.Size = new System.Drawing.Size(90, 16);
			this.label6.TabIndex = 17;
			this.label6.Text = "RESULTADO";
			// 
			// btnTranspuesta
			// 
			this.btnTranspuesta.Location = new System.Drawing.Point(805, 312);
			this.btnTranspuesta.Name = "btnTranspuesta";
			this.btnTranspuesta.Size = new System.Drawing.Size(179, 60);
			this.btnTranspuesta.TabIndex = 18;
			this.btnTranspuesta.Text = "TRANSPUESTA";
			this.btnTranspuesta.UseVisualStyleBackColor = true;
			this.btnTranspuesta.Click += new System.EventHandler(this.btnTranspuesta_Click);
			// 
			// comBox1
			// 
			this.comBox1.FormattingEnabled = true;
			this.comBox1.Items.AddRange(new object[] {
            "Matriz 1",
            "Matriz 2",
            "Matriz Resultado"});
			this.comBox1.Location = new System.Drawing.Point(829, 397);
			this.comBox1.Name = "comBox1";
			this.comBox1.Size = new System.Drawing.Size(121, 24);
			this.comBox1.TabIndex = 19;
			// 
			// ImprimirTrans
			// 
			this.ImprimirTrans.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.ImprimirTrans.Location = new System.Drawing.Point(805, 124);
			this.ImprimirTrans.Multiline = true;
			this.ImprimirTrans.Name = "ImprimirTrans";
			this.ImprimirTrans.ReadOnly = true;
			this.ImprimirTrans.Size = new System.Drawing.Size(209, 119);
			this.ImprimirTrans.TabIndex = 20;
			// 
			// label7
			// 
			this.label7.AutoSize = true;
			this.label7.Location = new System.Drawing.Point(802, 89);
			this.label7.Name = "label7";
			this.label7.Size = new System.Drawing.Size(109, 16);
			this.label7.TabIndex = 21;
			this.label7.Text = "TRANSPUESTA";
			// 
			// VentanaSuma
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(1042, 459);
			this.Controls.Add(this.label7);
			this.Controls.Add(this.ImprimirTrans);
			this.Controls.Add(this.comBox1);
			this.Controls.Add(this.btnTranspuesta);
			this.Controls.Add(this.label6);
			this.Controls.Add(this.label5);
			this.Controls.Add(this.label4);
			this.Controls.Add(this.btnRestar);
			this.Controls.Add(this.ImprimirResultado);
			this.Controls.Add(this.btnManual);
			this.Controls.Add(this.txtColumna1);
			this.Controls.Add(this.txtFila1);
			this.Controls.Add(this.label3);
			this.Controls.Add(this.label2);
			this.Controls.Add(this.bntAleatorio);
			this.Controls.Add(this.txtImprimir2);
			this.Controls.Add(this.txtImprimir1);
			this.Controls.Add(this.btnSumar);
			this.Controls.Add(this.label1);
			this.Controls.Add(this.btnRegresar);
			this.Name = "VentanaSuma";
			this.Text = "VentanaSuma";
			this.Load += new System.EventHandler(this.VentanaSuma_Load);
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Button btnRegresar;
		private System.Windows.Forms.Label label1;
		private System.Windows.Forms.Button btnSumar;
		private System.Windows.Forms.TextBox txtImprimir1;
		private System.Windows.Forms.TextBox txtImprimir2;
		private System.Windows.Forms.Button bntAleatorio;
		private System.Windows.Forms.Label label2;
		private System.Windows.Forms.Label label3;
		private System.Windows.Forms.TextBox txtFila1;
		private System.Windows.Forms.TextBox txtColumna1;
		private System.Windows.Forms.Button btnManual;
		private System.Windows.Forms.TextBox ImprimirResultado;
		private System.Windows.Forms.Button btnRestar;
		private System.Windows.Forms.Label label4;
		private System.Windows.Forms.Label label5;
		private System.Windows.Forms.Label label6;
		private System.Windows.Forms.Button btnTranspuesta;
		private System.Windows.Forms.ComboBox comBox1;
		private System.Windows.Forms.TextBox ImprimirTrans;
		private System.Windows.Forms.Label label7;
	}
}