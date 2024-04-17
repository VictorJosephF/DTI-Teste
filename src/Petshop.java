import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de caes pequenos: ");
        int smallDogs = scanner.nextInt();
        System.out.print("Informe a quantidade de caes grandes: ");
        int largeDogs = scanner.nextInt();
        System.out.print("Informe o dia da semana(Segunda-feira, Terca-feira, Quarta-feira, Quinta-feira, Sexta-feira, Sábado ou Domingo): ");
        String data = scanner.next();

        String melhorPetshop = encontrarMelhorPetshop(smallDogs, largeDogs, data);
        System.out.println("O melhor petshop é: " + melhorPetshop);

        scanner.close();


    }

    public static double meuCaninoFeliz (int smallDogs, int largeDogs, String data){
        double valorSmallDogs =  smallDogs * 20;
        double valueLargeDogs =  largeDogs * 40;
        double totalCost = valorSmallDogs + smallDogs;

        if(data.equalsIgnoreCase("sábado") || data.equalsIgnoreCase("domingo")){
            return  totalCost*1.2;
        }
        return totalCost;

    }
    public static double valorVaiRex (int smallDogs, int largeDogs, String data ) {
        double valorSmallDogs = smallDogs * 15;
        double valueLargeDogs = largeDogs * 50;
        double totalCost = valorSmallDogs + smallDogs;

        if (data.equalsIgnoreCase("sábado") || data.equalsIgnoreCase("domingo")) {
            valorSmallDogs = smallDogs * 20;
            valueLargeDogs = largeDogs * 55;
            return totalCost = valorSmallDogs + smallDogs;
        }
        return totalCost;
    }
    public static double valorChowChagas(int smallDogs, int largeDogs, String data){
        double valorSmallDogs = smallDogs * 30;
        double valueLargeDogs = largeDogs * 45;
        return valorSmallDogs + valueLargeDogs;
    }

    public static String encontrarMelhorPetshop(int smallDogs, int largeDogs, String data) {
        double precoTotalMeuCaninoFeliz = meuCaninoFeliz(smallDogs, largeDogs, data);
        double precoTotalVaiRex = valorVaiRex(smallDogs, largeDogs, data);
        double precoTotalChowChawgas = valorChowChagas(smallDogs, largeDogs, data);

        String melhorPetshop;
        double menorPrecoTotal;

        if (precoTotalMeuCaninoFeliz <= precoTotalVaiRex && precoTotalMeuCaninoFeliz <= precoTotalChowChawgas) {
            melhorPetshop = "Meu Canino Feliz";
            menorPrecoTotal = precoTotalMeuCaninoFeliz;
        } else if (precoTotalVaiRex <= precoTotalMeuCaninoFeliz && precoTotalVaiRex <= precoTotalChowChawgas) {
            melhorPetshop = "Vai Rex";
            menorPrecoTotal = precoTotalVaiRex;
        } else {
            melhorPetshop = "ChowChawgas";
            menorPrecoTotal = precoTotalChowChawgas;
        }

        return "O melhor petshop é: " + melhorPetshop + ", com o valor total do banho de R$" + menorPrecoTotal;
    }

}

