void main () {

    for (int celsius=10; celsius <= 100; celsius = celsius + 10){
        IO.println(celsius + " graus Celsius é igual a " + ((9*celsius + 160) /5) + " graus Fahrenheit");
    }
}