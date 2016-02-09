package com.greetings;
import org.astro.World;

/**
 * Jigsaw module examples : <a href="http://openjdk.java.net/projects/jigsaw/quick-start#greetingsworld">Greetings world</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.format("Greetings %s!%n", World.name());
    }
}