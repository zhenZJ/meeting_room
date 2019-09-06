# 会议室预订Demo
## 框架
- spring springMVC
- ORM： mybatis mybatis
- 连接池：druid
- UI: h-ui admin layui JQuery
- 数据库： MySQL
## 启动相关内容
- 使用IDE导入项目
- 数据库连接修改:/src/main/resources/db.properties <br>
  `jdbc.username= //数据库用户名`<br>
  `jdbc.password= //数据库密码`<br>
 - 使用tomcat部署

## 代码生成工具使用
- 配置生成表格
  /src/main/resources/generatorConfig.xml
  
  ```
  <table tableName="T_Meeting_Room" domainObjectName="MeetingRoom" alias="">
    <generatedKey column="Room_id" sqlStatement="MySql" identity="true" />
  </table>
  ```
    说明 
  `tableName`数据库表名称 <br>
  `domainObjectName` bean名称<br>
  `column` 主键<br>
  `sqlStatement` 数据库类型<br>
- 启动生成工具
  /src/main/java/run/generator/Generator.java
