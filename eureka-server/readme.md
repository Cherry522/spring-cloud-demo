## 参考链接
http://www.ityouknow.com/springcloud/2017/05/10/springcloud-eureka.html



## 配置/etc/hosts
```
# spring cloud Eureka测试
127.0.0.1 peer1
127.0.0.1 peer2
127.0.0.1 peer3
```

## 启动服务命令
```
 java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
 java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
 java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer3

```

## 通过页面查看服务注册状态
浏览器访问：http://localhost:8761/

## 访问Eureka的服务提供者
http://localhost:9001/hello?name=chenyan

## 访问Eureka的服务消费者
http://localhost:9002/hello?name=chenyan

## 熔断测试
停掉服务提供者，再访问服务消费者，发现服务会跳转到熔断的服务。
