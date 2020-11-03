/*
 *	自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 
 *	例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
 *	数组扩容一定要有提示用户输入的一个过程，何时达到80%，进行数组扩容
 */

import java.util.Scanner;
import java.util.Arrays;

public class AutoExpansion {
	 
	public static void main(String[] args) {
		
		System.out.println("数组初始容量为10，请随意输入，退出请输入'quit'。");
		System.out.println("-----------------------------------------------------------------------");
		
		// 数组下标
		int i = 0;
		// 新建字符串数组
		String[] arr = new String[10];
		
		// 无线循环，输入对应指令跳出
		for(;;) {
			// 计算当前数组的80%
			int num = arr.length * 8 / 10;
			// 如果已有元素数量到达80%，进行扩容
			if(i == num) {
				System.out.println("数组容量已达80%，进行数组扩容，扩容1.5倍。");
				// 新建个数组，容量是之前数组的1.5倍
				String[] newArr = new String[arr.length * 15 / 10];
				// 把原数组内容拷贝到新数组后，再把新数组赋值给原数组
				for(int j = 0;j < arr.length;j++) {
					newArr[j] = arr[j];
				}
				arr = newArr;
				System.out.println("当前数组为：" + Arrays.toString(arr));
				System.out.println("-----------------------------------------------------------------------");
			}	
			
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			
			// 输入"quit"退出
			if("quit".equals(str)) {
				break;
			}
			
			arr[i] = str;
			System.out.println("当前数组为：" + Arrays.toString(arr));
			System.out.println("-----------------------------------------------------------------------");
			i++;
		}
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("歇会，当前数组为：" + Arrays.toString(arr));
		
	}
}