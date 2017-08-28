using System;
using System.IO;
using System.Linq;

class Program 
{
	public static void Main(string[] args) 
	{
		using (StreamReader reader = File.OpenText (args[0]))

		while (!reader.EndOfStream) 
		{
			string line = reader.ReadLine ();
			if (null == line)
				continue;

			int[] houses = line.Split().Select(x => Int32.Parse(x)).Skip(1).Take(line.Length).ToArray();
			Array.Sort(houses);
			int min = houses.First();
			int max = houses.Last();

			long min_distance = 500000;
			for (int i = min; i <= max; i++) {
				long distance = getDistance(houses, i);
				if (distance < min_distance)
					min_distance = distance;
			}
			Console.WriteLine (min_distance);
		}
	}

	private static long getDistance(int[] addresses, int i) {
		long distance = 0;
		foreach (int address in addresses)
			distance += Math.Abs(address - i);
		return distance;
	}
}

