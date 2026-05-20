void main() {
    
    int soma=0;
    
    for (int contador=1; contador <=500; contador++){
        if (contador % 2 == 0)
        soma = soma + contador;
    }
    IO.println("A soma dos 500 primeiros números é: " + soma);
}