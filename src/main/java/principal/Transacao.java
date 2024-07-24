package principal;

public class Transacao {

        private final char tipo;
        private final double valor;

        public Transacao(char tipo, double valor) {
            this.tipo = tipo;
            this.valor = valor;
        }

        public char getTipo() {
            return tipo;
        }

        public double getValor() {
            return valor;
        }
    }

