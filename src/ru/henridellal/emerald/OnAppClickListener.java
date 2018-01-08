package ru.henridellal.emerald;

import java.lang.ref.SoftReference;
import android.view.View;

public class OnAppClickListener implements View.OnClickListener {
	private SoftReference<Apps> appsRef;
	public OnAppClickListener(Apps apps) {
		appsRef = new SoftReference<Apps>(apps);
	}
	
	@Override
	public void onClick(View arg0) {
		if (arg0.getTag() instanceof AppData) {
			appsRef.get().launch((AppData)arg0.getTag());
		}
	}
}
