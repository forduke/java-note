
/**
 * @Author ��Ǭ
 * @Date 2020/11/17 9:06
 * @Description:
 */

public enum SIMEnum {

    BIGCARD("��"),SMALLCARD("С��"),SUPERSMALLCARD("΢�Ϳ�");

    public final String desc;

    private SIMEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
