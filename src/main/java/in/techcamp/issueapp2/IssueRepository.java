package in.techcamp.issueapp2;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IssueRepository {
   @Insert("INSERT INTO issues (title, content, deadline, priority) VALUES(#{title}, #{content}, #{deadline}, #{priority})")
   void insertIssues(String title, String content, String deadline, char priority);
}
