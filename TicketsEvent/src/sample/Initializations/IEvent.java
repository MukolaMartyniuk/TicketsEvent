package sample.Initializations;

import java.sql.Date;

public class IEvent {
    private int Code_Event;
    private String Name_Event;
    private int Data_Event;
    private double Price;
    private int Number_of_seats;
    private int Type_Event;
    private int Availability;


    public IEvent(int Code_Event, String Name_Event, int Data_Event, double Price, int Number_of_seats, int Type_Event, int Availability)
    {
        this.Code_Event = Code_Event;
        this.Name_Event = Name_Event;
        this.Data_Event = Data_Event;
        this.Price = Price;
        this.Number_of_seats = Number_of_seats;
        this.Type_Event = Type_Event;
        this.Availability = Availability;

    }

    public int getCode_Event()
    {
        return Code_Event;
    }
    public String getName_Event()
    {
        return Name_Event;
    }
    public int getData_Event()
    {
        return Data_Event;
    }
    public double getPrice()
    {
        return Price;
    }
    public int getNumber_of_seats()
    {
        return Number_of_seats;
    }
    public int getType_Event()
    {
        return Type_Event;
    }
    public int getAvailability()
    {
        return Availability;
    }

}
