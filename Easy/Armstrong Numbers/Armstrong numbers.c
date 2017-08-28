#include<stdio.h>

int main()
{
	//Armstrong numaralari
	// Duz mantikla yaptim daha kolay ve kisa olabilir program
	
	int sayi,a,b,c,d,basamak,carpim;
	printf("En fazla 4 basamak girebilirsiniz ! ! !\n\n");
	printf("Kac basamakli sayi gireceksiniz : ");scanf("%d",&basamak);
	printf("Kontrol edilmesini istediginiz sayiyi giriniz : ");
	scanf("%d",&sayi);
	
	a=sayi/1000;
	b=(sayi%1000)/100;
	c=((sayi%1000)%100)/10;
	d=((sayi%1000)%100)%10;
	
	if(basamak==2)
	{
		carpim=d*d+c*c;
	}
	else if(basamak==3)
	{
		carpim=d*d*d+c*c*c+b*b*b;
	}
	else if(basamak==4)
	{
		carpim=d*d*d*d+c*c*c*c+b*b*b*b+a*a*a*a;
	}
	else if(basamak==1)
	{
		carpim=d;
	}
	else
	{
		printf("Lutfen maximum 4 basamakli bir sayi giriniz.");
	}
	
	if(carpim==sayi)
	{
		printf("True");
	}
	else
	{
		printf("False");
	}
	
}
