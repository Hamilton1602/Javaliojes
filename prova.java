/*Elabore um programa em Java 25 (utilizando a estrutura simplificada, sem classes explicitas) para monitorizar a eficiência de
uma máquina numa linha de produção industrial através do número de peças defeituosas encontradas por lote. O programa
deve funcionar da seguinte forma:
• Estrutura de Repetição e Atribuição: O programa deve solicitar ao utilizador a quantidade de peças defeituosas
(número inteiro) encontradas em vários lotes inspecionados. A leitura deve ser interrompida imediatamente quando
o utilizador introduzir um valor negativo (ex: -1).
• Processamento: Durante a leitura, o programa deve acumular o total de peças defeituosas encontradas e contar
quantos lotes foram analisados.
• Estrutura Condicional: Ao encerrar a repetição (quando for digitado um número negativo), o programa deve calcular
a média de peças defeituosas por lote (Total de Defeitos / Lotes Analisados) e exibir uma classificação sobre o
estado da máquina:
◦ Se a média for menor ou igual a 2 peças: "Máquina Regulada (Excelente)"
◦ Se a média for entre 2.1 e 5 peças: "Alerta: Necessita de Manutenção Preventiva"
◦ Se a média for maior que 5 peças: "Paragem Crítica: Máquina Danificada"*/

void main () {
    int defeitos = Integer.parseInt(IO.readln("Informe a quantidade de peças defeituosas em 3 lotes: "));

    if (defeitos < 0) {
    System.out.println("Número negativo inserido.");
}



}