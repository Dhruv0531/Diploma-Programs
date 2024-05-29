#include <stdio.h> 
#include<stdlib.h>
#include <math.h>
#define MAX_SIZE 1000

//function to implement tower of hanoi using recursive stack
void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
{ 
    if (n == 1) 
    { 
        printf("\n Move disk 1 from rod %c to rod %c", from_rod, to_rod); 
        return; 
    } 
    towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
    printf("\n Move disk %d from rod %c to rod %c", n, from_rod, to_rod); 
    towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
}

//function to implement hailstone sequence using recursive stack
void hailstoneSequence(int n) 
{ 
    printf("%d ", n); 

    // Base case 
    if (n == 1) 
        return; 
  
    // If n is even then divide it by 2 
    if (n % 2 == 0) 
        hailstoneSequence(n / 2); 
  
    // Else multiply it by 3 and add 1 
    else
        hailstoneSequence(3 * n + 1); 
}

//function to implement Fibonacci series using recursive stack
int fibonacci(int n) 
{ 
    if (n <= 1) 
        return n; 
    return fibonacci(n-1) + fibonacci(n-2); 
} 

//menu driven function
int main() 
{ 
    int choice, n;
    char from_rod = 'A', to_rod = 'C', aux_rod = 'B'; 
    
    
    //displaying menu 
    while(1)
    { printf("\nMENU");
      printf("\n1. Tower of Hanoi \n2. Hailstone sequence \n3. Fibonacci series \n4. Exit");
      printf("\nEnter your choice: ");
      scanf("%d", &choice);
    
      //performing a task depending on the choice made by the user
     
      switch(choice)
     {
        case 1:
            printf("\nEnter the number of disks: "); 
            scanf("%d", &n);
            towerOfHanoi(n, from_rod, to_rod, aux_rod); 
            break;
            
        case 2:
            printf("\nEnter the number: ");
            scanf("%d", &n);
            hailstoneSequence(n);
            break;
            
        case 3:
            printf("\nEnter the number of terms: ");
            scanf("%d", &n);
            printf("Fibonacci Series: "); 
            for (int i = 0; i < n; i++) 
            {
                printf("%d ", fibonacci(i));
            } 
            break;
            
        case 4:
            exit(0);
            break;
            
        default:
            printf("\nInvalid choice! Try again.");
      }
    }
    return 0;
}