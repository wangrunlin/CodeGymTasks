package zh.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen {
    @Override
    public int getMonthlyEggCount() {
        return 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "我来自" + Continent.NORTHAMERICA + "。我每个月下 " + getMonthlyEggCount() + " 个蛋。";
    }
}
