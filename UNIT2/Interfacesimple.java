// Interface definition
interface Printable {
    void print();
}

// Implementing the interface
class Document implements Printable {
    String text;

    Document(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Printing document content: \"" + text + "\"");
    }
}

public class Interfacesimple {
    public static void main(String[] args) {
        System.out.println("--- Interface Simple Demo ---");
        Printable doc = new Document("Hello, World");
        doc.print();
    }
}