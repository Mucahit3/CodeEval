#include<stdio.h>
#include<math.h>
int main()
{
	//ilk 1000 asal sayinin toplamini veren program
	
	int a=0,toplam=0,c=0;
	for(int i=2;i<10000;i++)
	{
		a=0;
		for(int j=2;j<=sqrt(i);j++)
		{
			if(i%j==0)
			{
				a++;
			}
		}
		if(a==0)
		{
			toplam+=i;
			
			c++;
		}
		if(c==1000)
		{
			printf("%d\n",toplam);
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
