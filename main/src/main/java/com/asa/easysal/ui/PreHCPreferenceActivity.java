package com.asa.easysal.ui;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.asa.easysal.R;
import com.asa.easysal.SettingsUtil;
import com.asa.easysal.analytics.AnalyticsContants;
import com.asa.easysal.analytics.AnalyticsHelper;

public class PreHCPreferenceActivity extends PreferenceActivity {
	// We are using deprecation because of compatibility.
	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.layout.preferences);

		SettingsUtil.launchAbout(this,
				findPreference(SettingsUtil.PREFERENCES_ABOUT));
		SettingsUtil.launchHome(this,
				findPreference(SettingsUtil.PREFERENCES_HOMEPAGE));

		AnalyticsHelper.sendScreenView(this, AnalyticsContants.SCREEN_SETTINGS_SCREEN);
	}
}
