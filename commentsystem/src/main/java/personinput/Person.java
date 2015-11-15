package personinput;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

    @Size(min=2, max=30)
    private String name;

    @Size(min=2, max=100)
    private String location;

    @NotNull
    @Min(13)
    private Integer age;

    @Size(min=2, max=255)
    private String comment;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Location: " + this.location + ", Age: " + this.age + ", Comment: " + this.comment + ")";
    }

}
