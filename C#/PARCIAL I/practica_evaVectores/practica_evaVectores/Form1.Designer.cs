namespace practica_evaVectores
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
			this.button1 = new System.Windows.Forms.Button();
			this.label1 = new System.Windows.Forms.Label();
			this.txtX1 = new System.Windows.Forms.TextBox();
			this.txtY1 = new System.Windows.Forms.TextBox();
			this.txtZ1 = new System.Windows.Forms.TextBox();
			this.txtZ2 = new System.Windows.Forms.TextBox();
			this.txtY2 = new System.Windows.Forms.TextBox();
			this.txtX2 = new System.Windows.Forms.TextBox();
			this.label2 = new System.Windows.Forms.Label();
			this.btnComparar = new System.Windows.Forms.Button();
			this.btnNorma = new System.Windows.Forms.Button();
			this.Imprimir = new System.Windows.Forms.TextBox();
			this.txtZ4 = new System.Windows.Forms.TextBox();
			this.txtY4 = new System.Windows.Forms.TextBox();
			this.txtX4 = new System.Windows.Forms.TextBox();
			this.label3 = new System.Windows.Forms.Label();
			this.txtZ3 = new System.Windows.Forms.TextBox();
			this.txtY3 = new System.Windows.Forms.TextBox();
			this.txtX3 = new System.Windows.Forms.TextBox();
			this.label4 = new System.Windows.Forms.Label();
			this.SuspendLayout();
			// 
			// button1
			// 
			this.button1.Location = new System.Drawing.Point(91, 305);
			this.button1.Name = "button1";
			this.button1.Size = new System.Drawing.Size(75, 23);
			this.button1.TabIndex = 0;
			this.button1.Text = "SUMAR";
			this.button1.UseVisualStyleBackColor = true;
			this.button1.Click += new System.EventHandler(this.button1_Click);
			// 
			// label1
			// 
			this.label1.AutoSize = true;
			this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.label1.Location = new System.Drawing.Point(102, 93);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(58, 29);
			this.label1.TabIndex = 1;
			this.label1.Text = "x,y,z";
			// 
			// txtX1
			// 
			this.txtX1.Location = new System.Drawing.Point(61, 138);
			this.txtX1.Name = "txtX1";
			this.txtX1.Size = new System.Drawing.Size(40, 22);
			this.txtX1.TabIndex = 2;
			this.txtX1.Text = "0";
			// 
			// txtY1
			// 
			this.txtY1.Location = new System.Drawing.Point(107, 138);
			this.txtY1.Name = "txtY1";
			this.txtY1.Size = new System.Drawing.Size(40, 22);
			this.txtY1.TabIndex = 3;
			this.txtY1.Text = "0";
			// 
			// txtZ1
			// 
			this.txtZ1.Location = new System.Drawing.Point(153, 138);
			this.txtZ1.Name = "txtZ1";
			this.txtZ1.Size = new System.Drawing.Size(40, 22);
			this.txtZ1.TabIndex = 4;
			this.txtZ1.Text = "0";
			// 
			// txtZ2
			// 
			this.txtZ2.Location = new System.Drawing.Point(383, 138);
			this.txtZ2.Name = "txtZ2";
			this.txtZ2.Size = new System.Drawing.Size(40, 22);
			this.txtZ2.TabIndex = 8;
			this.txtZ2.Text = "4";
			// 
			// txtY2
			// 
			this.txtY2.Location = new System.Drawing.Point(337, 138);
			this.txtY2.Name = "txtY2";
			this.txtY2.Size = new System.Drawing.Size(40, 22);
			this.txtY2.TabIndex = 7;
			this.txtY2.Text = "3";
			// 
			// txtX2
			// 
			this.txtX2.Location = new System.Drawing.Point(291, 138);
			this.txtX2.Name = "txtX2";
			this.txtX2.Size = new System.Drawing.Size(40, 22);
			this.txtX2.TabIndex = 6;
			this.txtX2.Text = "2";
			// 
			// label2
			// 
			this.label2.AutoSize = true;
			this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.label2.Location = new System.Drawing.Point(332, 93);
			this.label2.Name = "label2";
			this.label2.Size = new System.Drawing.Size(58, 29);
			this.label2.TabIndex = 5;
			this.label2.Text = "x,y,z";
			// 
			// btnComparar
			// 
			this.btnComparar.Location = new System.Drawing.Point(226, 305);
			this.btnComparar.Name = "btnComparar";
			this.btnComparar.Size = new System.Drawing.Size(75, 23);
			this.btnComparar.TabIndex = 9;
			this.btnComparar.Text = "COMPRAR";
			this.btnComparar.UseVisualStyleBackColor = true;
			this.btnComparar.Click += new System.EventHandler(this.btnComparar_Click);
			// 
			// btnNorma
			// 
			this.btnNorma.Location = new System.Drawing.Point(331, 305);
			this.btnNorma.Name = "btnNorma";
			this.btnNorma.Size = new System.Drawing.Size(167, 23);
			this.btnNorma.TabIndex = 10;
			this.btnNorma.Text = "CALCULAR NORMA";
			this.btnNorma.UseVisualStyleBackColor = true;
			this.btnNorma.Click += new System.EventHandler(this.btnNorma_Click);
			// 
			// Imprimir
			// 
			this.Imprimir.Location = new System.Drawing.Point(91, 377);
			this.Imprimir.Multiline = true;
			this.Imprimir.Name = "Imprimir";
			this.Imprimir.ReadOnly = true;
			this.Imprimir.Size = new System.Drawing.Size(381, 136);
			this.Imprimir.TabIndex = 11;
			// 
			// txtZ4
			// 
			this.txtZ4.Location = new System.Drawing.Point(383, 241);
			this.txtZ4.Name = "txtZ4";
			this.txtZ4.Size = new System.Drawing.Size(40, 22);
			this.txtZ4.TabIndex = 19;
			this.txtZ4.Text = "4";
			// 
			// txtY4
			// 
			this.txtY4.Location = new System.Drawing.Point(337, 241);
			this.txtY4.Name = "txtY4";
			this.txtY4.Size = new System.Drawing.Size(40, 22);
			this.txtY4.TabIndex = 18;
			this.txtY4.Text = "3";
			// 
			// txtX4
			// 
			this.txtX4.Location = new System.Drawing.Point(291, 241);
			this.txtX4.Name = "txtX4";
			this.txtX4.Size = new System.Drawing.Size(40, 22);
			this.txtX4.TabIndex = 17;
			this.txtX4.Text = "2";
			// 
			// label3
			// 
			this.label3.AutoSize = true;
			this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.label3.Location = new System.Drawing.Point(332, 196);
			this.label3.Name = "label3";
			this.label3.Size = new System.Drawing.Size(58, 29);
			this.label3.TabIndex = 16;
			this.label3.Text = "x,y,z";
			// 
			// txtZ3
			// 
			this.txtZ3.Location = new System.Drawing.Point(153, 241);
			this.txtZ3.Name = "txtZ3";
			this.txtZ3.Size = new System.Drawing.Size(40, 22);
			this.txtZ3.TabIndex = 15;
			this.txtZ3.Text = "0";
			// 
			// txtY3
			// 
			this.txtY3.Location = new System.Drawing.Point(107, 241);
			this.txtY3.Name = "txtY3";
			this.txtY3.Size = new System.Drawing.Size(40, 22);
			this.txtY3.TabIndex = 14;
			this.txtY3.Text = "0";
			// 
			// txtX3
			// 
			this.txtX3.Location = new System.Drawing.Point(61, 241);
			this.txtX3.Name = "txtX3";
			this.txtX3.Size = new System.Drawing.Size(40, 22);
			this.txtX3.TabIndex = 13;
			this.txtX3.Text = "0";
			// 
			// label4
			// 
			this.label4.AutoSize = true;
			this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.label4.Location = new System.Drawing.Point(102, 196);
			this.label4.Name = "label4";
			this.label4.Size = new System.Drawing.Size(58, 29);
			this.label4.TabIndex = 12;
			this.label4.Text = "x,y,z";
			// 
			// Form1
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(549, 556);
			this.Controls.Add(this.txtZ4);
			this.Controls.Add(this.txtY4);
			this.Controls.Add(this.txtX4);
			this.Controls.Add(this.label3);
			this.Controls.Add(this.txtZ3);
			this.Controls.Add(this.txtY3);
			this.Controls.Add(this.txtX3);
			this.Controls.Add(this.label4);
			this.Controls.Add(this.Imprimir);
			this.Controls.Add(this.btnNorma);
			this.Controls.Add(this.btnComparar);
			this.Controls.Add(this.txtZ2);
			this.Controls.Add(this.txtY2);
			this.Controls.Add(this.txtX2);
			this.Controls.Add(this.label2);
			this.Controls.Add(this.txtZ1);
			this.Controls.Add(this.txtY1);
			this.Controls.Add(this.txtX1);
			this.Controls.Add(this.label1);
			this.Controls.Add(this.button1);
			this.Name = "Form1";
			this.Text = "Form1";
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Button button1;
		private System.Windows.Forms.Label label1;
		private System.Windows.Forms.TextBox txtX1;
		private System.Windows.Forms.TextBox txtY1;
		private System.Windows.Forms.TextBox txtZ1;
		private System.Windows.Forms.TextBox txtZ2;
		private System.Windows.Forms.TextBox txtY2;
		private System.Windows.Forms.TextBox txtX2;
		private System.Windows.Forms.Label label2;
		private System.Windows.Forms.Button btnComparar;
		private System.Windows.Forms.Button btnNorma;
		private System.Windows.Forms.TextBox Imprimir;
		private System.Windows.Forms.TextBox txtZ4;
		private System.Windows.Forms.TextBox txtY4;
		private System.Windows.Forms.TextBox txtX4;
		private System.Windows.Forms.Label label3;
		private System.Windows.Forms.TextBox txtZ3;
		private System.Windows.Forms.TextBox txtY3;
		private System.Windows.Forms.TextBox txtX3;
		private System.Windows.Forms.Label label4;
	}
}

