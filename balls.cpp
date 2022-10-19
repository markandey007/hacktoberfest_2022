#include<stdio.h>
int main()
{
	int n[100],a,i,prod=1;
	printf("Enter no.of balls: ");
	scanf("%d",&a);
	printf("Enter balls\n");
	for(i=0;i<a;i++)
	{
		scanf("%d",&n[i]);
	}
	printf("printing balls without symbols\n");
	for(i=0;i<a;i++)
	{
		if(n[i]>0)
		{
			printf("%d ",n[i]);
			prod*=n[i];
		}
	}
	printf("\nprinting product of values on balls :%d",prod);
}
