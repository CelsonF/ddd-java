package com.school.Student;

class Email {

    private String email;

   public Email(String address) {
       if (address == null || !address.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
           throw new IllegalArgumentException("Invalid email address");
       }
       this.email = address;
   }

    public String getEmail() {
        return email;
    }

}
