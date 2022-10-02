/*
Author: Arijit Ghosh(rancho2002)
Question: HackerRank
*/



#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

//Complete the following function.


void calculate_the_maximum(int n, int k) {
  //Write your code here.
  int i,j,l,and,or,xor,max1,max2,max3;
  max1=max2=max3=0;
  int arr[n];
  for(int x=0;x<n;x++){
      arr[x]=x+1;
  }
  for(i=0;i<n;i++){
      for(j=0;j<n;j++){
        if(i!=j){
         and= arr[i]&arr[j];
        //  printf("a= %d b= %d %d\n",arr[i],arr[j],and);
         or=arr[i]|arr[j];
         xor=arr[i]^arr[j];

         if(and<k && max1<and){
             max1=and;
         }
         if(or<k && max2<or){
             max2=or;
             
         }
         if(xor<k && max3<xor){
             max3=xor;
             
         }
        }
      }

  }
  
  printf("%d\n%d\n%d",max1,max2,max3);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}


//! Status : Solved:)