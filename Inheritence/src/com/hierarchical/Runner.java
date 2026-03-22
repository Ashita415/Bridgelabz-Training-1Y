package com.hierarchical;

public class Runner {
        public static void main(String[] args) {

            Teacher t = new Teacher("Mr. Sharma", 40, "Math");
            Student s = new Student("Riya", 16, "10th");
            Staff st = new Staff("Raj", 35, "Administration");

            t.displayRole();
            s.displayRole();
            st.displayRole();
        }
}
