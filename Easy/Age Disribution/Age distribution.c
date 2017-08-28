#include<stdio.h>

int main()
{	
	int yas;
	printf("How old are you : ");scanf("%d",&yas);
	
	if(yas>=0 && yas<=2)
	{
		printf("Still in Mama's arms");
	}
	else if(yas>=3 && yas<=4)
	{
		printf("Preschool Maniac");
	}
	else if(yas>=5 && yas<=11)
	{
		printf("Elementary school");
	}
	else if(yas>=12 && yas<=14)
	{
		printf("Middle School");
	}
	else if(yas>=15 && yas<=18)
	{
		printf("High School");
	}
	else if(yas>=19 && yas<=22)
	{
		printf("College");
	}
	else if(yas>=23 && yas<=65)
	{
		printf("Working for the man");
	}
	else if(yas>=66 && yas<=100)
	{
		printf("The Golden Years");
	}
	else
	{
		printf("This program for humans.");
	}
	
	
	
	
	
	
	
	
}
