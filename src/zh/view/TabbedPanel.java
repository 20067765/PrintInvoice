package zh.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
/**
 * ��ǩҳpanel
 * @author �ź�
 */
public class TabbedPanel extends JTabbedPane {
	public TabbedPanel(){
		this.init();
		this.setSelectedIndex(0);
		this.setVisible(true);
	}
	
	private void init(){
		this.addTab("�ֽ�֧Ʊ", new CashChequePanel());
		this.addTab("ת��֧Ʊ", new JPanel());
		this.addTab("���˵�", new JPanel());
		this.addTab("��", new JPanel());
	}
}
