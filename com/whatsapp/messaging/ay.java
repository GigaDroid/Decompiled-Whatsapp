package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.protocol.VoipOptions.Miscellaneous;

final class ay implements Parcelable {
    public static final Creator CREATOR;
    private final Miscellaneous a;

    public Miscellaneous a() {
        return this.a;
    }

    ay(Miscellaneous miscellaneous, bq bqVar) {
        this(miscellaneous);
    }

    private ay(Miscellaneous miscellaneous) {
        this.a = miscellaneous;
    }

    private ay(Parcel parcel) {
        this.a = new Miscellaneous((Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), parcel.readString(), parcel.readString(), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new bi();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = co.a;
        parcel.writeValue(this.a.enableComfortNoiseGeneration);
        parcel.writeValue(this.a.enableHighPassFiltering);
        parcel.writeValue(this.a.enableSilenceDetection);
        parcel.writeValue(this.a.callerTimeout);
        parcel.writeValue(this.a.jitterBufferImpl);
        parcel.writeValue(this.a.jitterBufferDiscardAlgo);
        parcel.writeValue(this.a.jitterBufferStretchAlgo);
        parcel.writeValue(this.a.audioCallbackThreshold);
        parcel.writeValue(this.a.ringbackMode);
        parcel.writeValue(this.a.ringbackTone);
        parcel.writeValue(this.a.callerEndCallThreshold);
        parcel.writeValue(this.a.audioSamplingRate);
        parcel.writeValue(this.a.androidAudioEngine);
        parcel.writeValue(this.a.androidAudioModeInCall);
        parcel.writeValue(this.a.androidRecordPreset);
        parcel.writeValue(this.a.androidAudioRecordBufferSize);
        parcel.writeValue(this.a.androidAudioPlaybackBufferSize);
        parcel.writeValue(this.a.androidShowCallConnectedToast);
        parcel.writeValue(this.a.androidShowCallConnectingToast);
        parcel.writeValue(this.a.androidRingFaster);
        parcel.writeValue(this.a.udpReceiveSocketBufferSize);
        parcel.writeValue(this.a.audioEncodeOffload);
        parcel.writeValue(this.a.disableP2P);
        parcel.writeValue(this.a.createStreamOnOffer);
        parcel.writeValue(this.a.initialInterruptionSoundDelay);
        parcel.writeValue(this.a.audioFPSThreshold);
        parcel.writeValue(this.a.networkRestartTimeout);
        parcel.writeValue(this.a.neteqMinDelay);
        parcel.writeValue(this.a.neteqMaxDelay);
        parcel.writeValue(this.a.neteqBgnMode);
        parcel.writeValue(this.a.audioLevelAdjust);
        parcel.writeValue(this.a.restartAudioOnWhiteNoise);
        parcel.writeValue(this.a.callOfferAckTimeout);
        parcel.writeString(this.a.testKey);
        parcel.writeString(this.a.testValue);
        parcel.writeValue(this.a.ipConfig);
        parcel.writeValue(this.a.ipAutoSwitch);
        parcel.writeValue(this.a.rtpExtType);
        parcel.writeValue(this.a.e2eDecryptEnable);
        if (i2 != 0) {
            WAAppCompatActivity.c++;
        }
    }

    ay(Parcel parcel, bq bqVar) {
        this(parcel);
    }
}
