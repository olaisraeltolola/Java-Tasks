import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testThatBalanceIsZeroWhenAccountIsCreated(){
        Account tololaAccount = new Account(1234);
        assertEquals(0, tololaAccount.getBalance());
    }
    @Test
    public void testThatBalanceIs5kWhen5kIsDeposited(){
        Account tololaAccount = new Account(1234);
        tololaAccount.deposit(5_000);
        assertEquals(5_000, tololaAccount.getBalance());
    }

    @Test
    public void testThatDeposit5kTwice_balanceIs10k(){
        Account tololaAccount = new Account(1234);
        tololaAccount.deposit(5_000);
        assertEquals(5_000, tololaAccount.getBalance());

        tololaAccount.deposit(5_000);
        assertEquals(10_000, tololaAccount.getBalance());
    }

    @Test
    public void testThatDepositMinus5k_balanceIsUnchanged(){
        Account tololaAccount = new Account(1234);
        tololaAccount.deposit(5_000);
        assertEquals(5_000, tololaAccount.getBalance());

        tololaAccount.deposit(-5_000);
        assertEquals(5_000, tololaAccount.getBalance());
    }

    @Test
    public void testThatDeposit5k_withdraw3k_balanceIs2k(){
        Account tololaAccount = new Account(1234);
        tololaAccount.deposit(5_000);
        assertEquals(5_000, tololaAccount.getBalance());

        tololaAccount.withdraw(3_000, 1234);
        assertEquals(2_000, tololaAccount.getBalance());
    }

    @Test
    public void testThatDeposit5k_withdraw10k_balanceIs5k(){
        Account tololaAccount = new Account(1234);
        tololaAccount.deposit(5_000);
        assertEquals(5_000, tololaAccount.getBalance());

        tololaAccount.withdraw(10_000, 1234);
        assertEquals(5_000, tololaAccount.getBalance());
    }

    @Test
    public void testThatDeposit5k_withdrawMinus10k_balanceIs5k(){
        Account tololaAccount = new Account(1234);
        tololaAccount.deposit(5_000);
        assertEquals(5_000, tololaAccount.getBalance());

        tololaAccount.withdraw(-10_000, 1234);
        assertEquals(5_000, tololaAccount.getBalance());
    }

    @Test
    public void testThatDeposit5k_withdraw2k_enterWrongPin_balanceIs5k(){
        Account tololaAccount = new Account(1234);
        tololaAccount.deposit(5_000);
        assertEquals(5_000, tololaAccount.getBalance());

        tololaAccount.withdraw(2_000, 2334);
        assertEquals(5_000, tololaAccount.getBalance());
    }

}
