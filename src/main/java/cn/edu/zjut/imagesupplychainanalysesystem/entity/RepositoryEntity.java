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
@Node("Repository")
@NoArgsConstructor
@ApiModel(value = "Repository对象")
public class RepositoryEntity implements Serializable {
    @Id
    private String name;

    private boolean can_edit;

    private Long collaborator_count;

    private String date_registered;

    private String description;

    private String full_description;

    private boolean has_starred;

    private String hub_user;

    private boolean is_automated;

    private boolean id_private;

    private String last_updated;

    private String media_types;

    private String namespace;

    private String permissions;

    private Long pull_count;

    private String repository_type;

    private Long star_count;

    private Long status;

    private String user;

    private String affiliation;

    @Relationship(type = "HAS", direction = Relationship.Direction.OUTGOING)
    private List<Tags> TagsList;
}

