/**
 *	提示用户输入年月日信息，判断这一天是这一年中的第几天并打印
 *	思路：
 *	1. 先确定输入格式，然后使用相应运算符拆分判断出 年、月、日
 *	2. 判断是否为闰年，用一个boolean变量标记
 *	3. 检查输入的格式是否合规，年不能小于1，月份要大于0小于13，日根据月份来判断
 *	4. 格式正确后来计算天数
 */
 
import java.util.Scanner;

public class WhichDay {
	
	public static void main(String[] args) {
		
		System.out.println("请输入年月日。例：2020年1月1日输入 20200101 ");
		Scanner sc = new Scanner(System.in);
		
		int birthday = sc.nextInt();
		// 日期在公元前的不算
		if(birthday < 10101) {
			System.out.println("公元前的不会算，请检查后按格式重新输入。例：2020年1月1日输入 20200101 ");
			return;
		}
		
		int year = birthday / 10000;		// 计算哪一年
		int month = birthday % 10000 / 100;	// 计算哪一月
		int day = birthday % 100;			// 计算哪一天
		int days = 0;							// 总天数
		boolean isLeapYear = false;			// 是否为闰年
		
		// 判断是否为闰年，世纪年除以400
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				isLeapYear = true;
			}
		} else if(year % 4 == 0) {
			isLeapYear = true;
		}
		
		// 检查月份或天数，不能为0
		if((month == 0 || month > 12) || day == 0) {
			System.out.println("输入的月份或日期不能为0，请检查后按格式重新输入。例：2020年1月1日输入 20200101 ");
			return;
		}
		// 大月不能超过31天
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
			if(day > 31) {
				System.out.println("输入的日期有误，请检查后按格式重新输入。例：2020年1月1日输入 20200101 ");
				return;
			}
		// 小月不能超过30天
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day > 30) {
				System.out.println("输入的日期有误，请检查后按格式重新输入。例：2020年1月1日输入 20200101 ");
				return;
			}
		// 2月，闰年不能超过29天，普通年不能超过28天
		} else {
			if(isLeapYear) {
				if(day > 29) {
					System.out.println("输入的日期有误，请检查后按格式重新输入。例：2020年1月1日输入 20200101 ");
					return;
				}
			} else {
				if(day > 28) {
					System.out.println("输入的日期有误，请检查后按格式重新输入。例：2020年1月1日输入 20200101 ");
					return;
				}
			}
		}
		
		// 月份循环判断计算总天数
		switch(month) {
			case 1:
				days = day;
			break;
			case 2:
				days = 31 + day;
			break;
			case 3:
				days = 31 + 28 + day;
			break;
			case 4:
				days = 31 + 28 + 31 + day;
			break;
			case 5:
				days = 31 + 28 + 31 + 30 + day;
			break;
			case 6:
				days = 31 + 28 + 31 + 30 + 31 + day;
			break;
			case 7:
				days = 31 + 28 + 31 + 30 + 31 + 30 + day;
			break;
			case 8:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
			break;
			case 9:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
			break;
			case 10:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			break;
			case 11:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			break;
			default:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}
		
		// 如果是闰年，大于2月份多加1天
		if(isLeapYear && month > 2) {
			days += 1;
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("输入的日期是：公元" + year + "年的第" + days + "天");
		System.out.println("--------------------------------------------------");
	}
}