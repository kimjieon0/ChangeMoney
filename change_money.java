package change_money;

import java.util.Scanner;
public class change_money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		final double exchangeRateUSD = 1131.80;
		final double exchangeRateEUR = 1346.23;
		final double exchangeRateJPY = 10.25;

		
		double input, exchangeRate, exchange;
		int selectMoney,returnMoney, returnKor, money, USD = 1,EUR = 2, JPY = 3;
		String selectedTypeText;
		
		while(true) {

		System.out.print("환전할 종류 선택 (USD = 1을 입력, EUR = 2를 입력, JPY = 3을 입력하세요, 0을 입력하면 종료) :");
		selectMoney= (int)myInput.nextDouble(); 
		
		if (selectMoney == 0) {
			break;
		}
		
		System.out.print("원화 입력 : ");
		input = myInput.nextDouble();

		
		if (selectMoney == 1) {
			selectedTypeText = "USD";
			exchangeRate = exchangeRateUSD;
		}else if(selectMoney == 2) {
			selectedTypeText = "EUR";
			exchangeRate = exchangeRateEUR;
		}else {
			selectedTypeText = "JPY";
			exchangeRate = exchangeRateJPY;
		}
		
		
		
		System.out.printf("%s을(를) 선택하였습니다 \n", selectedTypeText);
	
		exchange = input / exchangeRate;
		returnMoney = (int)exchange;
		exchange = exchange - returnMoney;
		returnKor = (int)(exchange * exchangeRate);
		returnKor = returnKor - (returnKor % 10);
		money = (int)exchangeRate;
		
		System.out.printf("\n*** %s 환전 결과 *** \n", selectedTypeText);
		System.out.printf("현재 환율은 1 %s에 %.2f 원입니다. \n", selectedTypeText, exchangeRate);
		System.out.printf("환전금액 : %d %s \n", returnMoney, selectedTypeText);
	
		
		int kor1000, kor500, kor100, kor50, kor10;
		kor1000= returnKor / 1000;
		returnKor = returnKor % 1000;
		kor500= returnKor / 500;
		returnKor = returnKor % 500;
		kor100= returnKor / 100;
		returnKor = returnKor % 100;
		kor50= returnKor / 50;
		returnKor = returnKor % 50;
		kor10= returnKor / 10;
		returnKor = returnKor % 10;	
		
		
		
		switch(selectMoney) {
		
		case 1:
			System.out.printf("100USD : %d 장 \n", (int)returnMoney/100);
			System.out.printf("50USD : %d 장 \n" , (int)returnMoney % 100 / 50);
			System.out.printf("20USD : %d 장 \n", (int)returnMoney % 100%50/20);
			System.out.printf("10USD : %d 장 \n", (int)returnMoney %100%50%20/10);
			System.out.printf("5USD : %d 장 \n", (int)returnMoney %100%50%20%10 / 5);
			System.out.printf("2USD : %d장 \n", (int)returnMoney %100%50%20%10%5/ 2);
			System.out.printf("1USD : %d 장 \n", (int)returnMoney %100%50%20%10%5%2/1);
			break;
			
		case 2:
			System.out.printf("500EUR : %d 장 \n", (int)returnMoney/500);
			System.out.printf("200EUR : %d 장 \n" , (int)returnMoney % 500/200);
			System.out.printf("100EUR : %d 장 \n", (int)returnMoney % 500%200/100);
			System.out.printf("50EUR : %d 장 \n", (int)returnMoney %500%200%100/50);
			System.out.printf("20EUR : %d 장 \n", (int)returnMoney %500%200%100%50/20);
			System.out.printf("10EUR : %d장 \n", (int)returnMoney %500%200%100%50%20 /10);
			System.out.printf("5EUR : %d 장 \n", (int)returnMoney%500%200%100%50%20%10/5);
			break;
		case 3:
			System.out.printf("10000JPY : %d 장 \n", (int)returnMoney/10000);
			System.out.printf("5000JPY : %d 장 \n" , (int)returnMoney % 10000/5000);
			System.out.printf("2000JPY : %d 장 \n", (int)returnMoney % 10000%5000 /2000);
			System.out.printf("1000JPY : %d 장 \n", (int)returnMoney %10000%5000%2000/1000);
			break;
			
		}
	
		/*if (selectMoney == 1) { //1136.8달러
			System.out.println("달러 환전 결과");
			System.out.printf("100USD : %d 장 \n", (int)returnMoney/100);
			System.out.printf("50USD : %d 장 \n" , (int)returnMoney % 100 / 50);
			System.out.printf("20USD : %d 장 \n", (int)returnMoney % 100%50/20);
			System.out.printf("10USD : %d 장 \n", (int)returnMoney %100%50%20/10);
			System.out.printf("5USD : %d 장 \n", (int)returnMoney %100%50%20%10 / 5);
			System.out.printf("2USD : %d장 \n", (int)returnMoney %100%50%20%10%5/ 2);
			System.out.printf("1USD : %d 장 \n", (int)returnMoney %100%50%20%10%5%2/1);

		}

			
		 if (selectMoney == 2){ //1349.58유로

			System.out.println("유로 환전 결과");
			System.out.printf("500EUR : %d 장 \n", (int)returnMoney/500);
			System.out.printf("200EUR : %d 장 \n" , (int)returnMoney % 500/200);
			System.out.printf("100EUR : %d 장 \n", (int)returnMoney % 500%200/100);
			System.out.printf("50EUR : %d 장 \n", (int)returnMoney %500%200%100/50);
			System.out.printf("20EUR : %d 장 \n", (int)returnMoney %500%200%100%50/20);
			System.out.printf("10EUR : %d장 \n", (int)returnMoney %500%200%100%50%20 /10);
			System.out.printf("5EUR : %d 장 \n", (int)returnMoney%500%200%100%50%20%10/5);

		 }
			
		 if (selectMoney == 3)  {// 1026 엔

			System.out.println("엔화 환전 결과");
			System.out.printf("10000JPY : %d 장 \n", (int)returnMoney/10000);
			System.out.printf("5000JPY : %d 장 \n" , (int)returnMoney % 10000/5000);
			System.out.printf("2000JPY : %d 장 \n", (int)returnMoney % 10000%5000 /2000);
			System.out.printf("1000JPY : %d 장 \n", (int)returnMoney %10000%5000%2000/1000);

		}   */
		    System.out.println("\n*** 원화 거스름돈 *** ");
			System.out.printf("거스름돈 : %d  원 \n", returnKor);
			System.out.printf("1000원 : %d장 \n", (int)kor1000);
			System.out.printf("500원 : %d원 \n", (int)kor500);
			System.out.printf("100원 : %d원 \n", (int)kor100);
			System.out.printf("50원 : %d원 \n", (int)kor50);
			System.out.printf("10원 : %d원 \n", (int)kor10);
		
			
		}
            myInput.close(); //scanner 닫기 
		

		
		
}
}
