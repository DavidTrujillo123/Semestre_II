namespace MatrizVisual
{
	partial class Formulario
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
			this.btnSuma = new System.Windows.Forms.Button();
			this.bntMultiplicacion = new System.Windows.Forms.Button();
			this.label1 = new System.Windows.Forms.Label();
			this.SuspendLayout();
			// 
			// btnSuma
			// 
			this.btnSuma.Location = new System.Drawing.Point(146, 168);
			this.btnSuma.Name = "btnSuma";
			this.btnSuma.Size = new System.Drawing.Size(172, 99);
			this.btnSuma.TabIndex = 0;
			this.btnSuma.Text = "SUMA O RESTA";
			this.btnSuma.UseVisualStyleBackColor = true;
			this.btnSuma.Click += new System.EventHandler(this.btnSuma_Click);
			// 
			// bntMultiplicacion
			// 
			this.bntMultiplicacion.Location = new System.Drawing.Point(407, 168);
			this.bntMultiplicacion.Name = "bntMultiplicacion";
			this.bntMultiplicacion.Size = new System.Drawing.Size(188, 99);
			this.bntMultiplicacion.TabIndex = 1;
			this.bntMultiplicacion.Text = "MULTIPLICACIÓN";
			this.bntMultiplicacion.UseVisualStyleBackColor = true;
			this.bntMultiplicacion.Click += new System.EventHandler(this.btnMultiplicacion);
			// 
			// label1
			// 
			this.label1.AutoSize = true;
			this.label1.Location = new System.Drawing.Point(268, 61);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(208, 16);
			this.label1.TabIndex = 2;
			this.label1.Text = "OPERACIONES CON MATRICES";
			// 
			// Formulario
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(715, 319);
			this.Controls.Add(this.label1);
			this.Controls.Add(this.bntMultiplicacion);
			this.Controls.Add(this.btnSuma);
			this.Name = "Formulario";
			this.Text = "OPERACIONES CON MATRICES";
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Button btnSuma;
		private System.Windows.Forms.Button bntMultiplicacion;
		private System.Windows.Forms.Label label1;
	}
}

