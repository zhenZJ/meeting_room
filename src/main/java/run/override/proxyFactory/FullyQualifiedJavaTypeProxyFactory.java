package run.override.proxyFactory;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;

public class FullyQualifiedJavaTypeProxyFactory  extends FullyQualifiedJavaType{
    
    private static FullyQualifiedJavaType pageInfoInstance = new FullyQualifiedJavaType("com.zm.core.base.model.PageInfo");
    private static FullyQualifiedJavaType baseExampleInstance = new FullyQualifiedJavaType("com.zm.core.base.model.BaseExample");
    private static FullyQualifiedJavaType baseMapperInstance = new FullyQualifiedJavaType("com.zm.core.base.dao.BaseMapper");
    private static FullyQualifiedJavaType baseServiceInstance = new FullyQualifiedJavaType("com.zm.core.base.service.BaseService");
    private static FullyQualifiedJavaType baseServiceImplInstance = new FullyQualifiedJavaType("com.zm.core.base.service.impl.BaseServiceImpl");
    
    public FullyQualifiedJavaTypeProxyFactory(String fullTypeSpecification) {
        super(fullTypeSpecification);
    }
    
    public static final FullyQualifiedJavaType getPageInfoInstanceInstance() {

        return pageInfoInstance;
    }
    public static final FullyQualifiedJavaType getBaseExampleInstance() {
        
        return baseExampleInstance;
    }
    
    public static final FullyQualifiedJavaType getBaseMapperInstance() {
        
        return baseMapperInstance;
    }
    public static final FullyQualifiedJavaType getBaseServiceInstance() {
        
        return baseServiceInstance;
    }
    public static final FullyQualifiedJavaType getBaseServiceImplInstance() {
        
        return baseServiceImplInstance;
    }
}