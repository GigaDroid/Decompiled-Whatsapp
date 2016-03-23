package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.app.AlertDialog.Builder;

public class aro {
    public static Dialog b(Activity activity) {
        Dialog com_whatsapp_ai7 = new ai7(activity, 2130903094, activity);
        com_whatsapp_ai7.setOnCancelListener(new d9(activity));
        return com_whatsapp_ai7;
    }

    public static Dialog a(Activity activity) {
        Dialog com_whatsapp_aif = new aif(activity, 2130903275, activity);
        com_whatsapp_aif.setOnCancelListener(new v5(activity));
        return com_whatsapp_aif;
    }

    public static Dialog a(Activity activity, String str, String str2) {
        return new Builder(activity).setMessage((CharSequence) str).setPositiveButton(2131232177, new q(activity, str2)).setNegativeButton(2131230884, new f3()).create();
    }
}
