#include<iostream>
#include<fstream>

using namespace std;

int fibonacci(int);

int main()
{
	ifstream sayilar("fibonacci.txt");
	int sayi;
	
	while(!sayilar.eof())
	{
		sayilar>>sayi;
		cout<<fibonacci(sayi)<<endl;
	}
}

int fibonacci(int number)
{
	if(number==0)
	{
		return 0;
	}
	if(number==1)
	{
		return 1;
	}
	else
	{
		return fibonacci(number-1)+fibonacci(number-2);
	}
	
}


