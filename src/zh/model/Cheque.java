package zh.model;

import java.util.ArrayList;
import java.util.List;

import zh.model.AbstractBill.PrintInfo;

/**
 * 支票，现金支票和转账支票，要素和打印位置全部一样
 * 
 * @author 张豪
 */
public class Cheque extends AbstractBill {
	private String money;
	private String payee;
	private String password;
	private String use;

	public Cheque() {
		this.width = 22.5;
		this.height = 8;
		super.init();
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	@Override
	public List<PrintInfo> getPrintInfos() {
		List<PrintInfo> printInfos = new ArrayList<PrintInfo>();
		printInfos.add(new PrintInfo(this.getDateInWords(),190,55));
		return null;
	}
	
	private String getDateInWords(){
		
		return null;
	}

}
