package com.whatsapp;

import android.content.SharedPreferences;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect.Descriptor;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.fieldstats.ao;
import com.whatsapp.fieldstats.bk;
import com.whatsapp.fieldstats.bv;
import com.whatsapp.fieldstats.o;
import com.whatsapp.messaging.be;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.VoipOptions;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class Voip {
    public static SignalingCallback a;
    private static final ConditionVariable b;
    private static final be c;
    public static CryptoCallback d;
    public static final SimpleDateFormat e;
    private static final String[] z;

    public interface SignalingCallback {
        void sendAccept(String str, String str2, String str3, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2);

        void sendOffer(String str, String str2, boolean z, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

        void sendPreAccept(String str, String str2, String str3, int i, byte[] bArr);

        void sendReject(String str, String str2, String str3);

        void sendRelayElection(String str, String str2, byte[] bArr, int i);

        void sendRelayLatencies(String str, String str2, byte[][] bArr, int[] iArr);

        void sendTerminate(String str, String str2, String str3);

        void sendTransport(String str, String str2, byte[][] bArr, int[] iArr);
    }

    public interface EventCallback {
        void NoSamplingRatesForAudioRecord();

        void audioDriverRestart();

        void audioInitError();

        void audioStreamStarted();

        void callAcceptFailed();

        void callAcceptReceived();

        void callAcceptSent();

        void callCaptureBufferFilled(DebugTapType debugTapType, byte[] bArr, int i, RecordingInfo[] recordingInfoArr);

        void callCaptureEnded(DebugTapType debugTapType, RecordingInfo[] recordingInfoArr);

        void callEnding();

        void callInterrupted();

        void callOfferAckedWithRelayInfo();

        void callOfferNacked(int i);

        void callOfferReceiptReceived();

        void callOfferReceived();

        void callOfferSent();

        void callRejectReceived(String str);

        void callResumed();

        void callStateChanged(CallState callState, CallInfo callInfo);

        void callTerminateReceived();

        void errorGatheringHostCandidates();

        void handleAcceptFailed();

        void handleOfferFailed();

        void incompatibleSrtpKeyExchange();

        void mediaStreamError();

        void mediaStreamStartError();

        void missingRelayInfo();

        void p2pNegotaitionFailed();

        void p2pNegotiationSuccess();

        void p2pTransportCreateFailed();

        void p2pTransportMediaCreateFailed();

        void p2pTransportRestartSuccess();

        void p2pTransportStartFailed();

        void relayBindsFailed();

        void relayCreateSuccess();

        void relayElectionSendFailed();

        void relayLatencySendFailed();

        void reportEcho(int i, int i2);

        void rtcpPacketReceived();

        void rxTimeout();

        void rxTrafficStarted();

        void rxTrafficStopped();

        void sendAcceptFailed();

        void sendOfferFailed();

        void soundPortCreateFailed();

        void soundPortCreated(int i);

        void transportCandSendFailed();

        void txTimeout();

        void willCreateSoundPort();
    }

    public class CallInfo {
        private long ECMode;
        private long bytesReceived;
        private long bytesSent;
        private long callActiveTime;
        private long callDuration;
        private String callId;
        private CallState callState;
        private long echoLevel;
        private long echoLevelBeforeEC;
        private boolean isCaller;
        private boolean isEndedByMe;
        private boolean isPeerInterrupted;
        private boolean isSelfInterrupted;
        private String peerId;

        public void setEchoLevel(long j) {
            this.echoLevel = j;
        }

        public void setEchoLevelBeforeEC(long j) {
            this.echoLevelBeforeEC = j;
        }

        public long getBytesReceived() {
            return this.bytesReceived;
        }

        public boolean isEndedByMe() {
            return this.isEndedByMe;
        }

        public boolean isPeerInterrupted() {
            return this.isPeerInterrupted;
        }

        public String getCallId() {
            return this.callId;
        }

        public CallState getCallState() {
            return this.callState;
        }

        public String getPeerId() {
            return this.peerId;
        }

        public boolean isSelfInterrupted() {
            return this.isSelfInterrupted;
        }

        public long getECMode() {
            return this.ECMode;
        }

        public CallInfo(CallState callState, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, long j3, long j4, long j5) {
            this.callState = callState;
            this.callId = str;
            this.peerId = str2;
            this.isCaller = z;
            this.isEndedByMe = z2;
            this.isSelfInterrupted = z3;
            this.isPeerInterrupted = z4;
            this.callActiveTime = j;
            this.callDuration = j2;
            this.bytesSent = j3;
            this.bytesReceived = j4;
            this.ECMode = j5;
            this.echoLevel = -1;
            this.echoLevelBeforeEC = -1;
        }

        public long getEchoLevel() {
            return this.echoLevel;
        }

        public boolean isCaller() {
            return this.isCaller;
        }

        public long getBytesSent() {
            return this.bytesSent;
        }

        public long getCallDuration() {
            return this.callDuration;
        }

        public long getEchoLevelBeforeEC() {
            return this.echoLevelBeforeEC;
        }

        public long getCallActiveTime() {
            return this.callActiveTime;
        }
    }

    public enum CallState {
        ;
        
        private static final CallState[] $VALUES;
        public static final CallState ACCEPT_RECEIVED;
        public static final CallState ACCEPT_SENT;
        public static final CallState ACTIVE;
        public static final CallState CALLING;
        public static final CallState NONE;
        public static final CallState RECEIVED_CALL;
        private static final String[] z;

        static {
            String[] strArr = new String[6];
            String str = "\u007fMP#";
            int i = -1;
            String[] strArr2 = strArr;
            String[] strArr3 = strArr;
            int i2 = 0;
            while (true) {
                char[] toCharArray = str.toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i3 = 0; length > i3; i3++) {
                    int i4;
                    char c = cArr[i3];
                    switch (i3 % 5) {
                        case v.m /*0*/:
                            i4 = 49;
                            break;
                        case at.g /*1*/:
                            i4 = 2;
                            break;
                        case at.i /*2*/:
                            i4 = 30;
                            break;
                        case at.o /*3*/:
                            i4 = arj.Theme_checkboxStyle;
                            break;
                        default:
                            i4 = 27;
                            break;
                    }
                    cArr[i3] = (char) (i4 ^ c);
                }
                str = new String(cArr).intern();
                switch (i) {
                    case v.m /*0*/:
                        strArr2[i2] = str;
                        str = "pAJ/Mt";
                        i2 = 2;
                        strArr2 = strArr3;
                        i = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i2] = str;
                        str = "rCR*R\u007fE";
                        i2 = 3;
                        strArr2 = strArr3;
                        i = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i2] = str;
                        str = "pA]#Ke]M#Ue";
                        i2 = 4;
                        strArr2 = strArr3;
                        i = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i2] = str;
                        i2 = 5;
                        strArr2 = strArr3;
                        str = "pA]#Ke]L#XtKH#_";
                        i = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i2] = str;
                        z = strArr3;
                        NONE = new CallState(z[0], 0);
                        CALLING = new CallState(z[3], 1);
                        RECEIVED_CALL = new CallState(z[1], 2);
                        ACCEPT_SENT = new CallState(z[4], 3);
                        ACCEPT_RECEIVED = new CallState(z[5], 4);
                        ACTIVE = new CallState(z[2], 5);
                        $VALUES = new CallState[]{NONE, CALLING, RECEIVED_CALL, ACCEPT_SENT, ACCEPT_RECEIVED, ACTIVE};
                        return;
                    default:
                        strArr2[i2] = str;
                        str = "cG]#RgGZ9XpNR";
                        i2 = 1;
                        strArr2 = strArr3;
                        i = 0;
                        break;
                }
            }
        }
    }

    public interface CryptoCallback {
        BigInteger generateDiffieHellmanSharedPublicKey(byte[] bArr);

        boolean generateDiffieHellmanSymmetricKey(BigInteger bigInteger, byte[] bArr, byte[] bArr2);

        boolean generateE2EKeys(byte[] bArr, byte[] bArr2);

        byte[] generateRandomBytes(int i);
    }

    public enum DebugTapType {
        ;
        
        private static final DebugTapType[] $VALUES;
        public static final DebugTapType CAPTURED_AND_POST_PROCESSED;
        public static final DebugTapType OUTGOING_ENCODED;
        public static final DebugTapType RAW_CAPTURED;
        public static final DebugTapType RAW_PLAYBACK;
        public static final DebugTapType RECEIVED_AND_DECODED;
        private static final String[] z;

        static {
            String[] strArr = new String[5];
            String str = "0H\b\u0002d!L\u001c\tp=M\u0007\u0006~ ]\u0007\u0006c<J\u001d\u0005b6M";
            int i = -1;
            String[] strArr2 = strArr;
            String[] strArr3 = strArr;
            int i2 = 0;
            while (true) {
                char[] toCharArray = str.toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i3 = 0; length > i3; i3++) {
                    int i4;
                    char c = cArr[i3];
                    switch (i3 % 5) {
                        case v.m /*0*/:
                            i4 = 115;
                            break;
                        case at.g /*1*/:
                            i4 = 9;
                            break;
                        case at.i /*2*/:
                            i4 = 88;
                            break;
                        case at.o /*3*/:
                            i4 = 86;
                            break;
                        default:
                            i4 = 49;
                            break;
                    }
                    cArr[i3] = (char) (i4 ^ c);
                }
                str = new String(cArr).intern();
                switch (i) {
                    case v.m /*0*/:
                        strArr2[i2] = str;
                        str = "!H\u000f\tr2Y\f\u0003c6M";
                        i2 = 2;
                        strArr2 = strArr3;
                        i = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i2] = str;
                        str = "<\\\f\u0011~:G\u001f\tt=J\u0017\u0012t7";
                        i2 = 3;
                        strArr2 = strArr3;
                        i = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i2] = str;
                        str = "!L\u001b\u0013x%L\u001c\tp=M\u0007\u0012t0F\u001c\u0013u";
                        i2 = 4;
                        strArr2 = strArr3;
                        i = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i2] = str;
                        z = strArr3;
                        RECEIVED_AND_DECODED = new DebugTapType(z[4], 0);
                        CAPTURED_AND_POST_PROCESSED = new DebugTapType(z[0], 1);
                        OUTGOING_ENCODED = new DebugTapType(z[3], 2);
                        RAW_CAPTURED = new DebugTapType(z[2], 3);
                        RAW_PLAYBACK = new DebugTapType(z[1], 4);
                        $VALUES = new DebugTapType[]{RECEIVED_AND_DECODED, CAPTURED_AND_POST_PROCESSED, OUTGOING_ENCODED, RAW_CAPTURED, RAW_PLAYBACK};
                        return;
                    default:
                        strArr2[i2] = str;
                        str = "!H\u000f\ta?H\u0001\u0014p0B";
                        i2 = 1;
                        strArr2 = strArr3;
                        i = 0;
                        break;
                }
            }
        }
    }

    public class DefaultCryptoCallback implements CryptoCallback {
        private static final BigInteger G;
        private static final BigInteger P;
        private static final String[] z;
        private final SecureRandom secureRandom;

        public byte[] generateRandomBytes(int i) {
            byte[] bArr = new byte[i];
            this.secureRandom.nextBytes(bArr);
            return bArr;
        }

        public DefaultCryptoCallback() {
            this.secureRandom = new SecureRandom();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.math.BigInteger generateDiffieHellmanSharedPublicKey(byte[] r9) {
            /*
            r8 = this;
            r1 = 0;
            r4 = com.whatsapp.DialogToastActivity.f;
            r0 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
            r0 = new byte[r0];
            r2 = r8.secureRandom;
            r2.nextBytes(r0);
            r0[r1] = r1;
            r3 = new java.math.BigInteger;
            r3.<init>(r0);
            r0 = G;
            r2 = P;
            r0 = r0.modPow(r3, r2);
            r5 = r0.toByteArray();
            r0 = r5.length;
            r2 = r9.length;
            if (r0 <= r2) goto L_0x0089;
        L_0x0023:
            r0 = r1;
        L_0x0024:
            r2 = r5.length;
            r6 = r9.length;
            r2 = r2 - r6;
            if (r0 >= r2) goto L_0x0062;
        L_0x0029:
            r2 = r5[r0];
            if (r2 == 0) goto L_0x005e;
        L_0x002d:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = z;
            r2 = 2;
            r1 = r1[r2];
            r0 = r0.append(r1);
            r1 = r5.length;
            r0 = r0.append(r1);
            r1 = z;
            r2 = 3;
            r1 = r1[r2];
            r0 = r0.append(r1);
            r1 = r9.length;
            r0 = r0.append(r1);
            r1 = ")";
            r0 = r0.append(r1);
            r0 = r0.toString();
            com.whatsapp.util.Log.e(r0);
            r0 = 0;
        L_0x005d:
            return r0;
        L_0x005e:
            r0 = r0 + 1;
            if (r4 == 0) goto L_0x0024;
        L_0x0062:
            r0 = r5.length;
            r2 = r9.length;
            r0 = r0 - r2;
            if (r4 == 0) goto L_0x0077;
        L_0x0067:
            r2 = r5.length;
            r6 = r9.length;
            if (r2 >= r6) goto L_0x0077;
        L_0x006b:
            r2 = r1;
        L_0x006c:
            r6 = r9.length;
            r7 = r5.length;
            r6 = r6 - r7;
            if (r2 >= r6) goto L_0x0077;
        L_0x0071:
            r9[r2] = r1;
            r2 = r2 + 1;
            if (r4 == 0) goto L_0x006c;
        L_0x0077:
            r2 = r9.length;
            r4 = r5.length;
            r2 = r2 - r4;
            r1 = java.lang.Math.max(r2, r1);
            r2 = r9.length;
            r4 = r5.length;
            r2 = java.lang.Math.min(r2, r4);
            java.lang.System.arraycopy(r5, r0, r9, r1, r2);
            r0 = r3;
            goto L_0x005d;
        L_0x0089:
            r0 = r1;
            goto L_0x0067;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Voip.DefaultCryptoCallback.generateDiffieHellmanSharedPublicKey(byte[]):java.math.BigInteger");
        }

        public boolean generateE2EKeys(byte[] bArr, byte[] bArr2) {
            if (bArr == null || bArr2 == null || bArr.length != 32 || bArr2.length != 92) {
                return false;
            }
            this.secureRandom.nextBytes(bArr);
            Object a = VoiceService.a(bArr);
            if (a == null || a.length != 92) {
                return false;
            }
            System.arraycopy(a, 0, bArr2, 0, 92);
            return true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean generateDiffieHellmanSymmetricKey(java.math.BigInteger r9, byte[] r10, byte[] r11) {
            /*
            r8 = this;
            r3 = 1;
            r1 = 0;
            r4 = com.whatsapp.DialogToastActivity.f;
            r0 = r10[r1];
            if (r0 == 0) goto L_0x0014;
        L_0x0008:
            r0 = r10.length;
            r0 = r0 + 1;
            r0 = new byte[r0];
            r0[r1] = r1;
            r2 = r10.length;
            java.lang.System.arraycopy(r10, r1, r0, r3, r2);
            r10 = r0;
        L_0x0014:
            r0 = new java.math.BigInteger;
            r0.<init>(r10);
            r2 = P;
            r0 = r0.modPow(r9, r2);
            r5 = r0.toByteArray();
            r0 = r5.length;
            r2 = r11.length;
            if (r0 <= r2) goto L_0x008a;
        L_0x0027:
            r0 = r1;
        L_0x0028:
            r2 = r5.length;
            r6 = r11.length;
            r2 = r2 - r6;
            if (r0 >= r2) goto L_0x0063;
        L_0x002d:
            r2 = r5[r0];
            if (r2 == 0) goto L_0x005f;
        L_0x0031:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = z;
            r2 = r2[r1];
            r0 = r0.append(r2);
            r2 = r5.length;
            r0 = r0.append(r2);
            r2 = z;
            r2 = r2[r3];
            r0 = r0.append(r2);
            r2 = r11.length;
            r0 = r0.append(r2);
            r2 = ")";
            r0 = r0.append(r2);
            r0 = r0.toString();
            com.whatsapp.util.Log.e(r0);
        L_0x005e:
            return r1;
        L_0x005f:
            r0 = r0 + 1;
            if (r4 == 0) goto L_0x0028;
        L_0x0063:
            r0 = r5.length;
            r2 = r11.length;
            r0 = r0 - r2;
            if (r4 == 0) goto L_0x0078;
        L_0x0068:
            r2 = r5.length;
            r6 = r11.length;
            if (r2 >= r6) goto L_0x0078;
        L_0x006c:
            r2 = r1;
        L_0x006d:
            r6 = r11.length;
            r7 = r5.length;
            r6 = r6 - r7;
            if (r2 >= r6) goto L_0x0078;
        L_0x0072:
            r11[r2] = r1;
            r2 = r2 + 1;
            if (r4 == 0) goto L_0x006d;
        L_0x0078:
            r2 = r11.length;
            r4 = r5.length;
            r2 = r2 - r4;
            r1 = java.lang.Math.max(r2, r1);
            r2 = r11.length;
            r4 = r5.length;
            r2 = java.lang.Math.min(r2, r4);
            java.lang.System.arraycopy(r5, r0, r11, r1, r2);
            r1 = r3;
            goto L_0x005e;
        L_0x008a:
            r0 = r1;
            goto L_0x0068;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Voip.DefaultCryptoCallback.generateDiffieHellmanSymmetricKey(java.math.BigInteger, byte[], byte[]):boolean");
        }

        static {
            String[] strArr = new String[5];
            String str = "\u000bW\"\\Q\u0004P2@R\fMqZG\u0003Z4\tQ\rKqZN\u000fT4]E\u000bZqBR\u001b\u0019|\u0017\u0017\u0007W2FS\u0007]qER\f^%A\u0017J";
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
                            i3 = 98;
                            break;
                        case at.g /*1*/:
                            i3 = 57;
                            break;
                        case at.i /*2*/:
                            i3 = 81;
                            break;
                        case at.o /*3*/:
                            i3 = 41;
                            break;
                        default:
                            i3 = 55;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u000bW\"\\Q\u0004P2@R\fMqZG\u0003Z4\tQ\rKqYB\u0000U8J\u0017\t\\(\t\u001a\\\u00194GT\r]4M\u0017\u000e\\?NC\n\u0019y";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "K\u0019'Z\u0017\u0011I0JRBX'H^\u000eX3ERB\u0011";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "$\u007f\u0017oq$\u007f\u0017oq$\u007f\u0017oq$zh\u0019q&x\u0010\u001b\u0005S\u000fij\u0005Q\r\u0012\u001dtT\u000fc\u0011uZ\t\u0015j\u0006!}`\u001b\u000eR\u000bel\u0007Z\u0001\u0010\u001f\u0000!zf\u001d\u0007P\t\u0013kr#\u000fbk\u0006Q\u0000\u0013\u001b\u0005W\beh\u0007Z\u000eh\u0011rQ\ra\u001ds&|\u0017\u0010\u0002S\u0000\u0013\u001at&\n\u0010\u001d\u0004S{b\u0019\u0005 \t\u0010\u001fs$\u000bdo\u0006V\nf\u001dq'\bb\u001c\u0001&\u000f\u0015\u001c\u0006!\u000be\u001crV\u0001dk\u0002U\u000fg\u001b\u0002'\u000e\u0014j\u0001$\rej\u0003P|hh\u0001Q\u000e\u0014m\u0001 \t\u0013oqWz\u0013\u001fqV\tgk\u0000'}\u0014l\u0004Z\u000f\u0013ouWxi\u0010\u000e$xdhr[\u007fc\u001d\u0006S\u000e\u0012\u001duS\u007f\u0014\u001f\u0003[\u000bi\u001f\u0001W\b\u0014jrV\f\u0013\u001as!\u000ba\u0019\u0000!{ih\u0006T\n\u0013o\u0007W\u0000imvV\u0001b\u001f\u0006!\fdm\u0004[xg\u0010\u0006T\n\u0017h\u000f$}c\u001dt$\f\u0017\u0011\u0004T\fdm\u0005Q}\u0012h\u0004#}h\u001f\u0006!\u000fco\u0004W\u000fc\u0019\u000fW\fcku[|\u0015\u001c\u0005[\tf\u001e\u0007[\u000fh\u001f\u0001&\u000ff\u0019tQ\fel\u0003#{\u0012\u0010\u000fR\r\u0017\u0018\u0000V\u000f\u0012\u0019\u000f!xc\u001a\u0000Q\u000bfoq$\u007f\u0017oq$\u007f\u0017oq$\u007f\u0017o";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        P = new BigInteger(z[4], 16);
                        G = BigInteger.valueOf(2);
                        return;
                    default:
                        strArr2[i] = str;
                        str = "K\u0019'Z\u0017\u0011I0JRBX'H^\u000eX3ERB\u0011";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }
    }

    public class JNIUtils {
        public static synchronized int[] findAvailableAudioSamplingRate() {
            int[] a;
            synchronized (JNIUtils.class) {
                a = VoiceService.a(new int[]{16000, 44100, 22050, 8000, 11025, 32000, 48000, 24000, 12000}, 1);
            }
            return a;
        }
    }

    public class RecordingInfo {
        private static final String[] z;
        private File a;
        private OutputStream b;

        static {
            String[] strArr = new String[7];
            String str = "\u0000\u007f\u0003O`\u00164\u0005Nq\u001d~\u0005D";
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
                            i3 = 114;
                            break;
                        case at.g /*1*/:
                            i3 = 26;
                            break;
                        case at.i /*2*/:
                            i3 = 96;
                            break;
                        case at.o /*3*/:
                            i3 = 32;
                            break;
                        default:
                            i3 = 18;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u0000\u007f\u0003O`\u00164\u0010R}\u0011\u007f\u0013Sw\u0016";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u0007t\u000bN}\u0005t@Dw\u0010o\u0007\u0000f\u0013j@Tk\u0002\u007fZ\u0000";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "\u0000\u007f\u0003E{\u0004\u007f\u0004\u000ev\u0017y\u000fDw\u0016";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\u0000\u007f\u0003O`\u00164\u0012Ae";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\\m\u0001V<\u0015`";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u0002v\u0001Yp\u0013y\u000b\u000e`\u0013m";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public RecordingInfo(com.whatsapp.Voip.DebugTapType r7) {
            /*
            r6 = this;
            r3 = 1;
            r1 = com.whatsapp.DialogToastActivity.f;
            r6.<init>();
            r0 = com.whatsapp.jg.a;
            r2 = r7.ordinal();
            r0 = r0[r2];
            switch(r0) {
                case 1: goto L_0x002f;
                case 2: goto L_0x0036;
                case 3: goto L_0x003d;
                case 4: goto L_0x0044;
                case 5: goto L_0x004b;
                default: goto L_0x0011;
            };
        L_0x0011:
            r0 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x002d }
            r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x002d }
            r1.<init>();	 Catch:{ IOException -> 0x002d }
            r2 = z;	 Catch:{ IOException -> 0x002d }
            r3 = 3;
            r2 = r2[r3];	 Catch:{ IOException -> 0x002d }
            r1 = r1.append(r2);	 Catch:{ IOException -> 0x002d }
            r1 = r1.append(r7);	 Catch:{ IOException -> 0x002d }
            r1 = r1.toString();	 Catch:{ IOException -> 0x002d }
            r0.<init>(r1);	 Catch:{ IOException -> 0x002d }
            throw r0;	 Catch:{ IOException -> 0x002d }
        L_0x002d:
            r0 = move-exception;
            throw r0;
        L_0x002f:
            r0 = z;
            r2 = 2;
            r0 = r0[r2];
            if (r1 == 0) goto L_0x0051;
        L_0x0036:
            r0 = z;
            r2 = 0;
            r0 = r0[r2];
            if (r1 == 0) goto L_0x0051;
        L_0x003d:
            r0 = z;
            r2 = 4;
            r0 = r0[r2];
            if (r1 == 0) goto L_0x0051;
        L_0x0044:
            r0 = z;
            r2 = 5;
            r0 = r0[r2];
            if (r1 == 0) goto L_0x0051;
        L_0x004b:
            r0 = z;
            r0 = r0[r3];
            if (r1 != 0) goto L_0x0011;
        L_0x0051:
            r1 = com.whatsapp.Voip.e;
            r2 = new java.util.Date;
            r4 = java.lang.System.currentTimeMillis();
            r2.<init>(r4);
            r1 = r1.format(r2);
            r2 = new java.io.File;
            r3 = com.whatsapp.dg.h();
            r4 = new java.lang.StringBuilder;
            r4.<init>();
            r1 = r4.append(r1);
            r4 = ".";
            r1 = r1.append(r4);
            r0 = r1.append(r0);
            r1 = z;
            r4 = 6;
            r1 = r1[r4];
            r0 = r0.append(r1);
            r0 = r0.toString();
            r2.<init>(r3, r0);
            r6.a = r2;
            r0 = new java.util.zip.GZIPOutputStream;	 Catch:{ IOException -> 0x009c }
            r1 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x009c }
            r2 = r6.a;	 Catch:{ IOException -> 0x009c }
            r3 = 1;
            r1.<init>(r2, r3);	 Catch:{ IOException -> 0x009c }
            r0.<init>(r1);	 Catch:{ IOException -> 0x009c }
            r6.b = r0;	 Catch:{ IOException -> 0x009c }
        L_0x009b:
            return;
        L_0x009c:
            r0 = move-exception;
            com.whatsapp.util.Log.a(r0);
            r0 = 0;
            r6.b = r0;
            goto L_0x009b;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Voip.RecordingInfo.<init>(com.whatsapp.Voip$DebugTapType):void");
        }

        public OutputStream b() {
            return this.b;
        }

        public File a() {
            return this.a;
        }
    }

    public static native void acceptCall();

    public static native void adjustAudioLevel(int i);

    public static native boolean checkStreamStatistics();

    public static native void debugAdjustAECMParams(short s, short s2);

    public static native void endCall();

    public static native long getCallActiveTime();

    public static native Events$Call getCallFieldStats();

    public static native CallInfo getCallInfo();

    public static native String getCurrentCallId();

    public static native CallState getCurrentCallState();

    public static native int getElapsedTimeSinceCallStarts();

    public static native String getPeerJid();

    public static native String getStreamStatistics();

    public static native boolean isCaller();

    public static native void muteCall(boolean z);

    public static native void nativeHandleCallAcceptReceipt(String str, String str2, String str3);

    public static native void nativeHandleCallOffer(String str, String str2, String str3, String[] strArr, int[] iArr, byte[][] bArr, int[] iArr2, byte[][] bArr2, byte[][] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, VoipOptions voipOptions, boolean z, int i, int i2);

    public static native void nativeHandleCallOfferAccept(String str, String str2, String str3, String str4, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2);

    public static native void nativeHandleCallOfferAck(String str, String str2, String str3, int i, byte[][] bArr, byte[][] bArr2, VoipOptions voipOptions, boolean z, int i2, int i3);

    public static native void nativeHandleCallOfferPreAccept(String str, String str2, String str3, String str4, int i, byte[] bArr);

    public static native void nativeHandleCallOfferReceipt(String str, String str2, String str3);

    public static native void nativeHandleCallOfferReject(String str, String str2, String str3, String str4);

    public static native void nativeHandleCallRelayElection(String str, String str2, String str3, byte[] bArr, int i);

    public static native void nativeHandleCallRelayLatency(String str, String str2, String str3, byte[][] bArr, int[] iArr);

    public static native void nativeHandleCallTerminate(String str, String str2, String str3, String str4);

    public static native void nativeHandleCallTransport(String str, String str2, String str3, byte[][] bArr, int[] iArr);

    public static native void nativeRegisterCryptoCallback(CryptoCallback cryptoCallback);

    public static native void nativeRegisterEventCallback(EventCallback eventCallback);

    public static native void nativeRegisterSignalingCallback(SignalingCallback signalingCallback);

    public static native void nativeUnregisterCryptoCallback();

    public static native void nativeUnregisterEventCallback();

    public static native void nativeUnregisterSignalingCallback();

    public static native void notifyAudioRouteChange(int i);

    public static native void onNetworkChange();

    public static native void rejectCall();

    public static native void saveCallMetrics(String str);

    public static native void setAudioStreamPause(boolean z);

    public static native void setNetworkMedium(int i);

    public static native void setPeerAudioStreamPause(boolean z);

    public static native void setSpeakerOn(boolean z);

    public static native void startCall(String str, String str2);

    public static native boolean startCallRecording(RecordingInfo[] recordingInfoArr);

    public static native boolean stopCallRecording();

    public static Object c(int i) {
        boolean z = DialogToastActivity.f;
        if (VERSION.SDK_INT >= 16 && j() && i >= 0) {
            int i2 = 0;
            while (i2 <= 50) {
                int i3 = i2 == 0 ? i + 3 : i + i2;
                try {
                    AutomaticGainControl create = AutomaticGainControl.create(i3);
                    if (create != null) {
                        create.setEnabled(true);
                        Log.i(z[19] + create.getEnabled() + z[21] + i3 + z[22] + i);
                        return create;
                    }
                    int i4 = i2 + 1;
                    if (z) {
                        break;
                    }
                    i2 = i4;
                } catch (Throwable th) {
                    Log.a(th);
                }
            }
            Log.i(z[20] + i + z[18] + 50);
        }
        return null;
    }

    public static void a(CryptoCallback cryptoCallback) {
        nativeRegisterCryptoCallback(cryptoCallback);
        d = cryptoCallback;
    }

    public static void d(Object obj) {
        if (obj == null) {
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            try {
                ((AutomaticGainControl) obj).release();
            } catch (Throwable th) {
                Log.a(th);
            }
        }
    }

    public static be b() {
        return c;
    }

    public static boolean d() {
        try {
            if (getCurrentCallState() != CallState.NONE) {
                return true;
            }
            return false;
        } catch (UnsatisfiedLinkError e) {
            throw e;
        } catch (Throwable e2) {
            Log.b(z[29], e2);
            return false;
        }
    }

    public static Object h(int i) {
        boolean z = DialogToastActivity.f;
        if (VERSION.SDK_INT >= 16 && e() && i >= 0) {
            int i2 = 0;
            while (i2 <= 50) {
                int i3;
                if (i2 == 0) {
                    i3 = i + 3;
                } else {
                    i3 = i + i2;
                }
                try {
                    NoiseSuppressor create = NoiseSuppressor.create(i3);
                    if (create != null) {
                        create.setEnabled(true);
                        Log.i(z[13] + create.getEnabled() + z[14] + i3 + z[17] + i);
                        return create;
                    }
                    int i4 = i2 + 1;
                    if (z) {
                        break;
                    }
                    i2 = i4;
                } catch (Throwable th) {
                    Log.a(th);
                }
            }
            Log.i(z[15] + i + z[16] + 50);
        }
        return null;
    }

    public static String a(int i) {
        boolean z = DialogToastActivity.f;
        bk[] values = bk.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            bk bkVar = values[i2];
            if (bkVar.getCode() != i) {
                i2++;
                if (z) {
                    break;
                }
            }
            return bkVar.toString();
        }
        return z[33];
    }

    public static String g(int i) {
        boolean z = DialogToastActivity.f;
        bv[] values = bv.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            bv bvVar = values[i2];
            if (bvVar.getCode() != i) {
                i2++;
                if (z) {
                    break;
                }
            }
            return bvVar.toString();
        }
        return z[32];
    }

    public static void a() {
        b.close();
    }

    public static void c(Object obj) {
        if (obj == null) {
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            try {
                ((NoiseSuppressor) obj).release();
            } catch (Throwable th) {
                Log.a(th);
            }
        }
    }

    public static void i() {
        nativeUnregisterSignalingCallback();
        a = null;
    }

    public static String e(int i) {
        boolean z = DialogToastActivity.f;
        ao[] values = ao.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            ao aoVar = values[i2];
            if (aoVar.getCode() != i) {
                i2++;
                if (z) {
                    break;
                }
            }
            return aoVar.toString();
        }
        return z[30];
    }

    public static boolean a(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (VERSION.SDK_INT >= 16) {
                try {
                    z = ((AcousticEchoCanceler) obj).getEnabled();
                } catch (Throwable th) {
                    Log.a(th);
                }
            }
        }
        return z;
    }

    static {
        String[] strArr = new String[35];
        String str = "3M&2o)";
        boolean z = true;
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
                        i3 = 19;
                        break;
                    case at.g /*1*/:
                        i3 = 56;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 11;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "pW>u|{Y'(jcH\f+yv^6)n}[6(";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "3]=:i\u007f]7a";
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "3P2(H|V')d\u007f\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "r]0\u0004d`g%>y`Q<5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "r]0\u0004b~H?>fvV'4y";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "r]0\u0004d`g%>y`Q<5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "eW:+$R[<.xgQ0\u001eh{W\u0010:ep]?>y3Q>+gvU65\u007f|Ji";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "r]0\u0004d`g%>y`Q<5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "r]0\u0004~fQ7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    str = "r]0\u0004b~H?>fvV'4y";
                    z = true;
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    strArr2 = strArr3;
                    str = "pY?71";
                    z = true;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "eW:+${Y00IfQ?/B}v tn}Y17nw\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "3W={xvK 2d}\u0018:?+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "eW:+${Y00IfQ?/B}v tmrQ?>o3H!>}zW&(Jf\\:4XvK 2d}q7{63";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "?\u0018!:et]sf+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "3O:/c3H!>}zW&(+`] (b|Vs2o3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "?\u0018!:et]sf+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    str = "eW:+${Y00IfQ?/B}y48$vV29gv\\s";
                    z = true;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "eW:+${Y00IfQ?/B}y48$uY:7nw\u0018#)neQ<.xRM72d@] (b|V\u001a?+.\u0018";
                    z = true;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "3W={xvK 2d}\u0018:?+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "3O:/c3H!>}zW&(+`] (b|Vs2o3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "3W={xvK 2d}\u0018:?+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "?\u0018!:et]sf+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "eW:+${Y00IfQ?/B}y68$uY:7nw\u0018#)neQ<.xRM72d@] (b|V\u001a?+.\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "eW:+${Y00IfQ?/B}y68$vV29gv\\s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "3O:/c3H!>}zW&(+`] (b|Vs2o3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "Fv\u0018\u0015DDv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "fV29gv\u0018'4+bM6)r3^<)+pM!)n}Ls8j\u007fTs(\u007frL6";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "Fv\u0018\u0015DDv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "Fv\u0018\u0015DDv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "Fv\u0018\u0015DDv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "Fv\u0018\u0015DDv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "jA*\"F^\\7\u0013C~U (";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    z = strArr3;
                    e = new SimpleDateFormat(z[34], Locale.US);
                    b = new ConditionVariable(true);
                    c = new jh();
                    a = null;
                    d = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "r]0\u0004~fQ7";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static String b(int i) {
        boolean z = DialogToastActivity.f;
        o[] values = o.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            o oVar = values[i2];
            if (oVar.getCode() != i) {
                i2++;
                if (z) {
                    break;
                }
            }
            return oVar.toString();
        }
        return z[31];
    }

    public static void a(SignalingCallback signalingCallback) {
        nativeRegisterSignalingCallback(signalingCallback);
        a = signalingCallback;
    }

    public static boolean b(co coVar) {
        return coVar.c == 8 && !coVar.k.a && coVar.H == 0 && coVar.z == 0;
    }

    public static c3 g() {
        CallInfo callInfo = getCallInfo();
        if (callInfo == null) {
            return null;
        }
        return new c3(callInfo.getPeerId(), callInfo.isCaller(), a(callInfo.getCallId()));
    }

    public static String f(int i) {
        boolean z = DialogToastActivity.f;
        com.whatsapp.fieldstats.v[] values = com.whatsapp.fieldstats.v.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            com.whatsapp.fieldstats.v vVar = values[i2];
            if (vVar.getCode() != i) {
                i2++;
                if (z) {
                    break;
                }
            }
            return vVar.toString();
        }
        return z[28];
    }

    public static void f() {
        b.block();
    }

    public static boolean j() {
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            try {
                z = AutomaticGainControl.isAvailable();
            } catch (Throwable th) {
                Log.a(th);
            }
        }
        return z;
    }

    public static void c() {
        b.open();
    }

    public static void i(int i) {
        AcousticEchoCanceler acousticEchoCanceler = null;
        SharedPreferences sharedPreferences = App.z().getSharedPreferences(z[2], 0);
        if (!VERSION.RELEASE.equals(sharedPreferences.getString(z[5], null))) {
            if (VERSION.SDK_INT >= 16) {
                if (h()) {
                    try {
                        acousticEchoCanceler = AcousticEchoCanceler.create(i);
                        if (acousticEchoCanceler != null) {
                            Descriptor descriptor = acousticEchoCanceler.getDescriptor();
                            if (descriptor != null) {
                                if (descriptor.uuid != null) {
                                    Log.i(z[8] + descriptor.implementor + z[0] + descriptor.uuid.toString() + z[3] + acousticEchoCanceler.getEnabled() + z[4] + acousticEchoCanceler.hasControl());
                                    sharedPreferences.edit().putString(z[9], VERSION.RELEASE).putString(z[10], descriptor.uuid.toString()).putString(z[6], descriptor.implementor).commit();
                                }
                            }
                        }
                        if (acousticEchoCanceler != null) {
                            acousticEchoCanceler.release();
                        }
                    } catch (Throwable th) {
                        try {
                            Log.a(th);
                            if (acousticEchoCanceler != null) {
                                acousticEchoCanceler.release();
                            }
                        } catch (Throwable th2) {
                            if (acousticEchoCanceler != null) {
                                acousticEchoCanceler.release();
                            }
                        }
                    }
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
            }
            sharedPreferences.edit().putString(z[7], VERSION.RELEASE).putString(z[1], null).putString(z[11], null).commit();
        }
    }

    public static boolean h() {
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            try {
                z = AcousticEchoCanceler.isAvailable();
            } catch (Throwable th) {
                Log.a(th);
            }
        }
        return z;
    }

    public static boolean c(co coVar) {
        return coVar.c == 8 && coVar.q != null;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return z[12] + str;
    }

    public static void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            try {
                ((AcousticEchoCanceler) obj).release();
            } catch (Throwable th) {
                Log.a(th);
            }
        }
    }

    public static long a(co coVar) {
        try {
            if (coVar.A == null || coVar.A.length() == 0) {
                return 0;
            }
            try {
                long parseLong = Long.parseLong(coVar.A);
                return (parseLong < 0 || parseLong > 2147483648L) ? 0 : parseLong;
            } catch (Exception e) {
                return 0;
            }
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    public static Object d(int i) {
        boolean z = DialogToastActivity.f;
        if (VERSION.SDK_INT >= 16 && h() && i >= 0) {
            int i2 = 0;
            while (i2 <= 50) {
                int i3;
                if (i2 == 0) {
                    i3 = i + 3;
                } else {
                    i3 = i + i2;
                }
                try {
                    AcousticEchoCanceler create = AcousticEchoCanceler.create(i3);
                    if (create != null) {
                        create.setEnabled(true);
                        Log.i(z[26] + create.getEnabled() + z[23] + i3 + z[27] + i);
                        return create;
                    }
                    int i4 = i2 + 1;
                    if (z) {
                        break;
                    }
                    i2 = i4;
                } catch (Throwable th) {
                    Log.a(th);
                }
            }
            Log.i(z[25] + i + z[24] + 50);
        }
        return null;
    }

    public static boolean e() {
        boolean z = false;
        if (VERSION.SDK_INT >= 16) {
            try {
                z = NoiseSuppressor.isAvailable();
            } catch (Throwable th) {
                Log.a(th);
            }
        }
        return z;
    }
}
