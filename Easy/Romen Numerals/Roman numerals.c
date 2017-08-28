#include<stdio.h>

int main()
{
	int sayi,a,b,c,d;
	printf("En fazla 3999 sayisini girebilirsiniz !!!\n\n");
	printf("Roma rakamina cevrilmesini istediginiz sayiyi giriniz : ");scanf("%d",&sayi);
	
	
	a=sayi/1000;
	b=(sayi%1000)/100;
	c=((sayi%1000)%100)/10;
	d=((sayi%1000)%100)%10;
	
	if(sayi<4000)
	{
		switch(a)
		{
			case 1: printf("M");break;
			case 2: printf("MM");break;
			case 3: printf("MMM");break;
		}	
		switch(b)
		{
			case 1: printf("C");break;
			case 2: printf("CC");break;
			case 3: printf("CCC");break;
			case 4: printf("CD");break;
			case 5: printf("D");break;
			case 6: printf("DC");break;
			case 7: printf("DCC");break;
			case 8: printf("DCCC");break;
			case 9: printf("CM");break;
		}
		switch(c)
		{
			case 1: printf("X");break;
			case 2: printf("XX");break;
			case 3: printf("XXX");break;
			case 4: printf("XL");break;
			case 5: printf("L");break;
			case 6: printf("LX");break;
			case 7: printf("LXX");break;
			case 8: printf("LXXX");break;
			case 9: printf("XC");break;
		}
		switch(d)
		{
			case 1: printf("I");break;
			case 2: printf("II");break;
			case 3: printf("III");break;
			case 4: printf("IV");break;
			case 5: printf("V");break;
			case 6: printf("VI");break;
			case 7: printf("VII");break;
			case 8: printf("VIII");break;
			case 9: printf("IX");break;
		}
	}
	else
	{
		printf("4000 den buyuk bir sayi girerek programi sonlandirdiniz.");
	}
	
	
	
	
}

