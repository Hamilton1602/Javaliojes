void main(){
    int numero = Integer.parseInt(IO.readln("informe seu numero: "));

    for (int multiplicador=1; multiplicador<=10; multiplicador++)
        System.out.printf("%d x %d = %d \n", numero, multiplicador, numero * multiplicador);
}
