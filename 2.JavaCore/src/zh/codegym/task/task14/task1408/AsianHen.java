package zh.codegym.task.task14.task1408;

public class AsianHen extends Hen {
    @Override
    public int getMonthlyEggCount() {
        return 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "我来自" + Continent.ASIA + "。我每个月下 " + getMonthlyEggCount() + " 个蛋。";
    }
}
