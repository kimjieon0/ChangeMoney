package exchange;

public class ReturnMoney {

	public void returnmoney(int selectMoney, int returnMoney) {
		switch (selectMoney) {

		case 1:
			System.out.printf("100USD : %d 장 \n", (int) returnMoney / 100);
			System.out.printf("50USD : %d 장 \n", (int) returnMoney % 100 / 50);
			System.out.printf("20USD : %d 장 \n", (int) returnMoney % 100 % 50 / 20);
			System.out.printf("10USD : %d 장 \n", (int) returnMoney % 100 % 50 % 20 / 10);
			System.out.printf("5USD : %d 장 \n", (int) returnMoney % 100 % 50 % 20 % 10 / 5);
			System.out.printf("2USD : %d장 \n", (int) returnMoney % 100 % 50 % 20 % 10 % 5 / 2);
			System.out.printf("1USD : %d 장 \n", (int) returnMoney % 100 % 50 % 20 % 10 % 5 % 2 / 1);
			break;

		case 2:
			System.out.printf("500EUR : %d 장 \n", (int) returnMoney / 500);
			System.out.printf("200EUR : %d 장 \n", (int) returnMoney % 500 / 200);
			System.out.printf("100EUR : %d 장 \n", (int) returnMoney % 500 % 200 / 100);
			System.out.printf("50EUR : %d 장 \n", (int) returnMoney % 500 % 200 % 100 / 50);
			System.out.printf("20EUR : %d 장 \n", (int) returnMoney % 500 % 200 % 100 % 50 / 20);
			System.out.printf("10EUR : %d장 \n", (int) returnMoney % 500 % 200 % 100 % 50 % 20 / 10);
			System.out.printf("5EUR : %d 장 \n", (int) returnMoney % 500 % 200 % 100 % 50 % 20 % 10 / 5);
			break;
		case 3:
			System.out.printf("10000JPY : %d 장 \n", (int) returnMoney / 10000);
			System.out.printf("5000JPY : %d 장 \n", (int) returnMoney % 10000 / 5000);
			System.out.printf("2000JPY : %d 장 \n", (int) returnMoney % 10000 % 5000 / 2000);
			System.out.printf("1000JPY : %d 장 \n", (int) returnMoney % 10000 % 5000 % 2000 / 1000);
			break;

		}

	}

}
