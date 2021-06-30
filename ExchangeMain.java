package exchange;

public class ExchangeMain {

	public static void main(String[] args) {
		ExchangeData exData = new ExchangeData();
		ChangeMoney change = new ChangeMoney();
		ReturnMoney returnMoney = new ReturnMoney();
		

		while (true) {
			exData.inputmoney();
			if (exData.selectMoney == 0) {
				break;
			}
			exData.Moneydata();
			change.kor(exData.returnKor);
			returnMoney.returnmoney(exData.selectMoney, exData.returnMoney);
			change.change(exData.returnKor);
		}

	}

}
