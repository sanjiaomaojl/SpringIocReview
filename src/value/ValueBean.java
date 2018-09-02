package value;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ValueBean {
    private String name;
    private int age;
    private List<String> city;
    private Set<String> interest;
    private Map<String,Double> score;
    private Properties db;

    public Properties getDb() {
        return db;
    }

    public void setDb(Properties db) {
        this.db = db;
    }

    public Map<String, Double> getScore() {
        return score;
    }

    public void setScore(Map<String, Double> score) {
        this.score = score;
    }

    public Set<String> getInterest() {
        return interest;
    }

    public void setInterest(Set<String> interest) {
        this.interest = interest;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public ValueBean() {
        System.out.println("ValueBean()");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ValueBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city=" + city +
                ", interest=" + interest +
                ", score=" + score +
                ", db=" + db +
                '}';
    }
}
