package domain.events;

import domain.MessageDTO;
import lombok.Data;

@Data
public class MessageSentEvent {
    private MessageDTO messageDTO;
}
