package zh.codegym.task.task14.task1408;

public class AfricanHen extends Hen {
    @Override
    public int getMonthlyEggCount() {
        return 25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "我来自" + Continent.AFRICA + "。我每个月下 " + getMonthlyEggCount() + " 个蛋。";
    }
}
