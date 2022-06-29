#include <stdio.h>

int main()
{
    double sm = 1045.00;
    double salario;
    
    printf("Informe seu salário: ");
    scanf("%lf", &salario);
    
    printf("Usuário ganha o equivalente a %.2lf salários mínimos.", salario/sm);
    
    return 0;
}
