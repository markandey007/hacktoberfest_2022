#include<stdio.h>
int main()
{
	int n[100],a,i,sum=0;
	printf("Enter no.of elements: ");
	scanf("%d",&a);
	printf("Enter array elements\n");
	for(i=0;i<a;i++)
	{
		scanf("%d",&n[i]);
	}
	printf("printing array elements\n");
	for(i=0;i<a;i++)
	{
		printf("%d ",n[i]);
	}
	printf("\naddition of array elements is\n");
	for(i=0;i<a;i++)
	{
		sum+=n[i];
	}
	printf("%d ",sum);
}
