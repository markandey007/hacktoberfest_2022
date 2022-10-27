#include<bits/stdc++.h>
using namespace std;

int findLCM(int m, int n)
{
	int ans = 1;

	if (m > n)
		swap(m, n);

	for (int i = m; i <= n; i++)
	{
		ans = (ans * i)/ __gcd(ans, i);
	}
	return ans;
}

int main()
{
	int m, n;
	cout<<"Please enter two numbers : ";
	cin >> m >> n;
	cout <<findLCM(m, n)<<" is the smallest number divisible by all the numbers from "<<m<<" to "<<n<<endl;
	return 0;
}
