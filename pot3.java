void main () {

    int resultado=1, expoente=0;

    while(expoente<=15){
        IO.println("3^" + expoente + " = " + resultado);
        resultado = resultado * 3;
        expoente++;
    }
    }