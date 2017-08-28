#include<iostream>
#include<string.h>
#include<fstream>

using namespace std;

void print(string);
int uzunluk(string);

int main()
{
	
	string cumle,kelime="",max="";
	int maks=0;
	
	ifstream dosya("sentence.txt");
	int i=0,j=0;	

	while(!dosya.eof())
	{
		getline(dosya,cumle);
		while(cumle[i]!='\0'){
			
			while(cumle[i] != char(32) && cumle[i]!='\0'){
			kelime = kelime + cumle[i];
			i++;
			}
			if(uzunluk(kelime)>maks){
				
				maks=uzunluk(kelime);
				max = kelime;
			}
			if(cumle[i] == char(32)){
				i++;
			}
			kelime="";
		}
		print(max);
		cout<<endl;
		i=0;
		maks=0;
	}
	
	dosya.close();
}

void print(string a)
{
	for(int i=0;a[i]!='\0';i++)
	{
		for(int j=0;j<i;j++)
		{
			cout<<"*";
		}
		cout<<a[i]<<" ";
	}
	cout<<endl;
}

int uzunluk(string a)
{
	int i;
	for(i=0;a[i]!='\0';i++){
		
	}
	return i;
}
