#include <stdio.h>

int main()
{
    printf("Média aritmética de 8, 9 e 7: %d \n", (8+9+7)/3);
    printf("Média aritmética de 4, 5 e 6: %d \n", (4+5+6)/3);  
    printf("Soma das duas médias: %d \n", (8+9+7)/3+(4+5+6)/3);
    printf("Média das médias: %.1f \n", ((8+9+7)/3+(4+5+6)/3)/2);

    return 0;
}
