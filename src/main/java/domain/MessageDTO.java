package domain;

import lombok.Data;

import javax.persistence.Column;
import java.time.Instant;

@Data
public class MessageDTO {

    private static final long serialVersionUID = 1L;

    @Column(name = "creation_date")
    private Instant creationDate;

    private String content;

    private Boolean isSeen;

    private String sender;

    private String receiver;

}
