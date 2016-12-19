package ru.mipt.java2016.homework.g596.kozlova.task4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Array;

public class Function {

    private static final Logger LOG = LoggerFactory.getLogger(Variable.class);

    private String userName;
    private String name;
    private Array arguments;
    private String expression;

    public Function(String u, String n, Array a, String e) {
        userName = u;
        name = n;
        arguments = a;
        expression = e;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public Array getArguments() {
        return arguments;
    }

    public String getExpression() {
        return expression;
    }
}