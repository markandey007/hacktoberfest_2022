#include <iostream>
using namespace std;

int binarySearch( int *arr, int s, int e,  int key){

    //base case
    if(s>e)
        return -1;

    int mid = s + (e-s)/2;

    if(arr[mid] == key){
        return mid;
    }
    else if( arr[mid] < key){
        return binarySearch(arr, mid+1 , e, key);
    }
    else{
        return binarySearch(arr, s, mid-1, key);
    }

}

int main(){
    int arr[6] = {2,3,4,5,6,7};
    int size = 6;
    int key = 3;

    cout<<binarySearch(arr, 0, size, key)<<endl;

}

