package zh.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * �ֽ�֧Ʊ��ҳ��
 * 
 * @author �ź�
 */
public class CashChequePanel extends JPanel {
	private GridBagLayout gridBagLayout = new GridBagLayout();

	public CashChequePanel() {
		this.init();
	}

	private void init() {
		this.setLayout(gridBagLayout);
		this.addLabel("��Ʊ���ڣ�", 0, 0);
		this.addTextField(200, 1, 0);
		this.addLabel("���������ƣ�", 0, 1);
		this.addTextField(400, 1, 1);
		this.setVisible(true);
	}

	private void addLabel(String name, int gridx, int gridy) {
		JLabel label = new JLabel(name);
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridheight = 1;
		gridBagConstraints.gridx = gridx;
		gridBagConstraints.gridy = gridy;
		gridBagLayout.setConstraints(label, gridBagConstraints);
		this.add(label);
	}

	private void addTextField(int width, int gridx, int gridy) {
		JTextField jTextField = new JTextField();
	
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridheight = 1;
		gridBagConstraints.gridx = gridx;
		gridBagConstraints.gridy = gridy;
		gridBagLayout.setConstraints(jTextField, gridBagConstraints);
		this.add(jTextField);
	}
}
