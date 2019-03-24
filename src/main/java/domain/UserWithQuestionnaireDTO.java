package domain;

import lombok.Data;

@Data
public class UserWithQuestionnaireDTO {

    private UserDTO userDTO;
    private Questionnaire questionnaire;
}
