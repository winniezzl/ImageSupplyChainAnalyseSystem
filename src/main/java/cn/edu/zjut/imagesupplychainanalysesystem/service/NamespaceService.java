package cn.edu.zjut.imagesupplychainanalysesystem.service;

import cn.edu.zjut.imagesupplychainanalysesystem.entity.Namespace;
import cn.edu.zjut.imagesupplychainanalysesystem.entity.RepositoryEntity;
import cn.edu.zjut.imagesupplychainanalysesystem.mapper.NamespaceRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NamespaceService implements NamespaceServiceImpl {
    @Resource
    NamespaceRepository namespaceRepository;

    @Override
    public Namespace getInfoByName(String name) {
        return namespaceRepository.findByName(name);
    }


    @Override
    public List<String> getAllRealationTypes() {
        return namespaceRepository.getAllRealationTypes();
    }

    @Override
    public Boolean existByName(String name) {
        return namespaceRepository.existsByName(name);
    }

    @Override
    public List<RepositoryEntity> getRelationsOWNSByName(String name) {
        return namespaceRepository.getRelationsOWNSByName(name);
    }
}
