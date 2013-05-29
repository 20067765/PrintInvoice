package zh.util;

/**
 * ת��������
 * 
 * @author �ź�
 */
public class ConversionUtil {
	private static final double INCH_TO_CM = 2.54;
	private static String[] numberMap = {"��","Ҽ","��","��","��","��","½","��","��","��"};

	/**
	 * ����ת��ΪӢ��
	 * 
	 * @param cm ����
	 * @return Ӣ��
	 */
	public static double cmToInch(double cm) {
		return cm / INCH_TO_CM;
	}
}
