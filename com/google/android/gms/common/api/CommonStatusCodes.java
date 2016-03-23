package com.google.android.gms.common.api;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class CommonStatusCodes {
    public static String getStatusCodeString(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case v.m /*0*/:
                return "SUCCESS";
            case at.g /*1*/:
                return "SERVICE_MISSING";
            case at.i /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case at.o /*3*/:
                return "SERVICE_DISABLED";
            case at.p /*4*/:
                return "SIGN_IN_REQUIRED";
            case at.m /*5*/:
                return "INVALID_ACCOUNT";
            case Y.f /*6*/:
                return "RESOLUTION_REQUIRED";
            case aF.v /*7*/:
                return "NETWORK_ERROR";
            case aF.u /*8*/:
                return "INTERNAL_ERROR";
            case Y.l /*9*/:
                return "SERVICE_INVALID";
            case Y.t /*10*/:
                return "DEVELOPER_ERROR";
            case Y.j /*11*/:
                return "LICENSE_CHECK_FAILED";
            case Y.q /*13*/:
                return "ERROR_OPERATION_FAILED";
            case arj.Toolbar_titleMarginEnd /*14*/:
                return "INTERRUPTED";
            case arj.Toolbar_titleMarginTop /*15*/:
                return "TIMEOUT";
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                return "CANCELED";
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case 3001:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case 3002:
                return "AUTH_API_CLIENT_ERROR";
            case 3003:
                return "AUTH_API_SERVER_ERROR";
            case 3004:
                return "AUTH_TOKEN_ERROR";
            case 3005:
                return "AUTH_URL_RESOLUTION";
            default:
                return "unknown status code: " + i;
        }
    }
}
