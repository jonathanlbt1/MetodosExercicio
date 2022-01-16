public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static int getQuatroParcelas() {
        return 4;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static double getTaxaQuatroParcelas() {
        return 0.6;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$" + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$" + valorFinal);
        } else if (parcelas == 4) {
            double valorFinal = valor + (valor * getTaxaQuatroParcelas());
            System.out.println("Valor final do empréstimo para 4 parcelas: R$" + valorFinal);
        } else if (parcelas == 0 || parcelas == 1) {
            System.out.println("Pagamento a vista");
        } else {
            System.out.println("Parcelamento não disponivel! Favor, escolha apenas 2, 3 ou 4 vezes para parcelamento.");
        }
    }
}
