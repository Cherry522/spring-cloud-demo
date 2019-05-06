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
浏览器访问：http://localhost:8000/
