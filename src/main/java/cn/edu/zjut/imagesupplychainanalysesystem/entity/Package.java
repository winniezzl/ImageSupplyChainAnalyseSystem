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
@Node("Package")
@NoArgsConstructor
@ApiModel(value = "Package对象")
public class Package implements Serializable {
    @Id
    private String name;

    private String version;
    private String package_name;


    @Relationship(type = "EXISTS", direction = Direction.OUTGOING)
    private List<CVE> CVEList;

    @Relationship(type = "DEPENDENCIES", direction = Direction.OUTGOING)
    private List<Package> packageList;

    @Relationship(type = "DEPENDENCIES", direction = Direction.INCOMING)
    private List<Package> packageListAll;

}

