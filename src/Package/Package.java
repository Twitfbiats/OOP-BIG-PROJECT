package Package;

import java.util.Calendar;

import Location.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Package
{
    private int id;
    private String description;
    private float weight;
    private int senderId;
    private String senderName;
    private int receiverId;
    private String receiverName;
    private Address from;
    private Address to;
    private float distance;
    private float fee;
    private String transportType;
    private Calendar sendDate;
    private Calendar receiveDateEstimation;
    private String status;

    public Package()
    {
        this.from = new Address();
        this.to = new Address();
    }
}
