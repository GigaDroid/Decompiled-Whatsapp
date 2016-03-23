package com.whatsapp.fieldstats;

import android.content.Context;
import com.whatsapp.WAAppCompatActivity;

public final class Events$Call extends av {
    public Double audioGetFrameUnderflowPs;
    public Double audioPutFrameOverflowPs;
    public Double avgClockCbT;
    public Double avgDecodeT;
    public Double avgEncodeT;
    public Double avgPlayCbT;
    public Double avgRecordCbT;
    public Double avgRecordGetFrameT;
    public Double avgTargetBitrate;
    public Double builtinAecAvailable;
    public Double builtinAecEnabled;
    public String builtinAecImplementor;
    public String builtinAecUuid;
    public Double builtinAgcAvailable;
    public Double builtinNsAvailable;
    public Double callAcceptFuncT;
    public Double callAecMode;
    public Double callAecOffset;
    public Double callAecTailLength;
    public Double callAgcMode;
    public Double callAndroidAudioMode;
    public Double callAndroidRecordAudioPreset;
    public Double callAndroidRecordAudioSource;
    public Double callAudioEngineType;
    public Double callAudioRestartCount;
    public Double callAudioRestartReason;
    public Double callAvgRtt;
    public Double callCalculatedEcOffset;
    public Double callCalculatedEcOffsetStddev;
    public Double callEcRestartCount;
    public Double callEchoEnergy;
    public Double callEchoLikelihood;
    public Double callEchoLikelihoodBeforeEc;
    public Double callEndFuncT;
    public Double callEndReconnecting;
    public Double callEndedInterrupted;
    public Double callFromUi;
    public Double callHistEchoLikelihood;
    public Double callInitialRtt;
    public Double callInterrupted;
    public Double callLastRtt;
    public Double callMaxRtt;
    public Double callMinRtt;
    public Double callNetwork;
    public Double callNetworkSubtype;
    public Double callNsMode;
    public Double callOfferAckTimout;
    public Double callOfferElapsedT;
    public Double callOfferReceiptDelay;
    public Double callP2pDisabled;
    public String callPeerAppVersion;
    public Double callPeerAsn;
    public Double callPeerIpv4;
    public String callPeerPlatform;
    public Double callPlaybackBufferSize;
    public Double callPlaybackCallbackStopped;
    public Double callPlaybackFramesPs;
    public Double callPlaybackSilenceRatio;
    public Double callRecentPlaybackFramesPs;
    public Double callRecentRecordFramesPs;
    public Double callRecordBufferSize;
    public Double callRecordCallbackStopped;
    public Double callRecordFramesPs;
    public Double callRecordMaxEnergyRatio;
    public Double callRecordSilenceRatio;
    public Double callRejectFuncT;
    public Double callRelayBindStatus;
    public Double callRelayCreateT;
    public String callRelayServer;
    public Double callResult;
    public Double callRingingT;
    public Double callRxAvgBitrate;
    public Double callRxAvgBwe;
    public Double callRxAvgJitter;
    public Double callRxAvgLossPeriod;
    public Double callRxMaxJitter;
    public Double callRxMaxLossPeriod;
    public Double callRxMinJitter;
    public Double callRxMinLossPeriod;
    public Double callRxPktLossPct;
    public Double callRxStoppedT;
    public Double callSamplingRate;
    public Double callSelfAsn;
    public Double callSelfIpv4;
    public Double callServerNackErrorCode;
    public Double callSetupErrorType;
    public Double callSetupT;
    public Double callSide;
    public Double callSoundPortFuncT;
    public Double callStartFuncT;
    public Double callSwAecMode;
    public Double callSwAecType;
    public Double callT;
    public Double callTermReason;
    public String callTestBucket;
    public Double callTonesDetectedInRecord;
    public Double callTonesDetectedInRingback;
    public Double callTransitionCount;
    public Double callTransport;
    public Double callTransportP2pToRelayFallbackCount;
    public Double callTransportRelayToRelayFallbackCount;
    public Double callTxAvgBitrate;
    public Double callTxAvgBwe;
    public Double callTxAvgJitter;
    public Double callTxAvgLossPeriod;
    public Double callTxMaxJitter;
    public Double callTxMaxLossPeriod;
    public Double callTxMinJitter;
    public Double callTxMinLossPeriod;
    public Double callTxPktErrorPct;
    public Double callTxPktLossPct;
    public Double callUserRate;
    public Double callWakeupSource;
    public Double callerHungupBeforeConnected;
    public Double encoderCompStepdowns;
    public Double endCallAfterConfirmation;
    public Double isIpv6Capable;
    public Double jbAvgDelay;
    public Double jbDiscards;
    public Double jbEmpties;
    public Double jbGets;
    public Double jbLastDelay;
    public Double jbMaxDelay;
    public Double jbMinDelay;
    public Double jbPuts;
    public Double longConnect;
    public Double lowDataUsageBitrate;
    public String nativeSamplesPerFrame;
    public String nativeSamplingRate;
    public Double numberOfProcessors;
    public Double peerCallResult;
    public Double peerLoc;
    public Double peerUserId;
    public Double peerXmppStatus;
    public Double pingsSent;
    public Double pongsReceived;
    public Double presentEndCallConfirmation;
    public Double pushToCallOfferDelay;
    public Double rcMaxrtt;
    public Double rcMinrtt;
    public Double recordCircularBufferFrameCount;
    public Double reflectivePortsDiff;
    public Double rxTotalBitrate;
    public Double rxTotalBytes;
    public Double smallCallButton;
    public Double txTotalBitrate;
    public Double txTotalBytes;
    public String userDescription;
    public Double userProblems;
    public Double userRating;
    public Double wpNotifyCallFailed;
    public Double wpSoftwareEcMatches;
    public Double xmppStatus;

    void updateFields(Context context) {
        int i = b7.a;
        i.a(context, bn.EVENT, Integer.valueOf(cx.CALL.getCode()));
        i.a(context, bn.CALL_SIDE, this.callSide);
        i.a(context, bn.CALL_FROM_UI, this.callFromUi);
        i.a(context, bn.XMPP_STATUS, this.xmppStatus);
        i.a(context, bn.PEER_XMPP_STATUS, this.peerXmppStatus);
        i.a(context, bn.CALL_PEER_PLATFORM, this.callPeerPlatform);
        i.a(context, bn.SMALL_CALL_BUTTON, this.smallCallButton);
        i.a(context, bn.CALL_SELF_IPV4, this.callSelfIpv4);
        i.a(context, bn.CALL_PEER_IPV4, this.callPeerIpv4);
        i.a(context, bn.CALL_SELF_ASN, this.callSelfAsn);
        i.a(context, bn.CALL_PEER_ASN, this.callPeerAsn);
        i.a(context, bn.CALL_PEER_APP_VERSION, this.callPeerAppVersion);
        i.a(context, bn.CALL_RELAY_BIND_STATUS, this.callRelayBindStatus);
        i.a(context, bn.CALL_RELAY_SERVER, this.callRelayServer);
        i.a(context, bn.CALL_P2P_DISABLED, this.callP2pDisabled);
        i.a(context, bn.CALL_TEST_BUCKET, this.callTestBucket);
        i.a(context, bn.CALL_USER_RATE, this.callUserRate);
        i.a(context, bn.LONG_CONNECT, this.longConnect);
        i.a(context, bn.CALL_INTERRUPTED, this.callInterrupted);
        i.a(context, bn.CALL_ENDED_INTERRUPTED, this.callEndedInterrupted);
        i.a(context, bn.CALL_RECORD_CALLBACK_STOPPED, this.callRecordCallbackStopped);
        i.a(context, bn.CALL_PLAYBACK_CALLBACK_STOPPED, this.callPlaybackCallbackStopped);
        i.a(context, bn.CALL_RECORD_SILENCE_RATIO, this.callRecordSilenceRatio);
        i.a(context, bn.NUMBER_OF_PROCESSORS, this.numberOfProcessors);
        i.a(context, bn.CALL_RECORD_FRAMES_PS, this.callRecordFramesPs);
        i.a(context, bn.CALL_SAMPLING_RATE, this.callSamplingRate);
        i.a(context, bn.NATIVE_SAMPLING_RATE, this.nativeSamplingRate);
        i.a(context, bn.NATIVE_SAMPLES_PER_FRAME, this.nativeSamplesPerFrame);
        i.a(context, bn.BUILTIN_AEC_AVAILABLE, this.builtinAecAvailable);
        i.a(context, bn.BUILTIN_AGC_AVAILABLE, this.builtinAgcAvailable);
        i.a(context, bn.BUILTIN_NS_AVAILABLE, this.builtinNsAvailable);
        i.a(context, bn.BUILTIN_AEC_IMPLEMENTOR, this.builtinAecImplementor);
        i.a(context, bn.BUILTIN_AEC_UUID, this.builtinAecUuid);
        i.a(context, bn.BUILTIN_AEC_ENABLED, this.builtinAecEnabled);
        i.a(context, bn.CALL_AEC_MODE, this.callAecMode);
        i.a(context, bn.CALL_SW_AEC_TYPE, this.callSwAecType);
        i.a(context, bn.CALL_SW_AEC_MODE, this.callSwAecMode);
        i.a(context, bn.CALL_AEC_OFFSET, this.callAecOffset);
        i.a(context, bn.CALL_AEC_TAIL_LENGTH, this.callAecTailLength);
        i.a(context, bn.CALL_ECHO_LIKELIHOOD, this.callEchoLikelihood);
        i.a(context, bn.CALL_TONES_DETECTED_IN_RINGBACK, this.callTonesDetectedInRingback);
        i.a(context, bn.CALL_TONES_DETECTED_IN_RECORD, this.callTonesDetectedInRecord);
        i.a(context, bn.CALL_CALCULATED_EC_OFFSET, this.callCalculatedEcOffset);
        i.a(context, bn.CALL_CALCULATED_EC_OFFSET_STDDEV, this.callCalculatedEcOffsetStddev);
        i.a(context, bn.CALL_AGC_MODE, this.callAgcMode);
        i.a(context, bn.CALL_NS_MODE, this.callNsMode);
        i.a(context, bn.CALL_AUDIO_ENGINE_TYPE, this.callAudioEngineType);
        i.a(context, bn.CALL_ANDROID_AUDIO_MODE, this.callAndroidAudioMode);
        i.a(context, bn.CALL_ANDROID_RECORD_AUDIO_SOURCE, this.callAndroidRecordAudioSource);
        i.a(context, bn.CALL_ANDROID_RECORD_AUDIO_PRESET, this.callAndroidRecordAudioPreset);
        i.a(context, bn.CALL_RECORD_BUFFER_SIZE, this.callRecordBufferSize);
        i.a(context, bn.CALL_PLAYBACK_BUFFER_SIZE, this.callPlaybackBufferSize);
        i.a(context, bn.PEER_USER_ID, this.peerUserId);
        i.a(context, bn.PEER_LOC, this.peerLoc);
        i.a(context, bn.CALL_RESULT, this.callResult);
        i.a(context, bn.WP_NOTIFY_CALL_FAILED, this.wpNotifyCallFailed);
        i.a(context, bn.WP_SOFTWARE_EC_MATCHES, this.wpSoftwareEcMatches);
        i.a(context, bn.PEER_CALL_RESULT, this.peerCallResult);
        i.a(context, bn.CALLER_HUNGUP_BEFORE_CONNECTED, this.callerHungupBeforeConnected);
        i.a(context, bn.CALL_SERVER_NACK_ERROR_CODE, this.callServerNackErrorCode);
        i.a(context, bn.CALL_TERM_REASON, this.callTermReason);
        i.a(context, bn.CALL_END_RECONNECTING, this.callEndReconnecting);
        i.a(context, bn.CALL_SETUP_ERROR_TYPE, this.callSetupErrorType);
        i.a(context, bn.CALL_TRANSPORT, this.callTransport);
        i.a(context, bn.CALL_NETWORK, this.callNetwork);
        i.a(context, bn.CALL_NETWORK_SUBTYPE, this.callNetworkSubtype);
        i.a(context, bn.CALL_TRANSITION_COUNT, this.callTransitionCount);
        i.a(context, bn.CALL_TRANSPORT_RELAY_TO_RELAY_FALLBACK_COUNT, this.callTransportRelayToRelayFallbackCount);
        i.a(context, bn.CALL_TRANSPORT_P2P_TO_RELAY_FALLBACK_COUNT, this.callTransportP2pToRelayFallbackCount);
        i.a(context, bn.ENCODER_COMP_STEPDOWNS, this.encoderCompStepdowns);
        i.a(context, bn.AUDIO_PUT_FRAME_OVERFLOW_PS, this.audioPutFrameOverflowPs);
        i.a(context, bn.AUDIO_GET_FRAME_UNDERFLOW_PS, this.audioGetFrameUnderflowPs);
        i.a(context, bn.RECORD_CIRCULAR_BUFFER_FRAME_COUNT, this.recordCircularBufferFrameCount);
        i.a(context, bn.USER_RATING, this.userRating);
        i.a(context, bn.USER_DESCRIPTION, this.userDescription);
        i.a(context, bn.USER_PROBLEMS, this.userProblems);
        i.a(context, bn.PRESENT_END_CALL_CONFIRMATION, this.presentEndCallConfirmation);
        i.a(context, bn.END_CALL_AFTER_CONFIRMATION, this.endCallAfterConfirmation);
        i.a(context, bn.IS_IPV6_CAPABLE, this.isIpv6Capable);
        i.a(context, bn.CALL_WAKEUP_SOURCE, this.callWakeupSource);
        if (this.callRecentRecordFramesPs != null) {
            i.a(context, a.CALL_RECENT_RECORD_FRAMES_PS, this.callRecentRecordFramesPs);
        }
        if (this.callHistEchoLikelihood != null) {
            i.a(context, a.CALL_HIST_ECHO_LIKELIHOOD, this.callHistEchoLikelihood);
        }
        if (this.callEchoEnergy != null) {
            i.a(context, a.CALL_ECHO_ENERGY, this.callEchoEnergy);
        }
        if (this.callEchoLikelihoodBeforeEc != null) {
            i.a(context, a.CALL_ECHO_LIKELIHOOD_BEFORE_EC, this.callEchoLikelihoodBeforeEc);
        }
        if (this.callT != null) {
            i.a(context, a.CALL_T, this.callT);
        }
        if (this.callPlaybackFramesPs != null) {
            i.a(context, a.CALL_PLAYBACK_FRAMES_PS, this.callPlaybackFramesPs);
        }
        if (this.callRecentPlaybackFramesPs != null) {
            i.a(context, a.CALL_RECENT_PLAYBACK_FRAMES_PS, this.callRecentPlaybackFramesPs);
        }
        if (this.callPlaybackSilenceRatio != null) {
            i.a(context, a.CALL_PLAYBACK_SILENCE_RATIO, this.callPlaybackSilenceRatio);
        }
        if (this.callAudioRestartCount != null) {
            i.a(context, a.CALL_AUDIO_RESTART_COUNT, this.callAudioRestartCount);
        }
        if (this.callAudioRestartReason != null) {
            i.a(context, a.CALL_AUDIO_RESTART_REASON, this.callAudioRestartReason);
        }
        if (this.callRecordMaxEnergyRatio != null) {
            i.a(context, a.CALL_RECORD_MAX_ENERGY_RATIO, this.callRecordMaxEnergyRatio);
        }
        if (this.callEcRestartCount != null) {
            i.a(context, a.CALL_EC_RESTART_COUNT, this.callEcRestartCount);
        }
        if (this.callRxStoppedT != null) {
            i.a(context, a.CALL_RX_STOPPED_T, this.callRxStoppedT);
        }
        if (this.callSetupT != null) {
            i.a(context, a.CALL_SETUP_T, this.callSetupT);
        }
        if (this.callOfferElapsedT != null) {
            i.a(context, a.CALL_OFFER_ELAPSED_T, this.callOfferElapsedT);
        }
        if (this.callRingingT != null) {
            i.a(context, a.CALL_RINGING_T, this.callRingingT);
        }
        if (this.callRelayCreateT != null) {
            i.a(context, a.CALL_RELAY_CREATE_T, this.callRelayCreateT);
        }
        if (this.callMinRtt != null) {
            i.a(context, a.CALL_MIN_RTT, this.callMinRtt);
        }
        if (this.callMaxRtt != null) {
            i.a(context, a.CALL_MAX_RTT, this.callMaxRtt);
        }
        if (this.callAvgRtt != null) {
            i.a(context, a.CALL_AVG_RTT, this.callAvgRtt);
        }
        if (this.callLastRtt != null) {
            i.a(context, a.CALL_LAST_RTT, this.callLastRtt);
        }
        if (this.callInitialRtt != null) {
            i.a(context, a.CALL_INITIAL_RTT, this.callInitialRtt);
        }
        if (this.callTxPktLossPct != null) {
            i.a(context, a.CALL_TX_PKT_LOSS_PCT, this.callTxPktLossPct);
        }
        if (this.callTxPktErrorPct != null) {
            i.a(context, a.CALL_TX_PKT_ERROR_PCT, this.callTxPktErrorPct);
        }
        if (this.callTxAvgBitrate != null) {
            i.a(context, a.CALL_TX_AVG_BITRATE, this.callTxAvgBitrate);
        }
        if (this.callTxAvgBwe != null) {
            i.a(context, a.CALL_TX_AVG_BWE, this.callTxAvgBwe);
        }
        if (this.callTxMinJitter != null) {
            i.a(context, a.CALL_TX_MIN_JITTER, this.callTxMinJitter);
        }
        if (this.callTxMaxJitter != null) {
            i.a(context, a.CALL_TX_MAX_JITTER, this.callTxMaxJitter);
        }
        if (this.callTxAvgJitter != null) {
            i.a(context, a.CALL_TX_AVG_JITTER, this.callTxAvgJitter);
        }
        if (this.callTxMinLossPeriod != null) {
            i.a(context, a.CALL_TX_MIN_LOSS_PERIOD, this.callTxMinLossPeriod);
        }
        if (this.callTxMaxLossPeriod != null) {
            i.a(context, a.CALL_TX_MAX_LOSS_PERIOD, this.callTxMaxLossPeriod);
        }
        if (this.callTxAvgLossPeriod != null) {
            i.a(context, a.CALL_TX_AVG_LOSS_PERIOD, this.callTxAvgLossPeriod);
        }
        if (this.callRxPktLossPct != null) {
            i.a(context, a.CALL_RX_PKT_LOSS_PCT, this.callRxPktLossPct);
        }
        if (this.callRxAvgBitrate != null) {
            i.a(context, a.CALL_RX_AVG_BITRATE, this.callRxAvgBitrate);
        }
        if (this.callRxAvgBwe != null) {
            i.a(context, a.CALL_RX_AVG_BWE, this.callRxAvgBwe);
        }
        if (this.callRxMinJitter != null) {
            i.a(context, a.CALL_RX_MIN_JITTER, this.callRxMinJitter);
        }
        if (this.callRxMaxJitter != null) {
            i.a(context, a.CALL_RX_MAX_JITTER, this.callRxMaxJitter);
        }
        if (this.callRxAvgJitter != null) {
            i.a(context, a.CALL_RX_AVG_JITTER, this.callRxAvgJitter);
        }
        if (this.callRxMinLossPeriod != null) {
            i.a(context, a.CALL_RX_MIN_LOSS_PERIOD, this.callRxMinLossPeriod);
        }
        if (this.callRxMaxLossPeriod != null) {
            i.a(context, a.CALL_RX_MAX_LOSS_PERIOD, this.callRxMaxLossPeriod);
        }
        if (this.callRxAvgLossPeriod != null) {
            i.a(context, a.CALL_RX_AVG_LOSS_PERIOD, this.callRxAvgLossPeriod);
        }
        if (this.callStartFuncT != null) {
            i.a(context, a.CALL_START_FUNC_T, this.callStartFuncT);
        }
        if (this.callEndFuncT != null) {
            i.a(context, a.CALL_END_FUNC_T, this.callEndFuncT);
        }
        if (this.callRejectFuncT != null) {
            i.a(context, a.CALL_REJECT_FUNC_T, this.callRejectFuncT);
        }
        if (this.callAcceptFuncT != null) {
            i.a(context, a.CALL_ACCEPT_FUNC_T, this.callAcceptFuncT);
        }
        if (this.callSoundPortFuncT != null) {
            i.a(context, a.CALL_SOUND_PORT_FUNC_T, this.callSoundPortFuncT);
        }
        if (this.callOfferReceiptDelay != null) {
            i.a(context, a.CALL_OFFER_RECEIPT_DELAY, this.callOfferReceiptDelay);
        }
        if (this.avgEncodeT != null) {
            i.a(context, a.AVG_ENCODE_T, this.avgEncodeT);
        }
        if (this.avgDecodeT != null) {
            i.a(context, a.AVG_DECODE_T, this.avgDecodeT);
        }
        if (this.avgPlayCbT != null) {
            i.a(context, a.AVG_PLAY_CB_T, this.avgPlayCbT);
        }
        if (this.avgRecordCbT != null) {
            i.a(context, a.AVG_RECORD_CB_T, this.avgRecordCbT);
        }
        if (this.avgClockCbT != null) {
            i.a(context, a.AVG_CLOCK_CB_T, this.avgClockCbT);
        }
        if (this.avgRecordGetFrameT != null) {
            i.a(context, a.AVG_RECORD_GET_FRAME_T, this.avgRecordGetFrameT);
        }
        if (this.avgTargetBitrate != null) {
            i.a(context, a.AVG_TARGET_BITRATE, this.avgTargetBitrate);
        }
        if (this.txTotalBytes != null) {
            i.a(context, a.TX_TOTAL_BYTES, this.txTotalBytes);
        }
        if (this.rxTotalBytes != null) {
            i.a(context, a.RX_TOTAL_BYTES, this.rxTotalBytes);
        }
        if (this.txTotalBitrate != null) {
            i.a(context, a.TX_TOTAL_BITRATE, this.txTotalBitrate);
        }
        if (this.rxTotalBitrate != null) {
            i.a(context, a.RX_TOTAL_BITRATE, this.rxTotalBitrate);
        }
        if (this.jbAvgDelay != null) {
            i.a(context, a.JB_AVG_DELAY, this.jbAvgDelay);
        }
        if (this.jbMinDelay != null) {
            i.a(context, a.JB_MIN_DELAY, this.jbMinDelay);
        }
        if (this.jbMaxDelay != null) {
            i.a(context, a.JB_MAX_DELAY, this.jbMaxDelay);
        }
        if (this.jbLastDelay != null) {
            i.a(context, a.JB_LAST_DELAY, this.jbLastDelay);
        }
        if (this.jbDiscards != null) {
            i.a(context, a.JB_DISCARDS, this.jbDiscards);
        }
        if (this.jbEmpties != null) {
            i.a(context, a.JB_EMPTIES, this.jbEmpties);
        }
        if (this.jbGets != null) {
            i.a(context, a.JB_GETS, this.jbGets);
        }
        if (this.jbPuts != null) {
            i.a(context, a.JB_PUTS, this.jbPuts);
        }
        if (this.rcMinrtt != null) {
            i.a(context, a.RC_MINRTT, this.rcMinrtt);
        }
        if (this.rcMaxrtt != null) {
            i.a(context, a.RC_MAXRTT, this.rcMaxrtt);
        }
        if (this.lowDataUsageBitrate != null) {
            i.a(context, a.LOW_DATA_USAGE_BITRATE, this.lowDataUsageBitrate);
        }
        if (this.pushToCallOfferDelay != null) {
            i.a(context, a.PUSH_TO_CALL_OFFER_DELAY, this.pushToCallOfferDelay);
        }
        if (this.callOfferAckTimout != null) {
            i.a(context, a.CALL_OFFER_ACK_TIMOUT, this.callOfferAckTimout);
        }
        if (this.pingsSent != null) {
            i.a(context, a.PINGS_SENT, this.pingsSent);
        }
        if (this.pongsReceived != null) {
            i.a(context, a.PONGS_RECEIVED, this.pongsReceived);
        }
        if (this.reflectivePortsDiff != null) {
            i.a(context, a.REFLECTIVE_PORTS_DIFF, this.reflectivePortsDiff);
        }
        i.a(context, bn.EVENT);
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }
}
