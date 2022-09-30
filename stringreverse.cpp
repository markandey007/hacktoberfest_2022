/*!
 * --Simple code to reverse a string 
 *
 * Author: Anshuman Das(https://github.com/ANSHUMANDAS1506)
 * Date:1/10/2022
 * 
 */
#include <bits/stdc++.h>
using namespace std;
 

void stgreverse(string st)//Intialising function 
{
  for (int i = st.length() - 1; i >= 0; i--)//decrement of 'i' from (0 to string length-1) and displaying it
        cout << st[i];//displaying the charaacter at the ith index and then decrementing
}
 
int main()
{
    string st;
    cout<<"enter text\n";
    cin >> st;
    stgreverse(st);
    return 0;
}

   