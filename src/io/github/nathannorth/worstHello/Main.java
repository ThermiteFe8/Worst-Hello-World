package io.github.nathannorth.worstHello;

public class Main {
    public static void main(String[] args) {
        //todo find the first thousand prime numbers and sort them by their sum of digits
        //todo a big loading bar
        System.out.println("Hello World!");
        throw new TaskFailedSuccessfullyException();
    }
    private static class TaskFailedSuccessfullyException extends RuntimeException {
        public TaskFailedSuccessfullyException() {
            throw new TaskFailedSuccessfullyException();
        }
    }
}
