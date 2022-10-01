#include <bits/stdc++.h>
using namespace std;

void shellSort(int nums[], int n)
{
    for (int gap = n / 2; gap > 0; gap /= 2)
    {
        for (int i = gap; i < n; i += 1)
        {
            int j;
            int temp = nums[i];
            for (j = i; j >= gap && nums[j - gap] > temp; j -= gap)
            {
                nums[j] = nums[j - gap];
            }
            nums[j] = temp;
        }
    }
}

int main()
{
    int n;
    cin >> n;

    int nums[n];
    for (int i = 0; i < n; i++)
    {
        cin >> nums[i];
    }

    shellSort(nums, n);

    for (int i = 0; i < n; i++)
    {
        cout << nums[i] << " ";
    }
    cout << endl;

    return 0;
}
