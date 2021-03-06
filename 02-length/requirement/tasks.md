### 需求一

```
实现一个库: 通过这个库，用户可以以Mile为单位表一个长度，精度为1 Mile。

并且，可以对比两个长度的相等性。
```

思考问题：什么时候3 != 3 ?，涉及到单位。火星探测器就是因为公制单位和英制单位转换出错而坠毁。

1. 3 Mile = 3 Mile（英里）。
    * 需求
        * 给定的两个以Mile为单位的长度，可以比较相等性。
    * 意图
        * 
    * 测试名称
        * should_equal_when_two_same_quantity_compare
    * 类名及行为名
        * Quantity(既有长度，又有单位在英文中由**量**Quantity这个单词描述)
    * 问题
        * 第一个类是什么？Length吗
        * 它有什么属性（数量和单位）
        * 可能会有人理解为Length类，但是Length只有长度的意思，没有单位。
        * Mile是单位一般不会变成类，至少现在还没有必要。
    * 建议
        * 先写断言。如果写不出断言，就说明对行为还不清晰。
    * 原则
        * 一次只写一个刚好失败的测试，作为新功能的描述。
2. 3 Mile != 5 Mile。
    * 需求
        * 给定的两个以Mile为单位的长度，可以比较相等性。
    * 意图
        * 
    * 测试名称
        * should_not_equal_when_two_quantity_has_different_length
    * 类名及行为名
        * Quantity(既有长度，又有单位在英文中由**量**Quantity这个单词描述)

### 需求二

```
用户除了可以使用Mile为单位表示长度外，还可以使Yard为单位表示长度，其中:

* 以Mile为单位表示长度时，精度为1Mile。 
* 以Yard为单位表示长度时，精度为1Yard。 
* 能够对比任意两个长度的相等性。
* 1 Mile == 1760 Yard 
* 3 Yard = 3 Yard
* 1 Mile != 1761 Yard 
* 3 Yard != 4 Yard
```

3. 引入新的单位，单位之间可以转换，1 Mile == 1760 Yard
    * 需求
        * 给定的两个不同单位的Quantity，可以比较相等性。
    * 意图
        * 
    * 测试名称
        * should_equal_when_two_same_quantity_has_different_unit
    * 类名及行为名
        * Quantity(既有长度，又有单位在英文中由**量**Quantity这个单词描述)
    * 问题
        * 单位之间的转换，重构，Unit枚举类，定义基础值。
4. 不同长度和单位
    * 需求
        * 给定的两个不同单位和长度的Quantity，可以比较相等性。
    * 意图
        * 
    * 测试名称
        * should_not_equal_when_two_quantity_has_different_length_and_unit
    * 类名及行为名
        * Quantity(既有长度，又有单位在英文中由**量**Quantity这个单词描述)

### 需求三

```
增加两个新的长度单位，Feet和Inch，用户可以以它们为单位表示长度，其中:

* 1 Yard == 3 Feet
* 1 Feet == 12 Inch
* 当用Feet为单位表示长度时，精度为1 Feet
* 当用Inch为单位表示长度时，精度为1 Inch
```           

5. Yard与Feet之间的转换
    * 需求
        * Yard与Feet之间的转换。
    * 意图
        * 
    * 测试名称
        * should_one_yard_equal_three_feet
    * 类名及行为名
        * Quantity(既有长度，又有单位在英文中由**量**Quantity这个单词描述)
6. Feet与Inch之间的转换
    * 需求
        * Feet与Inch之间的转换。
    * 意图
        * 
    * 测试名称
        * should_one_feet_equal_twelve_feet
    * 类名及行为名
        * Quantity(既有长度，又有单位在英文中由**量**Quantity这个单词描述)  

### 需求五

```
任意两个长度对象可以进行加法运算
```              

6. 两个Quantity可以相加，获得具有基础单位的Quantity
    * 需求
        * 两个Quantity可以相加，获得具有基础单位的Quantity。
    * 意图
        * 
    * 测试名称
        * should_one_quantity_plus_another
    * 类名及行为名
        * Quantity(既有长度，又有单位在英文中由**量**Quantity这个单词描述) 