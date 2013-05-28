package zh.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
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
	private Paper paper;

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		if (pageIndex >= 1)
			// �˳���ӡ
			return Printable.NO_SUCH_PAGE;
		else {
			Graphics2D g2 = (Graphics2D) graphics;
			g2.setColor(Color.BLACK);
			pageFormat.setPaper(paper);
			drawCurrentPageText(g2, pageFormat);// ���ô�ӡ���ݵķ���
			return PAGE_EXISTS;
		}
	}

	// ��ӡ����
	private void drawCurrentPageText(Graphics2D g2, PageFormat pf) {
		Font font = null;
		// ���ô�ӡ������
		font = new Font("������", Font.BOLD, 11);
		g2.setFont(font);// ��������
		// �˴���ӡһ�仰����ӡ��ʼλ����(200,200),��ʾ��pf.getPaper()������Ϊ(200,200)��ʼ��ӡ
		// �˴�200�ĵ�λ��1/72(inch)��inch:Ӣ�磬��������ĳ��ȣ��ڲ�������Ҫ����ת��
		int x = 11;
		int y = 11;
		g2.drawString("x:" + x + ",y:" + y, x, y);
		g2.drawString("x:" + x + ",y:" + y, x, y+11);
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
		pm.starPrint();
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}
}
