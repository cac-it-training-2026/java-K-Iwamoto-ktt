package basic.question04;

import java.io.IOException;

/**
 * 第7章 配列
 */

public class Question04_1 {

	public static void main(String[] args) throws IOException {

		int[] age_Group = new int[5];
		age_Group[0] = 12;
		age_Group[1] = 18;
		age_Group[2] = 24;
		age_Group[3] = 19;
		age_Group[4] = 20;

		System.out.println("3番目の人の年齢は" + age_Group[2] + "歳です。");

	}

}
