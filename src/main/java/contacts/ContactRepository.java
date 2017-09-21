package contacts;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xieyuxing on 2017/9/19.
 */
@Repository
public class ContactRepository {
//    private JdbcTemplate jdbcTemplate;
    public List<Contact> findAll() {
        System.out.println("查询联系人列表");
        List<Contact> contacts=new ArrayList<Contact>();
        Contact contact1=new Contact();
        contact1.setFirstName("宇星");
        contact1.setLastName("谢");
        contact1.setEmailAddress("xieyuxing008@gmail.com");
        contact1.setPhoneNumber("18888888888");
        contacts.add(contact1);
        return contacts;
    }

    public void save(Contact contact) {
        System.out.println("保存联系人");
    }
}
