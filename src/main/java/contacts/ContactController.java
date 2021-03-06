package contacts;

import com.lingyuntec.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 使用了@Controller注解，无需配置检测包名，组件扫描将会找到它。
 *
 */
@Controller
@RequestMapping("/")
public class ContactController {
    private ContactRepository contactRepository;
    @Resource  private UserRepository userRepository;
    @Autowired
    public ContactController(ContactRepository contactRepository){
        this.contactRepository=contactRepository;
    }
    @RequestMapping(method= RequestMethod.GET)
    public String home(Map<String,Object>model){
        List<Contact> contacts=contactRepository.findAll();
        model.put("contacts",contacts);
        return "home";
    }
    @RequestMapping(method= RequestMethod.POST)
    public String submit(Contact contact){
        contactRepository.save(contact);
        return "redirect:/";
    }
}
