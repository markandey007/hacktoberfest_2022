#include <stdio.h>
#include <limits.h>
int main(void) {
	// your code goes here
	int total,min;
	scanf("%d",&total);
	int arr[3];
	for(int i=0;i<total;i++){
        fflush(stdin);
        scanf("%d%d%d%d",&arr[0],&arr[1],&arr[2]);
        min=arr[0];
        if(min<arr[i])
        min=arr[i];
        printf("%d\n",min);
	}
	return 0;
}

