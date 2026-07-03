//Hamilton Santos Pessoa Júnior
int MAX_ALUNOS = 20;
String[] nomes = new String[MAX_ALUNOS];
float[] medias = new float[MAX_ALUNOS];
int totalAlunos = 0;

void main() {
    while (true) {
        System.out.println("\nMENU PRINCIPAL: GESTÃO DE TURMA");
        System.out.println("1 Cadastrar Alunos e Médias");
        System.out.println("2 Exibir Lista de Alunos e Notas");
        System.out.println("3 Buscar Aluno");
        System.out.println("4 Sair");
        System.out.print("Escolha uma opção: ");
        
        String entradaOpcao = System.console().readLine();
        
        if (!eInteiro(entradaOpcao)) {
            System.out.println("Opção inválida! Digite apenas um número de 1 a 4.");
            continue;
        }

        int opcao = Integer.parseInt(entradaOpcao);

        if (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida! Digite um número de 1 a 4.");
            continue; 
        }

        if (opcao == 4) {
            System.out.println("Sistema encerrado. Até logo!");
            break;
        }

        switch (opcao) {
            case 1:
                cadastrarAlunos();
                break;
            case 2:
                listarAlunos();
                break;
            case 3:
                if (totalAlunos == 0) {
                    System.out.println("Nenhum aluno cadastrado ainda.");
                } else {
                    System.out.print("Digite o nome do aluno que deseja procurar: ");
                    String nomeProcurado = System.console().readLine();
                    
                    int indice = pesquisarAluno(nomeProcurado);
                    
                    if (indice != -1) {
                        String situacao = (medias[indice] >= 7.0) ? "Aprovado" : "Reprovado";
                        System.out.println("\nAluno encontrado!");
                        System.out.println("Nome: " + nomes[indice]);
                        System.out.println("Média: " + medias[indice]);
                        System.out.println("Situação: " + situacao);
                    } else {
                        System.out.println("O estudante não consta na lista.");
                    }
                }
                break;
        }
    }
}

void cadastrarAlunos() {
    if (totalAlunos >= MAX_ALUNOS) {
        System.out.println("Erro: A turma já está cheia (limite de 20 alunos atingido).");
        return;
    }

    System.out.print("Quantos alunos deseja cadastrar agora? ");
    String entradaQtd = System.console().readLine();
    
    if (!eInteiro(entradaQtd)) {
        System.out.println("Quantidade inválida. Digite apenas números inteiros.");
        return;
    }

    int qtd = Integer.parseInt(entradaQtd);

    if (qtd <= 0) {
        System.out.println("Quantidade inválida. Digite um número maior que zero.");
        return;
    }

    for (int i = 0; i < qtd; i++) {
        if (totalAlunos >= MAX_ALUNOS) {
            System.out.println("Limite de 20 alunos atingido durante o cadastro!");
            break;
        }

        System.out.println("\n Cadastro do Aluno " + (totalAlunos + 1));
        
        String nome;
        while (true) {
            System.out.print("Nome: ");
            nome = System.console().readLine();
            
            if (nome.trim().isEmpty()) {
                System.out.println("O nome não pode ser vazio.");
            } else if (buscarSequencial(nome) != -1) {
                System.out.println("Erro: Este nome já está cadastrado. Digite um nome diferente.");
            } else {
                break;
            }
        }

        float media = 0;
        while (true) {
            System.out.print("Média Final (0.0 a 10.0): ");
            String entradaMedia = System.console().readLine();
            
            if (!eFloat(entradaMedia)) {
                System.out.println("Entrada inválida! Digite um número válido para a média (use ponto para decimais).");
                continue;
            }

            media = Float.parseFloat(entradaMedia);

            if (media >= 0.0 && media <= 10.0) {
                break; 
            } else {
                System.out.println("Nota inválida! A média deve ser entre 0.0 e 10.0.");
            }
        }

        nomes[totalAlunos] = nome;
        medias[totalAlunos] = media;
        totalAlunos++;
    }

    ordenarDados();
    System.out.println("\nCadastros realizados e dados ordenados com sucesso!");
}

boolean eInteiro(String texto) {
    if (texto.isEmpty()) {
        return false;
    }
    for (int i = 0; i < texto.length(); i++) {
        char c = texto.charAt(i);
        if (c < '0' || c > '9') {
            return false;
        }
    }
    return true;
}

boolean eFloat(String texto) {
    if (texto.isEmpty() || texto.equals(".")) {
        return false;
    }
    int pontos = 0;
    for (int i = 0; i < texto.length(); i++) {
        char c = texto.charAt(i);
        if (c == '.') {
            pontos++;
            if (pontos > 1) {
                return false;
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
    }
    return true;
}

int buscarSequencial(String nomeProcurado) {
    for (int i = 0; i < totalAlunos; i++) {
        if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
            return i;
        }
    }
    return -1; 
}

void ordenarDados() {
    for (int i = 0; i < totalAlunos - 1; i++) {
        for (int j = 0; j < totalAlunos - i - 1; j++) {
            if (nomes[j].compareToIgnoreCase(nomes[j + 1]) > 0) {
                
                String tempNome = nomes[j];
                nomes[j] = nomes[j + 1];
                nomes[j + 1] = tempNome;

                float tempMedia = medias[j];
                medias[j] = medias[j + 1];
                medias[j + 1] = tempMedia;
            }
        }
    }
}

void listarAlunos() {
    if (totalAlunos == 0) {
        System.out.println("Nenhum aluno cadastrado para exibição.");
        return;
    }

    System.out.println("\n -LISTAGEM DE ALUNOS-");
    for (int i = 0; i < totalAlunos; i++) {
        String situacao = (medias[i] >= 7.0) ? "Aprovado" : "Reprovado";
        System.out.println(nomes[i] + " - Média: " + medias[i] + " - Situação: " + situacao);
    }
}

int pesquisarAluno(String nomeProcurado) {
    int inicio = 0;
    int fim = totalAlunos - 1;

    while (inicio <= fim) {
        int meio = (inicio + fim) / 2;
        int comparacao = nomeProcurado.compareToIgnoreCase(nomes[meio]);

        if (comparacao == 0) {
            return meio; 
        } else if (comparacao > 0) {
            inicio = meio + 1; 
        } else {
            fim = meio - 1; 
        }
    }

    return -1;
}