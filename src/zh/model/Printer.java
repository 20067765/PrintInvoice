package zh.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 * ��ӡ��������
 * 
 * @author �ź�
 * @version 1.0, 2013-05-27
 */
public class Printer implements Printable {
	private AbstractBill bill;

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		if (pageIndex >= 1)
			// �˳���ӡ
			return Printable.NO_SUCH_PAGE;
		else {
			Graphics2D g2 = (Graphics2D) graphics;
			g2.setColor(Color.BLACK);
			pageFormat.setPaper(bill);
			drawCurrentPageText(g2,pageFormat);

			return PAGE_EXISTS;
		}
	}

	// ��ӡ����
	private void drawCurrentPageText(Graphics2D g2, PageFormat pf) {
		Font font = null;
		// ���ô�ӡ������
		font = new Font("������", Font.BOLD, 9);
		g2.setFont(font);// ��������
		// �˴���ӡһ�仰����ӡ��ʼλ����(200,200),��ʾ��pf.getPaper()������Ϊ(200,200)��ʼ��ӡ
		// �˴�200�ĵ�λ��1/72(inch)��inch:Ӣ�磬��������ĳ��ȣ��ڲ�������Ҫ����ת��
		g2.drawString("����Ҽ��     Ҽʰ     Ҽʰ", 190, 37);//55
	}

	// ���Ӵ�ӡ����������ӡ�Ի���
	public void starPrint() {
		try {
			PrinterJob prnJob = PrinterJob.getPrinterJob();
			PageFormat pageFormat = new PageFormat();
			pageFormat.setOrientation(PageFormat.PORTRAIT);
			prnJob.setPrintable(this);
			// ������ӡ�Ի���Ҳ����ѡ�񲻵�����ӡ��ʾ��ֱ�Ӵ�ӡ
			if (!prnJob.printDialog())
				return;
			// ��ȡ�����ӵ�Ŀ���ӡ���Ľ�ֽ���Ŀ�ȣ���λ��1/72(inch)
//			paperW = prnJob.getPageFormat(null).getPaper().getWidth();
//			// ��ȡ�����ӵ�Ŀ���ӡ���Ľ�ֽ���Ŀ�ȣ���λ��1/72(inch)
//			paperH = prnJob.getPageFormat(null).getPaper().getHeight();
//			System.out.println("paperW:" + paperW + ";paperH:" + paperH);
			prnJob.print();// ������ӡ����
		} catch (PrinterException ex) {
			ex.printStackTrace();
			System.err.println("��ӡ����" + ex.toString());
		}
	}

	public static void main(String[] args) {
		Printer pm = new Printer();// ʵ������ӡ��
		Cheque cheque = new Cheque();
		pm.setBill(cheque);
		pm.starPrint();
	}

	public void setBill(AbstractBill bill) {
		this.bill = bill;
	}

}
