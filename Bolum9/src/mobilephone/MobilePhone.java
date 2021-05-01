package mobilephone;

import java.util.ArrayList;

public class MobilePhone {
    private String myPhoneNumber;
    private ArrayList<Content> arrayOfContent = new ArrayList<>();

    public MobilePhone(String myPhoneNumber){
        this.myPhoneNumber = myPhoneNumber;
        arrayOfContent = new ArrayList<>();
    }

    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public boolean addContent(Content content){
        if(findContect(content.getName()) >= 0){
            System.out.println(content.getName() + ", was already exist");
            return false;
        }
        arrayOfContent.add(content);
        return true;
    }
    public boolean removeContect(Content content){
        int checkContect = findContect(content.getName());
        if(checkContect < 0){
            System.out.println(content.getName() + ", was not exist");
            return false;
        }
        this.arrayOfContent.remove(checkContect);
        System.out.println(content.getName() + ",was deleted succesfully");
        return true;
    }

    private int findContect(String name){
        for(int i=0;i<arrayOfContent.size();i++){
            Content searchContent = arrayOfContent.get(i);
            if(searchContent.getName().equals(name)) return i;
        }
        return -1;
    }

    public void printContent(){
       if(arrayOfContent.size() > 0){
           for (int i=0;i<arrayOfContent.size();i++){
               System.out.println("\n"+(i+1)+".Name = " +  this.arrayOfContent.get(i).getName() +
                       "\nPhone number = " + this.arrayOfContent.get(i).getPhoneNumber());
               System.out.println("----------------------");
           }
       } else{
           System.out.println("Empty content list");
       }
    }
}
