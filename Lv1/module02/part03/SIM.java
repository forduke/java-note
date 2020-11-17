

/**
 * @Author 张乾
 * @Date 2020/11/16 8:37
 * @Description:
 * （1）手机卡类
 * 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量
 * 行为：显示（卡号 + 用户名 + 当前余额）
 *
 * 3.2 第二步：设计和实现以下枚举类 手机卡的类型总共有 3 种：大卡、小卡、微型卡
 * 3.3 第三步：实体类的优化 将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类。
 * 3.4 第四步：创建并实现以下接口
 * （1）通话服务接口 抽象方法: 参数1: 通话分钟, 参数2: 手机卡类对象 让通话套餐类实现通话服务接口。
 * （2）上网服务接口 抽象方法: 参数1: 上网流量, 参数2: 手机卡类对象 让上网套餐类实现上网服务接口。
 * 3.5 第五步：进行代码测试
 *
 * 编写测试类使用多态格式分别调用上述方法，方法体中打印一句话进行功能模拟即可。
 */
public class SIM {

    private String type;            // 卡类型
    private String cardID;          // 卡号
    private String userName;        // 用户名
    private String userPassword;    // 密码
    private double userBalance;     // 账户余额
    private int duration;           // 通话时长（分钟）
    private String traffic;         // 上网流量

    public SIM() {
    }

    public SIM(String type) {
        setType(type);
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double userBalance) {
        this.userBalance = userBalance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    void show() {
        System.out.println("卡号：" + cardID + " 用户名： " + userName + " 当前余额： " + userBalance);
    }
}
