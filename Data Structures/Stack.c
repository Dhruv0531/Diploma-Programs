//STACK
#include<stdio.h>
#include<stdlib.h>
#define max 5

typedef struct
{
    int stack[max];
    int top;
}stk;

main()
{
    int ch;
    stk s;

    s.top=-1;

    while(1)
    {
        printf("\nStack Operators:");
        printf("\n1.Push \n2.Pop \n3.Display \n4.Exit");
        printf("\nEnter Your Choice:");
        scanf("%d",&ch);

        switch(ch)
        {
            case 1: push(&s);
                    break;
            
            case 2: pop(&s);
                    break;
            
            case 3: display(&s);
                    break;

            case 4: exit(0);
        }
    }
}

push(stk *s)
{
    int item;

    if(s->top==max-1)   printf("\nStack is Full");

    printf("\nEnter Item:");
    scanf("%d",&item);

    s->stack[++s->top]=item;
}

pop(stk *s)
{
    if(s->top==-1)  
        printf("\nStack is Empty\n");
    else
        printf("\nItem Popped is:%d\n",s->stack[s->top--]);
}

display(stk *s)
{
    int i;

    if(s->top==-1)
        printf("\nStack is Empty\n");
    else
    for(i=s->top;i>0;--i)   
    printf("\n");
    printf("\n%d",s->stack[i]);
}