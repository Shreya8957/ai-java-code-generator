# AI-Powered Java Code Generator

This project turns natural language prompts into Java code using simulated GitHub Copilot/OpenAI Codex logic. It also includes sample JUnit tests and prompt files.

## Features

- Converts plain English to Java methods
- Generates test cases (JUnit)
- Easy to extend for more prompts

## Technologies Used

- Java
- JUnit 5
- GitHub Copilot / Codex (simulated)
- Prompt Engineering

## Example Prompt


### Output Code

```java
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
ai-java-code-generator/
├── Main.java
├── PromptProcessor.java
├── GeneratedCodeTest.java
├── prompts/
│   └── factorial.txt
└── README.md

---



