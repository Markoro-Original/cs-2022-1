#include <stdio.h>

int main()
{
    
    double saldo;
    
    printf("Informe o valor do saldo: ");
    scanf("%lf", &saldo);
    printf("Saldo com reajuste de 15%%: %.2lf", saldo+(saldo*0.15));
    
    return 0;
}
