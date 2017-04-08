package com.example.miku.servicebest_test;

/**
 * Created by miku on 2017/4/7.
 */
public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
