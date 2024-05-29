//BUBBLE SORT
#include<stdio.h>

#define max 10

main()
{
    int a[max],i,n,pass,temp,exch=0,compare=0;

    printf("\nEnter N(<%d):",max);
    scanf("%d",&n);

    printf("\nEnter %d Elements:",n);
    for(i=0;i<n;i++)    scanf("%d",&a[i]);

    for(pass=1;pass<n;pass++)
    {    
        for(i=0;i<n-pass;i++)
        {
            compare++;
            if(a[i]>a[i+1])
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
            exch++;
        }
    }

    printf("\nThe Sorted List is:");     
    for(i=0;i<n;i++)  printf("\t%d",a[i]);
    
    printf("\nThe Values are compare in %d ",compare);
    printf("\nThe Values are exchange in %d ",exch);
}