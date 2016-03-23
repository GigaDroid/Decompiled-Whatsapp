package com.whatsapp;

final class as0 implements Runnable {
    public void run() {
        if (!SettingsPrivacy.b().isEmpty()) {
            SettingsPrivacy.b().clear();
            App.a(App.z().getApplicationContext(), 2131231144, 1);
            if (SettingsPrivacy.c() != null) {
                SettingsPrivacy.a(SettingsPrivacy.c());
            }
        }
    }

    as0() {
    }
}
