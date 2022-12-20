package sample.Initializations;

import java.sql.Date;

public class IEmployee {
    private int Code_Employee;
    private int Position;
    private String Name;
    private String Surname;
    private String F_Name;
    private Date Date_Employee;
    private String Address;
    private int Phone;
    private String Status;

    public IEmployee(int Code_Employee, int Position, String Name, String Surname, String F_Name, Date Date_Employee, String Address,
                  int Phone, String Status)
    {
        this.Code_Employee = Code_Employee;
        this.Position = Position;
        this.Name = Name;
        this.Surname = Surname;
        this.F_Name = F_Name;
        this.Date_Employee = Date_Employee;
        this.Address = Address;
        this.Phone = Phone;
        this.Status = Status;
    }

    public int getCode_Employee()
    {
        return Code_Employee;
    }
    public int getPosition() { return Position; }
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
    public Date getDate_Employee()
    {
        return Date_Employee;
    }
    public String getAddress()
    {
        return Address;
    }
    public int getPhone()
    {
        return Phone;
    }
    public String getStatus()
    {
        return Status;
    }
}
