package sample.Initializations;

import jdk.jfr.Event;

import javax.xml.crypto.Data;
import java.sql.Date;

public class Ticket {
    private int Code_Ticket;
    private int Client;
    private int Event;
    private int Employee;
    private Date Data_of_sale;
    private int Ticket_number;
    private int Type_Payment;
    private String Company_name;
    private int Reserved_Ticket;

    public Ticket(int Code_Ticket, int Client, int Event, int Employee, Date Data_of_sale, int Ticket_number, int Type_Payment,
                  String Company_name, int Reserved_Ticket)
    {
        this.Code_Ticket = Code_Ticket;
        this.Client = Client;
        this.Event = Event;
        this.Employee = Employee;
        this.Data_of_sale = Data_of_sale;
        this.Ticket_number = Ticket_number;
        this.Type_Payment = Type_Payment;
        this.Company_name = Company_name;
        this.Reserved_Ticket = Reserved_Ticket;
    }

    public int getCode_Ticket()
    {
        return Code_Ticket;
    }
    public int getClient()
    {
        return Client;
    }
    public int getEvent()
    {
        return Event;
    }
    public int getEmployee()
    {
        return Employee;
    }
    public Date getData_of_sale()
    {
        return Data_of_sale;
    }
    public int getTicket_number()
    {
        return Ticket_number;
    }
    public int getType_Payment()
    {
        return Type_Payment;
    }
    public String getCompany_name()
    {
        return Company_name;
    }
    public int getReserved_Ticket()
    {
        return Reserved_Ticket;
    }
}
