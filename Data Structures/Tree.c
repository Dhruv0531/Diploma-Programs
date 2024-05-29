#include<stdio.h>
#include<stdlib.h>

typedef struct Node
{
    int data;
    struct Node *left,*right;
};

 struct Node *root=NULL,*newnode,*p,*q;

void create()
{
    int num;
    printf("\nEnter Data:");
    scanf("%d",&num);
    while(num!=-1)
    {
        newnode=(Node*)malloc(sizeof(Node));
        newnode->data=num;
        newnode->left=NULL;
        newnode->right=NULL;
        if(root==NULL)
        {
            root=newnode;
        }
        else
        {
            p=q=root;
            while(q!=NULL)
            {
                p=q;
                if(num<q->data)
                        q=q->left;
                else    
                        q=q->right;
            }
            if(num<p->data)
                p->left=newnode;
            else
                p->right=newnode;
        }
        scanf("%d",&num);
    }
}

void preorder(Node *root)
{
    if(root!=NULL)
    {
        printf("\t%d",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void inorder(Node *root)
{
    if(root!=NULL)
    {
        inorder(root->left);
        printf("\t%d",root->data);
        inorder(root->right);
    }
}

void postorder(Node *root)
{
    if(root!=NULL)
    {
        postorder(root->left);
        postorder(root->right);
        postorder(root->data);
    }
}

void main()
{
    int ch;
    while(1)
    {
        printf("\nMENU");
        printf("\n1.Create \n2.Preorder \n3.Inorder \n4.Postorder \n5.Exit");
        printf("\nEnter your choice:");
        scanf("%d",&ch);

        switch(ch)
        {
            case 1: create();           break;
            case 2: preorder(root);     break;
            case 3: inorder(root);      break;
            case 4: postorder(root);    break;
            case 5: exit(0);
        }
    }
}