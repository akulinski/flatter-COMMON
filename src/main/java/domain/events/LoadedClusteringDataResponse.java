package domain.events;

import domain.Questionnaireable;
import lombok.Data;

import java.util.LinkedList;

@Data
public class LoadedClusteringDataResponse {
    private String requester;
    private LinkedList<Questionnaireable> questionnaireables;
}
