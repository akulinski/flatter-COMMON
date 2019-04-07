package domain;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ConversationDTO {

    private static final long serialVersionUID = 1L;

    private Set<MessageDTO> messages = new HashSet<>();
}
