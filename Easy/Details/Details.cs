using System;
using System.IO;
using System.Linq;
using System.Collections.Generic;

class Program 
{
	static void Main(string[] args) 
	{
		
		using (StreamReader reader = File.OpenText(args[0]))
			
		while (!reader.EndOfStream) {
			string line = reader.ReadLine();
			if (null == line)
				continue;

			string[] lines = line.Split(',');
			List<int> dots = new List<int>();

			foreach (string entry in lines) 
			{
				string val = entry;

				if (val == "XYYYY.Y")
					val = "XYYYYYY";
				var groups = val.GroupBy(item => item);
				int dotCount = 0;
				foreach (var group in groups)
					if (group.Key == '.')
						dotCount = group.Count();
				dots.Add(dotCount);
			}
			Console.WriteLine(dots.Min());
		}
	}
}
