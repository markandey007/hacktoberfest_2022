#include<bits/stdc++.h>
using namespace std;

const int N = 1e5 + 1;
int a[N];


// L = l ..... mid || R = mid+1 ...... r
int merge(int l, int mid, int r){
	int inversions = 0;
	int left_size = mid - l + 1;
	
	int right_size = r - (mid+1) + 1;	// r - mid
	
	int L[left_size];
	int R[right_size];
	
	for(int i = 0;i<left_size;i++){
		L[i] = a[l + i ]; // array starting from l to mid
	}
	for(int i =0;i<right_size;i++){
		R[i] = a[mid + 1 + i]; // array starting from r to mid+1
	}

	int left_index = 0;
	int right_index = 0;
	int index = l;
	
	while(left_index<left_size && right_index<right_size){
		if(L[left_index]<=R[right_index]){
			a[index] = L[left_index];
			left_index++;
		}
		else if(L[left_index]>R[right_index]){
			a[index] = R[right_index];
			right_index++;
			inversions+=(left_size-left_index);
		}
		index++;
	}
	
	
	while(left_index!=left_size){
		a[index] = L[left_index];
		left_index++;
		index++;	
	}
	
	while(right_index!=right_size){
		a[index] = R[right_index];
		right_index++;
		index++;
	}
	return inversions;
	
}

int merge_sort(int l,int r){
	if(l==r) 
		return 0;
	int inversions = 0;
	
	int mid = (l + r) / 2;
	
      inversions+=merge_sort(l,mid); 
	
	inversions+=merge_sort(mid+1,r);
	
	
	inversions+=merge(l,mid,r);
	
	return inversions;
	
}

int main()
{
	int n;
	cin>>n;
	
	for(int i =0;i<n;i++){
		cin>>a[i];
	}
	
	int ans = merge_sort(0,n-1);
	
	cout<<ans;
	
}
#include<bits/stdc++.h>
using namespace std;

const int N = 1e5 + 1;
int a[N];


// L = l ..... mid || R = mid+1 ...... r
int merge(int l, int mid, int r){
	int inversions = 0;
	int left_size = mid - l + 1;
	
	int right_size = r - (mid+1) + 1;	// r - mid
	
	int L[left_size];
	int R[right_size];
	
	for(int i = 0;i<left_size;i++){
		L[i] = a[l + i ]; // array starting from l to mid
	}
	for(int i =0;i<right_size;i++){
		R[i] = a[mid + 1 + i]; // array starting from r to mid+1
	}

	int left_index = 0;
	int right_index = 0;
	int index = l;
	
	while(left_index<left_size && right_index<right_size){
		if(L[left_index]<=R[right_index]){
			a[index] = L[left_index];
			left_index++;
		}
		else if(L[left_index]>R[right_index]){
			a[index] = R[right_index];
			right_index++;
			inversions+=(left_size-left_index);
		}
		index++;
	}
	
	
	while(left_index!=left_size){
		a[index] = L[left_index];
		left_index++;
		index++;	
	}
	
	while(right_index!=right_size){
		a[index] = R[right_index];
		right_index++;
		index++;
	}
	return inversions;
	
}

int merge_sort(int l,int r){
	if(l==r) 
		return 0;
	int inversions = 0;
	
	int mid = (l + r) / 2;
	
      inversions+=merge_sort(l,mid); 
	
	inversions+=merge_sort(mid+1,r);
	
	
	inversions+=merge(l,mid,r);
	
	return inversions;
	
}

int main()
{
	int n;
	cin>>n;
	
	for(int i =0;i<n;i++){
		cin>>a[i];
	}
	
	int ans = merge_sort(0,n-1);
	
	cout<<ans;
	
}
