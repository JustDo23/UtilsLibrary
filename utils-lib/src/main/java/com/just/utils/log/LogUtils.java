package com.just.utils.log;

import android.util.Log;

/**
 * 打印日志工具类
 *
 * @author JustDo23
 * @since 2017年05月06日
 */
public class LogUtils {

  public static boolean DEBUG = true;
  private static String TAG = "JustDo23";

  public static void e(String tag, String content) {
    if (DEBUG) Log.e(tag, content);
  }

  public static void e(String content) {
    if (DEBUG) Log.e(TAG, content);
  }

}
