package quarta;
void main (){
    var a = new int [10];
    var b = new int [10];

    IO.println("Vetor A: ");
    for (int cont=0;cont<10;cont++){
        a[cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        b[cont] = a [cont] * 3;
    }
    IO.println("Vetor B: ");
    for (int cont =0;cont<10;cont++)
        IO.println("B[" + (cont) + "]: " + b[cont]);
}