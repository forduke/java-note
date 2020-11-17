

/**
 * @Author 张乾
 * @Date 2020/11/16 8:37
 * @Description:
 * （2）通话套餐类
 * 特征：通话时长、短信条数、每月资费
 * 行为: 显示所有套餐信息
 */

public class Call implements CallInterface {

    int duration;       // 通话时长
    int msgNum;         // 短信条数
    // double monthCost;   // 每月资费

    void show() {
        System.out.println("通话时长： " + duration);
        System.out.println("短信条数： " + msgNum);
    }

    @Override
    public void callServe(int minutes, SIM sim) {
        System.out.println("通话时长是: " + minutes + " 分钟");
    }

    public static void main(String[] args) {
        SIM sim = new SIM();

        sim.setType("大卡");

        CallInterface ca = new Call();
        ca.callServe(20, sim);

    }
}


//public class Call extends AbstractPackage {
//
//    // 把资费放到抽象类中，来继承
//    int duration;       // 通话时长
//    int msgNum;         // 短信条数
////    double monthCost;   // 每月资费
//
//
//    @Override
//    double showCost() {
//        return getMonthCost();
//    }
//
//    void show() {
//        System.out.println("通话时长： " + duration);
//        System.out.println("短信条数： " + msgNum);
//    }
//
//    public static void main(String[] args) {
//        AbstractPackage ap = new Internet(100.2);
//        ap.showCost();
//    }
//}
