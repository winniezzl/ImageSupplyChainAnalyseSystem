package cn.edu.zjut.imagesupplychainanalysesystem.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.io.Serializable;
import java.util.List;

@Data
@Node("Tags")
@NoArgsConstructor
@ApiModel(value = "Tags对象" )
public class Tags implements Serializable {
    @Id
    private Long id;

    private Long creator;

    private String last_updated;

    private Long last_updater;

    private String last_updater_username;

    private String name;

    private Long repository;

    private String repository_name;

    private Long full_size;

    private Boolean v2;

    private String tag_status;

    private String tag_last_pulled;

    private String tag_last_pushed;

    private String namespace;

    private Boolean is_base;

    private String digest;

    private String media_type;

    @Relationship(type = "HOLDS", direction = Relationship.Direction.OUTGOING)
    private List<Images> imagesList;

    @Relationship(type = "BASES", direction = Relationship.Direction.OUTGOING)
    private Tags baseImages;

    @Relationship(type = "BASES", direction = Relationship.Direction.INCOMING)
    private List<Images> baseImagesAll;

    @Relationship(type = "INCLUDES", direction = Relationship.Direction.OUTGOING)
    private List<Package> packageList;


}
