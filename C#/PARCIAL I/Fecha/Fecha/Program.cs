using System;
using System.IO
using System.Runtime.Serialization.Formatters.Binary


namespace Fecha
{
	class Program
	{
		static void Main(string[] args)
		{
			Facha f1,fr;
			f1 = new Fecha(12,8,2009);
			Console.WriteLine("Serializacion");
			try
			{
				BinaryFormatter bf = new BinaryFormatter();
				Stream stream = new FileStream("Fecha", FileMode.Create, FileAccess.Write, FileShare.None);
				
				bf.Serialize(stream, f1);
				stream.Close();
			}
			catch(Exception ex)
			{
			}
        }
	}
}
