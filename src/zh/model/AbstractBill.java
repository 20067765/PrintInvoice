package zh.model;

import java.awt.Font;
import java.awt.print.Paper;
import java.text.SimpleDateFormat;
import java.util.Date;

import zh.util.UnitConversionUtil;

/**
 * 发票的抽象类
 * 
 * @author 张豪
 */
public abstract class AbstractBill extends Paper {
	/**
	 * 票据的宽度，单位厘米
	 */
	protected double width;
	/**
	 * 票据的高度，单位厘米
	 */
	protected double height;
	/**
	 * 字体
	 */
	protected Font font;
	/**
	 * 日期
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
