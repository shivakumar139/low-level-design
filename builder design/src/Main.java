public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .firstName("Shiva")
                .lastName("Kumar")
                .password("password123")
                .email("john@example.com")
                .phoneNo("123-456-7890")
                .build();

        System.out.println("User details:");
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone No: " + user.getPhoneNo());
    }
}