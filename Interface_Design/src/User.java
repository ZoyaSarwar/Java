public class User {
    private String message;

    public String login(String[] credentials){
        try {
            String name = credentials[0];
            String password = credentials[1];

            if ( name.equals("admin") && password.equals("admin")) {   
                this.message = "Login Successful";
            } else {  
                this.message = "Invalid user name or password";
            }
    
            return this.message;
    
        } catch (Exception e) {
            this.message = "Something went wrong, please try again later!";
            return this.message;
        }
    }

}
