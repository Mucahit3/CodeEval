using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SIMPLE_SORTING
{
    class Program
    {
        static void sort(double[] a)
        {
            int i, j;
            double key;
            for (j = 1; j < a.Length; j++ )
            {
                key = a[j];
                i = j - 1;
                while(i >= 0 && a[i] > key)
                {
                    a[i + 1] = a[i];
                    i = i - 1;
                }
                a[i + 1] = key;
            }
        }

        static void Main(string[] args)
        {
            double[] array = new double[30];
            int index = 0;
            string temp = "";

            FileStream fs = new FileStream("text.txt", FileMode.Open, FileAccess.Read);
            StreamReader sw = new StreamReader(fs);

            string txt = sw.ReadLine();

            while (txt != null)
            {                
                txt += ' ';

                for (int i = 0; i < txt.Length; i++)
                {
                    if (txt[i] != ' ')
                    {
                        temp += txt[i];
                        
                    }
                    else
                    {
                        array[index] = Convert.ToDouble(temp);
                        index++;
                        temp = "";    
                    }
                }

                sort(array);

                for (int i = 0; i < array.Length; i++)
                {
                    if(array[i] != 0)
                        Console.Write(array[i] + " ");
                }
                Console.WriteLine();

                index = 0;
                txt = sw.ReadLine();
            }

            sw.Close();
            fs.Close();
        }
    }
}
