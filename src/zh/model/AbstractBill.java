package zh.model;

import java.awt.print.Paper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import zh.util.ConversionUtil;

/**
 * ��Ʊ�ĳ�����
 * 
 * @author �ź�
 */
public abstract class AbstractBill extends Paper {
	/**
	 * Ʊ�ݵĿ�ȣ���λ����
	 */
	protected double width;
	/**
	 * Ʊ�ݵĸ߶ȣ���λ����
	 */
	protected double height;
	/**
	 * ����
	 */
	protected String date = new SimpleDateFormat("yyyy-MM-dd")
			.format(new Date());

	protected void init() {
		double w = ConversionUtil.cmToInch(width) * 72;
		double h = ConversionUtil.cmToInch(height) * 72;
		super.setSize(w, h);
		super.setImageableArea(0, 0, w, h);
	}

	public abstract List<PrintInfo> getPrintInfos();
	/**
	 * ��¼��ӡ��Ϣ��bean��������ӡ�����ݣ�λ�õ���Ϣ
	 * @author �ź�
	 */
	protected class PrintInfo{
		private String printString;
		private int x;
		private int y;
		public PrintInfo(String printString, int x, int y) {
			this.printString = printString;
			this.x = x;
			this.y = y;
		}
		public String getPrintString() {
			return printString;
		}
		public void setPrintString(String printString) {
			this.printString = printString;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
	}
}
