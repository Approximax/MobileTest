package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/auth.properties"
})
public interface AuthConfig extends Config {

    @Key("user")
    String user();

    @Key("key")
    String key();
}
