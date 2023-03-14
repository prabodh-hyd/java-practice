package learnjava;

    class Encapsualtion{
        /*Encapsulation is defined as the wrapping up of data under a single unit.
         variables or data of a class is hidden from any other class and can be accessed only
        through any member function of its own class in which it is declared.
        private data members to hide the data*/
        private long acc_no;
        private String name,email;
        private int amount;
        public Encapsualtion() {
        }
        //public getter and setter methods 
        public long getAcc_no() {
            return acc_no;
        }
        public void setAcc_no(long acc_no) {
            this.acc_no = acc_no;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public int getAmount() {
            return amount;
        }
        public void setAmount(int amount) {
            this.amount = amount;
        }

    }
  

       
    

