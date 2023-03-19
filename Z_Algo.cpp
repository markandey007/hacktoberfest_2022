/*
Time Complexity -> O(Pattern length + Text Length)
*/

#include <bits/stdc++.h>
using namespace std;

vector<int> z_array(string &str)
{
    int len = str.size();
    int l = 0, r = 0;
    vector<int> z(len, 0);
    // 1<=l<=i<=r --> ALWAYS  satisfy
    for (int i = 1; i < len; i++)
    {
        if (i > r)
        {
            // we have to calculate for this range
            l = r = i;
            while (r < len and str[r] == str[r - i])
            {
                r++;
            }
            z[i] = r - l;
            r--;
        }
        else if (i <= r)
        {
            // means it possible to have inside the range
            int rel_idx = i - l;
            // chceking for inseide the range
            if (i + z[rel_idx] <= r)
            {
                // then we can use previous
                z[i] = z[rel_idx];
            }
            else
            {
                // then we have to change the range
                l = i;
                while (r < len and str[r] == str[r - l])
                {
                    r++;
                }
                z[i] = r - l;
                r--;
            }
        }
    }
    return z;
}
auto z_algo(string &pat, string &txt)
{
    string str = pat + '$' + txt;
    vector<int> z = z_array(str);
    for (int i = 0; i < z.size(); i++)
    {
        if (z[i] == pat.size())
        {
            cout << i - pat.size() - 1 << " ";
        }
    }
}

int main()
{
    string pat, txt;
    cin >> pat >> txt;
    z_algo(pat, txt);
    return 0;
}
