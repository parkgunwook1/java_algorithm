package study.polymorphism;


interface Language {
    void speak();
}

class English implements Language {
    String message = "Hello";

    public void speak() {
        System.out.println(this.message);
    }
}

class Korean implements Language {
    String message = "안녕";

    public void speak() {
        System.out.println(this.message);
    }
}

class French implements Language {
    String message = "Bonjour";

    public void speak() {
        System.out.println(this.message);
    }
}

class LanguageTranslator {
    void translate(Language language) {
        language.speak();
    }
}

public class Translator {
    public static void main(String[] args) {

        English english = new English();
        Korean korean = new Korean();
        French french = new French();

        LanguageTranslator papago = new LanguageTranslator();

        papago.translate(english);      // Hello 출력
        papago.translate(korean);       // 안녕 출력
        papago.translate(french);       // Bonjour 출력
    }
}
