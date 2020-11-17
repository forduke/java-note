

/**
 * @Author 张乾
 * @Date 2020/11/16 8:40
 * @Description: （3）上网套餐类
 * 特征：上网流量、每月资费
 * 行为：显示所有套餐信息
 */

public class Internet implements InternerInterface {

    String traffic;     // 上网流量
    //    double monthCost;   // 每月资费

    void show() {
        System.out.println("上网流量： " + traffic);
    }


    @Override
    public void internetServe(int duration, SIM sim) {
        System.out.println("每月上网费用是: " + duration + " 元。");
    }

    public static void main(String[] args) {

        SIM sim = new SIM();

        InternerInterface iif = new Internet();
        iif.internetServe(200, sim);
    }
}
//
//public class Internet extends AbstractPackage {
//
//    String traffic;     // 上网流量
////    double monthCost;   // 每月资费
//
//    public Internet(double monthCost) {
//        super(monthCost);
//    }
//
//    @Override
//    double showCost() {
//        return getMonthCost();
//    }
//
//    void show() {
//        System.out.println("上网流量： " + traffic);
//    }
//
//    public static void main(String[] args) {
//        AbstractPackage ap = new Internet(100.2);
//        double res = ap.showCost();
//        System.out.println("每月上网费用是: " + res + " 元。");
//    }
//}
