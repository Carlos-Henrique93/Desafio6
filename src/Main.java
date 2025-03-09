import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Iniciado a estrutura LinKedList
        int opcao;
        LinkedList<Ninja> listaDeNinjas = new LinkedList<>();



        //Declarando a inicialização dos 7 ninja declarado na classe ninja.
        Ninja Ninja1 = new Ninja("Naruto Uzumaki", 17, "Aldeia da Folha");
        Ninja Ninja2 = new Ninja("Hinata Hyuga", 17, "Aldeia da Folha");
        Ninja Ninja3 = new Ninja("Gaara", 18, "Aldeia da Areia");
        Ninja Ninja4 = new Ninja("Zabuza Momochi", 28, "Aldeia Oculta da Nevoa");
        Ninja Ninja5 = new Ninja("Killer B", 29, "Aldeia Oculta Nuvem");
        Ninja Ninja6 = new Ninja("Orochimaru", 33, "Aldeia da Folha");
        Ninja Ninja7 = new Ninja("Itachi Uchira", 24, "Aldeia da Folha");

        // adiconar os ninjas na linkedLista - que ao acessar o menu carrega as informações adioconadas4
        listaDeNinjas.add(Ninja1);
        listaDeNinjas.add(Ninja2);
        listaDeNinjas.add(Ninja3);
        listaDeNinjas.add(Ninja4);
        listaDeNinjas.add(Ninja5);
        listaDeNinjas.add(Ninja6);
        listaDeNinjas.add(Ninja7);


        // Para capturar informações do teclado acessar os valores do menu
        Scanner scanner = new Scanner(System.in);

        System.out.println(" SISTEMA DE GERENCIAMENTO DE NINJA");
        //Ler a opção do usuario
        do {
        System.out.println("-----Menu-----");
        System.out.println("1 - Adicionar ninja no Inicio");
        System.out.println("2 - Remover ninja do Inicio");
        System.out.println("3 - Exibir lista");
        System.out.println("4 - Acessar Ninja por posição");
        System.out.println("0 - Sair");
        System.out.println("--------------");
        System.out.println("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

            /* Processar a opção escolhida.
            No case 1 tive problema pois inclui no LinkedList o tipo como String e ao adicionar a idade
            ele não permitia pois o a idade foi declarada como int. No tipo informei a classe Ninja onde
            permitiu inserir os atributos3
            */
            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do ninja: ");
                    String nome = scanner.nextLine();
                    System.out.print("Entre com a idade do ninja: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Entre com a Aldeia do ninja: ");
                    String aldeia = scanner.nextLine();
                    listaDeNinjas.addFirst(new Ninja(nome, idade, aldeia));
                    System.out.println("Ninja adicionado com sucesso!");
                    break;

                case 2:
                    if (!listaDeNinjas.isEmpty()) {
                        System.out.println("Removendo: " + listaDeNinjas.removeFirst());
                    } else {
                        System.out.println("A lista já está vazia!");
                    }
                    break;
                case 3:
                    if (listaDeNinjas.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("Lista de Ninjas:");
                        for (Ninja ninja : listaDeNinjas) {
                            System.out.println(ninja);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Informe a posição do ninja (0 a " + (listaDeNinjas.size() - 1) + "): ");
                    int posicao = scanner.nextInt();
                    if (posicao >= 0 && posicao < listaDeNinjas.size()) {
                        System.out.println("Ninja na posição " + posicao + ": " + listaDeNinjas.get(posicao));
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

}
