package com.google.android.gms.internal;

public enum zzkc {
    SUCCESS("Ok"),
    BAD_AUTHENTICATION("BadAuthentication"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    UNKNOWN("Unknown"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    ACCOUNT_DELETED("AccountDeleted"),
    ACCOUNT_DISABLED("AccountDisabled"),
    SERVICE_DISABLED("ServiceDisabled"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    CAPTCHA("CaptchaRequired"),
    NETWORK_ERROR("NetworkError"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_REQUIRED("DeviceManagementRequired"),
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    NEED_PERMISSION("NeedPermission"),
    BAD_PASSWORD("WeakPassword"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    DELETED_GMAIL("DeletedGmail"),
    SOCKET_TIMEOUT("SocketTimeout"),
    EXISTING_USERNAME("ExistingUsername"),
    NEEDS_BROWSER("NeedsBrowser"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    INVALID_SCOPE("INVALID_SCOPE");
    
    public static final zzkc SUCCESS;
    public static final zzkc NEED_PERMISSION;
    public static final zzkc BAD_PASSWORD;
    public static final zzkc ALREADY_HAS_GMAIL;
    public static final zzkc BAD_REQUEST;
    public static final zzkc BAD_USERNAME;
    public static final zzkc LOGIN_FAIL;
    public static final zzkc NOT_LOGGED_IN;
    public static final zzkc NO_GMAIL;
    public static final zzkc REQUEST_DENIED;
    public static final zzkc SERVER_ERROR;
    public static final zzkc USERNAME_UNAVAILABLE;
    public static final zzkc DELETED_GMAIL;
    public static final zzkc SOCKET_TIMEOUT;
    public static final zzkc EXISTING_USERNAME;
    public static final zzkc NEEDS_BROWSER;
    public static final zzkc GPLUS_OTHER;
    public static final zzkc GPLUS_NICKNAME;
    public static final zzkc GPLUS_INVALID_CHAR;
    public static final zzkc GPLUS_INTERSTITIAL;
    public static final zzkc GPLUS_PROFILE_ERROR;
    public static final zzkc INVALID_SCOPE;
    public static final zzkc BAD_AUTHENTICATION;
    public static final zzkc EMPTY_CONSUMER_PKG_OR_SIG;
    public static final zzkc NEEDS_2F;
    public static final zzkc NEEDS_POST_SIGN_IN_FLOW;
    public static final zzkc NOT_VERIFIED;
    public static final zzkc TERMS_NOT_AGREED;
    public static final zzkc UNKNOWN;
    public static final zzkc UNKNOWN_ERROR;
    public static final zzkc ACCOUNT_DELETED;
    public static final zzkc ACCOUNT_DISABLED;
    public static final zzkc SERVICE_DISABLED;
    public static final zzkc SERVICE_UNAVAILABLE;
    public static final zzkc CAPTCHA;
    public static final zzkc NETWORK_ERROR;
    public static final zzkc USER_CANCEL;
    public static final zzkc PERMISSION_DENIED;
    @Deprecated
    public static final zzkc DEVICE_MANAGEMENT_REQUIRED;
    public static final zzkc THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED;
    public static final zzkc DM_INTERNAL_ERROR;
    public static final zzkc DM_SYNC_DISABLED;
    public static final zzkc DM_ADMIN_BLOCKED;
    public static final zzkc DM_ADMIN_PENDING_APPROVAL;
    public static final zzkc DM_STALE_SYNC_REQUIRED;
    public static final zzkc DM_DEACTIVATED;
    public static final zzkc DM_REQUIRED;
    public static final zzkc CLIENT_LOGIN_DISABLED;
    private final String zzSV;

    private zzkc(String str) {
        this.zzSV = str;
    }

    public String zzlL() {
        return this.zzSV;
    }
}
