package com.whatsapp.gdrive;

import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RadioGroup;
import android.widget.ScrollView;

class c8 implements OnGlobalLayoutListener {
    final GoogleDriveNewUserSetupActivity a;

    public void onGlobalLayout() {
        int measuredHeight;
        int i = 8;
        int measuredHeight2 = ((ScrollView) this.a.findViewById(2131755233)).getChildAt(0).getMeasuredHeight();
        if (GoogleDriveNewUserSetupActivity.c(this.a).getVisibility() == 0) {
            measuredHeight = GoogleDriveNewUserSetupActivity.c(this.a).getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        measuredHeight = ((double) ((float) this.a.getWindowManager().getDefaultDisplay().getHeight())) < 0.7d * ((double) ((float) ((GoogleDriveNewUserSetupActivity.b(this.a).getVisibility() == 0 ? 0 : GoogleDriveNewUserSetupActivity.b(this.a).getMeasuredHeight()) + (measuredHeight2 - measuredHeight)))) ? 1 : 0;
        AppCompatSpinner c = GoogleDriveNewUserSetupActivity.c(this.a);
        if (measuredHeight != 0) {
            measuredHeight2 = 0;
        } else {
            measuredHeight2 = 8;
        }
        c.setVisibility(measuredHeight2);
        RadioGroup b = GoogleDriveNewUserSetupActivity.b(this.a);
        if (measuredHeight != 0) {
            measuredHeight2 = 8;
        } else {
            measuredHeight2 = 0;
        }
        b.setVisibility(measuredHeight2);
        View findViewById = this.a.findViewById(2131755236);
        if (measuredHeight == 0) {
            i = 0;
        }
        findViewById.setVisibility(i);
        GoogleDriveNewUserSetupActivity.b(this.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    c8(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        this.a = googleDriveNewUserSetupActivity;
    }
}
