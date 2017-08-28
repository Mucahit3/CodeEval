using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HIDDEN_DIGITS
{
    class Program
    {
        static char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        static int[] digits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        
        static int search(char a)
        {
            int index = -1;
            for (int i = 0; i < letters.Length; i++ )
            {
                if(a == letters[i])
                {
                    index = i;
                    break;
                }
            }

            if(index != -1)
                return digits[index];
            
            return index;
        }
        
        static void Main(string[] args)
        {
            int counter;
            FileStream fs = new FileStream("hiddendigits.txt", FileMode.Open, FileAccess.Read);
            StreamReader sw = new StreamReader(fs);
             
            string text = sw.ReadLine();

            while (text != null)
            {
                counter = 0;
                for (int i = 0; i < text.Length; i++)
                {
                    if(search(text[i]) != -1)
                    {
                        counter++;
                        Console.Write(search(text[i]));
                    }
                }

                if(counter == 0)
                {
                    Console.Write("NONE");
                }

                Console.WriteLine();
                text = sw.ReadLine();
            }

            sw.Close();
            fs.Close();
            Console.WriteLine();
        }

        
    }
}
