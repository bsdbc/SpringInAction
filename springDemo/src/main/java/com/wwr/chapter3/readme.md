##高级装配

###1.1环境与profile
应用场景：
需要区分多个环境，比如开发环境和部署环境不同的情况

***Profile***

**使用**：
1. 注解方式可以使用`@Profile`注解区分初始化那些bean
    >`@Profile`注解可以使用在配置类和@Bean注解所在的方法上

2. XML配置方式
   >在`<beans>`标签上使用`profile`属性
   
   >在`<beans>`标签中嵌套的使用`<beans>`标签，然后在内部`<beans>`标签上使用`profile`属性

**激活**：

Spring在确定哪个profile处于激活状态时，需要依赖两个独立的属性`spring.profiles.active`和`spring.profiles.default`
>如果设置了`spring.profiles.active`属性的话，那么它的值就用来确定哪个profile是激活的。

>但如果没有设置`spring.profiles.active`属性的话，那么Spring将会查找`spring.profiles.default`的值

>如果两个都没有设置的话，那就是没有设置激活的profile，Spring只会激活那些没有配置profile的bean

这里可以采用多种方式设置这两个属性：

- 作为DispatcherServlet的初始化参数
- 作为Web应用的上下文参数
- 作为JNDI条目
- 作为JVM的系统属性
- 在集成测试类上，使用`@ActiveProfiles`注解设置


###条件化的bean

应用场景：假设你希望一个或多个bean只有在满足某种条件时才创建，比如设置了某个配置

**@Conditional**：在带有@Bean的方法上使用
```java
    @Bean
    @Conditional(MagicExistsCondition.class) //给@Conditional的类可以是任何实现了Condition接口的类
    public MagicBean magicBean(){

        return new MagicBean();
    }
```

```java
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MagicExistsCondition implements Condition {
    /**
     *判断resources下application.properties文件中是否同时存在magic的配置，存在则创建magicBean
     *
     * */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Resource resource = conditionContext.getResourceLoader().getResource("application.properties");
        Properties prop=new Properties();
        try {
            prop.load(new FileInputStream(resource.getFile()));

        } catch (IOException e) {
            e.printStackTrace();
        }


        return prop.containsKey("magic"); //true 创建bean false 忽略不创建
    }
}

```

###处理装配bean的歧义性
1. `@Autowire 和 @Qualifier 配合使用`
2. 使用J2EE自带的`@Resource(name="xxx")`注解
3. 使用`@Primary`注解标注首选项

###bean的作用域
1. 单例(Singleton):在整个应用中，只创建bean的一个实例
2. 原型(Prototype):每次注入或者通过Spring应用上下文获取的时候，都会创建一个新的bean实例。
3. 会话(Session):在Web应用中，为每个会话创建一个bean实例
4. 请求(Request):在Web应用中，为每个请求创建一个bean实例

**使用**

- 使用自动扫描时，在bean上添加`@Scope`注解

####scope 为session/request时的处理

思考：一个在StoreService中有一个购物车ShoppingCart实例，这个购物车在有会话才会被创建，但StoreService是单例的，它会在Spring初始化时就被创建，这时没有购物车实例，则会注入失败报错

Scope为Session的配置
```java
@Component
@Scope(
        value=WebApplicationContext.SCOPDE_SESSION,
        proxyMode=ScopedProxyMode.INTERFACE
)
public Shopping cart(){...}
```

###注入外部的值

1. 使用Environment
2. 使用SpEL

![SpEL运算符](./SpEL运算符.png)

SpEL使用示例：

> `#{表达式}` #{T(System).currentTimeMillis} //T()表达式会将java.lang.System视为Java中对应的类型,**他能够访问目标类型的静态方法和常量**

> `#{artistSelector.selectArtist?.toUpperCase()}` //?. 运算符，这个运算符能够在访问它右边的内容之前，确保它所对应的元素不是null

>`#{scoreboard.score > 1000 ? "Winner":"Loser"}` //三元表达式

>`#{disc.title?: "Rattle and Hum"}` //如果disc.title是null，则使用后面的默认值代替 

> `#{admin.email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com'}` //正则表达式

>`#{jukebox.songs.?[artist eq 'Aerosmith']}` //.? 运算符，用来过滤集合，得到一个集合的子集