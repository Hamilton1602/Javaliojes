void main() {
    float nota1 = Float.parseFloat(IO.readln("informe a nota da 1aunidade"));
    float nota2 = Float.parseFloat(IO.readln("informe a nota da 2a unidade"));
    float nota3 = Float.parseFloat(IO.readln("informe a nota da 3a unidade"));

float media = (nota1 + nota2 + nota3) /3;

if (media>=7)
    System.out.prinf(Aprovado com média %.2f \n", media);
else
    System.out.printf("Reprovado com média %.2f \n", media);
}