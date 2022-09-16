namespace CuadradoMagico
{
	partial class Form1
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
			this.components = new System.ComponentModel.Container();
			this.btnCrear = new System.Windows.Forms.Button();
			this.panelContentedor = new System.Windows.Forms.Panel();
			this.comboBoxNum = new System.Windows.Forms.ComboBox();
			this.btnRestablecer = new System.Windows.Forms.Button();
			this.timer1 = new System.Windows.Forms.Timer(this.components);
			this.btnResolver = new System.Windows.Forms.Button();
			this.trackBar1 = new System.Windows.Forms.TrackBar();
			((System.ComponentModel.ISupportInitialize)(this.trackBar1)).BeginInit();
			this.SuspendLayout();
			// 
			// btnCrear
			// 
			this.btnCrear.Location = new System.Drawing.Point(693, 63);
			this.btnCrear.Name = "btnCrear";
			this.btnCrear.Size = new System.Drawing.Size(186, 66);
			this.btnCrear.TabIndex = 0;
			this.btnCrear.Text = "CREAR";
			this.btnCrear.UseVisualStyleBackColor = true;
			this.btnCrear.Click += new System.EventHandler(this.btnCrear_Click);
			// 
			// panelContentedor
			// 
			this.panelContentedor.Location = new System.Drawing.Point(14, 12);
			this.panelContentedor.Name = "panelContentedor";
			this.panelContentedor.Size = new System.Drawing.Size(600, 600);
			this.panelContentedor.TabIndex = 1;
			// 
			// comboBoxNum
			// 
			this.comboBoxNum.Font = new System.Drawing.Font("Arial Rounded MT Bold", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.comboBoxNum.FormattingEnabled = true;
			this.comboBoxNum.Items.AddRange(new object[] {
            "3",
            "5",
            "7",
            "9"});
			this.comboBoxNum.Location = new System.Drawing.Point(693, 12);
			this.comboBoxNum.Name = "comboBoxNum";
			this.comboBoxNum.Size = new System.Drawing.Size(52, 28);
			this.comboBoxNum.TabIndex = 2;
			this.comboBoxNum.Text = "3";
			// 
			// btnRestablecer
			// 
			this.btnRestablecer.Location = new System.Drawing.Point(693, 135);
			this.btnRestablecer.Name = "btnRestablecer";
			this.btnRestablecer.Size = new System.Drawing.Size(186, 58);
			this.btnRestablecer.TabIndex = 3;
			this.btnRestablecer.Text = "REINICIAR";
			this.btnRestablecer.UseVisualStyleBackColor = true;
			this.btnRestablecer.Click += new System.EventHandler(this.btnRestablecer_Click);
			// 
			// timer1
			// 
			this.timer1.Interval = 1000;
			this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
			// 
			// btnResolver
			// 
			this.btnResolver.Location = new System.Drawing.Point(690, 199);
			this.btnResolver.Name = "btnResolver";
			this.btnResolver.Size = new System.Drawing.Size(200, 57);
			this.btnResolver.TabIndex = 4;
			this.btnResolver.Text = "RESOLVER";
			this.btnResolver.UseVisualStyleBackColor = true;
			this.btnResolver.Click += new System.EventHandler(this.btnResolver_Click);
			// 
			// trackBar1
			// 
			this.trackBar1.Location = new System.Drawing.Point(665, 302);
			this.trackBar1.Maximum = 1000;
			this.trackBar1.Minimum = 1;
			this.trackBar1.Name = "trackBar1";
			this.trackBar1.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
			this.trackBar1.RightToLeftLayout = true;
			this.trackBar1.Size = new System.Drawing.Size(245, 56);
			this.trackBar1.TabIndex = 12;
			this.trackBar1.TickFrequency = 100;
			this.trackBar1.Value = 500;
			this.trackBar1.Scroll += new System.EventHandler(this.trackBar1_Scroll);
			// 
			// Form1
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(947, 737);
			this.Controls.Add(this.trackBar1);
			this.Controls.Add(this.btnResolver);
			this.Controls.Add(this.btnRestablecer);
			this.Controls.Add(this.comboBoxNum);
			this.Controls.Add(this.panelContentedor);
			this.Controls.Add(this.btnCrear);
			this.Name = "Form1";
			this.Text = "Form1";
			this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.Form1_FormClosing);
			((System.ComponentModel.ISupportInitialize)(this.trackBar1)).EndInit();
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Button btnCrear;
		private System.Windows.Forms.Panel panelContentedor;
		private System.Windows.Forms.ComboBox comboBoxNum;
		private System.Windows.Forms.Button btnRestablecer;
		private System.Windows.Forms.Timer timer1;
		private System.Windows.Forms.Button btnResolver;
		private System.Windows.Forms.TrackBar trackBar1;
	}
}