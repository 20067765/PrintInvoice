package zh.business;

import javax.swing.SwingUtilities;

import zh.view.MainFrame;

/**
 * ��������
 * @author �ź�
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
