/* f) Elaborar um progama que apresente como resultado o valor de uma potência de uma base qualquer elevada 
a um expoente qualquer, ou seja, de B, em que B é o valor da base e E o valor o expoente. Observe que neste 
exercício não pode ser utilizado o operador de exponenciação do valor portuguol (^).  */

void main() {
    int base = Integer.parseInt(IO.readln("Informe a base: "));
    int expoente = Integer.parseInt(IO.readln("Informe o expoente: "));

    int resposta = 1;
    for (int contador=1; contador<=expoente; contador++) {
        resposta = resposta * base;
    }
    IO.println(base + " elevado a " + expoente + " é igual a " + resposta);

}