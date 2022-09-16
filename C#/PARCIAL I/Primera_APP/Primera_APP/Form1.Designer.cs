namespace Primera_APP
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
			this.lblNum1 = new System.Windows.Forms.Label();
			this.lblDen1 = new System.Windows.Forms.Label();
			this.txtNum = new System.Windows.Forms.TextBox();
			this.txtDen = new System.Windows.Forms.TextBox();
			this.btnCrear = new System.Windows.Forms.Button();
			this.txtImprimir = new System.Windows.Forms.TextBox();
			this.lblNum2 = new System.Windows.Forms.Label();
			this.lblDen2 = new System.Windows.Forms.Label();
			this.txtNum2 = new System.Windows.Forms.TextBox();
			this.txtDen2 = new System.Windows.Forms.TextBox();
			this.btnSumar = new System.Windows.Forms.Button();
			this.btnRestar = new System.Windows.Forms.Button();
			this.btnMult = new System.Windows.Forms.Button();
			this.bntDiv = new System.Windows.Forms.Button();
			this.lblFraccion1 = new System.Windows.Forms.Label();
			this.lblFraccion2 = new System.Windows.Forms.Label();
			this.SuspendLayout();
			// 
			// lblNum1
			// 
			this.lblNum1.AutoSize = true;
			this.lblNum1.Location = new System.Drawing.Point(53, 51);
			this.lblNum1.Name = "lblNum1";
			this.lblNum1.Size = new System.Drawing.Size(75, 16);
			this.lblNum1.TabIndex = 0;
			this.lblNum1.Text = "Numerador";
			// 
			// lblDen1
			// 
			this.lblDen1.AutoSize = true;
			this.lblDen1.Location = new System.Drawing.Point(53, 77);
			this.lblDen1.Name = "lblDen1";
			this.lblDen1.Size = new System.Drawing.Size(89, 16);
			this.lblDen1.TabIndex = 1;
			this.lblDen1.Text = "Denominador";
			// 
			// txtNum
			// 
			this.txtNum.Location = new System.Drawing.Point(170, 44);
			this.txtNum.Name = "txtNum";
			this.txtNum.Size = new System.Drawing.Size(48, 22);
			this.txtNum.TabIndex = 2;
			this.txtNum.Text = "15";
			// 
			// txtDen
			// 
			this.txtDen.Location = new System.Drawing.Point(170, 77);
			this.txtDen.Name = "txtDen";
			this.txtDen.Size = new System.Drawing.Size(48, 22);
			this.txtDen.TabIndex = 3;
			this.txtDen.Text = "3";
			// 
			// btnCrear
			// 
			this.btnCrear.Location = new System.Drawing.Point(94, 255);
			this.btnCrear.Name = "btnCrear";
			this.btnCrear.Size = new System.Drawing.Size(113, 36);
			this.btnCrear.TabIndex = 4;
			this.btnCrear.Text = "CREAR";
			this.btnCrear.UseVisualStyleBackColor = true;
			this.btnCrear.Click += new System.EventHandler(this.btnCrear_Click);
			// 
			// txtImprimir
			// 
			this.txtImprimir.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.txtImprimir.Location = new System.Drawing.Point(279, 47);
			this.txtImprimir.Multiline = true;
			this.txtImprimir.Name = "txtImprimir";
			this.txtImprimir.ReadOnly = true;
			this.txtImprimir.Size = new System.Drawing.Size(253, 120);
			this.txtImprimir.TabIndex = 5;
			// 
			// lblNum2
			// 
			this.lblNum2.AutoSize = true;
			this.lblNum2.Location = new System.Drawing.Point(50, 145);
			this.lblNum2.Name = "lblNum2";
			this.lblNum2.Size = new System.Drawing.Size(75, 16);
			this.lblNum2.TabIndex = 6;
			this.lblNum2.Text = "Numerador";
			// 
			// lblDen2
			// 
			this.lblDen2.AutoSize = true;
			this.lblDen2.Location = new System.Drawing.Point(50, 177);
			this.lblDen2.Name = "lblDen2";
			this.lblDen2.Size = new System.Drawing.Size(89, 16);
			this.lblDen2.TabIndex = 7;
			this.lblDen2.Text = "Denominador";
			// 
			// txtNum2
			// 
			this.txtNum2.Location = new System.Drawing.Point(167, 145);
			this.txtNum2.Name = "txtNum2";
			this.txtNum2.Size = new System.Drawing.Size(48, 22);
			this.txtNum2.TabIndex = 8;
			this.txtNum2.Text = "3";
			// 
			// txtDen2
			// 
			this.txtDen2.Location = new System.Drawing.Point(167, 174);
			this.txtDen2.Name = "txtDen2";
			this.txtDen2.Size = new System.Drawing.Size(48, 22);
			this.txtDen2.TabIndex = 9;
			this.txtDen2.Text = "2";
			// 
			// btnSumar
			// 
			this.btnSumar.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.btnSumar.Location = new System.Drawing.Point(294, 217);
			this.btnSumar.Name = "btnSumar";
			this.btnSumar.Size = new System.Drawing.Size(93, 42);
			this.btnSumar.TabIndex = 10;
			this.btnSumar.Text = "fr1 + fr2";
			this.btnSumar.UseVisualStyleBackColor = true;
			this.btnSumar.Click += new System.EventHandler(this.btnSumar_Click);
			// 
			// btnRestar
			// 
			this.btnRestar.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.btnRestar.Location = new System.Drawing.Point(403, 219);
			this.btnRestar.Name = "btnRestar";
			this.btnRestar.Size = new System.Drawing.Size(101, 40);
			this.btnRestar.TabIndex = 11;
			this.btnRestar.Text = "fr1 - fr2";
			this.btnRestar.UseVisualStyleBackColor = true;
			this.btnRestar.Click += new System.EventHandler(this.btnRestar_Click);
			// 
			// btnMult
			// 
			this.btnMult.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.btnMult.Location = new System.Drawing.Point(294, 274);
			this.btnMult.Name = "btnMult";
			this.btnMult.Size = new System.Drawing.Size(93, 43);
			this.btnMult.TabIndex = 12;
			this.btnMult.Text = "fr1 * fr2";
			this.btnMult.UseVisualStyleBackColor = true;
			this.btnMult.Click += new System.EventHandler(this.btnMult_Click);
			// 
			// bntDiv
			// 
			this.bntDiv.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.bntDiv.Location = new System.Drawing.Point(403, 274);
			this.bntDiv.Name = "bntDiv";
			this.bntDiv.Size = new System.Drawing.Size(101, 43);
			this.bntDiv.TabIndex = 13;
			this.bntDiv.Text = "fr1 / fr2";
			this.bntDiv.UseVisualStyleBackColor = true;
			this.bntDiv.Click += new System.EventHandler(this.bntDiv_Click);
			// 
			// lblFraccion1
			// 
			this.lblFraccion1.AutoSize = true;
			this.lblFraccion1.Location = new System.Drawing.Point(29, 22);
			this.lblFraccion1.Name = "lblFraccion1";
			this.lblFraccion1.Size = new System.Drawing.Size(69, 16);
			this.lblFraccion1.TabIndex = 14;
			this.lblFraccion1.Text = "Fracción 1";
			// 
			// lblFraccion2
			// 
			this.lblFraccion2.AutoSize = true;
			this.lblFraccion2.Location = new System.Drawing.Point(29, 120);
			this.lblFraccion2.Name = "lblFraccion2";
			this.lblFraccion2.Size = new System.Drawing.Size(69, 16);
			this.lblFraccion2.TabIndex = 15;
			this.lblFraccion2.Text = "Fracción 2";
			// 
			// Form1
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(554, 349);
			this.Controls.Add(this.lblFraccion2);
			this.Controls.Add(this.lblFraccion1);
			this.Controls.Add(this.bntDiv);
			this.Controls.Add(this.btnMult);
			this.Controls.Add(this.btnRestar);
			this.Controls.Add(this.btnSumar);
			this.Controls.Add(this.txtDen2);
			this.Controls.Add(this.txtNum2);
			this.Controls.Add(this.lblDen2);
			this.Controls.Add(this.lblNum2);
			this.Controls.Add(this.txtImprimir);
			this.Controls.Add(this.btnCrear);
			this.Controls.Add(this.txtDen);
			this.Controls.Add(this.txtNum);
			this.Controls.Add(this.lblDen1);
			this.Controls.Add(this.lblNum1);
			this.Name = "Form1";
			this.Text = "Mi primera APP";
			this.Load += new System.EventHandler(this.Form1_Load);
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Label lblNum1;
		private System.Windows.Forms.Label lblDen1;
		private System.Windows.Forms.TextBox txtNum;
		private System.Windows.Forms.TextBox txtDen;
		private System.Windows.Forms.Button btnCrear;
		private System.Windows.Forms.TextBox txtImprimir;
		private System.Windows.Forms.Label lblNum2;
		private System.Windows.Forms.Label lblDen2;
		private System.Windows.Forms.TextBox txtNum2;
		private System.Windows.Forms.TextBox txtDen2;
		private System.Windows.Forms.Button btnSumar;
		private System.Windows.Forms.Button btnRestar;
		private System.Windows.Forms.Button btnMult;
		private System.Windows.Forms.Button bntDiv;
		private System.Windows.Forms.Label lblFraccion1;
		private System.Windows.Forms.Label lblFraccion2;
	}
}

