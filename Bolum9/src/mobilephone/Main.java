package mobilephone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("553 319 14 50");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printInfo();
        while(!quit){
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    shutDown();
                    quit = true;
                    break;
                case 1:
                    printInfo();
                    break;
                case 2:
                    addContent();
                    break;
                case 3:
                    removeContect();
                    break;
                case 4:
                    printContent();
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
        }
    }
    private static void startPhone(){System.out.println("Starting phone");}
    private static void shutDown(){ System.out.println("Shutdown..");}
    private static void printContent(){mobilePhone.printContent();}
    private static void printInfo(){
        System.out.println("Content List Options\n"+
                            "0 - shut down the phone\n"+
                            "1 - print options\n"+
                            "2 - add new content\n"+
                            "3 - remove content\n"+
                            "4 - print content list\n");
    }
    private static void addContent(){
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Enter a number");
        String number = scanner.nextLine();
        Content content = Content.createContent(name,number);
        mobilePhone.addContent(content);
    }
    private static void removeContect(){
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        Content content = Content.createContent(name,null);
        mobilePhone.removeContect(content);
    }

}
