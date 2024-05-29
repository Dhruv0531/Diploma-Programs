#include<stdio.h>
#include<stdlib.h>
#define MAXSIZE 10

//declare the stack
int stack[MAXSIZE];
int top=-1;

//declare the functions
void push(int);
int pop();
void display();

void tower_of_hanoi(int, char, char, char);
void hailstone_sequence(int);
int fibonacci(int);

int main()
{
	int choice, n;
	
	while(1)
	{
		printf("\n\nMenu\n1. Tower of Hanoi\n2. Hailstone Sequence\n3. Fibonacci Series\n4. Exit\n\nEnter your choice : ");
		scanf("%d", &choice);

		switch(choice)
		{
			case 1: printf("\n\nEnter the number of disks : ");
					scanf("%d", &n);
					tower_of_hanoi(n, 'A', 'C', 'B');
					break;
			
			case 2: printf("\n\nEnter the number : ");
					scanf("%d", &n);
					hailstone_sequence(n);
					break;

			case 3: printf("\n\nEnter the number : ");
					scanf("%d", &n);
					printf("\nFibonacci Series : ");
					for(int i=0; i<n; i++)
						printf("%d ", fibonacci(i));
					break;
			
			case 4: exit(0);
			
			default: printf("\n\nInvalid Choice\n\n");
					 break;
		}
	}
	return 0;
}

//push the elements
void push(int n)
{
	if(top == MAXSIZE-1)
		printf("\n\nStack Overflow\n\n");
	else
	{
		top++;
		stack[top] = n;
	}
}

//pop the elements
int pop()
{
	int data;
	
	if(top == -1)
		printf("\n\nStack Underflow\n\n");
	else
	{
		data = stack[top];
		top--;
		return data;
	}
}

//display the elements
void display()
{
	if(top == -1)
		printf("\n\nStack Empty\n\n");
	else
	{
		printf("\n\nElements in the Stack : ");
		for(int i=top; i>=0; i--)
			printf("\n%d ", stack[i]);
		printf("\n\n");
	}
}

void tower_of_hanoi(int n, char source, char aux, char dest)
{
	if(n == 1)
		printf("\nMove disk 1 from %c to %c\n", source, dest);
	else
	{	
		tower_of_hanoi(n-1, source, dest, aux);
		printf("\nMove disk %d from %c to %c\n", n, source, dest);
		tower_of_hanoi(n-1, aux, source, dest);
	}
}

void hailstone_sequence(int n)
{
	push(n);
	
	while(n != 1)
	{	
		if(n % 2 == 0)
			n = n/2;
		else
			n = 3*n + 1;
		push(n);
	}
	
	printf("\nHailstone Sequence : ");
	display();
}

int fibonacci(int n)
{
	if(n == 0)
		return 0;
	else if(n == 1)
		return 1;
	else
		return(fibonacci(n-1) + fibonacci(n-2));	
}