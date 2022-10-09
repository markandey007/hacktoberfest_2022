//BUBBLE SORT - sort the array in ascending order..

#include <iostream>
#include <cmath>
#include <vector>
using namespace std;

int main()
{
    int temp, n;
    cout << "Enter length of array: ";
    cin >> n;
    int arr[n];
    cout << "Enter numbers: ";

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    /************ METHOD-1   O(n^2) (for all cases)  ************/ //"O"is bigOh notation
    // [ less adoptive, takes more time ]

    // for (int count = 0; count < n; count++)
    // {
        // cout<<"Pass "<<count<<" works"<<endl;

    // for (int i = 0; i < n - count - 1; i++)
    // {
    // if (arr[i] > arr[i + 1])
    // {
    // temp = arr[i];
    // arr[i] = arr[i + 1];
    // arr[i + 1] = temp;
    // }
    // }
    // }
    

    // /************ METHOD-2   O(n)(best case) <-> O(n^2)(worst case)  ************/
    // [ more adoptive, takes less time ]

    int isSorted ;   
    for (int count = 0; count < n; count++)
    {
        isSorted = 1;   //Let's assume it is sorted..
        // cout<<"Pass "<<count<<" works"<<endl;

        for (int i = 0; i < n - count - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                //If it is not sorted, then only this if works....So, isSorted=0(false),i.e, it is not sorted.
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                isSorted = 0;   
            }
        }

        if (isSorted)
        {
            //If isSorted=1(true),i.e, it is now sorted, then this if will run and loop will stop permanently.
            break;
        }
    }

    //After Bubble Sorting
    cout << "After Soring array: ";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << "  ";
    }
    cout << endl;

    return 0;
}
