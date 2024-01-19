package Trainingjava.Use.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.LocalDate;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UseRequest {

    private String name;
    private String password;
    private String lastname;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate createdDate; //-->create_date

    public UseRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "UseRequest{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", lastname='" + lastname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
