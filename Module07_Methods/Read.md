# Module 7 — Methods

Methods are one of the most important building blocks of Java programming.

A method is a block of code designed to perform a particular task. A method can be called whenever that task needs to be performed.

## Why Use Methods?

Methods help us:

- Reuse code
- Avoid code duplication
- Divide a large program into smaller parts
- Improve readability
- Make debugging easier
- Organize programs logically
- Build reusable functionality

---

## Basic Syntax

```java
returnType methodName(parameters)
{
    // method body
}
```

Example:

```java
static void greet()
{
    System.out.println("Hello Java");
}
```

The method can be called using:

```java
greet();
```

---

# Types of Methods Based on Parameters and Return Value

There are four common combinations.

## 1. No Parameters, No Return Value

```java
static void greet()
{
    System.out.println("Hello");
}
```

## 2. Parameters, No Return Value

```java
static void greet(String name)
{
    System.out.println("Hello " + name);
}
```

## 3. No Parameters, Return Value

```java
static int getNumber()
{
    return 10;
}
```

## 4. Parameters and Return Value

```java
static int add(int a, int b)
{
    return a + b;
}
```

---

# Parameters vs Arguments

A **parameter** is a variable declared in the method definition.

```java
static int add(int a, int b)
```

Here, `a` and `b` are parameters.

An **argument** is the actual value passed when calling the method.

```java
add(10, 20);
```

Here, `10` and `20` are arguments.

---

# void

`void` means the method does not return a value.

```java
static void display()
{
    System.out.println("Hello");
}
```

---

# return

The `return` statement sends a value back to the caller.

```java
static int square(int n)
{
    return n * n;
}
```

---

# Static Method

A static method belongs to the class rather than to an object.

It can be called directly from a static context:

```java
static void display()
{
    System.out.println("Hello");
}

public static void main(String[] args)
{
    display();
}
```

---

# Instance Method

An instance method belongs to an object.

Example:

```java
class Demo
{
    void display()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args)
    {
        Demo obj = new Demo();
        obj.display();
    }
}
```

---

# Method Overloading

Method overloading means defining multiple methods with the same name but different parameter lists.

Example:

```java
static int add(int a, int b)
{
    return a + b;
}

static int add(int a, int b, int c)
{
    return a + b + c;
}
```

Method overloading is an example of compile-time polymorphism.

## Important Rule

Changing only the return type does **not** overload a method.

Invalid:

```java
int add(int a, int b)
double add(int a, int b)
```

The parameter list must differ.

---

# Recursion

Recursion occurs when a method calls itself.

Example:

```java
static int factorial(int n)
{
    if (n == 0)
    {
        return 1;
    }

    return n * factorial(n - 1);
}
```

A recursive method must have a **base condition** to stop recursion.

---

# Scope

Scope determines where a variable can be accessed.

A local variable declared inside a method is generally accessible only within that method/block where it is declared.

---

# Important Interview Questions

### What is a method?

A method is a block of code that performs a specific task and can be called whenever required.

### Why are methods used?

Methods provide code reusability, reduce duplication, improve readability, and divide a program into manageable parts.

### What is a parameter?

A parameter is a variable declared in a method definition.

### What is an argument?

An argument is the actual value passed to a method when it is called.

### What is method overloading?

Method overloading allows multiple methods with the same name but different parameter lists in the same class.

### Can methods be overloaded by changing only return type?

No.

### What is recursion?

Recursion is a technique in which a method calls itself.

### What is a base condition?

A base condition is the condition that stops recursive calls.

---

# Programs in This Module

| File                                         | Main Concept              |
| -------------------------------------------- | ------------------------- |
| `MethodBasics.java`                          | Basic method              |
| `MethodCalling.java`                         | Calling methods           |
| `MethodWithParameters.java`                  | Parameters                |
| `MethodWithReturnValue.java`                 | Return values             |
| `MethodWithParametersAndReturnValue.java`    | Parameters + return       |
| `MethodWithoutParametersAndReturnValue.java` | No parameter + no return  |
| `MultipleParameters.java`                    | Multiple parameters       |
| `VoidMethod.java`                            | `void`                    |
| `ReturnStatement.java`                       | `return`                  |
| `StaticMethod.java`                          | Static method             |
| `InstanceMethod.java`                        | Instance method           |
| `MethodScope.java`                           | Scope                     |
| `LocalVariable.java`                         | Local variables           |
| `ParameterVsArgument.java`                   | Parameter vs argument     |
| `MethodOverloading.java`                     | Method overloading        |
| `MethodOverloadingDifferentParameters.java`  | Different parameter count |
| `MethodOverloadingDifferentDataTypes.java`   | Different parameter types |
| `MethodOverloadingOrderOfParameters.java`    | Different parameter order |
| `RecursiveMethod.java`                       | Recursion                 |
| `FactorialUsingMethod.java`                  | Factorial                 |
| `PrimeUsingMethod.java`                      | Prime checking            |
| `PalindromeUsingMethod.java`                 | Palindrome                |
| `ArmstrongUsingMethod.java`                  | Armstrong number          |
| `FibonacciUsingMethod.java`                  | Fibonacci                 |
| `GCDUsingMethod.java`                        | GCD                       |
| `CalculatorUsingMethods.java`                | Modular calculator        |
| `MenuDrivenCalculatorUsingMethods.java`      | Methods + switch          |

---

# Learning Outcome

After completing this module, you should be able to:

- Create and call methods.
- Pass arguments to methods.
- Return values from methods.
- Understand `void`.
- Understand parameters and arguments.
- Use static and instance methods.
- Understand variable scope.
- Overload methods.
- Write recursive methods.
- Break large programs into smaller reusable methods.
- Explain methods confidently in viva and interviews.
