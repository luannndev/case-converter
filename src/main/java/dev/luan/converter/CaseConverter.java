package dev.luan.converter;

public class CaseConverter {
    // Lowercase
    public String toLowerCase(String input) {
        return input.toLowerCase();
    }

    // Uppercase
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Camelcase
    public String toCamelCase(String input) {
        String[] words = input.split(" ");
        for (int i = 1; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join("", words);
    }

    // Capitalcase
    public String toCapitalCase(String input) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    // Constantcase
    public String toConstantCase(String input) {
        return input.toUpperCase().replace(" ", "_");
    }

    // Dotcase
    public String toDotCase(String input) {
        return input.toLowerCase().replace(" ", ".");
    }

    // Headercase
    public String toHeaderCase(String input) {
        return toCapitalCase(input.replace(" ", "-"));
    }

    // Nocase
    public String toNoCase(String input) {
        return input.replace(" ", "");
    }

    // Paramcase
    public String toParamCase(String input) {
        return input.toLowerCase().replace(" ", "-");
    }

    // Pascalcase
    public String toPascalCase(String input) {
        return toCapitalCase(input.replace(" ", ""));
    }

    // Pathcase
    public String toPathCase(String input) {
        return input.toLowerCase().replace(" ", "/");
    }

    // Sentencecase
    public String toSentenceCase(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    // Snakecase
    public String toSnakeCase(String input) {
        return input.toLowerCase().replace(" ", "_");
    }

    // Mockingcase
    public String toMockingCase(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(i % 2 == 0 ? Character.toUpperCase(input.charAt(i)) : Character.toLowerCase(input.charAt(i)));
        }
        return output.toString();
    }
}
