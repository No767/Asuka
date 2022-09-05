package io.no767.Asuka;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RinHelp {
    @Id
    private String uuid;
    private String name;
    private String description;
    private String parent_name;
    private String module;

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getParentName() {
        return parent_name;
    }

    public String getModule() {
        return module;
    }

    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setParentName(String parent_name) {
        this.parent_name = parent_name;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
