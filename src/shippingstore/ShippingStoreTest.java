package shippingstore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;

class ShippingStoreTest {
    public static ShippingStore shippingstore = null;
    @BeforeClass
    public static void createEnvironment() throws IOException {
        shippingstore = new ShippingStore();
        System.out.println("ENVIRONMENT CREATED");
    }
    @AfterClass
    public static void clearEnvironment(){
        shippingstore = null;
        System.out.println("ENVIRONMENT CLEARED");
    }




}