//BINARY SEARCH
#include<stdio.h>
#include<stdlib.h>
#define max 10

main()
{
    int a[max],i,n,high,low,mid,key;

    printf("\nEnter N(<%d):",max);
    scanf("%d",&n);

    printf("\nEnter %d Elements:",n);
    for(i=0;i<n;i++)    scanf("%d",&a[i]);

    printf("\nEnter Key Value to search:");
    scanf("%d",&key);

    low=0;
    high=n-1;

    while(low<=high)
    {
        mid=(low+high)/2;
        if(a[mid]>key)          low=mid+1;
        else if (a[mid]>key)    high=mid-1;
        else break;
    }

    if(a[mid]==key)
        printf("\n%d is found at Index %d",key,mid);
    else   
        printf("\nElement Not Found");
}