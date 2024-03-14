public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private String email;
    private String phoneNo;

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.password = builder.password;
        this.email = builder.email;
        this.phoneNo = builder.phoneNo;
    }

    // Getters

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    // Builder class
    public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;
        private String password;
        private String email;
        private String phoneNo;


        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }


        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
