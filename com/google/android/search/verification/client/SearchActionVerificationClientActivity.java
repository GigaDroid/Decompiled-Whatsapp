package com.google.android.search.verification.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public abstract class SearchActionVerificationClientActivity extends Activity {
    public static int a;

    public abstract Class getServiceClass();

    protected final void onCreate(Bundle bundle) {
        int i = a;
        super.onCreate(bundle);
        Intent intent = new Intent(this, getServiceClass());
        intent.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
        startService(intent);
        finish();
        if (SearchActionVerificationClientService.a != 0) {
            a = i + 1;
        }
    }
}
