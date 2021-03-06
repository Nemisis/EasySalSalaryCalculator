package com.asa.easysal.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asa.easysal.CalculationUtils;
import com.asa.easysal.R;

public class EasySalYearly extends BaseFragment {

	/**
	 * Create a new instance of CountingFragment, providing "num" as an
	 * argument.
	 */
	static EasySalYearly newInstance(int num) {
		EasySalYearly f = new EasySalYearly();

		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		overtimeTv.setVisibility(View.INVISIBLE);
		salaryTv.setText(R.string.yearly_salary);
		hoursWorkedTv.setText(R.string.yearly_monthly_hours);
	}

	@Override
	protected void calculateClicked() {
		makeCalculation(CalculationUtils.TYPE_YEARLY);
	}
}
