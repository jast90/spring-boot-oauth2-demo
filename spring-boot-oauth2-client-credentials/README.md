## WebSecurityConfigurerAdapter  和 ResourceServerConfigurerAdapter 关系
 如果配置了`EnableResourceServer`就不应该再去配置WebSecurityConfigurerAdapter而是应该通过配置ResourceServerConfigurerAdapter 
 来配置资源服务器的访问权限。
 
## 使用说明
- 运行项目
```
直接运行main方法 
```
- 获取access token
Base64 编码security.oauth2.client.client-id:security.oauth2.client.client-secret，
如：`foo:bar` [Base64编码](http://tool.oschina.net/encrypt?type=3)后的值`Zm9vOmJhcg==`

请求：
```
POST /oauth/token HTTP/1.1
Host: localhost:8080
Authorization: Basic Zm9vOmJhcg== //request header

grant_type=client_credentials //request body
```
返回值：
```
{
    "access_token": "dd8c9619-9241-4dc6-b911-957ae5706698",
    "token_type": "bearer",
    "expires_in": 43199,
    "scope": "read write"
}
```
- 访问资源

请求：
```
GET /hello?access_token=dd8c9619-9241-4dc6-b911-957ae5706698
```
返回值
```
{
    Hello: "World"
}
```

