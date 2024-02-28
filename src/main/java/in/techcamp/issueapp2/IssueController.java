package in.techcamp.issueapp2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class IssueController {

    private final IssueRepository issueRepository;

    @GetMapping
    public String index(Model model){
        var issuesList = issueRepository.findAll();
        model.addAttribute("issues", issuesList);
        return "index";
    }

    @GetMapping("/new")
    public String showIssueForm(@ModelAttribute("issueForm") IssueForm form){
        return "new";
    }

    @PostMapping("/issues")
    public String createIssues(IssueForm form){
        issueRepository.insertIssues(form.getTitle(), form.getContent(), form.getDeadline(), form.getPriority());
        return "redirect:/";
    }
}
