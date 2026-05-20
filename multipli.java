void main () {

    int numero = Integer.parseInt(IO.readln("Informe um número: "));
    
    for (int multiplicador=1; multiplicador<=10; multiplicador++)
        System.out.printf("%3d x %3d = %3d \n", numero, multiplicador, numero*multiplicador);
}