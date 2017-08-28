#include<stdio.h>

int main()
{
	int N,M,a,b;
	printf("Modu alinacak sayiyi giriniz : ");scanf("%d",&N);
	printf("\nHangi sayiya gore mod almak istediginizi giriniz(0 Girmemelisiniz ! ! !) : ");scanf("%d",&M);
	
	if(M==0)
	{
		printf("Programa 0 girerek programi sonlandirdiniz.");
	}
	
	a=N/M;
	b=N-(a*M);
	
	printf("Kalan = %d",b);
	
}

