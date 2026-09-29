# Java Strings

This module covers the fundamentals of **Strings in Java**, common String operations, problem-solving techniques, and interview-oriented String problems.

The programs are organized from basic concepts to more advanced problems.

---

## 📂 Folder Structure

```text
10-strings/
│
├── README.md
│
├── basics/
│   ├── StringBasics.java
│   ├── StringTraversal.java
│   ├── StringMethods.java
│   └── StringComparison.java
│
├── problems/
│   ├── ReverseString.java
│   ├── StringPalindrome.java
│   ├── CountVowelsConsonants.java
│   ├── CharacterFrequency.java
│   ├── FindDuplicateCharacters.java
│   ├── FirstNonRepeatingCharacter.java
│   ├── RemoveDuplicateCharacters.java
│   ├── CheckAnagram.java
│   ├── CheckStringRotation.java
│   ├── ReverseWords.java
│   ├── LongestWord.java
│   └── StringBuilderExample.java
│
└── interview/
    ├── StringCompression.java
    ├── LongestCommonPrefix.java
    ├── LongestSubstringWithoutRepeating.java
    └── ValidParentheses.java
```

---

## 📚 Topics Covered

### 1. String Basics

- Creating Strings
- String length
- Accessing characters
- String traversal
- `charAt()`
- `length()`

### 2. String Methods

Commonly used methods:

```java
length()
charAt()
substring()
toUpperCase()
toLowerCase()
contains()
startsWith()
endsWith()
indexOf()
equals()
```

### 3. String Comparison

Understanding the difference between:

```java
==
```

and

```java
equals()
```

`==` compares references, while `equals()` compares String contents.

### 4. String Manipulation

Programs for:

- Reversing a String
- Checking palindrome
- Reversing words
- Finding the longest word
- Removing duplicate characters
- Checking String rotation

### 5. Character Frequency

Programs covering:

- Character frequency
- Duplicate characters
- First non-repeating character

### 6. Anagram

Check whether two Strings contain the same characters with the same frequencies.

Example:

```text
listen
silent
```

Result:

```text
Anagram
```

### 7. StringBuilder

Understanding `StringBuilder` for efficient String modification.

Important methods:

```java
append()
insert()
delete()
reverse()
```

### 8. String Compression

Example:

```text
Input:
aaabbcccc

Output:
a3b2c4
```

### 9. Longest Common Prefix

Example:

```text
flower
flow
flight
```

Result:

```text
fl
```

### 10. Sliding Window

The module introduces the **sliding window technique** through:

```text
LongestSubstringWithoutRepeating
```

Example:

```text
Input:
abcabcbb

Output:
3
```

The longest substring without repeating characters is:

```text
abc
```

### 11. Stack with Strings

`ValidParentheses` demonstrates how a Stack can be used to validate:

```text
()
[]
{}
```

Example:

```text
({[]})
```

is valid.

---

## 🎯 Important Programs

The following programs are particularly useful for interview preparation:

| Program                            | Concept             |
| ---------------------------------- | ------------------- |
| `StringComparison`                 | `==` vs `equals()`  |
| `ReverseString`                    | String traversal    |
| `StringPalindrome`                 | Two pointers        |
| `CharacterFrequency`               | Frequency counting  |
| `FirstNonRepeatingCharacter`       | Character frequency |
| `CheckAnagram`                     | Frequency array     |
| `StringCompression`                | String traversal    |
| `LongestCommonPrefix`              | String comparison   |
| `LongestSubstringWithoutRepeating` | Sliding window      |
| `ValidParentheses`                 | Stack               |

---

## 🧠 Key Concepts

After completing this module, you should understand:

- What a String is in Java
- String immutability
- String comparison
- Common String methods
- Character traversal
- `StringBuilder`
- Frequency counting
- Two-pointer technique
- Sliding window technique
- Stack-based String problems
- Basic String interview problems

---

## 🚀 How to Run

Compile a Java program:

```bash
javac StringBasics.java
```

Run it:

```bash
java StringBasics
```

For a program inside a folder:

```bash
cd basics
javac StringBasics.java
java StringBasics
```

---

## 📌 Practice Order

Recommended learning order:

```text
1. StringBasics
       ↓
2. StringTraversal
       ↓
3. StringMethods
       ↓
4. StringComparison
       ↓
5. ReverseString
       ↓
6. StringPalindrome
       ↓
7. CharacterFrequency
       ↓
8. FindDuplicateCharacters
       ↓
9. FirstNonRepeatingCharacter
       ↓
10. CheckAnagram
       ↓
11. CheckStringRotation
       ↓
12. ReverseWords
       ↓
13. StringBuilderExample
       ↓
14. StringCompression
       ↓
15. LongestCommonPrefix
       ↓
16. LongestSubstringWithoutRepeating
       ↓
17. ValidParentheses
```

---

## 🛠️ Technologies

- **Language:** Java
- **Topic:** Strings
- **Level:** Beginner → Intermediate → Interview

---

## 🎯 Goal

The goal of this module is to build a strong foundation in Java Strings and gradually introduce common problem-solving techniques used in coding interviews.

> **Practice the basics first, then focus on the patterns behind the problems.**
