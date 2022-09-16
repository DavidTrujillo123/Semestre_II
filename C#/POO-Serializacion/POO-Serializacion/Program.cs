using System;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;

namespace POO_Serializacion
{
	internal class Program
	{
        public static void Serializacion(Object a, string n)
        {
            try
            {
                BinaryFormatter bf = new BinaryFormatter();

                Stream miStream = new FileStream(n + ".data", FileMode.Create, FileAccess.Write, FileShare.None);

                bf.Serialize(miStream, a);

                miStream.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine("Error al crear el archivo");
            }
        }


        public static object Deserializacion(string n)
        {
            try
            {
                BinaryFormatter bf = new BinaryFormatter();

                Stream miStram = new FileStream(n + ".data", FileMode.Open, FileAccess.Read, FileShare.None);

                return bf.Deserialize(miStram);
            }
            catch (FileNotFoundException e)
            {
                Console.WriteLine("No se encontró el archivo");
                return null;
            }


        }
        static void Main(string[] args)
		{
			Console.WriteLine("Hello World!");
		}
	}
}
