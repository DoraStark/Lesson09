
import java.util.Arrays;
import java.util.Random;

public class Bank {

    String name;
    double currencyPrice;

    Random random = new Random();

    public Bank() {
        this.name = bankNames[random.nextInt(bankNames.length)];
        this.currencyPrice = random.nextDouble((maxCurrencyPrice - minCurrencyPrice) + minCurrencyPrice);
    }

    double minCurrencyPrice = 37.0;
    double maxCurrencyPrice = 43.0;
    int bestOptions = 5;
    double[] priceCurrencyBank = new double[14];
    String[] bankNames = new String[]{"ПРИВАТБАНК", "Сенс Банк", "Сітібанк", "ІНГ Банк Україна", "Ощадбанк", "Укрексімбанк", "УКРГАЗБАНК", "Райффайзен Банк", "УКРСИББАНК", "ПУМБ", "Сенс Банк", "Сітібанк", "ПРИВАТБАНК", "Сенс Банк"};

    public void fillCurrency() {
        Random random = new Random();
        for (int i = 0; i < priceCurrencyBank.length; i++) {
            priceCurrencyBank[i] = random.nextDouble((maxCurrencyPrice - minCurrencyPrice))+minCurrencyPrice;

        }

        Arrays.sort(priceCurrencyBank);
    }

    public void reverseArray() {
        for (int i = 0; i < priceCurrencyBank.length / 2.0; i++) {
            double a = priceCurrencyBank[i];
            priceCurrencyBank[i] = priceCurrencyBank[priceCurrencyBank.length - 1 - i];
            priceCurrencyBank[priceCurrencyBank.length - 1 - i] = a;

        }
    }

    String[][] bankList = new String[priceCurrencyBank.length][bankNames.length];

    public void fill() {

        for (int i = 0; i < bestOptions; i++) {
            System.out.println("Найкращі пропозиціх для вас: "+ priceCurrencyBank[i] + "," + bankNames[i]);

        }
    }

    public void bestOptionsFinder() {
        fillCurrency();
        reverseArray();
        fill();
    }
}














