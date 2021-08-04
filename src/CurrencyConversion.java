import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập vào số USD");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Số tiền VND Là: " + quydoi);
    }
}

