void main () {
    String continua="5", comodo;
    float largura, comprimento, areaTotal=0;

    while (continua.toUpperCase()=="5"){
        comodo = IO.readln("informe o nome do comodo: ");
        largura = Float.parseFloat(IO.readln("Informe a largura do(a) " + comodo + ": "));
        comprimento = Float.parseFloat(IO.readln("Informe o comprimento do(a) " + comodo + "; "));
        areaTotal = areaTotal + largura*comprimento;
        continua = IO.readln("Deseja continuar (S/N)?: ");

    }
    IO.println("A área total da casa é: " + areaTotal);
}