#include<stdio.h>
#include<stdlib.h>
#define max 5

typedef struct
{
    int que[max];
    int front,rear;
}Queue;

main()
{
    Queue q;
    int ch;
    q.front=q.rear=-1;

    while(1)
    {
        printf("\n1.Insert \n2.Delete \n3.Display \n4.Exit");
        printf("\nEnter your choice:");
        scanf("%d",&ch);

        switch(ch)
        {
            case 1: insert(&q);     break;
            case 2: del(&q);        break;
            case 3: display(&q);    break;
            case 4: exit(0);
        }
    }
}

insert(Queue *q)
{
    int item;
    if(q->rear=max-1)
    {
        printf("\nQueue is Full");
        return;
    }
    printf("\nEnter item to insert:");
    scanf("%d",&item);

    q->que[++q->rear]=item;
    if(q->front==-1)    
        q->front=0;
}

del(Queue *q)
{
    
    if(q->front==-1)
        printf("\nQueue is Empty");
    else
        printf("\nItem Deleted is %d",q->que[que->front++]);
    
    if(q->front==q->rear+1)
        q->front=q->rear=-1;
}

display(Queue *q)
{
    int i;
    if(q->front==-1)
        printf("\nQueue is Empty");
    else
        for(i=q->front;i<=q->rear;i++)      
            printf("\t %d",q->que[i]);
}