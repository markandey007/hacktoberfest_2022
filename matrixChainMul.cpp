//minimum order of matrix
//dynamic programming
#include<bits/stdc++.h>
using namespace std;

int matrixChainOrder(int p[],int n)
{
    int m[n][n];
    for(int i=0;i<n;++i)
        m[i][i]=0;//cost for single matrix=0#principle diagonal

    //L=chain length
    for(int L=2;L<n;++L)
    {
         for(int i=1;i<n-L+1;++i)
         {
             int j=i+L-1;
             m[i][j]=INT_MAX;
             for (int k=i;k<=j-1;++k)
             {
                 //q=cost/scalar multiplication
                 int q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
                 if(q<m[i][j])
                    m[i][j]=q;
             }

         }


    }
    return m[1][n-1];//min matrix for matrix chain multiplication #i =1 always and j = n-1;



}

int main()
{
    int p[]={2,3,4,5};
    int n=sizeof(p)/sizeof(int);
    cout<<n<<endl;
    cout<<matrixChainOrder(p,n);
}


