package com.rnemojicompat;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.app.Application;

import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.bundled.BundledEmojiCompatConfig;

public class RnEmojiCompatPackage implements ReactPackage {

  public static void initializeEmojiCompat(Application application) {
        EmojiCompat.Config config = new BundledEmojiCompatConfig(application);
        EmojiCompat.init(config);
  }

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      return Arrays.<NativeModule>asList(new RnEmojiCompatModule(reactContext));
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      return Collections.emptyList();
  }
}
