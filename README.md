[![GitHub Release](https://github.com/BowenSun90/Picture-resources/blob/master/license.jpeg)](https://github.com/BowenSun90/Springboot-mybatis-multi-datasource)

# Springboot-mybatis-multi-datasource
Demo for Springboot project include mybatis multi-datasource

Springboot 集成mybatis 多数据源多项目实现

## demo-jdbc-common  
配置多个DataSource和Mapper，不通DataSource的Mapper放在不同的目录下，通过下面方式指定mapper用那个DataSource
```
@MapperScan(basePackages = "com.example.mapper.lib", sqlSessionFactoryRef = "primarySqlSessionFactory")
```
DataSource信息在使用者（demo-web）的properties中配置
```
spring.datasource.primary.url=jdbc:mysql://127.0.0.1:3306/lib
spring.datasource.primary.username=root
spring.datasource.primary.password=root
spring.datasource.primary.driver-class-name=com.mysql.jdbc.Driver

spring.datasource.secondary.url=jdbc:mysql://127.0.0.1:3306/web
spring.datasource.secondary.username=root
spring.datasource.secondary.password=root
spring.datasource.secondary.driver-class-name=com.mysql.jdbc.Driver
```

## demo-libs  
提供Service服务，连接一个DataSource


## demo-web  
提供Web服务，使用demo-libs提供的Service和自己连接的DataSource
