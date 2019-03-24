package domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@JsonSubTypes.Type(QuestionnaireableOffer.class)
public class QuestionnaireableOffer extends Questionnaireable implements Serializable {
    private String description;
}
