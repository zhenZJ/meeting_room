package run.override.mapper;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import run.override.dao.ClientDaoPlugin;

public class SqlMapIsMergeablePlugin extends ClientDaoPlugin {

    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
        //重新生成代码,xml内容覆盖
        sqlMap.setMergeable(false);
        return super.sqlMapGenerated(sqlMap, introspectedTable);
    }
}