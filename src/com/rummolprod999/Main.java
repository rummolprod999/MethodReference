package com.rummolprod999;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	Stream.of("abc", "def").map(Object::toString).forEach(System.out::println);
    Stream.of("abc", "def").map(String::toString).forEach(System.out::println);
    }
}
