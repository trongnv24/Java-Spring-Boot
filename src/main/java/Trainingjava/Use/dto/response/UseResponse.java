package Trainingjava.Use.dto.response;

import Trainingjava.Use.dto.request.UseRequest;

public class UseResponse extends UseRequest {

    private String id;

    public UseResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    @Override
    public String toString() {
        return "UseResponse{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", createdDate=" + getCreatedDate() +
                '}';
    }
}
