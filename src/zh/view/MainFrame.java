package zh.view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * �����������
 * 
 * @author �ź�
 */
public class MainFrame extends JFrame {

	public MainFrame() {
		this.init();
		this.setVisible(true);
	}

	/**
	 * ��ʼ��
	 */
	private void init() {
		this.setTitle("��ӡƱ��");
		this.setSize(500, 500);
		this.center();
		this.tabbed();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * �������
	 */
	private void center() {
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setLocation((int) (width - this.getWidth()) / 2,
				(int) (height - this.getHeight()) / 2);
	}
	
	private void tabbed(){
		TabbedPanel tab = new TabbedPanel();
		this.add(tab,BorderLayout.CENTER);
	}
}
