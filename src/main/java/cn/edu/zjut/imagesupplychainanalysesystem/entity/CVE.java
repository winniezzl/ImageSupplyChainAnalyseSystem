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
@Node("CVE")
@NoArgsConstructor
@ApiModel(value = "CVE对象")
public class CVE implements Serializable {
    @Id
    private String name;

    private String level;

    @Relationship(type = "EXISTS", direction = Direction.INCOMING)
    private List<Package> packageListAll;

}

