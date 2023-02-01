# rn-emoji-compat

Support new Emojis on older Android versions.

## 🪄 Installation

```sh
yarn add rn-emoji-compat
```

The library needs and initialization, to do that you only have to modify the MainApplication.java file.

```
rootDir/android/app/src/main/java/com/your-project-name/app*/MainApplication.java
* The app folder name may vary depends on your project setup.
...

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
    initializeEmojiCompat(this); ---> this is NEW
  }

  private static void initializeEmojiCompat(Context context) {
      try{
        Class<?> compatPackageClass = Class.forName("com.rnemojicompat.RnEmojiCompatPackage");
        compatPackageClass.getMethod("initializeEmojiCompat", Context.class).invoke(null, context);
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (NoSuchMethodException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      } catch (InvocationTargetException e) {
        e.printStackTrace();
      }
  }

  rest...
```

## Usage

After initilization, all uncompatible emojis should be rendered correctly, there's nothing more to do.

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

**[MIT](/LICENSE)**

## 📝 Contribute

If you want to contribute read the [CONTRIBUTING.md](/CONTRIBUTING.md) guide.

## 🏢 Built with ♥️ and ⌨️ at TheWidlarzGroup

Built at TheWidlarzGroup - the group of React Native Developers and Designers who has built this project for you.
If you like it -> give it a star!

E-mail if you have any questions or just want to talk <hello@thewidlarzgroup.com>
