package com.wdy.utils;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author wangdy
 */
public class ColorUtils {
	private static int[] safeColors = new int[] { 0xFFFF00, 0x6DC8FE, 0x74C366, 0xC4FD3D, 0xFF5CCA, 0xFFB909, 0xFF0000,
			0x4444FF, 0xFF00FF, 0x00FF00, 0x8D85F3, 0xAD3B6E, 0xEACC00, 0x12B3B5, 0x157419, 0xFAFD9E, 0x817C4E,
			0x002A97, 0x00CF00, 0xF9FD5F, 0xEA8F00, 0xCCBB00, 0x837C04, 0xEAAF00, 0xFFD660, 0xFFC73B, 0xFFAB00,
			0xFF7D00, 0xED7600, 0xFF5700, 0xEE5019, 0xB1441E, 0xFFC3C0, 0xFF897C, 0xFF6044, 0xFF4105, 0xDA4725,
			0x942D0C, 0xFF3932, 0x862F2F, 0xFF5576, 0x562B29, 0xF51D30, 0xDE0056, 0xED5394, 0xB90054, 0x8F005C,
			0xF24AC8, 0xE8CDEF, 0xD8ACE0, 0xA150AA, 0x750F7D, 0x8D00BA, 0x623465, 0x55009D, 0x3D168B, 0x311F4E,
			0xD2D8F9, 0x9FA4EE, 0x6557D0, 0x4123A1, 0x4668E4, 0x0D006A, 0x00004D, 0x001D61, 0x00234B, 0x002A8F,
			0x2175D9, 0x7CB3F1, 0x005199, 0x004359, 0x00A0C1, 0x007283, 0x00BED9, 0xAFECED, 0x55D6D3, 0x00BBB4,
			0x009485, 0x005D57, 0x008A77, 0x008A6D, 0x00B99B, 0x009F67, 0x00694A, 0x00A348, 0x00BF47, 0x96E78A,
			0x00BD27, 0x35962B, 0x7EE600, 0x6EA100, 0xCAF100, 0xF5F800, 0xCDCFC4, 0xBCBEB3, 0xAAABA1, 0x8F9286,
			0x797C6E, 0x2E3127,

	};

	public static int nextColor() {
		return new Random().nextInt();
	}

	public static int getColorByIndex(int index) {
		System.out.println(index + "###" + safeColors[index]);
		return safeColors[index];
	}

	public static int[] getColor(int count) {
		int[] colors = new int[count];
		int tc = Math.min(count, safeColors.length);
		System.arraycopy(safeColors, 0, colors, 0, tc);
		if (count > tc) {
			for (int i = tc; i < count; i++) {
				colors[i] = nextColor();
			}
		}
		return colors;
	}

	/**
	 * 字符串转换成Color对象
	 * 
	 * @param colorStr
	 *            16进制颜色字符串
	 * @return Color对象
	 */
	public static Color toColorFromString(String colorStr) {
		System.out.println("1----" + colorStr);
		colorStr = colorStr.substring(2);
		System.out.println("2----" + colorStr);
		Color color = new Color(Integer.parseInt(colorStr, 16));
		// java.awt.Color[r=0,g=0,b=255]
		return color;
	}

}
