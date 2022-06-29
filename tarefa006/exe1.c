#include <stdio.h>

int main()
{
    int anos, meses, dias;
    
    printf("Informe sua idade em anos, meses e dias.\n");
    printf("Anos: ");
    scanf("%d", &anos);
    printf("Meses: ");
    scanf("%d", &meses);
    printf("Dias: ");
    scanf("%d", &dias);
    printf("Idade em dias: %d", (anos*365)+(meses*30)+dias);

    return 0;
}