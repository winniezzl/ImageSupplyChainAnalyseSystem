package cn.edu.zjut.imagesupplychainanalysesystem.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.io.Serializable;
import java.util.List;


@Data
@Node("Images")
@NoArgsConstructor
@ApiModel(value = "Images对象")
public class Images implements Serializable {
    @Id
    private String digest;

    private String architecture;

    private String features;

    private String variant;

    private String os;

    private String os_features;

    private String os_version;

    private Long size;

    private String status;

    private String last_pulled;

    private String last_pushed;

    @Relationship(type = "HOLDS", direction = Direction.INCOMING)
    private List<Tags> tagsListAll;

}

