package sample.Initializations;

import java.sql.Date;

public class IClient {
    private int Code_Client;
    private String Name;
    private String Surname;
    private String F_Name;
    private int Phone;


    public IClient(int Code_Client, String Name, String Surname, String F_Name, int Phone)
    {
        this.Code_Client = Code_Client;
        this.Name = Name;
        this.Surname = Surname;
        this.F_Name = F_Name;
        this.Phone = Phone;
    }

    public int getCode_Client()
    {
        return Code_Client;
    }
    public String getName()
    {
        return Name;
    }
    public String getSurname()
    {
        return Surname;
    }
    public String getF_Name()
    {
        return F_Name;
    }
    public int getPhone()
    {
        return Phone;
    }

}
