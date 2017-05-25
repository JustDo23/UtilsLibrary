package com.just.utilslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.just.utils.log.LogUtils;
import com.just.utils.toast.ToastUtil;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ToastUtil.showLongToast(this, "Test this lib.");
    LogUtils.e("Test this lib.");
  }
}
