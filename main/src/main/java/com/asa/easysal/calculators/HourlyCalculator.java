package com.asa.easysal.calculators;

import android.content.Context;
import android.os.Parcel;
import android.support.annotation.NonNull;

import com.asa.easysal.CalculationUtils;
import com.asa.easysal.EsException;
import com.asa.easysal.R;
import com.asa.easysal.SettingsUtil;
import com.asa.easysal.analytics.AnalyticsContants;
import com.asa.easysal.analytics.AnalyticsHelper;

import timber.log.Timber;

public class HourlyCalculator implements EsCalculator {

    @Override
    public boolean canHaveOvertime(Context context) {
        return SettingsUtil.isOvertime(context);
    }

    @Override
    public void performCalculation(Context context, double[] values, CalculatorCallback callback) {
        double[] results = CalculationUtils.performCalculation(context, CalculatorType.HOURLY,
                canHaveOvertime(context), values);
        if (results != null) {
            callback.success(results);
        } else {
            Timber.e(new EsException(values), "");
            callback.failure(R.string.default_error);
        }
    }

    @Override
    public int getSalaryHintText() {
        return R.string.hourly_wage;
    }

    @Override
    public int getHoursHintText() {
        return R.string.hours_worked;
    }

    @Override
    public void sendAnalyticsCalculateClickedEvent(@NonNull Context context) {
        AnalyticsHelper.sendEvent(context, "", AnalyticsContants.EVENT_CALCULATE_CLICKED,
                AnalyticsContants.CALC_TYPE_HOURLY);
    }

    @NonNull
    @Override
    public String getType() {
        return "Hourly";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public static final Creator<HourlyCalculator> CREATOR = new Creator<HourlyCalculator>() {
        @Override
        public HourlyCalculator createFromParcel(Parcel in) {
            return new HourlyCalculator();
        }

        @Override
        public HourlyCalculator[] newArray(int size) {
            return new HourlyCalculator[size];
        }
    };
}
