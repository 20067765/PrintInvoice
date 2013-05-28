package zh.view;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * 程序的主界面
 * 
 * @author 张豪
 */
public class MainFrame extends JFrame {

	public MainFrame() {
		this.init();
		this.setVisible(true);
	}

	/**
	 * 初始化
	 */
	private void init() {
		this.setTitle("打印票据");
		this.setSize(500, 500);
		this.center();
		this.tabbed();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * 窗体居中
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
