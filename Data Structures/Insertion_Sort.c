//INSERTION SORT
#include<stdio.h>
#include<stdlib.h>
#define max 10

main()
{
    int a[max],n,i,j,temp,k,compare=0,exch=0;
    
    printf("\nEnter N(<%d):",max);
    scanf("%d",&n);

    printf("\nEnter %d Elements:",n);
    for(i=0;i<n;i++)    scanf("%d",&a[i]);
    
    for(i=1;i<n;i++)
    {
        for(j=0;j<1;j++)
        {
            compare++;
            if(a[i]<a[j])
            {
                temp=a[i];
                for(k=j-1;k>=j;k--)     a[k+1]=a[k];
                a[i]=temp;
                exch++;
                break;
            }
        }
    }

    printf("\nThe Sorted List is:");
    for(i=0;i<n;i++)    printf("\t%d",a[i]);

    printf("\nThe Values are compare in %d",compare);
    printf("\nThe Values are exchange in %d",exch);
}