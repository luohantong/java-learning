# Java 学习练习项目

Java 基础语法练习代码，按天（Day）组织，循序渐进。

## 项目结构

```
src/main/java/com/lht/
├── Main.java              # IDEA 模板文件（可删除）
├── Day01/
│   └── HelloWorld.java    # Day01 - 入门：Hello World
├── Day02/
│   └── Demo.java          # Day02 - 分支结构：BMI 计算器
├── Day03/
│   ├── Demo.java          # Day03 - 循环嵌套：九九乘法表
│   └── Demo2.java         # Day03 - 综合应用：猜数字游戏
└── Day04/
    ├── Demo.java          # Day04 - 数组基础：成绩统计（基础版）
    └── Demo2.java         # Day04 - 数组+方法：成绩统计（方法版）
```

## 环境要求

- JDK 17+
- Maven 3.8+

## 运行方式

### 方式一：使用 IDEA
直接运行对应类的 `main` 方法即可。

### 方式二：命令行

```bash
# 编译
mvn compile

# 运行指定类
mvn exec:java -Dexec.mainClass="com.lht.Day01.HelloWorld"
```

## 各文件功能说明

### Day01 - 入门基础

| 文件 | 功能描述 |
|------|----------|
| `HelloWorld.java` | Java 入门第一个程序，打印 "Hello World"，学习 `main` 方法结构和 `System.out.println` |

### Day02 - 分支结构

| 文件 | 功能描述 |
|------|----------|
| `Demo.java` | **BMI 身体质量指数计算器**。接收用户输入的体重(kg)和身高(m)，计算 BMI 值并判断体重状况（偏轻/正常/超重/肥胖）。核心知识点：`Scanner` 输入、算术运算、`if-else if` 分支、`printf` 格式化输出 |

### Day03 - 循环结构

| 文件 | 功能描述 |
|------|----------|
| `Demo.java` | **九九乘法表**。使用两层 `for` 循环嵌套输出标准九九乘法表。核心知识点：循环嵌套、`printf` 格式化、制表符 `\t` 对齐 |
| `Demo2.java` | **猜数字游戏**。程序随机生成 1-100 的数字，用户循环猜测，程序提示"猜大了/猜小了/猜对了"。核心知识点：`Random` 随机数、`while(true)` 死循环、`switch` 分支、`break`/`return` 控制流 |

### Day04 - 数组与方法

| 文件 | 功能描述 |
|------|----------|
| `Demo.java` | **成绩统计（基础版）**。录入 5 个学生成绩，计算最高分、最低分、总分和平均分。核心知识点：数组定义与遍历、最值算法、求和算法、强制类型转换 `(double)sum / length` |
| `Demo2.java` | **成绩统计（方法版）**。将统计逻辑封装为独立方法（`getMax`/`getMin`/`getSum`/`getAvg`），主方法负责数据录入和结果输出。核心知识点：方法封装、方法重载、方法复用、增强 `for` 循环（`for-each`）、`StringBuilder`/`String.format` |

## 知识点速查表

| 知识点 | 出现文件 |
|--------|----------|
| `System.out.println` / `printf` | Day01, Day02, Day03, Day04 |
| `Scanner` 键盘输入 | Day02, Day03/Demo2, Day04 |
| `if-else` / `switch` | Day02, Day03/Demo2 |
| `for` 循环 / 循环嵌套 | Day03/Demo, Day04 |
| `while` 循环 / 死循环 | Day03/Demo2 |
| `Random` 随机数 | Day03/Demo2 |
| 数组定义、遍历 | Day04 |
| 最值/求和/平均算法 | Day04 |
| 方法定义与调用 | Day04/Demo2 |
| 增强 for 循环 (`for-each`) | Day04/Demo2 |
| 强制类型转换 | Day02, Day04 |
| `break` / `return` 控制流 | Day03/Demo2 |

## 代码规范

- 类名采用大驼峰命名法（PascalCase）：`HelloWorld`, `Demo`, `Demo2`
- 方法名采用小驼峰命名法（camelCase）：`getMax`, `getMin`
- 包名全小写：`com.lht.Day01`
- 缩进使用 4 个空格
- 文件编码：UTF-8

## 版本历史

| 日期 | 说明 |
|------|------|
| Day01 | 基础语法入门 |
| Day02 | 分支结构练习 |
| Day03 | 循环结构练习 |
| Day04 | 数组与方法练习 |