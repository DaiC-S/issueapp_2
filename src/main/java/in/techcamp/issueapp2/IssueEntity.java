package in.techcamp.issueapp2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class IssueEntity {
    private long id;
    private String title;
    private String content;
    String	deadline;
    String	priority;
}
