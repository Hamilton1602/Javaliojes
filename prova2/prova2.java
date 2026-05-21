void main() {
    int totaldefeitos = 0;
    int totallotes = 0;

    while (true) {
        System.out.print("Quantas peças defeituosas encontrou no lote " + (totallotes + 1) + " (ou digite -1 para sair)? ");
        int defeitos = Integer.parseInt(System.console().readLine());

        if (defeitos < 0) {
            break;
        }

        totaldefeitos += defeitos;
        totallotes++;
    }

    if (totallotes == 0) {
        System.out.println("Aviso: Não inseriu dados nenhum.");
    } else {
        float media = (float) totaldefeitos / totallotes;
        System.out.println("Lotes analisados: " + totallotes);
        System.out.println("Média de defeitos: " + media);
        System.out.print("Resultado: ");

        if (media <= 2) {
            System.out.println(" Máquina Regulada (Excelente)");
        } else if (media <= 5) {
            System.out.println(" Alerta: Necessita de Manutenção Preventiva");
        } else {
            System.out.println(" Paragem Crítica: Máquina Danificada");
        }
    }
}