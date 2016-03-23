package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.d;
import com.google.android.gms.internal.zzlp;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class zzg {
    public static String zzb(Context context, int i, String str) {
        Resources resources = context.getResources();
        switch (i) {
            case at.g /*1*/:
                if (zzlp.zzb(resources)) {
                    return resources.getString(d.common_google_play_services_install_text_tablet, new Object[]{str});
                }
                return resources.getString(d.common_google_play_services_install_text_phone, new Object[]{str});
            case at.i /*2*/:
                return resources.getString(d.common_google_play_services_update_text, new Object[]{str});
            case at.o /*3*/:
                return resources.getString(d.common_google_play_services_enable_text, new Object[]{str});
            case at.m /*5*/:
                return resources.getString(d.common_google_play_services_invalid_account_text);
            case aF.v /*7*/:
                return resources.getString(d.common_google_play_services_network_error_text);
            case Y.l /*9*/:
                return resources.getString(d.common_google_play_services_unsupported_text, new Object[]{str});
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                return resources.getString(d.common_google_play_services_api_unavailable_text, new Object[]{str});
            case arj.Toolbar_maxButtonHeight /*17*/:
                return resources.getString(d.common_google_play_services_sign_in_failed_text);
            case arj.Toolbar_collapseIcon /*18*/:
                return resources.getString(d.common_google_play_services_updating_text, new Object[]{str});
            case arj.Theme_dialogTheme /*42*/:
                return resources.getString(d.common_android_wear_update_text, new Object[]{str});
            default:
                return resources.getString(d.common_google_play_services_unknown_issue);
        }
    }

    public static final String zzg(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case at.g /*1*/:
                return resources.getString(d.common_google_play_services_install_title);
            case at.i /*2*/:
                return resources.getString(d.common_google_play_services_update_title);
            case at.o /*3*/:
                return resources.getString(d.common_google_play_services_enable_title);
            case at.p /*4*/:
            case Y.f /*6*/:
                return null;
            case at.m /*5*/:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return resources.getString(d.common_google_play_services_invalid_account_title);
            case aF.v /*7*/:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return resources.getString(d.common_google_play_services_network_error_title);
            case aF.u /*8*/:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case Y.l /*9*/:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(d.common_google_play_services_unsupported_title);
            case Y.t /*10*/:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case Y.j /*11*/:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case arj.Toolbar_maxButtonHeight /*17*/:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return resources.getString(d.common_google_play_services_sign_in_failed_title);
            case arj.Toolbar_collapseIcon /*18*/:
                return resources.getString(d.common_google_play_services_updating_title);
            case arj.Theme_dialogTheme /*42*/:
                return resources.getString(d.common_android_wear_update_title);
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
        }
    }

    public static String zzh(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case at.g /*1*/:
                return resources.getString(d.common_google_play_services_install_button);
            case at.i /*2*/:
            case arj.Theme_dialogTheme /*42*/:
                return resources.getString(d.common_google_play_services_update_button);
            case at.o /*3*/:
                return resources.getString(d.common_google_play_services_enable_button);
            default:
                return resources.getString(17039370);
        }
    }
}
