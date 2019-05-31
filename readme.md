
## 服务注册与发现
### Consulf服务的启动
#### 从官网下载对应操作系统的安装包
下载地址：https://www.consul.io/downloads.html
#### 安装
下载下来之后，得到一个压缩包：consul_1.5.1_darwin_amd64.zip
加压
#### 启动服务
在解压后的文件里有两个文件：
```
.
|____content.json
|____consul

```

##### 查看服务的版本
```
chenyanMac:consul chenyan$ ./consul -v
Consul v1.5.1
Protocol 2 spoken by default, understands 2 to 3 (agent will automatically use protocol >2 when speaking to compatible agents)
chenyanMac:consul chenyan$
```

##### 通过consul启动服务：
```
cd consul解压后的服务目录
./consul agent -dev
```
结果如下：
```
chenyanMac:consul chenyan$ ./consul agent -dev
==> Starting Consul agent...
==> Consul agent running!
           Version: 'v1.5.1'
           Node ID: '8e765751-4dc7-a22f-b351-6da4f5675f4e'
         Node name: 'chenyanMac'
        Datacenter: 'dc1' (Segment: '<all>')
            Server: true (Bootstrap: false)
       Client Addr: [127.0.0.1] (HTTP: 8500, HTTPS: -1, gRPC: 8502, DNS: 8600)
      Cluster Addr: 127.0.0.1 (LAN: 8301, WAN: 8302)
           Encrypt: Gossip: false, TLS-Outgoing: false, TLS-Incoming: false

==> Log data will now stream in as it occurs:

    2019/05/31 15:14:19 [DEBUG] agent: Using random ID "8e765751-4dc7-a22f-b351-6da4f5675f4e" as node ID
    ......
```

##### 服务访问地址：
启动服务后，通过浏览器访问url为：
http://localhost:8500




