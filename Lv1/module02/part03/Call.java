

/**
 * @Author ��Ǭ
 * @Date 2020/11/16 8:37
 * @Description:
 * ��2��ͨ���ײ���
 * ������ͨ��ʱ��������������ÿ���ʷ�
 * ��Ϊ: ��ʾ�����ײ���Ϣ
 */

public class Call implements CallInterface {

    int duration;       // ͨ��ʱ��
    int msgNum;         // ��������
    // double monthCost;   // ÿ���ʷ�

    void show() {
        System.out.println("ͨ��ʱ���� " + duration);
        System.out.println("���������� " + msgNum);
    }

    @Override
    public void callServe(int minutes, SIM sim) {
        System.out.println("ͨ��ʱ����: " + minutes + " ����");
    }

    public static void main(String[] args) {
        SIM sim = new SIM();

        sim.setType("��");

        CallInterface ca = new Call();
        ca.callServe(20, sim);

    }
}


//public class Call extends AbstractPackage {
//
//    // ���ʷѷŵ��������У����̳�
//    int duration;       // ͨ��ʱ��
//    int msgNum;         // ��������
////    double monthCost;   // ÿ���ʷ�
//
//
//    @Override
//    double showCost() {
//        return getMonthCost();
//    }
//
//    void show() {
//        System.out.println("ͨ��ʱ���� " + duration);
//        System.out.println("���������� " + msgNum);
//    }
//
//    public static void main(String[] args) {
//        AbstractPackage ap = new Internet(100.2);
//        ap.showCost();
//    }
//}
