package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.Serializable;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class Statistics$Data implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    final long last_reset;
    long rx_google_drive_bytes;
    long rx_media_bytes;
    long rx_media_msgs;
    long rx_message_service_bytes;
    long rx_offline_delay;
    long rx_offline_msgs;
    long rx_roaming_bytes;
    long rx_text_msgs;
    long rx_voip_bytes;
    long rx_voip_calls;
    long tx_google_drive_bytes;
    long tx_media_bytes;
    long tx_media_msgs;
    long tx_message_service_bytes;
    long tx_roaming_bytes;
    long tx_text_msgs;
    long tx_voip_bytes;
    long tx_voip_calls;

    static {
        String[] strArr = new String[28];
        String str = "~$\\b1-fWs7;/Ss0~";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 94;
                        break;
                    case at.g /*1*/:
                        i3 = 70;
                        break;
                    case at.i /*2*/:
                        i3 = 37;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 84;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "~$\\b1-fVs:*j\u0005";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "~$\\b1-fWs7;/Ss0~";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "~i\u0005[1:/D6\u0019;5Vw3;5\u001f6";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "~4@u170@rtv";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "~)Pb31/Kqt='Iz'rf";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "~i\u0005[1-5Dq1~\u0015@d\"7%@,t";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "~$\\b1-fVs:*j\u0005";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "~/Ku;3/Kqt='Iz'rf";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\n#]bt\u0013#Ve59#V,t";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "~4@u170@r";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "~+Vs7~'Ss&?!@60;*Do}";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "~5@x ~n";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "~5@x rf";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "qfqy ?*\u0005R5*'\u001f6";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "~$\\b1-fWs7;/Ss0";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "~4@u170@rtv";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "~$\\b1-fVs:*j\u0005";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "~$\\b1-fWs7;/Ss0";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "~$\\b1-fWs7;/Ss0";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "~i\u0005@;76\u0005U52*V,t";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    str = "~i\u0005Y28*Lx1~\u000b@e'?!@en~";
                    obj = 21;
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "~$\\b1-o\t6";
                    obj = 22;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "~$\\b1-o";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "~i\u0005Q;1!Ist\u001a4L`1df";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "~$\\b1-fVs:*j\u0005";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "~$\\b1-fVs:*j\u0005";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "~i\u0005D;?+Lx3df";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public long getTotalBytesSent() {
        return ((this.tx_media_bytes + this.tx_message_service_bytes) + this.tx_voip_bytes) + this.tx_google_drive_bytes;
    }

    Statistics$Data(boolean z) {
        this.rx_text_msgs = 0;
        this.tx_text_msgs = 0;
        this.rx_media_msgs = 0;
        this.tx_media_msgs = 0;
        this.rx_offline_msgs = 0;
        this.rx_offline_delay = 0;
        this.rx_media_bytes = 0;
        this.tx_media_bytes = 0;
        this.rx_message_service_bytes = 0;
        this.tx_message_service_bytes = 0;
        this.rx_voip_calls = 0;
        this.tx_voip_calls = 0;
        this.rx_voip_bytes = 0;
        this.tx_voip_bytes = 0;
        this.rx_google_drive_bytes = 0;
        this.tx_google_drive_bytes = 0;
        this.rx_roaming_bytes = 0;
        this.tx_roaming_bytes = 0;
        if (z) {
            this.last_reset = System.currentTimeMillis();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.last_reset = Long.MIN_VALUE;
    }

    public long getIncomingVoipCalls() {
        return this.rx_voip_calls;
    }

    public long getVoipBytesSent() {
        return this.tx_voip_bytes;
    }

    public long getTotalBytesSentToGoogleDrive() {
        return this.tx_google_drive_bytes;
    }

    public long getMessageBytesReceived() {
        return this.rx_message_service_bytes;
    }

    public long getMessageBytesSent() {
        return this.tx_message_service_bytes;
    }

    public long getTotalBytesReceived() {
        return ((this.rx_media_bytes + this.rx_message_service_bytes) + this.rx_voip_bytes) + this.rx_google_drive_bytes;
    }

    public long getTotalBytesReceivedFromGoogleDrive() {
        return this.rx_google_drive_bytes;
    }

    public String toString() {
        return z[10] + this.tx_text_msgs + z[14] + this.rx_text_msgs + z[11] + z[4] + this.tx_media_msgs + z[13] + this.tx_media_bytes + z[23] + this.rx_media_msgs + z[17] + this.rx_media_bytes + z[24] + z[22] + this.rx_offline_msgs + z[5] + this.rx_offline_delay + z[12] + z[7] + this.tx_message_service_bytes + z[26] + this.rx_message_service_bytes + z[16] + z[21] + this.tx_voip_calls + z[6] + this.rx_voip_calls + z[9] + this.tx_voip_bytes + z[8] + this.rx_voip_bytes + z[20] + z[25] + this.tx_google_drive_bytes + z[18] + this.rx_google_drive_bytes + z[3] + z[1] + this.tx_roaming_bytes + z[27] + this.rx_roaming_bytes + z[0] + z[15] + getTotalBytesSent() + z[2] + getTotalBytesReceived() + z[19];
    }

    public long getTotalVoipBytes() {
        return this.rx_voip_bytes + this.tx_voip_bytes;
    }

    public long getOutgoingVoipCalls() {
        return this.tx_voip_calls;
    }

    public long getLastReset() {
        return this.last_reset;
    }

    public long getMediaBytesReceived() {
        return this.rx_media_bytes;
    }

    public long getTotalMessagesReceived() {
        return this.rx_text_msgs + this.rx_media_msgs;
    }

    public long getTotalVoipCalls() {
        return this.tx_voip_calls + this.rx_voip_calls;
    }

    public long getTotalMessagesSent() {
        return this.tx_text_msgs + this.tx_media_msgs;
    }

    public long getMediaBytesSent() {
        return this.tx_media_bytes;
    }

    public long getVoipBytesReceived() {
        return this.rx_voip_bytes;
    }

    public long getRoamingBytesSent() {
        return this.tx_roaming_bytes;
    }

    public long getRoamingBytesReceived() {
        return this.rx_roaming_bytes;
    }
}
