# guice-example
A simple project with an example of google guice dependency injection

Guiceをバッチで使用する場合に、javax.enterprise.inject.spi.CDI#selectメソッドが使用可能かを調査したが、
次のようなエラーが発生した。

```
Exception in thread "main" java.lang.IllegalStateException: Unable to locate CDIProvider
	at javax.enterprise.inject.spi.CDI.findAllProviders(CDI.java:121)
	at javax.enterprise.inject.spi.CDI.getCDIProvider(CDI.java:82)
	at javax.enterprise.inject.spi.CDI.current(CDI.java:64)
	at co.mark.howard.guiceexample.Application.start(Application.java:30)
	at co.mark.howard.guiceexample.Application.main(Application.java:24)
```

CDIのコンポーネントをバッチアプリで静的に取得することを目的に、Google Guiceを使っても目的を果たせない模様。
