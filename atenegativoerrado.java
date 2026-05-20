void main () {

    int valor = Integer.parseInt(IO.readln("Informe um valor: "));

    if (valor>=0){
        int maior=valor;
        int menor=valor;
    }
    while (valor>=0){ 
        valor = Integer.parseInt(IO.readln("Informe um valor: "));
        if (valor>=0) {
            if (valor>=maior)
                maior=valor;
            if (valor<=menor)
                menor=valor;
        else
            break;
    
        }
    }

    IO.println("O maior valor é: " + maior);
    IO.println("O menor valor é: " + menor);

}