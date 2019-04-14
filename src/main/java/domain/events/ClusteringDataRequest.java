package domain.events;


import lombok.Data;

@Data
public class ClusteringDataRequest {
    private String requester;

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }
}
