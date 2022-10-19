main()
{
	int a,b,i=1;
	printf("Enter Number:");
	scanf("%d",&a);
	do
	{
		printf("%d * %d = %d\n",a,i,a*i);
		i++;
	}while(i<=10);
}
