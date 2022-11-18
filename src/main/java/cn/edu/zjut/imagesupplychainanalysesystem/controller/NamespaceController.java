package cn.edu.zjut.imagesupplychainanalysesystem.controller;

import cn.edu.zjut.imagesupplychainanalysesystem.entity.Namespace;
import cn.edu.zjut.imagesupplychainanalysesystem.entity.RepositoryEntity;
import cn.edu.zjut.imagesupplychainanalysesystem.service.NamespaceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping(value = "/namespace",produces="application/json;charset=UTF-8")
@Api(tags="namespace操作测试")
public class NamespaceController {
    @Resource
    NamespaceService namespaceService;

    @GetMapping(value="/getInfoByName")
    @ApiOperation(value="根据name查询")
    @ApiImplicitParam(name="name",value="名称",required = true,dataType = "String",paramType="query")
    public Map getInfoByName(@RequestParam(name = "name")String name) {
        Map<String,Object> map = new HashMap<String,Object>();
        System.out.println(name);
        Namespace namespace=namespaceService.getInfoByName(name);
        List<RepositoryEntity> list=namespaceService.getRelationsOWNSByName(name);
        System.out.print(list);
        map.put("msg","查询成功");
        map.put("data", namespace);
        map.put("code",200);
        return map;
    }

    @GetMapping(value="/getAllRealationTypes")
    @ApiOperation(value="得到所有关系名称")
    public Map getAllRealationTypes() {
        Map<String,Object> map = new HashMap<String,Object>();
        List<String> list=namespaceService.getAllRealationTypes();
        System.out.print(list);
        map.put("msg","查询成功");
        map.put("data", list);
        map.put("code",200);
        return map;
    }

    @GetMapping(value="/existByName")
    @ApiOperation(value="判断namespace是否存在")
    @ApiImplicitParam(name="name",value="名称",required = true,dataType = "String",paramType="query")
    public Map existByName(@RequestParam(name = "name")String name) {
        Map<String,Object> map = new HashMap<String,Object>();
        Boolean exist=namespaceService.existByName(name);
        System.out.print(exist);
        map.put("msg","查询成功");
        map.put("data", exist);
        map.put("code",200);
        return map;
    }


}
