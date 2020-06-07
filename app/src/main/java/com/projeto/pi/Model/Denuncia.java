package com.projeto.pi.Model;

import java.io.Serializable;

public class Denuncia implements Serializable {
    private String id;
    private String uuid;
    private String comment;
    private String type;

    public Denuncia(String id, String uuid, String comment, String type) {
        this.id = id;
        this.uuid = uuid;
        this.comment = comment;
        this.type = type;
    }

    public Denuncia() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
