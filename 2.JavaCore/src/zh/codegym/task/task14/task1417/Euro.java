package zh.codegym.task.task14.task1417;

public class Euro extends Money {
    public Euro(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "EUR";
    }

    public String getCurrencyName(double amount) {
        Euro euro = new Euro(amount);
        return "EUR";
    }
}
