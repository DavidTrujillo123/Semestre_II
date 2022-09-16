using System;

namespace CuentaBancaria
{
	internal class Program
	{
		static void Main(string[] args)
		{
            Cuenta c1, c2, c3;
            c1 = new Cuenta("Marco Pérez", 1, 12, 1981, 125);
            c2 = new Cuenta();
            c3 = new Cuenta(200);

			Console.WriteLine((c1.ImprimirDatos() + c1.ImprimirSaldo()));

            double cantidad = 123.05;
            c1.Depositar(cantidad);
			Console.WriteLine(("Deposito: " + cantidad + "\n" + c1.ImprimirSaldo()));

            cantidad = 200;
			if (c1.Retirar(cantidad)) Console.WriteLine(("Retiro: " + cantidad + "\n" + c1.ImprimirSaldo()));
			else Console.WriteLine(("Saldo insuficiente\n" + c1.ImprimirSaldo()));

			Console.WriteLine(("---------------------------------"));

			Console.WriteLine(c2.ImprimirDatos() + c2.ImprimirSaldo());
            c2.Depositar(cantidad);
			Console.WriteLine("Deposito: " + cantidad + "\n" + c2.ImprimirSaldo());

            cantidad = 100.2;
			if (c2.Retirar(cantidad)) Console.WriteLine("Retiro: " + cantidad + "\n" + c2.ImprimirSaldo());
			else Console.WriteLine(("Saldo insuficiente\n" + c2.ImprimirSaldo()));

			Console.WriteLine(("----------------------------------"));

            c3.setFechaNacimiento(3, 5, 1998);
            c3.setNombre("Maria Paez");

			Console.WriteLine((c3.ImprimirDatos() + c3.ImprimirSaldo()));
            c3.Depositar(cantidad);
			Console.WriteLine(("Deposito: " + cantidad + "\n" + c3.ImprimirSaldo()));

            cantidad = 300;
			if (c3.Retirar(cantidad)) Console.WriteLine("Retiro: " + cantidad + "\n" + c3.ImprimirSaldo());
			else Console.WriteLine("Saldo insuficiente\n" + c3.ImprimirSaldo());


        }

    }
}
