

/**
 * @Author 张乾
 * @Date 2020/11/16 8:38
 * @Description:
 * （4）用户消费信息类
 * 特征：统计通话时长、统计上网流量、每月消费金额
 */
public class Consume {

    int duration;       // 统计通话时长
    String traffic;     // 统计上网流量
    double monthCost;   // 每月消费金额

    void show() {
        System.out.println("统计通话时长: " + duration + ",统计上网流量: " + traffic + ",每月消费金额: " + monthCost);
    }

}
