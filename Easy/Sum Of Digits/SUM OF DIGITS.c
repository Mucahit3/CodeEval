#include<stdio.h>
#include<math.h>
int main()
{
	int sayi,a,b,c;
	printf("Sayi giriniz : ");scanf("%d",&sayi);
	a=sayi/100;
	b=(sayi%100)/10;
	c=(sayi%100)%10;
	
	printf("%d",a+b+c);
}
