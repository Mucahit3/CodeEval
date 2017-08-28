using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WORD_TO_DIGIT
{
    class Program
    {
        static string[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        static int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        
        static int search(string a)
        {
            int index = -1;

            for (int i = 0; i < digits.Length; i++)
            {
                if(a == digits[i])
                {
                    index = i;
                }
            }

            if (index != -1)
                return numbers[index];
            return index;
        }

        static void Main(string[] args)
        {
            string word;

            using (StreamReader reader = File.OpenText("digits.txt"))
            while (!reader.EndOfStream)
            {
                string text = reader.ReadLine();
                if (null == text)
                    continue;

                word = "";
                text += ' ';
                for(int i = 0; i < text.Length; i++)
                {                
                    if(text[i] == ';' || text[i] == ' ')
                    {
                        if (search(word) != -1)
                        {
                            Console.Write(search(word));
                            word = "";
                        }
                    }
                    else 
                    {
                        word += text[i];
                    }            
                }

                Console.WriteLine();
            }
        }
    }
}
