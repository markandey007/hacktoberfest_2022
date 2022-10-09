//Calculates a^b
//Time Complexity - log(b), Space Complexity - O(1)
#include <bits/stdc++.h>
#define int long long
using namespace std;
int mod = 1e9+7;

int fastModExponentiation(int a, int b)
{
    int ans=1;
    while(b>0)
    {
        if(b&1){
            ans=(ans*a)%mod;
        }
        b=b>>1;
        a=(a*a)%mod;
    }
    return ans;
}

signed main()
{
    cin.tie(NULL);
    cout.tie(NULL);
    int a, b;
    cin>>a>>b;
    cout<<fastModExponentiation(a,b);
    return 0;
}
