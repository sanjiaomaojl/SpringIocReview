# SpringIocReview
IOC
# Review
周末闲来无事，把IOC复习了一下，圣人云：温故而知新，可以为师矣。都是一些小的知识点。
### 创建对象
方式一 使用无参构造器 （重点）<br>
1.给类添加无参构造器<br>
2.配置<bean>元素<br>
3.调用容器的getBean方法来获得对象。<br>
方式二 静态工厂方法（了解）<br>
方式二 实例工厂方法（了解）<br>
### 作用域
默认情况下，容器对于某个bean。只会创建一个实例 <br>.
在配置bean的时候，指定scope属性,用来配置作用域，缺省值是singleton(即一个bean只创建一个实例)，如果值为prootype(即一个bean只创多个实例)<br>
`<bean id = "**" class="**" scope="prootype"/>`
## IOC 即控制反转
### 是什么？
对象之间的依赖关系由容器来建立 <br>
### DI 依赖注入
容器通过调用对象提供的set方法或者构造方法来简历依赖关系<br>
注：IOC是目标，DI是手段。<br>

<-- property元素：表示使用set方式来注入。其中name属性指定属性名，ref属性指定属性值(是被注入的bean的id) -->
`<bean id="b1" class="**"/>`<br>
`<bean id="a1" class="**">`<br>
`<property name="属性" ref="b1"/>`<br>
`</bean>`<br>
依赖注入的类可以增加一个接口，添加公共方法，[位置](https://github.com/sanjiaomaojl/SpringIocReview/blob/master/src/IOC/IB.java)，（sjmjl自己去看吧，不知道咋解释了。）
### 注入集合类型的值 
List Set Map Properties<br>
- 普通<br>
`<bean id="*" class="*">`<br>
`<property name="*" value="*">`<br>
`</bean>`<br>
- List<br>
`<property name="*">`<br>
`<List>`<br>
`<value>**</value>`<br>
`</list>`<br>
- Set <br>
    `<property name="*">`<br>
    `<set>`<br>
    `<value>*</value>`<br>
    `<value>*</value>`<br>
    `<value>*</value>`<br>
    `</set>`<br>
    `</property>`<br>
- Map<br>
`<property name="*">`<br>
`<map>`<br>
`<entry key="*" value="*"/>`<br>
`<entry key="*" value="*"/>`<br>
`</map>`<br>
`</property>`<br>
- Properties<br>
`<property name="*">`<br>
`<props>`<br>
`<prop key="*">*</prop>`<br>
`</props>`<br>
`</property>`<br>
### 读取properties文件的内容
读取properties文件的内容
        classpath:按照类路径来搜索。
        spring容器会依据路径找到对应的properties文件
        然后读取文件的内容<br>
`<util:properties id="config" location="classpath:conf/config.properties"/>`
