package myapp.domain;
import java.util.Date;  
  
public class User { 
	//필드
    private int id;
    private String name;  
    private String phone;  
    private Date birthday;

    //getter and setter  
    public int getId() {
    	return id; 
    }
    public void setId(int id) { 
    	this.id = id;  
    }
    public String getName() {
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }
    public String getPhone() { 
    	return phone; 
    }
    public void setPhone(String phone) {
    	this.phone = phone;  
    }
    public Date getBirthday() { 
    	return birthday;  
    }
    public void setBirthday(Date birthday) { 
    	this.birthday = birthday;
    }
     
    public String toString() {  
        return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", birthday=" + birthday + "]";  
   } 
    
}  
