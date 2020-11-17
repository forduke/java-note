
/**
 * @Author ��Ǭ
 * @Date 2020/11/17 9:33
 * @Description:
 */
public class SIMTest {

    public static void enumTest(SIMEnum sim) {
        switch (sim) {
            case BIGCARD:
                System.out.println("���Ǵ󿨣�");
                break;
            case SMALLCARD:
                System.out.println("����С����");
                break;
            case SUPERSMALLCARD:
                System.out.println("����΢�Ϳ���");
                break;
        }
    }

    public static void main(String[] args) {

        // ö��
        SIMTest.enumTest(SIMEnum.BIGCARD);
        System.out.println("====================================");

        SIM sim = new SIM();

        // ͨ��������󷽷�
        CallInterface ca = new Call();
        ca.callServe(20, sim);
        System.out.println("====================================");

        // ����������󷽷�
        InternerInterface iif = new Internet();
        iif.internetServe(200, sim);

    }

}
