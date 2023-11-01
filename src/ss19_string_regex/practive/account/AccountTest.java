package ss19_string_regex.practive.account;

public class AccountTest {
    private static AccountExample accountExample;
    public static final String[] valiAccount = new String[]{"123abc_" , "_123abc", "______", "123456", "abcdefgh"};
    public static final String[] invaliAccount = new String[]{".@", "12345", "1234_", "abcde"};
        public static void main(String[] args) {
            accountExample = new AccountExample();
            for (String account: valiAccount){
                boolean isValid = accountExample.validate(account);
                System.out.println("Account is " + account + " is valid: " + isValid);
            }
            for (String account: invaliAccount){
                boolean isValid = accountExample.validate(account);
                System.out.println("Account is " + account + " is valid: " + isValid);
            }
    }
}
