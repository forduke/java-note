

/**
 * @Author ��Ǭ
 * @Date 2020/11/16 8:40
 * @Description: ��3�������ײ���
 * ����������������ÿ���ʷ�
 * ��Ϊ����ʾ�����ײ���Ϣ
 */

public class Internet implements InternerInterface {

    String traffic;     // ��������
    //    double monthCost;   // ÿ���ʷ�

    void show() {
        System.out.println("���������� " + traffic);
    }


    @Override
    public void internetServe(int duration, SIM sim) {
        System.out.println("ÿ������������: " + duration + " Ԫ��");
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
//    String traffic;     // ��������
////    double monthCost;   // ÿ���ʷ�
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
//        System.out.println("���������� " + traffic);
//    }
//
//    public static void main(String[] args) {
//        AbstractPackage ap = new Internet(100.2);
//        double res = ap.showCost();
//        System.out.println("ÿ������������: " + res + " Ԫ��");
//    }
//}
