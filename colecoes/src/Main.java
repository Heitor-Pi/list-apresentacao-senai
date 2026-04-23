import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Vaca> vacas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();

                System.out.print("Nome: ");
                String nome = sc.next();

                vacas.add(new Vaca(id, nome));
            } else if (opcao == 2) {
                for (Vaca v : vacas) {
                    System.out.println(v.getId() + " - " + v.getNome());
                }
            } else if (opcao == 3) {
                System.out.print("ID: ");
                int id = sc.nextInt();

                for (Vaca v : vacas) {
                    if (v.getId() == id) {
                        System.out.print("Novo nome: ");
                        v.setNome(sc.next());
                    }
                }
            } else if (opcao == 4) {
                System.out.print("ID: ");
                int id = sc.nextInt();

                vacas.removeIf(v -> v.getId() == id);
            }

        } while (opcao != 0);

        sc.close();
    }
}