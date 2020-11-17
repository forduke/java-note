
/**
 * @Author 张乾
 * @Date 2020/11/17 9:06
 * @Description:
 */

public enum SIMEnum {

    BIGCARD("大卡"),SMALLCARD("小卡"),SUPERSMALLCARD("微型卡");

    public final String desc;

    private SIMEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
