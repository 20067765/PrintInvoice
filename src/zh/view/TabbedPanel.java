package zh.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
/**
 * 标签页panel
 * @author 张豪
 */
public class TabbedPanel extends JTabbedPane {
	public TabbedPanel(){
		this.init();
		this.setSelectedIndex(0);
		this.setVisible(true);
	}
	
	private void init(){
		this.addTab("现金支票", new CashChequePanel());
		this.addTab("转账支票", new JPanel());
		this.addTab("进账单", new JPanel());
		this.addTab("汇款单", new JPanel());
	}
}
