//LINEAR SEARCH
#include<stdio.h>
#include<stdlib.h>
#define max 10

main()
{
    int a[max],n,i,key,index;

    printf("\nEnter N(<%d):",max);
    scanf("%d",&n);

    printf("\nEnter %d Elements:",n);
    for(i=0;i<n;i++)  scanf("%d",&a[i]);

    printf("\nEnter the Key value to search:");
    scanf("%d",&key);

    for(i=0;i<n;i++)
    {
        if(a[i]==key)
        {
            index=i;
            break;
        }
    }

    if(a[i]==key)
        printf("\n%d Found at Index %d",key,i);
    else  
        printf("\nElement Not Found");
}