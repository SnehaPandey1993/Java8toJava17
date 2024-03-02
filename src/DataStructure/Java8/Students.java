package DataStructure.Java8;

public class Students {
    int rollId;
    String name;

    String subject;

    public int getRollId() {
        return rollId;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public Students(int rollId, String name, String subject) {
        this.rollId = rollId;
        this.name = name;
        this.subject = subject;
    }
}
