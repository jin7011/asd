// Generated by data binding compiler. Do not edit!
package com.coinner.coin_kotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.coinner.coin_kotlin.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAlarmBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout L1;

  @NonNull
  public final LinearLayout L2;

  @NonNull
  public final ImageButton addBtn;

  @NonNull
  public final LinearLayout alarmLayout;

  @NonNull
  public final EditText alarmPriceET;

  @NonNull
  public final RecyclerView alarmRecycler;

  @NonNull
  public final TextView alarmSizeT;

  @NonNull
  public final ImageButton downBtn;

  @NonNull
  public final TextView priceT;

  @NonNull
  public final TextView rateT;

  @NonNull
  public final ImageButton resetBtn;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final Toolbar toolbarAlarm;

  @NonNull
  public final ImageButton upBtn;

  protected ActivityAlarmBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout L1, LinearLayout L2, ImageButton addBtn, LinearLayout alarmLayout,
      EditText alarmPriceET, RecyclerView alarmRecycler, TextView alarmSizeT, ImageButton downBtn,
      TextView priceT, TextView rateT, ImageButton resetBtn, TextView textView, TextView textView3,
      Toolbar toolbarAlarm, ImageButton upBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.L1 = L1;
    this.L2 = L2;
    this.addBtn = addBtn;
    this.alarmLayout = alarmLayout;
    this.alarmPriceET = alarmPriceET;
    this.alarmRecycler = alarmRecycler;
    this.alarmSizeT = alarmSizeT;
    this.downBtn = downBtn;
    this.priceT = priceT;
    this.rateT = rateT;
    this.resetBtn = resetBtn;
    this.textView = textView;
    this.textView3 = textView3;
    this.toolbarAlarm = toolbarAlarm;
    this.upBtn = upBtn;
  }

  @NonNull
  public static ActivityAlarmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_alarm, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAlarmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAlarmBinding>inflateInternal(inflater, R.layout.activity_alarm, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAlarmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_alarm, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAlarmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAlarmBinding>inflateInternal(inflater, R.layout.activity_alarm, null, false, component);
  }

  public static ActivityAlarmBinding bind(@NonNull View view) {
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
  public static ActivityAlarmBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAlarmBinding)bind(component, view, R.layout.activity_alarm);
  }
}
