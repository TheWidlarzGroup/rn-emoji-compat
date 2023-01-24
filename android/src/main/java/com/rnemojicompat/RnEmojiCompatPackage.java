package com.rnemojicompat;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.app.Application;

import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.bundled.BundledEmojiCompatConfig;


public class RnEmojiCompatPackage implements ReactPackage {

    public void RNEmojiCompatPackage(Application application) {
        EmojiCompat.Config config = new BundledEmojiCompatConfig(application);
        EmojiCompat.init(config);
    }


  @NonNull
  @Override
  public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();
    modules.add(new RnEmojiCompatModule(reactContext));
    return modules;
  }

  @NonNull
  @Override
  public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }
}
