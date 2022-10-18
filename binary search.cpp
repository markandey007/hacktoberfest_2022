#include<bits/stdc++.h>
using namespace std;
int binarysearch(vector<int>&arr,int n,int k)
{

    int s=0;
    int e=n;
    int mid=(s+e)/2;
    while(s<=e)
    {
        if(k==arr[mid])
            return mid;
        if(k>arr[mid])
        {
            s=mid+1;

        }
        else
        {
            ans=mid;
            e=mid-1;
        }
        mid=(s+e)/2;
    }
    return ans;
}
int main()
{   int s=0;
    int arr[]={1,2,4,5,6,7,8};
    int s=binarysearch(arr,7,1);
    cout<<s;

}
