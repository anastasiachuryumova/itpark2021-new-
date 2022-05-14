package lesson42.model.nosql;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Document(collation = "comment")
public class Comment {

    @Id
    private String id;

    @NotEmpty
    private String text;

    @ManyToOne
    private Book book;

    public Comment(String text) {
        this.text = text;
    }
}
