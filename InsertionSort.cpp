//c++ program for insertion sort
//Contribution to HACKTOBERFEST_2022

#include<bits/stdc++.h>
using namespace std;

//function to implement insertion sort

void insertionSort(int arr[], int n){
    int i, key, j;
    
    for(i=1;i<n;i++){

        //looping to access the elements

        key=arr[i];
        j=i-1;
        
        //applying insertion sort logic

        while(j>=0&&arr[j]>key){

            arr[j+1]=arr[j];
            j=j-1;

        }
        arr[j+1]=key;

    }

}

//function to print the array elements

void print(int arr[],int n){
    int i;
    for(i=0;i<n;i++){
      cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main(){
    int arr[]={-2,-8,10,2,100,-9};
    int size=sizeof(arr)/sizeof(arr[0]);
    cout<<"Array before insertion sort:\n";
    print(arr,size);
    cout<<"Array after insertion sort:\n";
    insertionSort(arr,size);
    print(arr,size);
    return 0;
}