## UtilsLibrary

> 引言：将自己的封装的 Library 提交到 JCenter 方便使用。
>
> 时间：2017年05月25日
>
> 作者：JustDo23

### 01. 参考文档

看到一篇文章之后决定动手实践，没想到还是踩了几个坑。

1. [Android Studio 快速发布开源项目到 Jcenter/Bintray](http://blog.csdn.net/yanzhenjie1003/article/details/51672530)
2. [Android Studio 上传 Library 至 Jcenter 生成依赖的两种方式](http://blog.csdn.net/lv_fq/article/details/72567208)
3. [Android 快速发布开源项目到 jcenter](http://blog.csdn.net/lmj623565791/article/details/51148825)
4. [取之于开源,必回归于开源](http://www.sabria.me/2015/12/02/ZT12_1/)

最后推荐跟着第一篇文章实践。

### 02. 执行指令

1. 第一次进行操作

   ```
   ./gradlew install
   ./gradlew bintrayUpload
   ```

2. 升级版本

   ```
   // 在修改了版本号之后执行指令
   ./gradlew bintrayUpload
   ```

3. 参考指令

   ```
   ./gradlew clean build bintrayUpload -PbintrayUser=BINTRAY_USERNAME -PbintrayKey=BINTRAY_KEY -PdryRun=false
   ```

   命令中 `BINTRAY_USERNAME` 代表在 `bintray` 上注册的用户名 `BINTRAY_KEY` 代表注册时获取的 `key`。 

   **注意：** 踩了这个坑，第一次执行这个没有生成 `pom` 文件，导致在 [bintray](https://bintray.com) 中点击 `Add to JCenter` 的时候报错提示需要添加 pom 文件。


### 03. 本库引用

在 app 的 build.gradle 中添加代码

```groovy
compile 'com.just:utils-lib:1.0.0'
```


