package zh.model;

import java.awt.Font;
import java.awt.print.Paper;
/**
 * ��Ʊ�ĳ�����
 * @author �ź�
 * @version 1.0, 2013-05-27
 */
public abstract class AbstractInvoice extends Paper {
	/**
	 * Ʊ�ݵĿ��
	 */
	protected double width;
	/**
	 * Ʊ�ݵĸ߶�
	 */
	protected double height;
	/**
	 * ����
	 */
	protected Font font;
	
	public AbstractInvoice(){
		super.setSize(width, height);
		super.setImageableArea(0, 0, width, height);
	}
	
}
