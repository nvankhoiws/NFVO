package org.project.neutrino.nfvo.catalogue.nfvo;

import org.project.neutrino.nfvo.catalogue.util.IdGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Created by lto on 18/05/15.
 */
@Entity
public class ConfigurationParameter {
    @Id
    private String id = IdGenerator.createUUID();
    @Version
    private int version;

    private String key;
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConfigurationParameter{" +
                "id='" + id + '\'' +
                ", version=" + version +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
