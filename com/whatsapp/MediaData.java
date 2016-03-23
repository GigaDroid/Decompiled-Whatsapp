package com.whatsapp;

import java.io.File;
import java.io.Serializable;

public class MediaData implements Serializable {
    public static int SUSPICIOUS_CONTENT_NO = 0;
    public static int SUSPICIOUS_CONTENT_YES = 0;
    public static int SUSPICIOUS_CONTENT_YES_IGNORE = 0;
    private static final long serialVersionUID = -3211751283609594L;
    public boolean autodownloadRetryEnabled;
    public byte[] cipherKey;
    public transient boolean dedupeDownload;
    public transient v downloader;
    public int faceX;
    public int faceY;
    public int failErrorCode;
    public File file;
    public long fileSize;
    public transient boolean forward;
    public byte[] hmacKey;
    public byte[] iv;
    public byte[] mediaKey;
    public long progress;
    public byte[] refKey;
    public int suspiciousContent;
    public boolean transcoded;
    public transient aiv transcoder;
    public boolean transferred;
    public transient boolean transferring;
    public long trimFrom;
    public long trimTo;
    public String uploadUrl;
    public transient sx uploader;

    public MediaData createSerializableCopy() {
        MediaData mediaData = new MediaData();
        mediaData.transferred = this.transferred;
        mediaData.progress = this.progress;
        mediaData.file = this.file;
        mediaData.fileSize = this.fileSize;
        mediaData.autodownloadRetryEnabled = this.autodownloadRetryEnabled;
        mediaData.transcoded = this.transcoded;
        mediaData.suspiciousContent = this.suspiciousContent;
        mediaData.trimFrom = this.trimFrom;
        mediaData.trimTo = this.trimTo;
        mediaData.faceX = this.faceX;
        mediaData.faceY = this.faceY;
        mediaData.mediaKey = this.mediaKey;
        mediaData.refKey = this.refKey;
        mediaData.cipherKey = this.cipherKey;
        mediaData.hmacKey = this.hmacKey;
        mediaData.iv = this.iv;
        mediaData.uploadUrl = this.uploadUrl;
        mediaData.failErrorCode = this.failErrorCode;
        return mediaData;
    }

    static {
        SUSPICIOUS_CONTENT_NO = 0;
        SUSPICIOUS_CONTENT_YES = 1;
        SUSPICIOUS_CONTENT_YES_IGNORE = 2;
    }

    public MediaData() {
        this.transferring = false;
        this.transferred = false;
    }

    public MediaData(MediaData mediaData) {
        this.transferring = false;
        this.transferred = false;
        this.transferred = mediaData.transferred;
        this.file = mediaData.file;
        this.fileSize = mediaData.fileSize;
        this.suspiciousContent = mediaData.suspiciousContent;
        this.faceX = mediaData.faceX;
        this.faceY = mediaData.faceY;
        this.mediaKey = mediaData.mediaKey;
        this.refKey = mediaData.refKey;
        this.cipherKey = mediaData.cipherKey;
        this.hmacKey = mediaData.hmacKey;
        this.iv = mediaData.iv;
        this.failErrorCode = mediaData.failErrorCode;
    }
}
