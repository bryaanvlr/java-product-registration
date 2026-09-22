import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do produto: ");
        String produto = scanner.nextLine();

        System.out.println("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        System.out.println("Preço: ");
        Double preco = scanner.nextDouble();

        System.out.println("Está disponivel? true/false");
        boolean ativo = scanner.nextBoolean();

        System.out.println("Produto: " + produto);
        System.out.println("Estoque: " + quantidade);
        System.out.println("Preço: " + preco);
        System.out.println("Disponível: " + ativo);

        scanner.close();
    }
}