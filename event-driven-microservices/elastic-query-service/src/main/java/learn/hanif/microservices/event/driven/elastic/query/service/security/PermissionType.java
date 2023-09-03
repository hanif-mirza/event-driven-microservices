package learn.hanif.microservices.event.driven.elastic.query.service.security;

public enum PermissionType {

    READ("READ"), WRITE("WRITE"), ADMIN("ADMIN");

    private String type;

    PermissionType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
