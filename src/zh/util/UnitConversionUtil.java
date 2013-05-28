package zh.util;

/**
 * 单位转换工具类
 * 
 * @author 张豪
 */
public class UnitConversionUtil {
	private static final double INCH_TO_CM = 2.54;

	public static double cmToInch(double cm) {
		return cm / INCH_TO_CM;
	}
}
