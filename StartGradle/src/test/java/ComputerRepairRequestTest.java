import ro.mpp2024.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First test")

    public void testExample1() {
        ComputerRepairRequest request = new ComputerRepairRequest();
        assertEquals("", request.getOwnerName());
        assertEquals("", request.getOwnerAddress());
    }

    @Test
    @DisplayName("Second test")

    public void testExample2() {
        assertEquals(2, 2, "The numbers must be equal!");
    }
}