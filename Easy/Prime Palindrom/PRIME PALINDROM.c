#include<stdio.h>
#include<math.h>
int main()
{
	int a,b=0,c;
	for(int i=999;i>=0;i--)
	{
		a=i/100;
		c=i%10;
		if(a==c)
		{
			b=0;
			for(int j=2;j<=sqrt(i);j++)
			{
				if(i%j==0)
				{
					b++;
				}
			}
			if(b==0)
			{
				printf("%d\n",i);
				break;
			}
		}
	}
	
	
	
	
	
	
	
}
