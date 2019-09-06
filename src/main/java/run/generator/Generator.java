package run.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.internal.DefaultShellCallback;

import run.override.service.ConfigurationParserOverride;

public class Generator {

  public void generator() throws Exception {

    List<String> warnings = new ArrayList<String>();
    boolean overwrite = true;
    File configFile = new File("src/main/resources/generatorConfig.xml");

    ConfigurationParserOverride cp = new ConfigurationParserOverride(warnings);
    Configuration config = cp.parseConfiguration(configFile);
    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

    myBatisGenerator.generate(null);

  }

  public static void main(String[] args) throws Exception {
    try {
      Generator generator = new Generator();
      generator.generator();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}