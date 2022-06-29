#include <stdio.h>

int main()
{
    
    double ipi, valor1, quant1, valor2, quant2;
    char cod1 [5], cod2 [5];
    
    printf("Informe a porcentagem do IPI a ser acrescido: ");
    scanf("%lf", &ipi);
    printf("Informe o código da peça 1: ");
    scanf("%s", cod1);
    printf("Informe o valor da peça 1: ");
    scanf("%lf", &valor1);
    printf("Informe a quantidade de peças 1: ");
    scanf("%lf", &quant1);
    printf("Informe o código da peça 2: ");
    scanf("%s", cod2);
    printf("Informe o valor da peça 2: ");
    scanf("%lf", &valor2);
    printf("Informe a quantidade de peças 2: ");
    scanf("%lf", &quant2);
    
    printf("O valor total a ser pago é: %.2lf", (valor1*quant1+valor2*quant2)*((ipi/100)+1));
    
    return 0;
}
