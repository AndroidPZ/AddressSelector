package com.xupz.addresslibrary;

import android.content.Context;
import android.os.Build;
import android.support.annotation.ColorRes;

/**
 * @author xupz
 */
public class DensityUtil {
	private static int widthPixels = -1;
	private static int heightPixels = -1;
	/**
	 * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}

	/**
	 * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
	 */
	public static int px2dip(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}
	/**
	 * 获取屏幕的宽度
	 *
	 * @param context
	 * @return
	 */
	public static int getScreenWidth(Context context) {

		if (context == null) {
			return 0;
		}
		if (widthPixels <= 0) {
			widthPixels = context.getResources().getDisplayMetrics().widthPixels;
		}
		return widthPixels;
	}
	/**
	 * 获取屏幕的高度
	 *
	 * @param context
	 * @return
	 */
	public static int getScreenHeight(Context context) {
		if (context == null) {
			return 0;
		}
		if (heightPixels <= 0) {
			heightPixels = context.getResources().getDisplayMetrics().heightPixels;
		}
		return heightPixels;
	}


	/**
	 * 获取Resource中的color
	 *
	 * @param context
	 * @param colorId
	 * @return
	 */
	public static int getColor(Context context, @ColorRes int colorId) {
		if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.LOLLIPOP_MR1) {
			//noinspection deprecation
			return context.getResources().getColor(colorId);
		} else {
			return context.getColor(colorId);
		}
	}
}