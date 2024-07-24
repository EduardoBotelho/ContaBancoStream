package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class RegistroTransacoesComStream {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                // Lê o saldo inicial
                double saldo = scanner.nextDouble();
                // Lê a quantidade de transações
                int quantidadeTransacoes = scanner.nextInt();

                List<Transacao> transacoes = new ArrayList<>();

                for (int i = 1; i <= quantidadeTransacoes; i++) {
                    // Lê o tipo de transação (d para depósito ou s para saque)
                    char tipoTransacao = scanner.next().toLowerCase().charAt(0);
                    // Lê o valor da transação
                    double valorTransacao = scanner.nextDouble();

                    // Cria uma nova transação e adiciona à lista de transações
                    Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
                    transacoes.add(transacao);

                    // Atualiza o saldo com base no tipo de transação
                    if (transacao.getTipo() == 'd') {
                        saldo += valorTransacao;
                    } else if (transacao.getTipo() == 's') {
                        saldo -= valorTransacao;
                    }
                }

                // Exibe o saldo final
                System.out.println("Saldo : " + saldo);
                // Exibe as transações
                System.out.println("Transacoes:");
                transacoes.stream()
                        .map(t -> t.getTipo() + " de " + t.getValor())
                        .collect(Collectors.toList())
                        .forEach(System.out::println);

                // Fecha o scanner para evitar vazamentos de recursos
                scanner.close();
            }
        }





