/* Find shortest path using floyd warshall algorithm */

#include<iostream.h>
#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
class path
{
	int n;
		int p[10][10];
		int a[10][10];
		int c[10][10];
	public:
		void get();
		void pm();
		void ap();
		void disp();
};
void path::get()
{
	int i,j,k;
	clrscr();
	cout<<"Enter the no. of nodes in the graph :";
	cin>>n;
	cout<<"
Enter the adjacency matrix :
";
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
		    //	cout<<"a["<<i<<","<<j<<"] = ";
			cin>>a[i][j];
			p[i][j]=0;
		}
	}
	cout<<"

Enter The cost matrix is :

";
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
		   //	cout<<"a["<<i<<","<<j<<"] = ";
			cin>>c[i][j];
		}
	}
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{

				p[i][j]=a[i][j];

		}
	}
}
void path::disp()
{
//	cout<<"

 The output matrix for the given graph is :
";
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			cout<<p[i][j]<< "	";
		}
		cout<<endl;
}
}

void path::pm()
{
	int i,j,k;

	for(k=1;k<=n;k++)
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				p[i][j]=p[i][j] || p[i][k] && p[k][j];
			}
		}
	}

}
void path::ap()
{
	int i,j,k;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{

				p[i][j]=c[i][j];

		}
	}
	for(k=1;k<=n;k++)
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(p[i][j]<p[i][k]+p[k][j])
				{
					p[i][j]=p[i][j];
				}
				else
				{
				p[i][j]=p[i][k]+p[k][j];
				}
			}
		}
	}
}
void main()
{
path p;
p.get();
p.pm();
cout<<"path matrix is :
";
p.disp();
getch();
p.ap();
cout<<"all pair shortest  path matrix is :
";
p.disp();
getch();
}
