using System;
using System.Collections.Generic;
using System.Text;

namespace PilasYcolas
{
	internal class Fecha
	{
        private int dia;
        private int mes;
        private int anio;

        public Fecha()
        {
            this.dia = 1;
            this.mes = 1;
            this.anio = 2022;
        }
        /**
         * Contructor
         * 
         * @param dia
         * @param mes
         * @param anio 
         */
        /// <CONSTRUCTOR>
        /// 
        /// </Si el dia es mayor a 31 o negativo lo convierte en uno 
        /// Si el mes es mayor a 12 o negativo lo convierto en uno
        /// Si el anio es negativo lo convierte en uno/>
        /// <param name="dia"></param>
        /// <param name="mes"></param>
        /// <param name="anio"></param>
        public Fecha(int dia, int mes, int anio)
        {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;

			if (dia > 31 || dia < 0)
			{
				this.dia = 1;
			}
			else this.dia = dia;

			if (mes > 12 || mes < 0)
			{
				this.mes = 1;
			}
			else this.mes = mes;

			if (anio < 0) this.anio = 1;
			else this.anio = anio;
		}
        //Getters and Setters
        public int Dia
        {
            get { return this.dia; }
            set { 
                if (value >= 1 && value <= 31) this.dia = value; 
            }
        }
        public int Mes
        {
            get { return this.mes; }
            set { 
                if (value >= 1 && value <= 31)this.mes = value; }
        }
        public int Anio
        {
            get { return this.anio; }
            set { 
                if (anio > 0) this.Anio = value; }
        }

        ///
        /// < Metodo que calcula si el anio es biciesto o no>
        /// 
        /// </summary>
        /// <returns></True -> bisiesto False -> No bisiesto>
        public bool Bisiesto()
        {
            if ((this.anio % 4 == 0) && (this.anio % 400 == 0 || this.anio % 100 != 0)) return true;
            else return false;
        }
        /// <summary>
        /// 
        /// </Metodo que calcula los dias del mes>
        /// <returns></Dias del mes>
        private int DiaMes(int mes){
            if(mes == 2){
                if(this.Bisiesto()) return 29;
                else return 28;
            }
            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                return 30;
            }
            else return 31;
        }
        public int DiaMes(){
            return DiaMes(this.mes);
        }
        /// <summary>
        /// 
        /// </Incrementa un dia a la fecha>
        public void IncrementarDia()
        {
            if (this.dia == DiaMes())
            {
                if (this.mes == 12)
                {
                    this.mes = 1;
                    anio++;
                } else this.mes ++;
                
                this.dia = 1;
            }
            else
            {
                this.dia++;
            }
        }
        public void IncrementarDia(int n)
        {
            for (int i = 0; i < n; i++)
            {
                if (this.dia == DiaMes())
                {
                    if (this.mes == 12)
                    {
                        mes = 1;
                        anio++;
                    }
                    else mes++;
                    dia = 1;
                }
                else dia++;
            }
        }
        /// <summary>
        /// 
        /// </Decrementa un dia a la fecha>
        public void DecrementarDia()
        {
            if (this.dia == 1)
            {
                if (mes == 1) {
                    this.mes = 12;
                    this.anio--;
                }
                else this.mes--;
                this.dia = DiaMes();
            }
            else
            {
                this.dia--;
            }
        }
        public void DecrementarDia(int n)
        {
            for (int i = 0; i < n; i++)
            {
                if (this.dia == 1)
                {
                    if (mes == 1)
                    {
                        mes = 12;
                        anio--;
                    }
                    else mes--;
                    this.dia = DiaMes();
                }
                else
                {
                    this.dia--;
                }
            }
        }
        /// <summary>
        /// 
        /// </Metodo que compara dos fechas>
        /// <param name="cDia"></param>
        /// <param name="cMes"></param>
        /// <param name="cAnio"></param>
        /// <returns></retorna la diferencia de dias, meses y anios>
        public int Comparar(int dia, int mes, int anio)
        {
            if (this.anio > anio) return 1;
            else
            {
                if (this.anio < anio) return -1;
                else
                {
                    if (this.mes > mes) return 1;
                    else
                    {
                        if (this.mes < mes) return -1;
                        else
                        {
                            if (this.dia > dia) return 1;
                            else
                            {
                                if (this.dia < dia) return -1;
                                else return 0;
                            }
                        }
                    }
                }
            }

        }
        public int Comparar(Fecha fn){
            return Comparar(fn.dia, fn.mes, fn.anio);
        }
        public int Comparar()
        {
            int dia = DateTime.Now.Day;
            int mes = DateTime.Now.Month;
            int anio = DateTime.Now.Year;

            return Comparar(dia, mes, anio);
        }
        public Fecha Edad(int dia, int mes, int anio){
            int diaM, mesM, anioM, diam,mesm, aniom;

            int aux = Comparar(dia, mes, anio);

            if (aux == 1){
                diaM = this.dia;
                mesM = this.mes;
                anioM = this.anio;
            
                diam = dia;
                mesm = mes;
                aniom=anio;
            }else if(aux == -1){
                diaM = dia;
                mesM = mes;
                anioM = anio;
            
                diam = this.dia;
                mesm = this.mes;
                aniom = this.anio;
            }else{
                Fecha f1 = new Fecha(0, 0, 0);
                return f1;
            }
        
            if(diaM < diam){
                mesM --;
                diaM += DiaMes(mesM);
                if(mesM < mesm){
                    mesM +=12;
                    anioM--;
                }
            }
            int rdia, rmes, ranio;
        
            rdia = diaM-diam;
            rmes = mesM - mesm;
            ranio = anioM - aniom;
        
            Fecha f = new Fecha(rdia, rmes, ranio);
            return f;
        }
        public Fecha Edad(){
            int dia = DateTime.Now.Day;
            int mes = DateTime.Now.Month;
            int anio = DateTime.Now.Year;

            return Edad(dia, mes, anio);
        }
        public Fecha Edad(Fecha f){
            return Edad(f.Dia, f.Mes, f.Anio);
        }
        public String Imprimir()
        {
            return this.Dia + "dd " + this.Mes + "mm " + this.Anio + "aa\r\n";
        }

    }
}
