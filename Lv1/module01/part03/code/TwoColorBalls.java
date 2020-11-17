/*
 *	实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 
 *	其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。 
 *	其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
 */

import java.util.Random;

public class TwoColorBalls {
 
	public static void main(String[] args) {
		
		Random ra = new Random();
		
		int[] arr = new int[6];	// 红球编号数组
		int i = 0;				// 从0开始循环
		boolean isSame = false;	// 是否有一样的号码
		
		// 一直循环到数组中没有重复元素为止
		while(i < 6) {
			arr[i] = ra.nextInt(33) + 1;
			if(i > 0) {	// 从第二个元素开始判断
				// 遍历当前已有元素，比较是否相同，相同的话把这次赋值的元素变成0，跳出循环，重新随机
				for(int j = 0;j < i;j++) {
					if(arr[j] == arr[i]) {
						arr[i] = 0;
						isSame = true;
						break;
					}
				}
				// 没有一样额元素就把i加1,
				if(!isSame) {
					i++;
				}
			} else {
				i++;
			}
			// 重置标识
			isSame = false;
		};
		
		int blueNum = ra.nextInt(16) + 1;
		
		System.out.println("-----------------------------------");
		System.out.print("本期双色球中奖号码：红球 ");
		
		for(int k = 0;k < arr.length;k++) {
				System.out.print(arr[k] + " ");
		}
		
		System.out.println("蓝球 " + blueNum);
		System.out.println("-----------------------------------");
		
	}
}