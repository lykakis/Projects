package gr.likakis.customermanagment.action;

import java.util.ArrayList;

public class customer {
     ArrayList<String> values;
    String name;
    String lastName;
    String address;
    String phone;
    String email;
    String profession;
    int id;
    DatabaseAction connection = new DatabaseAction();
    
    public customer(int id) {
        this.id = id;
    }
    public customer(String name, String lastName, String address, String phone, String email, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void insertToSql(customer customerToInsert) {
        
        connection.insert(customerToInsert);
        
    }
    public ArrayList<String> selectAll(){
        // ArrayList<String> values;
         values=  connection.selectAll();
         return values;
    }
    public  ArrayList<String> search(int searchBy,String searchFor){
       // ArrayList<String> values;
        values=  connection.search(searchBy, searchFor);
        return values;
    }
     public void saveChanges(String[] dataTosave,int id){
         connection.saveChanges(dataTosave,id);
     }
     public void deleteCustomer(customer current){
         connection.deleteCustomer(current);
     }
     
     
          
}
