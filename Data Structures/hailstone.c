#include <stdio.h>

int main()
{
    int n, hailstone;
    printf("Enter a number: ");
    scanf("%d", &n);

    hailstone = n;

    printf("Hailstone sequence for %d: \n", n);
    printf("%d\n", hailstone);

    while (hailstone != 1)
    {
        if (hailstone % 2 == 0)
        {
            hailstone = hailstone / 2;
        }
        else
        {
            hailstone = (hailstone * 3) + 1;
        }

        printf("%d\n", hailstone);
    }

    return 0;
}