package it.altralogica.upload;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by tanis on 17/05/17.
 */
@ConfigurationProperties("storage")
public class StorageProperties {
    private String location = "uploads";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
