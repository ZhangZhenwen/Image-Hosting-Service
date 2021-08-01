package priv.zhenwen.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhenwen
 * @date 2021/7/31
 */
@Component
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {
    /** 项目名称 */
    private String name;

    /** 版本 */
    private String version;

    /** 上传路径 */
    private static String profile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        ApplicationProperties.profile = profile;
    }
}
