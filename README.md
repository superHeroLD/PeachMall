# PeachMall
做个电商商城玩玩

目前所用的技术主要是SpringCloud + SpringBoot
+ 注册中心：Nacos
+ 配置中心：Nacos
+ 熔断限流：Sentinel
+ RPC框架：Dubbo
+ 定时任务框架：Quartz

但是用了一下Nacos后感觉Nacos作为注册中和配置中心确实比较简单，但实际项目中如果使用的话可能会有不够专注的问题。
也就是说如果我线上配置需要20台注册中心，4台配置中心就可以的话，那么使用Nacos的情况下这两个中间件是分不开的。会有冗余的情况。
后续的话我会尝试用下Eurka作为注册中心，在用Apollo做配置中心


