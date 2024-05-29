#include <stdio.h>

int factorial(int n);

int main()
{
    int num, result;
    printf("Enter a number: ");
    scanf("%d", &num);
    if (num < 0)
    {
        printf("Factorial of negative number doesn't exist.");
    }
    else
    {
        result = factorial(num);
        printf("Factorial of %d = %ld", num, result);
    }
    return 0;
}

int factorial(int n)
{
    if (n == 0 || n == 1)
    {
        return 1;
    }
    else
    {
        return (n * factorial(n - 1));
    }
}