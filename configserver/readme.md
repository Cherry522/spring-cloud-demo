# 统一配置中心服务端配置
查看服务状态
http://localhost:8888/actuator

## 通过config服务查看配置文件
### 访问路径
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
### 路径替代符解释
* application：程序名称，比如user
* profile:环境名称，比如local、test、dev、pre、prod
* label：分支名称，比如master、trunk


