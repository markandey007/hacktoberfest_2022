main()
{
	int base,power,res;
	scanf("%d",&base);
	scanf("%d",&power);
	res=pow(base,power);
	printf("Power of %d^%d is : %d",base,power,res);
}
int pow(int base,int power)
{
	if(power==0)
		return 1;
	else
		return base*pow(base,power-1);
}
