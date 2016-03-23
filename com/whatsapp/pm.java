package com.whatsapp;

import android.app.Activity;
import com.whatsapp.Voip.CallInfo;
import com.whatsapp.Voip.CallState;

public interface pm {
    void a(CallInfo callInfo);

    void a(CallState callState, CallInfo callInfo);

    void b();

    Activity c();

    void d();

    void e(String str);

    void f();

    boolean g();
}
