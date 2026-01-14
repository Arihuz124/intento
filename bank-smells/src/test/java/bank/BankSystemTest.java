package bank;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankSystemTest {
    private BankSystem bank;

    @BeforeEach
    void setup() {
        bank = new BankSystem();
        bank.addAccount(new Account("A1","VIP","USD",5000));
        bank.addAccount(new Account("A2","SAVINGS","USD",100));
        bank.addAccount(new Account("A3","REGULAR","USD",0));
        bank.addCustomer(new Customer("C1", new Profile(new Address("Guayaquil"))));
        bank.addCustomer(new Customer("C2", new Profile(new Address("Quito"))));
    }

    @Test
    void transfer_ok() {
        String r = bank.transfer("A1","A3",1000,"USD","INTERNAL","R1","n","C1",true,false);
        assertEquals("OK", r);
    }

    @Test
    void city_limit_guayaquil() {
        assertEquals("ERROR_CITY_LIMIT",
            bank.transfer("A1","A3",3500,"USD","APP","R2","n","C1",false,false));
    }

    @Test
    void insufficient_funds() {
        assertEquals("ERROR_FUNDS",
            bank.transfer("A2","A3",120,"USD","APP","R3","n","C2",false,false));
    }

    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Account account = null;
        BankSystem instance = new BankSystem();
        instance.addAccount(account);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer customer = null;
        BankSystem instance = new BankSystem();
        instance.addCustomer(customer);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        String accountId = "";
        BankSystem instance = new BankSystem();
        double expResult = 0.0;
        double result = instance.getBalance(accountId);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTransfer() {
        System.out.println("transfer");
        String fromId = "";
        String toId = "";
        double amount = 0.0;
        String currency = "";
        String channel = "";
        String reference = "";
        String note = "";
        String performedByCustomerId = "";
        boolean applyFee = false;
        boolean allowOverdraft = false;
        BankSystem instance = new BankSystem();
        String expResult = "";
        String result = instance.transfer(fromId, toId, amount, currency, channel, reference, note, performedByCustomerId, applyFee, allowOverdraft);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGenerateMonthlyStatement() {
        System.out.println("generateMonthlyStatement");
        String accountId = "";
        BankSystem instance = new BankSystem();
        String expResult = "";
        String result = instance.generateMonthlyStatement(accountId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}