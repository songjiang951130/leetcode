# 工厂模式

### 简单工厂模式

一个工厂 根据产品名称 获取不同厂商的的同一产品

```java
public class Factory{

    public Product getProduct(string name){
         switch(name){
            case "apple":
                return new Apple();
            case "samsung":
                return new Samsung();
         }
    }
}

abstract class Product{
}

class Apple extends Product{
}

class Samsung extends Product{
}
```

### 工厂方法模式

工厂方法模式是对工厂的进一步抽象，将工厂抽象，对应工厂生产对应厂商的产品  
> 比如：苹果工厂生产苹果手机，三星工厂生产三星手机


```java
abstract class AbstractFactory{
    Product getProduct(string name);
}

public class AppleFactory extends AbstractFactory{

    public Product getProduct(string name){
         return new Apple();
    }
}

public class SamsungFactory extends AbstractFactory{

    public Product getProduct(string name){
         return new Samsung();
    }
}
```
**此时如果有新的厂商，比如华为小米加入仅需要，新增产品和工厂即可。**  
**如果是简单工厂模式，则需要修改获取 Factory 的 getProduct，这就违反了开闭原则。**

### 抽象工厂模式

以上的工厂模式，仅能生产一种产品（手机）。多产品的
