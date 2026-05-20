public class Main {

    public static void main(String[] args) {

        ServiceOrder order =
                new ServiceOrder("Firma Alfa", 10, 120.0);

        PriceCalculator calculator =
                new PriceCalculator();

        // Cena standardowa
        PriceStrategy standard =
                o -> o.hours() * o.hourRate();

        // Rabat 10%
        PriceStrategy discount =
                o -> o.hours() * o.hourRate() * 0.90;

        // Dopłata weekendowa +25%
        PriceStrategy weekend =
                o -> o.hours() * o.hourRate() * 1.25;

        System.out.println("Cena standardowa: "
                + calculator.calculate(order, standard));

        System.out.println("Cena z rabatem: "
                + calculator.calculate(order, discount));

        System.out.println("Cena weekendowa: "
                + calculator.calculate(order, weekend));
    }
}