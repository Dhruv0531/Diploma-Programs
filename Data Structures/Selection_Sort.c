//SELECTION SORT 
#include<stdio.h>
#include<stdlib.h>
#define max 10

main()
{
    int a[max],n,i,j,temp,compare=0,exch=0,k;

    printf("\nEnter N(<%d):",max);
    scanf("%d",&n);

    printf("\nEnter %d Elements:",n);
    for(i=0;i<n;i++)    scanf("%d",&a[i]);

    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n;j++)
        {
            compare++;
            if(a[i]<a[j])
            {
                exch++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        printf("\nIteration:%d",i+1);
        for(k=0;k<n;k++)    printf("\t%d",a[k]);
    
    }
    printf("\nElements Sorted List:");
    for(i=0;i<n;i++)    printf("\t%d",a[i]);

    printf("\nThe Values are compare in: %d",compare);
    printf("\nThe Values in exchange in: %d",exch);
}