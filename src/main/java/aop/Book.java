package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Kamasutra")
    private String name;

    @Value("Indus")
    private String author;

    @Value("900")
    private int publicationYear;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
