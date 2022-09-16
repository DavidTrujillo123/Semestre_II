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
			this.timer1 = new System.Windows.Forms.Timer(this.components);
			this.panel1 = new System.Windows.Forms.Panel();
			this.btnLimpiar = new System.Windows.Forms.Button();
			this.btnInfo = new System.Windows.Forms.Button();
			this.trackBar1 = new System.Windows.Forms.TrackBar();
			this.btnResolver = new System.Windows.Forms.Button();
			this.btnComprobar = new System.Windows.Forms.Button();
			this.label1 = new System.Windows.Forms.Label();
			this.comboBoxNum = new System.Windows.Forms.ComboBox();
			this.panelContenedor = new System.Windows.Forms.Panel();
			this.panel1.SuspendLayout();
			((System.ComponentModel.ISupportInitialize)(this.trackBar1)).BeginInit();
			this.SuspendLayout();
			// 
			// timer1
			// 
			this.timer1.Interval = 1000;
			this.timer1.Tick += new System.EventHandler(this.timer1_Tick_1);
			// 
			// panel1
			// 
			this.panel1.BackgroundImage = global::CuadradoMagicoV2.Properties.Resources.blue_border_abstract_pixel_rain_background;
			this.panel1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
			this.panel1.Controls.Add(this.btnLimpiar);
			this.panel1.Controls.Add(this.btnInfo);
			this.panel1.Controls.Add(this.trackBar1);
			this.panel1.Controls.Add(this.btnResolver);
			this.panel1.Controls.Add(this.btnComprobar);
			this.panel1.Controls.Add(this.label1);
			this.panel1.Controls.Add(this.comboBoxNum);
			this.panel1.Controls.Add(this.panelContenedor);
			this.panel1.Dock = System.Windows.Forms.DockStyle.Fill;
			this.panel1.Location = new System.Drawing.Point(0, 0);
			this.panel1.Name = "panel1";
			this.panel1.Size = new System.Drawing.Size(1093, 899);
			this.panel1.TabIndex = 0;
			// 
			// btnLimpiar
			// 
			this.btnLimpiar.BackColor = System.Drawing.Color.Transparent;
			this.btnLimpiar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
			this.btnLimpiar.ForeColor = System.Drawing.Color.Transparent;
			this.btnLimpiar.Image = global::CuadradoMagicoV2.Properties.Resources.icons8_escoba_30;
			this.btnLimpiar.Location = new System.Drawing.Point(171, 116);
			this.btnLimpiar.Name = "btnLimpiar";
			this.btnLimpiar.Size = new System.Drawing.Size(63, 51);
			this.btnLimpiar.TabIndex = 14;
			this.btnLimpiar.UseVisualStyleBackColor = false;
			this.btnLimpiar.Click += new System.EventHandler(this.btnLimpiar_Click);
			// 
			// btnInfo
			// 
			this.btnInfo.BackColor = System.Drawing.Color.Transparent;
			this.btnInfo.FlatAppearance.BorderSize = 0;
			this.btnInfo.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
			this.btnInfo.Image = global::CuadradoMagicoV2.Properties.Resources.icons8_acerca_de_48;
			this.btnInfo.Location = new System.Drawing.Point(760, 9);
			this.btnInfo.Name = "btnInfo";
			this.btnInfo.Size = new System.Drawing.Size(58, 50);
			this.btnInfo.TabIndex = 13;
			this.btnInfo.TextAlign = System.Drawing.ContentAlignment.TopRight;
			this.btnInfo.UseVisualStyleBackColor = false;
			this.btnInfo.Click += new System.EventHandler(this.btnInfo_Click);
			// 
			// trackBar1
			// 
			this.trackBar1.Location = new System.Drawing.Point(12, 306);
			this.trackBar1.Maximum = 1000;
			this.trackBar1.Minimum = 10;
			this.trackBar1.Name = "trackBar1";
			this.trackBar1.RightToLeft = System.Windows.Forms.RightToLeft.Yes;
			this.trackBar1.RightToLeftLayout = true;
			this.trackBar1.Size = new System.Drawing.Size(260, 56);
			this.trackBar1.TabIndex = 12;
			this.trackBar1.TickFrequency = 100;
			this.trackBar1.Value = 500;
			this.trackBar1.Scroll += new System.EventHandler(this.trackBar1_Scroll);
			// 
			// btnResolver
			// 
			this.btnResolver.Location = new System.Drawing.Point(56, 238);
			this.btnResolver.Name = "btnResolver";
			this.btnResolver.Size = new System.Drawing.Size(134, 47);
			this.btnResolver.TabIndex = 11;
			this.btnResolver.Text = "RESOLVER";
			this.btnResolver.UseVisualStyleBackColor = true;
			this.btnResolver.Click += new System.EventHandler(this.btnResolver_Click);
			// 
			// btnComprobar
			// 
			this.btnComprobar.Location = new System.Drawing.Point(56, 186);
			this.btnComprobar.Name = "btnComprobar";
			this.btnComprobar.Size = new System.Drawing.Size(134, 46);
			this.btnComprobar.TabIndex = 10;
			this.btnComprobar.Text = "COMPROBAR";
			this.btnComprobar.UseVisualStyleBackColor = true;
			this.btnComprobar.Click += new System.EventHandler(this.btnComprobar_Click);
			// 
			// label1
			// 
			this.label1.AutoSize = true;
			this.label1.BackColor = System.Drawing.Color.Transparent;
			this.label1.Font = new System.Drawing.Font("Segoe Script", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.label1.Location = new System.Drawing.Point(402, 9);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(330, 55);
			this.label1.TabIndex = 9;
			this.label1.Text = "Cuadrado Mágico";
			// 
			// comboBoxNum
			// 
			this.comboBoxNum.Font = new System.Drawing.Font("Times New Roman", 16.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.comboBoxNum.FormattingEnabled = true;
			this.comboBoxNum.Items.AddRange(new object[] {
            "3",
            "5",
            "7",
            "9"});
			this.comboBoxNum.Location = new System.Drawing.Point(98, 125);
			this.comboBoxNum.Name = "comboBoxNum";
			this.comboBoxNum.Size = new System.Drawing.Size(49, 39);
			this.comboBoxNum.TabIndex = 7;
			this.comboBoxNum.Text = "3";
			this.comboBoxNum.SelectedIndexChanged += new System.EventHandler(this.comboBoxNum_SelectedIndexChanged);
			// 
			// panelContenedor
			// 
			this.panelContenedor.BackColor = System.Drawing.SystemColors.Control;
			this.panelContenedor.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
			this.panelContenedor.Location = new System.Drawing.Point(322, 116);
			this.panelContenedor.Name = "panelContenedor";
			this.panelContenedor.Size = new System.Drawing.Size(725, 734);
			this.panelContenedor.TabIndex = 6;
			// 
			// FormCM
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(1093, 899);
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
		private System.Windows.Forms.Panel panelContenedor;
		private System.Windows.Forms.Button btnComprobar;
		private System.Windows.Forms.ComboBox comboBoxNum;
		private System.Windows.Forms.Button btnResolver;
		private System.Windows.Forms.TrackBar trackBar1;
		private System.Windows.Forms.Timer timer1;
		private System.Windows.Forms.Button btnInfo;
		private System.Windows.Forms.Button btnLimpiar;
	}
}