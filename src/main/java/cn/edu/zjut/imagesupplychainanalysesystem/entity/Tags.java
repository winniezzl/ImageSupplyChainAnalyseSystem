package cn.edu.zjut.imagesupplychainanalysesystem.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.io.Serializable;

@Data
@Node("Tags")
@NoArgsConstructor
@ApiModel(value = "Tags对象" )
public class Tags implements Serializable {
    @Id
    private String name;

}
