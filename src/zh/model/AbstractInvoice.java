package zh.model;

import java.awt.Font;
import java.awt.print.Paper;
/**
 * 发票的抽象类
 * @author 张豪
 * @version 1.0, 2013-05-27
 */
public abstract class AbstractInvoice extends Paper {
	/**
	 * 票据的宽度
	 */
	protected double width;
	/**
	 * 票据的高度
	 */
	protected double height;
	/**
	 * 字体
	 */
	protected Font font;
	
	public AbstractInvoice(){
		super.setSize(width, height);
		super.setImageableArea(0, 0, width, height);
	}
	
}
