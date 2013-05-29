package zh.util;

/**
 * 转换工具类
 * 
 * @author 张豪
 */
public class ConversionUtil {
	private static final double INCH_TO_CM = 2.54;
	private static String[] numberMap = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

	/**
	 * 厘米转换为英寸
	 * 
	 * @param cm 厘米
	 * @return 英寸
	 */
	public static double cmToInch(double cm) {
		return cm / INCH_TO_CM;
	}
}
