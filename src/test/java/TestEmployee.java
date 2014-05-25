import org.junit.Test;

/**
 * Created by dinesh on 5/24/2014.
 */
public class TestEmployee {

    @Test
    public void testPerson(){
        Person p1 = new Person("John" , "Smith", 15);
        assert ( p1.getFirstName().equals("John"));
        assert( p1.getLastName().equals("Smith"));
        assert(p1.getAge()== 15);
    }

}
