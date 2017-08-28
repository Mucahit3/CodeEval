#include<stdio.h>
#include<math.h>

int main()
{
	int x1,x2,y1,y2,a;
	double distance;
	printf("1. aracin koordinatlarini giriniz : ");scanf("%d%d",&x1,&y1);
	printf("2. aracin koordinatlarini giriniz : ");scanf("%d%d",&x2,&y2);
	
	a=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
	distance=sqrt(a);
	
	printf("Distance = %.2lf m",distance);
}
