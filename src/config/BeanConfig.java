package config;

import bean.Environment;
import bean.Temp;
import dao.EnvironmentDAO;
import dao.TempDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * spring配置文件，已启动组件扫描相应的包
 * 因为idea是直接管理spring的配置文件的。所以将这个配置文件作为bean放入applicationContext.xml即可。（详见spring实战中的『在xml中引用javaconfig』）
 * 或者直接不使用默认生成的applicationContext.xml
 * Created by Lee on 2016/12/1 0001.
 */
@Configuration
@ComponentScan(basePackageClasses = {Environment.class, Temp.class, TempDAO.class, EnvironmentDAO.class})
public class BeanConfig {


}