package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

class b2 implements OnClickListener {
    final RadioButton a;
    final String b;
    final GoogleDriveNewUserSetupActivity c;

    b2(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity, String str, RadioButton radioButton) {
        this.c = googleDriveNewUserSetupActivity;
        this.b = str;
        this.a = radioButton;
    }

    public void onClick(View view) {
        GoogleDriveNewUserSetupActivity.a(this.c, this.b, this.a);
    }
}
