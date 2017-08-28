#include<stdio.h>

int main()
{
	//sayilari kucukten buyuge siralama
	
	int	gecicibellek;
	float dizi[5];
	for(int i=0;i<5;i++)
	{
		printf("%d. sayiyi giriniz : ",i+1);scanf("%f",&dizi[i]);
	}
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(dizi[i]<dizi[j])
			{
				gecicibellek=dizi[j];
				dizi[j]=dizi[i];
				dizi[i]=gecicibellek;
			}		
		}
		
	}
	for(int i=0;i<5;i++)
	{
		printf("%.3f  ",dizi[i]);
	}
	
	

	
	
}

