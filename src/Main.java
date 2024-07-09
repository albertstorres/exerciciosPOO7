//7 - ) Crie uma classe ContaBancaria com atributos de saldo e métodos para depositar,
//      sacar e verificar saldo, usando getters e setters;

import br.com.cubosacademy.exerciciospoo.setimo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Saldo: " + conta.getSaldo());
        conta.setDeposito(400);
        conta.setSaque(0);
        System.out.println("Saldo: " + conta.getSaldo());
    }
}