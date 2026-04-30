void main() {
    float batman = Float.parseFloat(IO.readln("Digite o valor de Batman: "));
    float superman = Float.parseFloat(IO.readln("Digite o valor de Superman: "));

    float resultado = batman / superman + batman;
    IO.println("O resultado é: " + resultado);