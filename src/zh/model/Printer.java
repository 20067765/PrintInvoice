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
 * 打印机抽象类
 * 
 * @author 张豪
 * @version 1.0, 2013-05-27
 */
public class Printer implements Printable {
	private AbstractBill bill;

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		if (pageIndex >= 1)
			// 退出打印
			return Printable.NO_SUCH_PAGE;
		else {
			Graphics2D g2 = (Graphics2D) graphics;
			g2.setColor(Color.BLACK);
			pageFormat.setPaper(bill);
			drawCurrentPageText(g2,pageFormat);

			return PAGE_EXISTS;
		}
	}

	// 打印内容
	private void drawCurrentPageText(Graphics2D g2, PageFormat pf) {
		Font font = null;
		// 设置打印的字体
		font = new Font("新宋体", Font.BOLD, 9);
		g2.setFont(font);// 设置字体
		// 此处打印一句话，打印开始位置是(200,200),表示从pf.getPaper()中座标为(200,200)开始打印
		// 此处200的单位是1/72(inch)，inch:英寸，所以这里的长度，在测量后需要进行转换
		g2.drawString("贰零壹叁     壹拾     壹拾", 190, 37);//55
	}

	// 连接打印机，弹出打印对话框
	public void starPrint() {
		try {
			PrinterJob prnJob = PrinterJob.getPrinterJob();
			PageFormat pageFormat = new PageFormat();
			pageFormat.setOrientation(PageFormat.PORTRAIT);
			prnJob.setPrintable(this);
			// 弹出打印对话框，也可以选择不弹出打印提示框，直接打印
			if (!prnJob.printDialog())
				return;
			// 获取所连接的目标打印机的进纸规格的宽度，单位：1/72(inch)
//			paperW = prnJob.getPageFormat(null).getPaper().getWidth();
//			// 获取所连接的目标打印机的进纸规格的宽度，单位：1/72(inch)
//			paperH = prnJob.getPageFormat(null).getPaper().getHeight();
//			System.out.println("paperW:" + paperW + ";paperH:" + paperH);
			prnJob.print();// 启动打印工作
		} catch (PrinterException ex) {
			ex.printStackTrace();
			System.err.println("打印错误：" + ex.toString());
		}
	}

	public static void main(String[] args) {
		Printer pm = new Printer();// 实例化打印类
		Cheque cheque = new Cheque();
		pm.setBill(cheque);
		pm.starPrint();
	}

	public void setBill(AbstractBill bill) {
		this.bill = bill;
	}

}
