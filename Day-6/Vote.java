public class Vote {
    
    
        private String name;
        private int age;
        public void details(String nam,int ag){
            this.name=nam;
            this.age=ag;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name=name;
        }
    
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age=age;
        }
        public   String checkEligibility() {
         
            if (age >= 18) {
                return  name + " is eligible to vote.";
            } else {
                return name + " is not eligible to vote.";
            }
        }

    }
    
    
        
    
    