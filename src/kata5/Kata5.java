package kata5;

import java.util.List;

public class Kata5 {

    public static void main(String[] args) {
        String fileName = "email.txt";
        List<String> mailList = MailListReader.read(fileName);
        String URL = "jdbc:sqlite:D:\\universidad\\Ingenieria del software 2\\kata5\\kata5\\DBsqlitle\\kata5.db";
        DataBase database = new DataBase(URL);
        database.open();
        
        database.select_PERSONAS();
        
        People people = new People("Ferb  ", "Flint", "brother");
        database.insert_PERSONAS(people);
        
        database.select_PERSONAS();
        
        
        //database.createTable_EMAIL();
        
        database.insert_EMAIL(mailList);
        database.close();
    }
    
}
