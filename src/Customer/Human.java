package Customer;

import Location.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Generate constructor with no parameter automatically
@NoArgsConstructor
// Generate getter and setter automatically
@Getter
@Setter
public class Human
{
    protected int id;
    protected String name;
    protected String phoneNumber;
    protected Address address;
    protected enum roleList {Sender,Receiver,Nobody};
    protected String role;

    public Human(int id, String name, String phoneNumber, Address address, String role) 
    {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;

        // If no role is detected, role = Nobody
        this.role = roleList.Nobody.toString();
        for (roleList roleTemp : roleList.values())
        {
            if (roleTemp.toString().equals(role))
            {
                this.role = roleTemp.toString();
            }
        }
    }
}