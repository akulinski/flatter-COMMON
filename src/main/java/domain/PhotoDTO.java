package domain;

import lombok.Data;

import java.time.Instant;

@Data
public class PhotoDTO {

    private String albumTitle;
    private String photoTitle;
    private String description;
    private byte[] bytes;
    private String imageContentType;
    private Integer height;
    private Integer width;
    private Instant taken;
    private Instant uploaded;

}
