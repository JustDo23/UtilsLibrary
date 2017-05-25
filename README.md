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
5. [如何通过Android Studio发布library到jCenter和Maven Central](http://www.jianshu.com/p/3c63ae866e52)

最后推荐跟着第一篇文章实践。

### 02. 配置 local.properties

**apikey** 要做好保密工作，将重要信息在 local.properties 并不对外公开

```groovy
# bintray 用户名 和 key
bintray.user=******
bintray.apikey=4************************************8
```

### 03. 执行指令

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

### 04. 本库引用

在 app 的 build.gradle 中添加代码

```groovy
compile 'com.just:utils-lib:1.0.0'
```

### 05. 简单链接

1. **JCenter** 托管在 [https://bintray.com](https://bintray.com) 资源库。可以在 [http://jcenter.bintray.com](http://jcenter.bintray.com) 找到需要的资源。
2. **Maven Central** 托管在 [https://sonatype.org](https://sonatype.org) 资源库。可以在 [https://oss.sonatype.org/content/repositories/releases](https://oss.sonatype.org/content/repositories/releases) 找到需要的资源。
3. **Gradle** 如何定义的依赖从仓库中拉取下来呢？其实比较简单就是定义的依赖对应有一个下载地址，比如我们的库会有一个地址： [http://jcenter.bintray.com/com/just/utils-lib/1.0.0](http://jcenter.bintray.com/com/just/utils-lib/1.0.0) 可以点击查看该目录下会有四个我们上传的文件。



