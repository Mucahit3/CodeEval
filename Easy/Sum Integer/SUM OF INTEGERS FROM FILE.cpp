#include<iostream>
#include<fstream>

using namespace std;

int main(int argc, char** argv)
{
	ifstream sayilar(argv[1]);
	int toplam=0,sayi;
	
	while(!sayilar.eof())
	{
		sayilar>>sayi;
		toplam+=sayi;
	}
	
	cout<<toplam;
	
	return 0;
}
