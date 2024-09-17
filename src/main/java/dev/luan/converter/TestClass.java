package dev.luan.converter;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your text: ");
        String input = scanner.nextLine();

        CaseConverter caseConverter = new CaseConverter();

        System.out.println("Input: " + input);
        System.out.println("LowerCase: " + caseConverter.toLowerCase(input));
        System.out.println("UpperCase: " + caseConverter.toUpperCase(input));
        System.out.println("CamelCase: " + caseConverter.toCamelCase(input));
        System.out.println("CapitalCase: " + caseConverter.toCapitalCase(input));
        System.out.println("ConstantCase: " + caseConverter.toConstantCase(input));
        System.out.println("DotCase: " + caseConverter.toDotCase(input));
        System.out.println("HeaderCase: " + caseConverter.toHeaderCase(input));
        System.out.println("NoCase: " + caseConverter.toNoCase(input));
        System.out.println("ParamCase: " + caseConverter.toParamCase(input));
        System.out.println("PascalCase: " + caseConverter.toPascalCase(input));
        System.out.println("PathCase: " + caseConverter.toPathCase(input));
        System.out.println("SentenceCase: " + caseConverter.toSentenceCase(input));
        System.out.println("SnakeCase: " + caseConverter.toSnakeCase(input));
        System.out.println("MockingCase: " + caseConverter.toMockingCase(input));
    }
}