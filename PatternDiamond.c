main()
{
  int n,i,j,tmp=1;
  scanf("%d", &n);
  tmp=n-1;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=tmp;j++)
      printf(" ");
    tmp--;
    for (j=1;j<=2*i-1;j++)
      printf("*");
    printf("\n");
  }
  tmp=1;
  for (i=1;i<=n-1;i++)
  {
    for (j=1;j<=tmp;j++)
      printf(" ");
    tmp++;
    for (j=1;j<=2*(n-i)-1;j++)
      printf("*");
    printf("\n");
  }
}
