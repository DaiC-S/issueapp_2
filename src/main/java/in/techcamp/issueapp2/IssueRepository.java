package in.techcamp.issueapp2;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IssueRepository {
   @Insert("INSERT INTO issues (title, content, deadline, priority) VALUES(#{title}, #{content}, #{deadline}, #{priority})")
   void insertIssues(String title, String content, String deadline, String priority);

   @Select("SELECT * FROM issues")
   List<IssueEntity> findAll();
}
