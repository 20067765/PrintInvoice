package zh.business;

import javax.swing.SwingUtilities;

import zh.view.MainFrame;

/**
 * 程序的入口
 * @author 张豪
 */
public class AppStart {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MainFrame mf = new MainFrame();
			}
		});
	}
}
