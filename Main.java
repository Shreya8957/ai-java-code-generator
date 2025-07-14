public class Main {
    public static void main(String[] args) {
        String prompt = "Write a method to check if a number is prime";
        String code = PromptProcessor.generateCode(prompt);
        System.out.println("Generated Java code:\n" + code);
    }
}
