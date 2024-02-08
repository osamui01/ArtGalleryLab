import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {


    Customer customer;

    @BeforeEach
    public void setUp(){

      customer = new Customer("Leonardo", 7000);
    }

   @Test
   public void canGetName(){
        assertThat(customer.getName()).isEqualTo("Leonardo");
   }

    @Test
    public void canSetName(){
        customer.setName("Van Gogh");
        assertThat(customer.getName()).isEqualTo("Van Gogh");
    }

    @Test
    public void canGetMoney(){
        assertThat(customer.getMoney()).isEqualTo(100);
    }

    @Test
    public void canSetMoney(){
        customer.setMoney(250);
        assertThat(customer.getMoney()).isEqualTo(250);
    }

    @Test
    public void canRemoveMoney(){
        customer.setMoney(250);
        customer.removeMoney(20);
        assertThat(customer.getMoney()).isEqualTo(230);
    }


}
