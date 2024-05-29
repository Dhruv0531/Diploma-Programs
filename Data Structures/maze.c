
#include<stdio.h>
#include<conio.h>
void main()
{
    int a[5][5]={{0,1,0,0,0},
                {0,1,0,1,0},
                {0,0,0,0,0},
                {0,1,1,1,0},
                {0,0,0,1,0}};
    int i,j,k=2,f=0;
    
    a[0][0]=1;
    while(i!=4 || j!=4)
    {
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
                printf("%d ",a[i][j]);
            printf("\n");
        }
        printf("\n");
        if(a[i+1][j]==0 && i+1<=4)
        {
            a[++i][j]=k++;
            f=1;
        }
        else if(a[i][j+1]==0 && j+1<=4)
        {
            a[i][++j]=k++;
            f=1;
        }
        else if(a[i-1][j]==0 && i-1>=0)
        {
            a[--i][j]=k++;
            f=1;
        }
        else if(a[i][j-1]==0 && j-1>=0)
        {
            a[i][--j]=k++;
            f=1;
        }
        else
            f=0;
        if(f==0)
            break;
    }
    if(f==0)
        printf("NO PATH");
    else
    {
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
                printf("%d ",a[i][j]);
            printf("\n");
        }
    }
    getch();
}