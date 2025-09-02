package desafioV;

public class Main {
    Scanner scanner = new Scanner(System.in);
    List<Notificacao> canaisSelecionados = new ArrayList();

            System.out.println("Escolha os canais de notificação (separe por vírgula): \n" +
                    "1 - Email \n" +
                    "2- SMS \n" +
                    "3- Push");

    String[] opcoes = scanner.nextLine().split(",");
    for (String opcao : opcoes) {
        switch (opcao.trim()) {
            case "1" -> canaisSelecionados.add(new EmailNotificacao());
            case "2" -> canaisSelecionados.add(new SmsNotificacao());
            case "3" -> canaisSelecionados.add(new PushNotificacao());
            default -> System.out.println("Opção inválida: " + opcao);
        }
    }

    System.out.println("Digite a mensagem que deseja enviar:");
    String mensagem = scanner.nextLine();

    gerenciador.notificarTodos(mensagem);
}
