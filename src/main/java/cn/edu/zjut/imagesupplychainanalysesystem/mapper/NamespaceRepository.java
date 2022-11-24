package cn.edu.zjut.imagesupplychainanalysesystem.mapper;
import cn.edu.zjut.imagesupplychainanalysesystem.entity.Namespace;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import cn.edu.zjut.imagesupplychainanalysesystem.entity.RepositoryEntity;
import java.util.List;

@Repository
public interface NamespaceRepository extends Neo4jRepository<Namespace,String> {
    //根据关系数据进行当前用户的所有关系生成
    @Query("CALL db.relationshipTypes()")
    List<String> getAllRealationTypes();

    @Query("MATCH (n:Namespace {name:$name}) RETURN n")
    Namespace findByName(@Param("name")String name);


    @Query("MATCH (n:Namespace {name:$name}) RETURN n")
    Boolean existsByName(@Param("name")String name);


    @Query("MATCH (n:Namespace{name:$name})-[r:OWNS]->(m:Repository) RETURN m")
    List<RepositoryEntity> getRelationsOWNSByName(String name);

}
