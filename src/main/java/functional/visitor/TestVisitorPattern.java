package functional.visitor;

import java.util.UUID;

public class TestVisitorPattern {

    public static void main(String[] args) {
        Visitor v = new ElementVisitor();
        Document d = new Document(UUID.randomUUID().toString());
        d.elements.add(new JsonElement(UUID.randomUUID().toString()));
        d.elements.add(new JsonElement(UUID.randomUUID().toString()));
        d.elements.add(new XmlElement(UUID.randomUUID().toString()));

        d.accept(v);
    }

}
