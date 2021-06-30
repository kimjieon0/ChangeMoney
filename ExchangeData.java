package exchange;

import java.util.Scanner;

public class ExchangeData {

	Scanner myInput = new Scanner(System.in);
	public final double exchangeRateUSD = 1131.80;
	public final double exchangeRateEUR = 1346.23;
	public final double exchangeRateJPY = 10.25;

	public double input = 0, exchangeRate = 0, exchange = 0;
	public int selectMoney = 0, returnMoney = 0, returnKor = 0, money, USD = 1, EUR = 2, JPY = 3;
	public String selectedTypeText = null;

	public void inputmoney() {
		System.out.print("환전할 종류 선택 (USD = 1을 입력, EUR = 2를 입력, JPY = 3을 입력하세요, 0을 입력하면 종료) :");
		selectMoney = (int) myInput.nextDouble();
	}

	public void Moneydata() {
		System.out.print("원화 입력 : ");
		input = myInput.nextDouble();

		if (selectMoney == 1) {
			selectedTypeText = "USD";
			exchangeRate = exchangeRateUSD;
		} else if (selectMoney == 2) {
			selectedTypeText = "EUR";
			exchangeRate = exchangeRateEUR;
		} else {
			selectedTypeText = "JPY";
			exchangeRate = exchangeRateJPY;
		}

		System.out.printf("%s을(를) 선택하였습니다 \n", selectedTypeText);

		exchange = input / exchangeRate;
		returnMoney = (int) exchange;
		exchange = exchange - returnMoney;
		returnKor = (int) (exchange * exchangeRate);
		returnKor = returnKor - (returnKor % 10);
		money = (int) exchangeRate;

		System.out.printf("\n*** %s 환전 결과 *** \n", selectedTypeText);
		System.out.printf("현재 환율은 1 %s에 %.2f 원입니다. \n", selectedTypeText, exchangeRate);
		System.out.printf("환전금액 : %d %s \n", returnMoney, selectedTypeText);

	}

}
