# UtilsLibrary


参考文档

1. [AndroidStuio快速发布开源项目到Jcenter/Bintray](http://blog.csdn.net/yanzhenjie1003/article/details/51672530)
2. [Android Studio 上传 Library 至 Jcenter 生成依赖的两种方式](http://blog.csdn.net/lv_fq/article/details/72567208)
3. [Android 快速发布开源项目到jcenter](http://blog.csdn.net/lmj623565791/article/details/51148825)
4. ​


执行指令

```
./gradlew clean build bintrayUpload -PbintrayUser=BINTRAY_USERNAME -PbintrayKey=BINTRAY_KEY -PdryRun=false
```

命令中 `BINTRAY_USERNAME` 代表在 `bintray` 上注册的用户名 `BINTRAY_KEY` 代表注册时获取的 `key`。 