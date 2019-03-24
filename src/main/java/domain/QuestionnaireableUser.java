package domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonSubTypes.Type(QuestionnaireableUser.class)
public class QuestionnaireableUser extends Questionnaireable {

    private String login;

    private String firstName;

    private String lastName;

    private String email;
}
