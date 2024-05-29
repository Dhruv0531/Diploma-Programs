#include<stdio.h>
#include<stdlib.h>
#define max 10

main()
{
    int a[max],n,i,ch,value,index;

    printf("\nEnter N(<%d):",max);
    scanf("%d",&n);

    printf("\nEnter %d Elements:",n);
    for(i=0;i<n;i++)  scanf("%d",&a[i]);
    
    while(1)
    {
        printf("\nArray Operators:");
        printf("\n1.Insertion\n2. Deletion\n3.Display\n4.Exit");
        printf("\nEnter Your Choice:");
        scanf("%d",&ch);
        
        switch(ch)
        {
            case 1: //Insertion
                    printf("\nEnter Value to insert and its index:");
                    scanf("%d%d",&value,&index);
                    for(i=n-1;i>=index;i--)  a[i+1]=a[i];
                    a[index]=value;
                    n++;
                    break;
            
            case 2: //Deletion
                    printf("\nEnter value to be deleted:");
                    scanf("%d",&value);
                    for(i=0;i<n;i++)
                    
                        if(a[i]==value)
                        {
                            index=i;
                            break;
                        }
                    for(i=index+1;i<n;i++)  a[i-1]=a[i];
                    n--;
                    break;
            
            case 3: //Display
                    for(i=0;i<n;i++)  printf("\t%d",a[i]);
                    break;
            
            case 4: exit(0);
        }
    }
}