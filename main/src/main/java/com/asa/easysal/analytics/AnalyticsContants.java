package com.asa.easysal.analytics;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface AnalyticsContants {

    String EVENT_CALCULATE_CLICKED = "calculate_clicked";
    String EVENT_SETTINGS_ACTION_CLICKED = "settings_action_clicked";
    String EVENT_OVERTIME_TURNED_ON = "overtime_turned_on";
    String EVENT_OVERTIME_TURNED_OFF = "overtime_turned_off";
    String EVENT_OVERTIME_AMOUNT_CHANGED = "overtime_amount_changed";
    String EVENT_OPEN_SOURCE_LICENSES_CLICKED = "open_source_licenses_clicked";
    String EVENT_OVERTIME_INFO_BTN_CLICKED = "overtime_info_btn_clicked";
    String EVENT_CLEAR_FIELDS_TOGGLED = "clear_fields_toggled";
    String SCREEN_HOURLY_CALCULATE_SCREEN = "hourly_calculate_screen";
    String SCREEN_DAILY_CALCULATE_SCREEN = "daily_calculate_screen";
    String SCREEN_WEEKLY_CALCULATE_SCREEN = "weekly_calculate_screen";
    String SCREEN_BIWEEKLY_CALCULATE_SCREEN = "biweekly_calculate_screen";
    String SCREEN_MONTHLY_CALCULATE_SCREEN = "monthly_calculate_screen";
    String SCREEN_YEARLY_CALCULATE_SCREEN = "yearly_calculate_screen";
    String SCREEN_SETTINGS_SCREEN = "settings_screen";
    String CALC_TYPE_HOURLY = "Hourly";
    String CALC_TYPE_DAILY = "Daily";
    String CALC_TYPE_WEEKLY = "Weekly";
    String CALC_TYPE_BIWEEKLY = "Biweekly";
    String CALC_TYPE_MONTHLY = "Monthly";
    String CALC_TYPE_YEARLY = "Yearly";
    @Retention(RetentionPolicy.SOURCE)
    @StringDef({
            EVENT_CALCULATE_CLICKED, EVENT_SETTINGS_ACTION_CLICKED, EVENT_OVERTIME_TURNED_ON, EVENT_OVERTIME_TURNED_OFF,
            EVENT_OVERTIME_AMOUNT_CHANGED, EVENT_OPEN_SOURCE_LICENSES_CLICKED, EVENT_OVERTIME_INFO_BTN_CLICKED,
            EVENT_CLEAR_FIELDS_TOGGLED
    })
    @interface Events {
    }
    @Retention(RetentionPolicy.SOURCE)
    @StringDef({
            SCREEN_HOURLY_CALCULATE_SCREEN, SCREEN_DAILY_CALCULATE_SCREEN, SCREEN_WEEKLY_CALCULATE_SCREEN,
            SCREEN_BIWEEKLY_CALCULATE_SCREEN, SCREEN_MONTHLY_CALCULATE_SCREEN, SCREEN_YEARLY_CALCULATE_SCREEN,
            SCREEN_SETTINGS_SCREEN
    })
    @interface Screens {
    }
    @Retention(RetentionPolicy.SOURCE)
    @StringDef({
            CALC_TYPE_HOURLY, CALC_TYPE_DAILY, CALC_TYPE_WEEKLY, CALC_TYPE_BIWEEKLY, CALC_TYPE_MONTHLY, CALC_TYPE_YEARLY
    })
    @interface CalculationTypes {

    }

}
