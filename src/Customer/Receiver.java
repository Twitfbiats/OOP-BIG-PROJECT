package Customer;

import java.util.List;

import Location.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Receiver extends Human
{
    private List<Integer> packageReceived;

    public Receiver(int id, String name, String phoneNumber, Address address, String role) 
    {
        super(id, name, phoneNumber, address, role = "Receiver");
    }
}
