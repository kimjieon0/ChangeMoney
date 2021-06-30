package exchange;

import java.util.Scanner;

public class ChangeMoney {
	Scanner myInput = new Scanner(System.in);
	public int kor1000, kor500, kor100, kor50, kor10;

	public void kor(int returnKor) {

		kor1000 = returnKor / 1000;
		returnKor = returnKor % 1000;
		kor500 = returnKor / 500;
		returnKor = returnKor % 500;
		kor100 = returnKor / 100;
		returnKor = returnKor % 100;
		kor50 = returnKor / 50;
		returnKor = returnKor % 50;
		kor10 = returnKor / 10;
		returnKor = returnKor % 10;

	}

	public void change(int returnKor) {
		System.out.println("\n*** 원화 거스름돈 *** ");
		System.out.printf("거스름돈 : %d  원 \n", returnKor);
		System.out.printf("1000원 : %d장 \n", (int) kor1000);
		System.out.printf("500원 : %d원 \n", (int) kor500);
		System.out.printf("100원 : %d원 \n", (int) kor100);
		System.out.printf("50원 : %d원 \n", (int) kor50);
		System.out.printf("10원 : %d원 \n", (int) kor10);

	}

}
