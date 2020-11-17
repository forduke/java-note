
/**
 * @Author 张乾
 * @Date 2020/11/17 9:33
 * @Description:
 */
public class SIMTest {

    public static void enumTest(SIMEnum sim) {
        switch (sim) {
            case BIGCARD:
                System.out.println("我是大卡！");
                break;
            case SMALLCARD:
                System.out.println("我是小卡！");
                break;
            case SUPERSMALLCARD:
                System.out.println("我是微型卡！");
                break;
        }
    }

    public static void main(String[] args) {

        // 枚举
        SIMTest.enumTest(SIMEnum.BIGCARD);
        System.out.println("====================================");

        SIM sim = new SIM();

        // 通话服务抽象方法
        CallInterface ca = new Call();
        ca.callServe(20, sim);
        System.out.println("====================================");

        // 上网服务抽象方法
        InternerInterface iif = new Internet();
        iif.internetServe(200, sim);

    }

}
