package com.rnemojicompat;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import com.facebook.react.bridge.Callback;
import androidx.emoji2.text.EmojiCompat;

@ReactModule(name = RnEmojiCompatModule.NAME)
public class RnEmojiCompatModule extends ReactContextBaseJavaModule {
  public static final String NAME = "RnEmojiCompat";

  public RnEmojiCompatModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void getCompatibleEmojiString(String input, Callback onSuccess, Callback onError) {
        try {
            CharSequence compatible = EmojiCompat.get().process(input);
            onSuccess.invoke(compatible);
        } catch(Error error) {
            onError.invoke("EmojiCompat: Processing emoji failed");
        }
    }
}
