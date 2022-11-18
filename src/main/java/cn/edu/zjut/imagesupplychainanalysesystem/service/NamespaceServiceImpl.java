package cn.edu.zjut.imagesupplychainanalysesystem.service;
import cn.edu.zjut.imagesupplychainanalysesystem.entity.Namespace;
import cn.edu.zjut.imagesupplychainanalysesystem.entity.RepositoryEntity;
import org.springframework.data.domain.Page;

import java.util.List;


public interface NamespaceServiceImpl {
    //查询namespace
    Namespace getInfoByName(String name);


    //返回所有关系类型
    List<String> getAllRealationTypes();

    //判断是否存在
    Boolean existByName(String name);

    //查询指定name的所有关系
    List<RepositoryEntity> getRelationsOWNSByName(String name);








}
