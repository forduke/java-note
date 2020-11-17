

/**
 * @Author ��Ǭ
 * @Date 2020/11/16 8:37
 * @Description:
 * ��1���ֻ�����
 * �����������͡����š��û��������롢�˻���ͨ��ʱ��(����)����������
 * ��Ϊ����ʾ������ + �û��� + ��ǰ��
 *
 * 3.2 �ڶ�������ƺ�ʵ������ö���� �ֻ����������ܹ��� 3 �֣��󿨡�С����΢�Ϳ�
 * 3.3 ��������ʵ������Ż� ��ͨ���ײ���������ײ�������ͬ����������Ϊ��ȡ������ɳ����ײ��ࡣ
 * 3.4 ���Ĳ���������ʵ�����½ӿ�
 * ��1��ͨ������ӿ� ���󷽷�: ����1: ͨ������, ����2: �ֻ�������� ��ͨ���ײ���ʵ��ͨ������ӿڡ�
 * ��2����������ӿ� ���󷽷�: ����1: ��������, ����2: �ֻ�������� �������ײ���ʵ����������ӿڡ�
 * 3.5 ���岽�����д������
 *
 * ��д������ʹ�ö�̬��ʽ�ֱ���������������������д�ӡһ�仰���й���ģ�⼴�ɡ�
 */
public class SIM {

    private String type;            // ������
    private String cardID;          // ����
    private String userName;        // �û���
    private String userPassword;    // ����
    private double userBalance;     // �˻����
    private int duration;           // ͨ��ʱ�������ӣ�
    private String traffic;         // ��������

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
        System.out.println("���ţ�" + cardID + " �û����� " + userName + " ��ǰ�� " + userBalance);
    }
}
