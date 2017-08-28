#include<stdio.h>

int main()
{
	
	int sayi;
	printf("Cift mi Tek mi kontrol etmek istediginiz sayiyi giriniz : ");
	scanf("%d",&sayi);
	
	if(sayi>=0 && sayi<5000)
	{
		if(sayi%2==0)
		{
		    printf("1");
		}
		else
		{
            printf("0");
		}
	}
	else
	{
		printf("0 ile 5000 arasinda bir deger giriniz.");
	}
	
	
	
	
	
	
}

