package xianmu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class studentlist {
    private List<student> user= new ArrayList();



    public studentlist(){
        Integer a=0;
        user.add(new student("10000", "123456","aa","无",a));
        user.add(new student("10001", "123456","bb","无",a));
        user.add(new student("10002", "123456","cc","无",a));
    }

    public List getUser() {
        return user;
    }

    public void setUser(List user) {
        this.user = user;
    }
}
