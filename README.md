\# Text File

\# AUTHOR:   siku

\# FILE:     README.md

\# ROLE:     TODO (some explanation)

\# CREATED:  2017-03-25 12:34:22

\# MODIFIED: 2017-03-25 12:34:22

# 实  验  三

使用面向对象的思想设计一个即时战略游戏的类结构，主要的类和接口如下：

## 1.人口类: 实现可移动接口和可进攻的接口。
+ ### ~~1.1 属性~~:
  + 生命值
  + 攻击力
  + 占用人口个数
  + 消耗资源

+ ### 1.2 子类:
  + ~~农民~~ 该类可以创建其它人口类如机枪兵、坦克、飞机。

## ~~2.资源类~~

+ ### 2.1 属性
  封装了一个整形的数组,包含两个元素

  +  水晶资源
  +  油矿资源

+ ### 2.2方法
  +  int getDiamond()
  +  void setDiamond()
  +  void setOil()
  +  int getOil()

## 3.建筑类(是使用接口还是抽象类?)
+ ### ~~3.1属性~~
  +  生命值
  +  消耗资源
+ ### 3.2子类

|类名|属性|
|:-| :-|
|~~指挥中心~~|~~创建农民,实现可以升降的接口~~|
|~~兵营~~|~~创建机枪兵,实现可升降的接口~~|
|~~工厂~~|~~创建坦克,实现可升降接口~~|
|~~飞机场~~|~~创建飞机,实现可升降的接口~~|
|~~供应站~~|~~每个供应站可以供应8个人口~~|


## 4.玩家类
+ ### 4.1 属性
  +  玩家的名称
  +  玩家的最大人口数
  +  玩家的当前人口数
  +  玩家的资源

## ~~5.可移动接口~~
+ ### 5.1 方法
  +  move()

## ~~6.可进攻接口~~
+ ### 6.1 方法
  +  attack();

## ~~7.可升降接口~~
+ ### 7.1 方法
  +  uprising()
  +  downLanding()
