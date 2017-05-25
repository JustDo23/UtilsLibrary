package com.just.utils.toast;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * 吐司工具类
 *
 * @author JustDo23
 */
public class ToastUtil {

  /**
   * 显示短时间吐司
   *
   * @param text 要显示的文本内容[String类型]
   */
  public static void showShortToast(Context context, String text) {
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
  }

  /**
   * 显示短时间吐司
   *
   * @param resId 要显示的文本内容对应的资源ID[int类型]
   */
  public static void showShortToast(Context context, int resId) {
    Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
  }

  /**
   * 显示长时间吐司
   *
   * @param text 要显示的文本内容[String类型]
   */
  public static void showLongToast(Context context, String text) {
    Toast.makeText(context, text, Toast.LENGTH_LONG).show();
  }

  /**
   * 显示长时间吐司
   *
   * @param resId 要显示的文本内容对应的资源ID[int类型]
   */
  public static void showLongToast(Context context, int resId) {
    Toast.makeText(context, resId, Toast.LENGTH_LONG).show();
  }

  /**
   * 位置在中间显示短时间吐司
   *
   * @param text 要显示的文本内容[String类型]
   */
  public static void showCenterToast(Context context, String text) {
    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
    toast.setGravity(Gravity.CENTER, 0, 0);
    toast.show();
  }

}
