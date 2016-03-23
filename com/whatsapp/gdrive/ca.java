package com.whatsapp.gdrive;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class ca implements OnItemSelectedListener {
    final GoogleDriveNewUserSetupActivity a;

    ca(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        this.a = googleDriveNewUserSetupActivity;
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (GoogleDriveNewUserSetupActivity.c(this.a).getVisibility() == 0) {
            GoogleDriveNewUserSetupActivity.a(this.a, String.valueOf(adapterView.getItemAtPosition(i)), null);
        }
    }
}
