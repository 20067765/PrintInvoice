package zh.model;

import java.awt.Font;
import java.awt.print.Paper;
import java.text.SimpleDateFormat;
import java.util.Date;

import zh.util.UnitConversionUtil;

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
	protected Font font;
	/**
	 * ����
	 */
	protected String date = new SimpleDateFormat("yyyy-MM-dd")
			.format(new Date());

	protected void init() {
		double w = UnitConversionUtil.cmToInch(width) * 72;
		double h = UnitConversionUtil.cmToInch(height) * 72;
		super.setSize(w, h);
		super.setImageableArea(0, 0, w, h);
	}

}
