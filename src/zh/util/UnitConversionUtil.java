package zh.util;

/**
 * ��λת��������
 * 
 * @author �ź�
 */
public class UnitConversionUtil {
	private static final double INCH_TO_CM = 2.54;

	public static double cmToInch(double cm) {
		return cm / INCH_TO_CM;
	}
}
