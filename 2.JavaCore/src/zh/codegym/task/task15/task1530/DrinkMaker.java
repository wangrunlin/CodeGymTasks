package zh.codegym.task.task15.task1530;

abstract class DrinkMaker {

    // 选择合适的杯子
    abstract void getRightCup();

    // 加入原料
    abstract void addIngredients();

    // 倒入液体
    abstract void pour();

    // 准备饮料
    void makeDrink() {
        getRightCup();
        addIngredients();
        pour();
    }
}
