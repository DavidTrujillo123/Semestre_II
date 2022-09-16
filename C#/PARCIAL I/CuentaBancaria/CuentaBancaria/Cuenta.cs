using System;
using System.Collections.Generic;
using System.Text;

namespace CuentaBancaria
{
	internal class Cuenta
	{
        private String nombre;
        private int diaNacimiento;
        private int mesNacimiento;
        private int anioNacimiento;
        private int diaCreacionCuenta;
        private int mesCreacionCuenta;
        private int anioCreacionCuenta;
        private double saldo;
        private static double saldoMinimo = 20;

        public Cuenta(String nombre, int diaNacimiento, int mesNacimiento, int anioNacimiento, double saldo)
        {
            this.nombre = nombre;
            this.saldo = saldo;
            this.diaNacimiento = diaNacimiento;
            this.mesNacimiento = mesNacimiento;
            this.anioNacimiento = anioNacimiento;

            FechaCreacion();
        }
        public Cuenta()
        {
            this.nombre = "David Trujillo";
            this.saldo = 110;
            this.diaNacimiento = 1;
            this.mesNacimiento = 5;
            this.anioNacimiento = 2001;

            FechaCreacion();
        }
        public Cuenta(double saldo)
        {
            this.saldo = saldo;
            this.nombre = "David Trujillo";
            this.diaNacimiento = 1;
            this.mesNacimiento = 5;
            this.anioNacimiento = 2001;
            FechaCreacion();
        }
        private void FechaCreacion()
        {
            this.diaCreacionCuenta = DateTime.Now.Day;
            this.mesCreacionCuenta = DateTime.Now.Month;
            this.anioCreacionCuenta = DateTime.Now.Year;
        }

        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }
        public void setFechaNacimiento(int dia, int mes, int anio)
        {
            this.diaNacimiento = dia;
            this.mesNacimiento = mes;
            this.anioNacimiento = anio;

            if (dia > 31 || dia < 1)
            {
                this.diaNacimiento = 1;
            }
            else this.diaNacimiento = dia;

            if (mes > 12 || mes < 1)
            {
                this.mesNacimiento = 1;
            }
            else this.mesNacimiento = mes;

            if (anio < 1) this.anioNacimiento = 2001;
            else this.anioNacimiento = anio;
        }
        public int getDiaCreancioCuenta()
        {
            return diaCreacionCuenta;
        }
        public int getMesCreacionCuenta()
        {
            return mesCreacionCuenta;
        }
        public int getAnioCreacionCuenta()
        {
            return anioCreacionCuenta;
        }

        public void Depositar(double cantidad)
        {
            if (cantidad > 0) this.saldo += cantidad;
        }
        public bool Retirar(double cantidad)
        {
            if (this.saldo >= Cuenta.saldoMinimo + cantidad && cantidad > 0)
            {
                this.saldo -= cantidad;
                return true;
            }
            else return false;
        }

        public String ImprimirDatos()
        {
            return "Fecha de creacion: " + this.diaCreacionCuenta + "dd " + this.mesCreacionCuenta + "mm " + this.anioCreacionCuenta + "aa"
                    + "\nNombre: " + this.nombre
                    + "\nFecha de nacimiento: " + this.diaNacimiento + "dd " + this.mesNacimiento + "mm " + this.anioNacimiento + "\n";
        }
        public String ImprimirSaldo()
        {
            return "Saldo disponible: " + this.saldo + "$\n";
        }


    }
}
