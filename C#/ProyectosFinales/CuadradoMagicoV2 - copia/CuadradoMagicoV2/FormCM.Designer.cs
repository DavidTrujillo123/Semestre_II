namespace CuadradoMagicoV2
{
	partial class FormCM
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
			this.panel1 = new System.Windows.Forms.Panel();
			this.btnResolver = new System.Windows.Forms.Button();
			this.btnComprobar = new System.Windows.Forms.Button();
			this.label1 = new System.Windows.Forms.Label();
			this.btnRestablecer = new System.Windows.Forms.Button();
			this.comboBoxNum = new System.Windows.Forms.ComboBox();
			this.panelContentedor = new System.Windows.Forms.Panel();
			this.btnCrear = new System.Windows.Forms.Button();
			this.trackBar1 = new System.Windows.Forms.TrackBar();
			this.timer1 = new System.Windows.Forms.Timer(this.components);
			this.panel1.SuspendLayout();
			((System.ComponentModel.ISupportInitialize)(this.trackBar1)).BeginInit();
			this.SuspendLayout();
			// 
			// panel1
			// 
			this.panel1.Controls.Add(this.trackBar1);
			this.panel1.Controls.Add(this.btnResolver);
			this.panel1.Controls.Add(this.btnComprobar);
			this.panel1.Controls.Add(this.label1);
			this.panel1.Controls.Add(this.btnRestablecer);
			this.panel1.Controls.Add(this.comboBoxNum);
			this.panel1.Controls.Add(this.panelContentedor);
			this.panel1.Controls.Add(this.btnCrear);
			this.panel1.Dock = System.Windows.Forms.DockStyle.Fill;
			this.panel1.Location = new System.Drawing.Point(0, 0);
			this.panel1.Name = "panel1";
			this.panel1.Size = new System.Drawing.Size(1093, 891);
			this.panel1.TabIndex = 0;
			// 
			// btnResolver
			// 
			this.btnResolver.Location = new System.Drawing.Point(66, 320);
			this.btnResolver.Name = "btnResolver";
			this.btnResolver.Size = new System.Drawing.Size(125, 23);
			this.btnResolver.TabIndex = 11;
			this.btnResolver.Text = "RESOLVER";
			this.btnResolver.UseVisualStyleBackColor = true;
			this.btnResolver.Click += new System.EventHandler(this.btnResolver_Click);
			// 
			// btnComprobar
			// 
			this.btnComprobar.Location = new System.Drawing.Point(66, 268);
			this.btnComprobar.Name = "btnComprobar";
			this.btnComprobar.Size = new System.Drawing.Size(125, 23);
			this.btnComprobar.TabIndex = 10;
			this.btnComprobar.Text = "COMPROBAR";
			this.btnComprobar.UseVisualStyleBackColor = true;
			this.btnComprobar.Click += new System.EventHandler(this.btnComprobar_Click);
			// 
			// label1
			// 
			this.label1.AutoSize = true;
			this.label1.Font = new System.Drawing.Font("Segoe Script", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.label1.Location = new System.Drawing.Point(402, 9);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(330, 55);
			this.label1.TabIndex = 9;
			this.label1.Text = "Cuadrado Mágico";
			// 
			// btnRestablecer
			// 
			this.btnRestablecer.Location = new System.Drawing.Point(81, 227);
			this.btnRestablecer.Name = "btnRestablecer";
			this.btnRestablecer.Size = new System.Drawing.Size(98, 23);
			this.btnRestablecer.TabIndex = 8;
			this.btnRestablecer.Text = "REINICIAR";
			this.btnRestablecer.UseVisualStyleBackColor = true;
			this.btnRestablecer.Click += new System.EventHandler(this.btnRestablecer_Click);
			// 
			// comboBoxNum
			// 
			this.comboBoxNum.Font = new System.Drawing.Font("Times New Roman", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.comboBoxNum.FormattingEnabled = true;
			this.comboBoxNum.Items.AddRange(new object[] {
            "3",
            "5",
            "7",
            "9"});
			this.comboBoxNum.Location = new System.Drawing.Point(105, 141);
			this.comboBoxNum.Name = "comboBoxNum";
			this.comboBoxNum.Size = new System.Drawing.Size(40, 27);
			this.comboBoxNum.TabIndex = 7;
			this.comboBoxNum.Text = "3";
			// 
			// panelContentedor
			// 
			this.panelContentedor.Location = new System.Drawing.Point(322, 116);
			this.panelContentedor.Name = "panelContentedor";
			this.panelContentedor.Size = new System.Drawing.Size(725, 734);
			this.panelContentedor.TabIndex = 6;
			// 
			// btnCrear
			// 
			this.btnCrear.Location = new System.Drawing.Point(93, 180);
			this.btnCrear.Name = "btnCrear";
			this.btnCrear.Size = new System.Drawing.Size(75, 23);
			this.btnCrear.TabIndex = 5;
			this.btnCrear.Text = "CREAR";
			this.btnCrear.UseVisualStyleBackColor = true;
			this.btnCrear.Click += new System.EventHandler(this.btnCrear_Click);
			// 
			// trackBar1
			// 
			this.trackBar1.Location = new System.Drawing.Point(33, 398);
			this.trackBar1.Maximum = 1000;
			this.trackBar1.Name = "trackBar1";
			this.trackBar1.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
			this.trackBar1.RightToLeftLayout = true;
			this.trackBar1.Size = new System.Drawing.Size(260, 56);
			this.trackBar1.TabIndex = 12;
			this.trackBar1.TickFrequency = 100;
			this.trackBar1.Value = 500;
			this.trackBar1.Scroll += new System.EventHandler(this.trackBar1_Scroll);
			// 
			// timer1
			// 
			this.timer1.Interval = 1000;
			this.timer1.Tick += new System.EventHandler(this.timer1_Tick_1);
			// 
			// FormCM
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(1093, 891);
			this.Controls.Add(this.panel1);
			this.Name = "FormCM";
			this.Text = "FormCM";
			this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.FormCM_FormClosing);
			this.panel1.ResumeLayout(false);
			this.panel1.PerformLayout();
			((System.ComponentModel.ISupportInitialize)(this.trackBar1)).EndInit();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.Panel panel1;
		private System.Windows.Forms.Label label1;
		private System.Windows.Forms.Panel panelContentedor;
		private System.Windows.Forms.Button btnComprobar;
		private System.Windows.Forms.Button btnRestablecer;
		private System.Windows.Forms.ComboBox comboBoxNum;
		private System.Windows.Forms.Button btnCrear;
		private System.Windows.Forms.Button btnResolver;
		private System.Windows.Forms.TrackBar trackBar1;
		private System.Windows.Forms.Timer timer1;
	}
}