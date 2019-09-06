package run.override.service;

import java.util.List;

import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.ModelType;

public class ContextOverride extends Context{
    //Ìí¼ÓServiceGeneratorConfiguration
    private ServiceGeneratorConfiguration serviceGeneratorConfiguration;

    public ContextOverride(ModelType defaultModelType) {
        super(defaultModelType);
    }

    public ServiceGeneratorConfiguration getServiceGeneratorConfiguration() {
        return serviceGeneratorConfiguration;
    }

    public void setServiceGeneratorConfiguration(ServiceGeneratorConfiguration serviceGeneratorConfiguration) {
        this.serviceGeneratorConfiguration = serviceGeneratorConfiguration;
    }

    @Override
    public void validate(List<String> errors) {
        if(serviceGeneratorConfiguration != null)
            serviceGeneratorConfiguration.validate(errors, this.getId());
        
        super.validate(errors);
    }
    
    public XmlElement toXmlElement() {
        
        XmlElement xmlElement = super.toXmlElement();
        if (serviceGeneratorConfiguration != null)
            xmlElement.addElement(serviceGeneratorConfiguration.toXmlElement());
        return xmlElement;
    }
}