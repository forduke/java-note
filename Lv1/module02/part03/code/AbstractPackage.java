

/**
 * @Author 张乾
 * @Date 2020/11/17 9:54
 * @Description:
 */
public abstract class AbstractPackage {

    private double monthCost;   // 每月资费

    public AbstractPackage() {
    }

    public AbstractPackage(double monthCost) {
        setMonthCost(monthCost);
    }

    public double getMonthCost() {
        return monthCost;
    }

    public void setMonthCost(double monthCost) {
        if (monthCost > 0) {
            this.monthCost = monthCost;
        } else {
            System.out.println("资费不合理！");
        }
    }

    abstract double showCost();

    public static void main(String[] args) {

    }

}
