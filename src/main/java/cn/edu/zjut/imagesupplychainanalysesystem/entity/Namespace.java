package cn.edu.zjut.imagesupplychainanalysesystem.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;
import java.io.Serializable;
import java.util.List;


@Data
@Node("Namespace")
@NoArgsConstructor
@ApiModel(value = "Namespace对象")
public class Namespace implements Serializable {
    @Id
    private String name;

    @Relationship(type = "OWNS", direction = Relationship.Direction.OUTGOING)
    private List<RepositoryEntity> RepositoryList;

    public Namespace(String name){
        this.name=name;
    }
}

