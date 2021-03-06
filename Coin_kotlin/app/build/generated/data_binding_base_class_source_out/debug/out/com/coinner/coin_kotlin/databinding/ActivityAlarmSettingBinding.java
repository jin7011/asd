// Generated by data binding compiler. Do not edit!
package com.coinner.coin_kotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.coinner.coin_kotlin.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAlarmSettingBinding extends ViewDataBinding {
  @NonNull
  public final Switch coinNotiChek;

  @NonNull
  public final Switch postNotiChek;

  protected ActivityAlarmSettingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Switch coinNotiChek, Switch postNotiChek) {
    super(_bindingComponent, _root, _localFieldCount);
    this.coinNotiChek = coinNotiChek;
    this.postNotiChek = postNotiChek;
  }

  @NonNull
  public static ActivityAlarmSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_alarm_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAlarmSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAlarmSettingBinding>inflateInternal(inflater, R.layout.activity_alarm_setting, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAlarmSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_alarm_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAlarmSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAlarmSettingBinding>inflateInternal(inflater, R.layout.activity_alarm_setting, null, false, component);
  }

  public static ActivityAlarmSettingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityAlarmSettingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAlarmSettingBinding)bind(component, view, R.layout.activity_alarm_setting);
  }
}
